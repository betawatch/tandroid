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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class wl extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final kc w = new kc(2);
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
    public nl k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public wl(int i, int i2, long j) {
        this.h = i2;
        this.g = i;
        x();
        this.f = j;
        g(i2).b(j, new ml(this, (byte) 0));
    }

    public static TLRPC.Document e(int i, long j) {
        HashMap hashMap = g(i).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j));
    }

    public static int f() {
        return xea.o() == 0 ? 0 : 2;
    }

    public static sl g(int i) {
        HashMap hashMap = s;
        if (hashMap == null) {
            hashMap = new HashMap();
            s = hashMap;
        }
        sl slVar = (sl) hashMap.get(Integer.valueOf(i));
        if (slVar != null) {
            return slVar;
        }
        HashMap hashMap2 = s;
        Integer valueOf = Integer.valueOf(i);
        sl slVar2 = new sl(i);
        hashMap2.put(valueOf, slVar2);
        return slVar2;
    }

    public static wl l(int i, int i2, TLRPC.Document document) {
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
        wl wlVar = (wl) longSparseArray.get(document.id);
        if (wlVar != null) {
            return wlVar;
        }
        long j = document.id;
        wl wlVar2 = new wl(i2, i, document);
        longSparseArray.put(j, wlVar2);
        return wlVar2;
    }

    public static wl m(int i, long j, String str, int i2) {
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
        wl wlVar = (wl) longSparseArray.get(j);
        if (wlVar != null) {
            return wlVar;
        }
        wl wlVar2 = new wl();
        wlVar2.l = 1.0f;
        wlVar2.n = null;
        wlVar2.o = null;
        wlVar2.h = i;
        wlVar2.g = i2;
        wlVar2.x();
        wlVar2.f = j;
        wlVar2.i = str;
        g(i).b(j, new ml(wlVar2, b));
        longSparseArray.put(j, wlVar2);
        return wlVar2;
    }

    public static void r(int i, boolean z) {
        LongSparseArray longSparseArray;
        nl nlVar;
        boolean z2 = !z;
        if (v != z2) {
            v = z2;
            if (r == null || (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i), 25))) == null) {
                return;
            }
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                wl wlVar = (wl) longSparseArray.valueAt(i2);
                if (wlVar != null && (nlVar = wlVar.k) != null) {
                    if (z) {
                        nlVar.v0 = true;
                        nlVar.u0 = true;
                        nlVar.M(1);
                        lm m = nlVar.m();
                        if (m != null) {
                            boolean z3 = nlVar.w0;
                            if (!m.o0) {
                                m.w0 = z3;
                            }
                            m.start();
                        } else {
                            b29 y = nlVar.y();
                            if (y != null) {
                                y.start();
                            }
                        }
                    } else {
                        nlVar.u0 = false;
                        nlVar.v0 = false;
                        nlVar.M(0);
                        nlVar.x0();
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
                    wl wlVar = (wl) longSparseArray.get(keyAt);
                    if (wlVar == null || !wlVar.a) {
                        longSparseArray.remove(keyAt);
                    } else {
                        wlVar.i(true);
                    }
                }
            }
        }
    }

    public static void w() {
        t = i86.e(16388);
        u = i86.e(8200);
    }

    public final void a(em emVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList(10);
            this.c = arrayList;
        }
        this.m = false;
        if (!arrayList.contains(emVar)) {
            this.c.add(emVar);
        }
        u();
    }

    public final void b(View view) {
        if (view instanceof p0a) {
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
        if (!k() && !r47.B4(this.e)) {
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
        nl nlVar = this.k;
        if (nlVar == null) {
            return;
        }
        nlVar.j0(getBounds());
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
        return hl.L(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return hl.L(this.d);
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
        ggb d;
        String str;
        jn5 jn5Var;
        jn5 b;
        om5 om5Var;
        jn5 jn5Var2;
        Drawable g;
        Drawable drawable;
        nl nlVar;
        int i;
        String str2 = this.i;
        int i2 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            nl nlVar2 = this.k;
            if (nlVar2 == null || this.j || z) {
                if ((i2 == 20 || i2 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                byte b2 = 0;
                this.j = false;
                if (nlVar2 == null) {
                    nl nlVar3 = new nl(this, b2);
                    this.k = nlVar3;
                    nlVar3.d = this.h;
                    nlVar3.A1 = true;
                    if (i2 == 12) {
                        nlVar3.y = true;
                    }
                }
                if (this.p != null && c()) {
                    this.k.p1 = this.p;
                }
                if (i2 != 0) {
                    this.k.w1 = bp1.n(i2 == 12 ? 2 : i2, "_");
                }
                this.k.z1 = true;
                boolean z2 = (xea.o() == 0 && i2 == 5) || ((i2 == 2 || i2 == 25) && !t) || (i2 == 3 && !u);
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
                if (i2 != 17 && i2 != 15 && i2 != 14 && i2 != 8 && ((i2 != 1 || xea.o() < 2) && i2 != 12)) {
                    str3 = str3.concat("_pcache");
                }
                if (i2 != 17 && i2 != 0 && i2 != 26 && i2 != 1 && i2 != 14 && i2 != 15 && i2 != 19 && i2 != 20 && i2 != 21) {
                    str3 = str3.concat("_compress");
                }
                if (i2 == 8) {
                    str3 = str3.concat("firstframe");
                }
                TLRPC.PhotoSize w2 = xb4.w(this.e.thumbs, 90, false, null, false);
                boolean equals = "video/webm".equals(this.e.mime_type);
                TLRPC.Document document2 = this.e;
                if (equals) {
                    b = jn5.b(document2);
                    str3 = str3.concat("_g");
                    d = lp3.d(this.e.thumbs, aob.m6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(document2.mime_type)) {
                        d = lp3.d(this.e.thumbs, aob.m6, 0.2f, true);
                        if (d != null && r47.K2(this.e, true)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = str3;
                        jn5Var = null;
                        if (i2 != 20 || i2 == 21) {
                            jn5Var2 = null;
                            g = pv3.g(r47.V(this.e, null, null));
                            if (g != null) {
                                drawable = g;
                                if (str2 != null) {
                                    this.k.g0(new lm(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i2 == 8) {
                                    nl nlVar4 = this.k;
                                    TLRPC.Document document3 = this.e;
                                    nlVar4.Y(null, null, jn5Var, str, null, null, drawable, document3.size, null, document3, 1);
                                } else {
                                    String str4 = str;
                                    if (z2 || !(t || i2 == 14)) {
                                        jn5 c = i2 == 16 ? jn5.c(w2, this.e) : jn5Var2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            nl nlVar5 = this.k;
                                            jn5 c2 = jn5.c(w2, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document4 = this.e;
                                            nlVar5.Y(null, null, c2, str5, c, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            boolean K2 = r47.K2(this.e, true);
                                            nl nlVar6 = this.k;
                                            if (K2) {
                                                String concat = str4.concat("_firstframe");
                                                TLRPC.Document document5 = this.e;
                                                nlVar6.Z(jn5Var, concat, c, null, drawable, document5.size, null, document5, 1);
                                            } else {
                                                jn5 c3 = jn5.c(w2, this.e);
                                                String str6 = this.d + "_" + this.d;
                                                TLRPC.Document document6 = this.e;
                                                nlVar6.Z(c3, str6, c, null, drawable, document6.size, null, document6, 1);
                                            }
                                        }
                                    } else {
                                        jn5 c4 = i2 == 17 ? jn5.c(w2, this.e) : jn5Var2;
                                        nl nlVar7 = this.k;
                                        jn5 c5 = jn5.c(w2, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document7 = this.e;
                                        nlVar7.Y(jn5Var, str4, c5, str7, c4, null, drawable, document7.size, null, document7, 1);
                                    }
                                }
                                v(this.k);
                                if (i2 != 13 || i2 == 16 || i2 == 3 || i2 == 5 || i2 == 4 || i2 == 24) {
                                    this.k.m0(7);
                                }
                                if (i2 != 9 || i2 == 21 || i2 == 27) {
                                    this.k.m0(6656);
                                }
                                nlVar = this.k;
                                nlVar.S0 = true;
                                if (i2 != 12 || i2 == 26 || i2 == 18 || i2 == 8 || i2 == 6 || i2 == 5 || (i2 == 25 && v)) {
                                    i = 0;
                                    nlVar.u0 = false;
                                    nlVar.v0 = false;
                                    nlVar.M(0);
                                } else {
                                    nlVar.v0 = true;
                                    nlVar.u0 = true;
                                    nlVar.M(1);
                                    i = 0;
                                }
                                this.k.x0 = true;
                                this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? hl.L(6.0f) : i2 == 24 ? hl.L(14.0f) : i);
                                u();
                                j();
                            }
                        } else {
                            jn5Var2 = null;
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
                        nlVar = this.k;
                        nlVar.S0 = true;
                        if (i2 != 12) {
                        }
                        i = 0;
                        nlVar.u0 = false;
                        nlVar.v0 = false;
                        nlVar.M(0);
                        this.k.x0 = true;
                        this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? hl.L(6.0f) : i2 == 24 ? hl.L(14.0f) : i);
                        u();
                        j();
                    }
                    String str8 = (i2 != 0 ? bp1.n(i2, "_") : "") + this.f + "@" + str3;
                    if (xea.o() != 0 || i2 == 2 || i2 == 25 || i2 == 22 || (om5Var = in5.z().e) == null || !((LinkedHashMap) om5Var.c).containsKey(str8)) {
                        ggb d2 = lp3.d(this.e.thumbs, aob.m6, i2 == 22 ? 0.8f : 0.2f, false);
                        if (d2 != null && r47.K2(this.e, true)) {
                            d2.e = 512;
                            d2.f = 512;
                        }
                        d = d2;
                    } else {
                        d = null;
                    }
                    b = jn5.b(this.e);
                }
                jn5Var = b;
                str = str3;
                if (i2 != 20) {
                }
                jn5Var2 = null;
                g = pv3.g(r47.V(this.e, null, null));
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
                nlVar = this.k;
                nlVar.S0 = true;
                if (i2 != 12) {
                }
                i = 0;
                nlVar.u0 = false;
                nlVar.v0 = false;
                nlVar.M(0);
                this.k.x0 = true;
                this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? hl.L(6.0f) : i2 == 24 ? hl.L(14.0f) : i);
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
                em emVar = (em) this.c.get(i2);
                if (emVar != null) {
                    emVar.invalidate();
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
            TLRPC.InputStickerSet i1 = r47.i1(document);
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

    public final void n(em emVar) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(emVar);
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
        nl nlVar = this.k;
        if (nlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            nlVar.s = j;
        }
    }

    public final void q(String str) {
        nl nlVar;
        int i = this.g;
        if ((i == 20 || i == 21) && !TextUtils.isEmpty(str) && (nlVar = this.k) == null) {
            if (nlVar == null) {
                nlVar = new nl(this, (byte) 0);
                this.k = nlVar;
                nlVar.d = this.h;
                nlVar.A1 = true;
                if (i == 12) {
                    nlVar.y = true;
                }
            }
            this.j = true;
            nlVar.g0(pv3.g(str));
            this.k.B0 = true;
        }
    }

    public final void s(long j) {
        nl nlVar = this.k;
        if (nlVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            if (nlVar.y() != null) {
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
        nl nlVar = this.k;
        if (nlVar != null) {
            nlVar.setAlpha(f);
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
        return c00.k(sb, document == null ? "null" : r47.V(document, null, null), "}");
    }

    public final void u() {
        ArrayList arrayList;
        if (this.k != null) {
            ArrayList arrayList2 = this.b;
            boolean z = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.c) != null && arrayList.size() > 0) || this.m;
            if (z != this.a) {
                this.a = z;
                nl nlVar = this.k;
                if (z) {
                    nlVar.I();
                } else {
                    nlVar.K();
                }
                if (this.a) {
                    return;
                }
                kc kcVar = w;
                hl.r(kcVar);
                hl.d3(kcVar, 5000L);
            }
        }
    }

    public final void v(nl nlVar) {
        int i = this.g;
        if (i == 7 || i == 9 || i == 10) {
            nlVar.N(2);
            return;
        }
        if (i == 11 || i == 18 || i == 14 || i == 6 || i == 5 || i == 22) {
            nlVar.N(1);
        } else if (i == 17) {
            nlVar.N(0);
        }
    }

    public final void x() {
        int i = this.g;
        if (i == 0 || i == 26) {
            this.d = (int) (((Math.abs(aob.o2.descent()) + Math.abs(aob.o2.ascent())) * 1.15f) / hl.p);
            return;
        }
        TextPaint[] textPaintArr = aob.y2;
        if (textPaintArr != null && (i == 1 || i == 4 || i == 19 || i == 20)) {
            this.d = (int) (((Math.abs(aob.y2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / hl.p);
            return;
        }
        if (textPaintArr != null && i == 8) {
            this.d = (int) (((Math.abs(aob.y2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / hl.p);
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
            this.d = jn7.V1;
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

    public wl(int i, int i2, TLRPC.Document document) {
        this.g = i;
        this.h = i2;
        this.e = document;
        x();
        w();
        i(false);
    }
}
