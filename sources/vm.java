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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class vm extends Drawable {
    public static SparseArray r;
    public static HashMap s;
    public static boolean t;
    public static boolean u;
    public static boolean v;
    public static final jd w = new jd(2);
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
    public mm k;
    public boolean m;
    public ColorFilter p;
    public ColorFilter q;
    public float l = 1.0f;
    public Boolean n = null;
    public Boolean o = null;

    public vm(int i, int i2, long j) {
        this.h = i2;
        this.g = i;
        x();
        this.f = j;
        g(i2).b(j, new lm(this, (byte) 0));
    }

    public static TLRPC.Document e(int i, long j) {
        HashMap hashMap = g(i).a;
        if (hashMap == null) {
            return null;
        }
        return (TLRPC.Document) hashMap.get(Long.valueOf(j));
    }

    public static int f() {
        return gda.o() == 0 ? 0 : 2;
    }

    public static rm g(int i) {
        HashMap hashMap = s;
        if (hashMap == null) {
            hashMap = new HashMap();
            s = hashMap;
        }
        rm rmVar = (rm) hashMap.get(Integer.valueOf(i));
        if (rmVar != null) {
            return rmVar;
        }
        HashMap hashMap2 = s;
        Integer valueOf = Integer.valueOf(i);
        rm rmVar2 = new rm(i);
        hashMap2.put(valueOf, rmVar2);
        return rmVar2;
    }

    public static vm l(int i, int i2, TLRPC.Document document) {
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
        vm vmVar = (vm) longSparseArray.get(document.id);
        if (vmVar != null) {
            return vmVar;
        }
        long j = document.id;
        vm vmVar2 = new vm(i2, i, document);
        longSparseArray.put(j, vmVar2);
        return vmVar2;
    }

    public static vm m(int i, long j, String str, int i2) {
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
        vm vmVar = (vm) longSparseArray.get(j);
        if (vmVar != null) {
            return vmVar;
        }
        vm vmVar2 = new vm();
        vmVar2.l = 1.0f;
        vmVar2.n = null;
        vmVar2.o = null;
        vmVar2.h = i;
        vmVar2.g = i2;
        vmVar2.x();
        vmVar2.f = j;
        vmVar2.i = str;
        g(i).b(j, new lm(vmVar2, b));
        longSparseArray.put(j, vmVar2);
        return vmVar2;
    }

    public static void r(int i, boolean z) {
        LongSparseArray longSparseArray;
        mm mmVar;
        boolean z2 = !z;
        if (v != z2) {
            v = z2;
            if (r == null || (longSparseArray = (LongSparseArray) r.get(Objects.hash(Integer.valueOf(i), 25))) == null) {
                return;
            }
            for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                vm vmVar = (vm) longSparseArray.valueAt(i2);
                if (vmVar != null && (mmVar = vmVar.k) != null) {
                    if (z) {
                        mmVar.v0 = true;
                        mmVar.u0 = true;
                        mmVar.M(1);
                        kn m = mmVar.m();
                        if (m != null) {
                            boolean z3 = mmVar.w0;
                            if (!m.o0) {
                                m.w0 = z3;
                            }
                            m.start();
                        } else {
                            p09 y = mmVar.y();
                            if (y != null) {
                                y.start();
                            }
                        }
                    } else {
                        mmVar.u0 = false;
                        mmVar.v0 = false;
                        mmVar.M(0);
                        mmVar.x0();
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
                    vm vmVar = (vm) longSparseArray.get(keyAt);
                    if (vmVar == null || !vmVar.a) {
                        longSparseArray.remove(keyAt);
                    } else {
                        vmVar.i(true);
                    }
                }
            }
        }
    }

    public static void w() {
        t = e86.e(16388);
        u = e86.e(8200);
    }

    public final void a(dn dnVar) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList(10);
            this.c = arrayList;
        }
        this.m = false;
        if (!arrayList.contains(dnVar)) {
            this.c.add(dnVar);
        }
        u();
    }

    public final void b(View view) {
        if (view instanceof yy9) {
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
        if (!k() && !k47.B4(this.e)) {
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
        mm mmVar = this.k;
        if (mmVar == null) {
            return;
        }
        mmVar.j0(getBounds());
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
        return gm.L(this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return gm.L(this.d);
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
        meb d;
        String str;
        gn5 gn5Var;
        gn5 b;
        lm5 lm5Var;
        gn5 gn5Var2;
        Drawable g;
        Drawable drawable;
        mm mmVar;
        int i;
        String str2 = this.i;
        int i2 = this.g;
        TLRPC.Document document = this.e;
        if (document != null) {
            mm mmVar2 = this.k;
            if (mmVar2 == null || this.j || z) {
                if ((i2 == 20 || i2 == 21) && (document instanceof TLRPC.TL_documentEmpty)) {
                    return;
                }
                byte b2 = 0;
                this.j = false;
                if (mmVar2 == null) {
                    mm mmVar3 = new mm(this, b2);
                    this.k = mmVar3;
                    mmVar3.d = this.h;
                    mmVar3.A1 = true;
                    if (i2 == 12) {
                        mmVar3.y = true;
                    }
                }
                if (this.p != null && c()) {
                    this.k.p1 = this.p;
                }
                if (i2 != 0) {
                    this.k.w1 = aq1.n(i2 == 12 ? 2 : i2, "_");
                }
                this.k.z1 = true;
                boolean z2 = (gda.o() == 0 && i2 == 5) || ((i2 == 2 || i2 == 25) && !t) || (i2 == 3 && !u);
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
                if (i2 != 17 && i2 != 15 && i2 != 14 && i2 != 8 && ((i2 != 1 || gda.o() < 2) && i2 != 12)) {
                    str3 = str3.concat("_pcache");
                }
                if (i2 != 17 && i2 != 0 && i2 != 26 && i2 != 1 && i2 != 14 && i2 != 15 && i2 != 19 && i2 != 20 && i2 != 21) {
                    str3 = str3.concat("_compress");
                }
                if (i2 == 8) {
                    str3 = str3.concat("firstframe");
                }
                TLRPC.PhotoSize w2 = bc4.w(this.e.thumbs, 90, false, null, false);
                boolean equals = "video/webm".equals(this.e.mime_type);
                TLRPC.Document document2 = this.e;
                if (equals) {
                    b = gn5.b(document2);
                    str3 = str3.concat("_g");
                    d = eq3.d(this.e.thumbs, cmb.l6, 0.2f, true);
                } else {
                    if (!"application/x-tgsticker".equals(document2.mime_type)) {
                        d = eq3.d(this.e.thumbs, cmb.l6, 0.2f, true);
                        if (d != null && k47.K2(this.e, true)) {
                            d.e = 512;
                            d.f = 512;
                        }
                        str = str3;
                        gn5Var = null;
                        if (i2 != 20 || i2 == 21) {
                            gn5Var2 = null;
                            g = gw3.g(k47.V(this.e, null, null));
                            if (g != null) {
                                drawable = g;
                                if (str2 != null) {
                                    this.k.g0(new kn(new File(str2), true, 0L, 0, null, null, null, 0L, this.h, true, 512, 512, null, 0, true));
                                } else if (i2 == 8) {
                                    mm mmVar4 = this.k;
                                    TLRPC.Document document3 = this.e;
                                    mmVar4.Y(null, null, gn5Var, str, null, null, drawable, document3.size, null, document3, 1);
                                } else {
                                    String str4 = str;
                                    if (z2 || !(t || i2 == 14)) {
                                        gn5 c = i2 == 16 ? gn5.c(w2, this.e) : gn5Var2;
                                        if ("video/webm".equals(this.e.mime_type)) {
                                            mm mmVar5 = this.k;
                                            gn5 c2 = gn5.c(w2, this.e);
                                            String str5 = this.d + "_" + this.d;
                                            TLRPC.Document document4 = this.e;
                                            mmVar5.Y(null, null, c2, str5, c, null, drawable, document4.size, null, document4, 1);
                                        } else {
                                            boolean K2 = k47.K2(this.e, true);
                                            mm mmVar6 = this.k;
                                            if (K2) {
                                                String concat = str4.concat("_firstframe");
                                                TLRPC.Document document5 = this.e;
                                                mmVar6.Z(gn5Var, concat, c, null, drawable, document5.size, null, document5, 1);
                                            } else {
                                                gn5 c3 = gn5.c(w2, this.e);
                                                String str6 = this.d + "_" + this.d;
                                                TLRPC.Document document6 = this.e;
                                                mmVar6.Z(c3, str6, c, null, drawable, document6.size, null, document6, 1);
                                            }
                                        }
                                    } else {
                                        gn5 c4 = i2 == 17 ? gn5.c(w2, this.e) : gn5Var2;
                                        mm mmVar7 = this.k;
                                        gn5 c5 = gn5.c(w2, this.e);
                                        String str7 = this.d + "_" + this.d;
                                        TLRPC.Document document7 = this.e;
                                        mmVar7.Y(gn5Var, str4, c5, str7, c4, null, drawable, document7.size, null, document7, 1);
                                    }
                                }
                                v(this.k);
                                if (i2 != 13 || i2 == 16 || i2 == 3 || i2 == 5 || i2 == 4 || i2 == 24) {
                                    this.k.m0(7);
                                }
                                if (i2 != 9 || i2 == 21 || i2 == 27) {
                                    this.k.m0(6656);
                                }
                                mmVar = this.k;
                                mmVar.S0 = true;
                                if (i2 != 12 || i2 == 26 || i2 == 18 || i2 == 8 || i2 == 6 || i2 == 5 || (i2 == 25 && v)) {
                                    i = 0;
                                    mmVar.u0 = false;
                                    mmVar.v0 = false;
                                    mmVar.M(0);
                                } else {
                                    mmVar.v0 = true;
                                    mmVar.u0 = true;
                                    mmVar.M(1);
                                    i = 0;
                                }
                                this.k.x0 = true;
                                this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? gm.L(6.0f) : i2 == 24 ? gm.L(14.0f) : i);
                                u();
                                j();
                            }
                        } else {
                            gn5Var2 = null;
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
                        mmVar = this.k;
                        mmVar.S0 = true;
                        if (i2 != 12) {
                        }
                        i = 0;
                        mmVar.u0 = false;
                        mmVar.v0 = false;
                        mmVar.M(0);
                        this.k.x0 = true;
                        this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? gm.L(6.0f) : i2 == 24 ? gm.L(14.0f) : i);
                        u();
                        j();
                    }
                    String str8 = (i2 != 0 ? aq1.n(i2, "_") : "") + this.f + "@" + str3;
                    if (gda.o() != 0 || i2 == 2 || i2 == 25 || i2 == 22 || (lm5Var = fn5.z().e) == null || !((LinkedHashMap) lm5Var.c).containsKey(str8)) {
                        meb d2 = eq3.d(this.e.thumbs, cmb.l6, i2 == 22 ? 0.8f : 0.2f, false);
                        if (d2 != null && k47.K2(this.e, true)) {
                            d2.e = 512;
                            d2.f = 512;
                        }
                        d = d2;
                    } else {
                        d = null;
                    }
                    b = gn5.b(this.e);
                }
                gn5Var = b;
                str = str3;
                if (i2 != 20) {
                }
                gn5Var2 = null;
                g = gw3.g(k47.V(this.e, null, null));
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
                mmVar = this.k;
                mmVar.S0 = true;
                if (i2 != 12) {
                }
                i = 0;
                mmVar.u0 = false;
                mmVar.v0 = false;
                mmVar.M(0);
                this.k.x0 = true;
                this.k.q0((i2 != 5 || i2 == 6 || i2 == 27) ? gm.L(6.0f) : i2 == 24 ? gm.L(14.0f) : i);
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
                dn dnVar = (dn) this.c.get(i2);
                if (dnVar != null) {
                    dnVar.invalidate();
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
            TLRPC.InputStickerSet i1 = k47.i1(document);
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

    public final void n(dn dnVar) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(dnVar);
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
        mm mmVar = this.k;
        if (mmVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            mmVar.s = j;
        }
    }

    public final void q(String str) {
        mm mmVar;
        int i = this.g;
        if ((i == 20 || i == 21) && !TextUtils.isEmpty(str) && (mmVar = this.k) == null) {
            if (mmVar == null) {
                mmVar = new mm(this, (byte) 0);
                this.k = mmVar;
                mmVar.d = this.h;
                mmVar.A1 = true;
                if (i == 12) {
                    mmVar.y = true;
                }
            }
            this.j = true;
            mmVar.g0(gw3.g(str));
            this.k.B0 = true;
        }
    }

    public final void s(long j) {
        mm mmVar = this.k;
        if (mmVar != null) {
            if (this.g == 8) {
                j = 0;
            }
            if (mmVar.y() != null) {
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
        mm mmVar = this.k;
        if (mmVar != null) {
            mmVar.setAlpha(f);
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
        return b10.j(sb, document == null ? "null" : k47.V(document, null, null), "}");
    }

    public final void u() {
        ArrayList arrayList;
        if (this.k != null) {
            ArrayList arrayList2 = this.b;
            boolean z = (arrayList2 != null && arrayList2.size() > 0) || ((arrayList = this.c) != null && arrayList.size() > 0) || this.m;
            if (z != this.a) {
                this.a = z;
                mm mmVar = this.k;
                if (z) {
                    mmVar.I();
                } else {
                    mmVar.K();
                }
                if (this.a) {
                    return;
                }
                jd jdVar = w;
                gm.r(jdVar);
                gm.d3(jdVar, 5000L);
            }
        }
    }

    public final void v(mm mmVar) {
        int i = this.g;
        if (i == 7 || i == 9 || i == 10) {
            mmVar.N(2);
            return;
        }
        if (i == 11 || i == 18 || i == 14 || i == 6 || i == 5 || i == 22) {
            mmVar.N(1);
        } else if (i == 17) {
            mmVar.N(0);
        }
    }

    public final void x() {
        int i = this.g;
        if (i == 0 || i == 26) {
            this.d = (int) (((Math.abs(cmb.n2.descent()) + Math.abs(cmb.n2.ascent())) * 1.15f) / gm.p);
            return;
        }
        TextPaint[] textPaintArr = cmb.x2;
        if (textPaintArr != null && (i == 1 || i == 4 || i == 19 || i == 20)) {
            this.d = (int) (((Math.abs(cmb.x2[2].descent()) + Math.abs(textPaintArr[2].ascent())) * 1.15f) / gm.p);
            return;
        }
        if (textPaintArr != null && i == 8) {
            this.d = (int) (((Math.abs(cmb.x2[0].descent()) + Math.abs(textPaintArr[0].ascent())) * 1.15f) / gm.p);
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
            this.d = nm7.V1;
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

    public vm(int i, int i2, TLRPC.Document document) {
        this.g = i;
        this.h = i2;
        this.e = document;
        x();
        w();
        i(false);
    }
}
