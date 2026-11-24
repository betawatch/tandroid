// default package

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wv1 implements ylb, h57 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ yv1 G;
    public SparseIntArray e;
    public tz3 f;
    public TLRPC.WallPaper g;
    public Drawable h;
    public ValueAnimator i;
    public Bitmap j;
    public Bitmap k;
    public Canvas m;
    public BitmapShader n;
    public BitmapShader o;
    public boolean p;
    public AnimatorSet r;
    public boolean s;
    public m37 t;
    public m37 u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Matrix c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint l = new Paint();
    public final Rect E = new Rect();
    public final Rect F = new Rect();
    public boolean q = cmb.I.o();

    public wv1(yv1 yv1Var) {
        int i;
        int i2;
        fnb fnbVar;
        this.G = yv1Var;
        if (p(false)) {
            i = ((d) yv1Var).currentAccount;
            uf2 e = uf2.e(i);
            long j = yv1Var.l6;
            LongSparseArray longSparseArray = e.h;
            fnb fnbVar2 = (fnb) longSparseArray.get(j);
            if (fnbVar2 == null) {
                String string = a.b.getSharedPreferences("chatthemeconfig_emoji", 0).getString("chatTheme_" + e.currentAccount + "_" + j, null);
                if (string != null) {
                    if (string.startsWith("gift_")) {
                        fnbVar = new fnb(null, string.substring(5));
                    } else if (string.startsWith("emoticon_")) {
                        fnbVar = new fnb(string.substring(9), null);
                    } else if (!TextUtils.isEmpty(string)) {
                        fnbVar = new fnb(string, null);
                    }
                    fnbVar2 = fnbVar;
                    longSparseArray.put(j, fnbVar2);
                }
                fnbVar2 = null;
                longSparseArray.put(j, fnbVar2);
            }
            this.f = e.g(fnbVar2);
            i2 = ((d) yv1Var).currentAccount;
            TLRPC.WallPaper c = uf2.e(i2).c(yv1Var.l6);
            this.g = c;
            tz3 tz3Var = this.f;
            if (tz3Var != null || c != null) {
                r(tz3Var, c, false);
                gm.c3(new jd((byte) 18));
            }
        }
        s();
        if (ThemeEditorView.p == null) {
            cmb.r1(true, true);
            return;
        }
        gm.c3(new jd((byte) 18));
    }

    @Override // ylb
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        return (sparseIntArray == null || sparseIntArray.size() <= 0) ? cmb.I.o() : this.q;
    }

    @Override // ylb
    public final void b(float f, float f2, int i, int i2) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h == null || (bitmap = this.j) == null || (bitmapShader = this.n) == null) {
            cmb.q(f, f2, i, i2);
            return;
        }
        boolean z = this.p;
        Matrix matrix = this.c;
        if (z) {
            cmb.r(this.k, this.o, matrix, i, i2, f, f2);
        } else {
            cmb.r(bitmap, bitmapShader, matrix, i, i2, f, f2);
        }
    }

    @Override // ylb
    public final ColorFilter c() {
        return cmb.u3;
    }

    @Override // ylb
    public final Paint d(String str) {
        if (this.f == null && this.h == null && !this.s) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // ylb
    public final boolean e() {
        return this.G.U7();
    }

    @Override // ylb
    public final int f(int i) {
        return h(i);
    }

    @Override // ylb
    public final boolean g() {
        return (this.h != null || this.s) ? this.n != null : cmb.b1();
    }

    @Override // ylb
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    @Override // ylb
    public final int h(int i) {
        int indexOfKey;
        Integer y0;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.s && (y0 = cmb.y0(i, this)) != null) {
            return y0.intValue();
        }
        if (this.f == null) {
            return cmb.w0(null, i, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i2 = cmb.hm.get(i);
        return (i2 < 0 || (indexOfKey = this.d.indexOfKey(i2)) < 0) ? cmb.w0(null, i, false) : this.d.valueAt(indexOfKey);
    }

    @Override // ylb
    public final void i(int i, int i2) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i, i2);
        }
    }

    @Override // ylb
    public final int j(int i) {
        return k(i, false);
    }

    public final int k(int i, boolean z) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return cmb.w0(null, i, false);
        }
        if (!z && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i)) < 0) ? cmb.w0(null, i, false) : this.d.valueAt(indexOfKey);
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        return drawable != null ? drawable : cmb.s0();
    }

    public final void m() {
        Drawable m37Var;
        for (Map.Entry entry : cmb.cm.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    m37Var = new m37(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    m37Var = new m37(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    m37Var = new m37(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    m37Var = new m37(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    m37Var = new m37(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    m37Var = new m37(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    m37Var = new m37(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    m37Var = new m37(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    m37Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (m37Var != null) {
                        int intValue = ((Integer) cmb.dm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            cmb.A1(h(intValue), m37Var);
                            break;
                        }
                    }
                    break;
            }
            if (m37Var != null) {
                this.a.put((String) entry.getKey(), m37Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : cmb.em.entrySet()) {
            Paint paint2 = (Paint) entry.getValue();
            if (paint2 instanceof TextPaint) {
                paint = new TextPaint();
                paint.setTextSize(paint2.getTextSize());
                paint.setTypeface(paint2.getTypeface());
            } else {
                paint = new Paint();
            }
            if ((paint2.getFlags() & 1) != 0) {
                paint.setFlags(1);
            }
            int intValue = ((Integer) cmb.fm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Drawable drawable) {
        float f;
        boolean z;
        float f2;
        Paint d;
        Paint d2;
        int width;
        int i;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        yv1 yv1Var = this.G;
        if (yv1Var.za != null) {
            return;
        }
        int i2 = gm.q(drawable2)[0];
        int k = k(cmb.bd, false);
        int i3 = cmb.xd;
        int k2 = k(i3, false);
        if (k != 0 && this.g == null) {
            i2 = k;
        }
        boolean U7 = yv1Var.U7();
        if (U7) {
            i2 = on2.l(k(cmb.Da, false), k(cmb.ta, false));
        }
        this.B = i2;
        if (drawable2 instanceof a92) {
            a92 a92Var = (a92) drawable2;
            f = a92Var.f == null ? a92Var.d : 0.0f;
            drawable2 = a92Var.c(false);
        } else {
            f = 0.0f;
        }
        boolean z2 = !U7 && ((drawable2 instanceof ah7) || (drawable2 instanceof BitmapDrawable)) && gda.o() != 0;
        this.C = z2;
        tz3 tz3Var = this.f;
        if (tz3Var != null) {
            TLRPC.ChatTheme chatTheme = tz3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.q) {
                        z = true;
                        this.D = z2;
                        if (z2) {
                            boolean z3 = drawable2 instanceof BitmapDrawable;
                            Rect rect = this.F;
                            f2 = 0.0f;
                            Rect rect2 = this.E;
                            if (z3) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i = (int) (bitmap.getHeight() * (40.0f / bitmap.getWidth()));
                                    width = 40;
                                } else {
                                    width = (int) (bitmap.getWidth() * (40.0f / bitmap.getHeight()));
                                    i = 40;
                                }
                                this.j = Bitmap.createBitmap(width, i, Bitmap.Config.ARGB_8888);
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.j, 3);
                                this.m.drawColor(on2.p(-16777216, (int) (f * 255.0f)));
                                Bitmap bitmap2 = this.j;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                this.n = new BitmapShader(bitmap2, tileMode, tileMode);
                                this.k = Bitmap.createBitmap(this.j);
                                this.o = new BitmapShader(this.k, tileMode, tileMode);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.n.setFilterMode(2);
                                    this.o.setFilterMode(2);
                                }
                                this.p = true;
                            } else {
                                this.j = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                Bitmap bitmap3 = ((ah7) drawable2).k;
                                this.k = bitmap3;
                                if (z) {
                                    this.k = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.k).drawColor(-870178270);
                                }
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
                                this.m.drawColor(on2.p(-16777216, (int) (f * 255.0f)));
                                if (z) {
                                    this.m.drawColor(-870178270);
                                }
                                Bitmap bitmap4 = this.j;
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                this.n = new BitmapShader(bitmap4, tileMode2, tileMode2);
                                this.o = new BitmapShader(this.k, tileMode2, tileMode2);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.n.setFilterMode(2);
                                    this.o.setFilterMode(2);
                                }
                                this.p = true;
                            }
                        } else {
                            f2 = 0.0f;
                            this.j = null;
                            this.n = null;
                            this.k = null;
                            this.m = null;
                            this.p = false;
                        }
                        d = d("paintChatActionBackground");
                        Paint d3 = d("paintChatActionBackgroundSelected");
                        d2 = d("paintChatMessageBackgroundSelected");
                        HashMap hashMap = this.b;
                        if (d != null) {
                            Paint paint = (Paint) hashMap.get("paintChatActionBackgroundDarken");
                            if (paint == null) {
                                paint = new Paint(1);
                                hashMap.put("paintChatActionBackgroundDarken", paint);
                                paint.setColor(0);
                            }
                            if (this.C) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (drawable2 instanceof ah7) {
                                    if (((ah7) drawable2).q >= f2) {
                                        colorMatrix.setSaturation(1.6f);
                                        gm.l2(colorMatrix, this.q ? 0.97f : 0.92f);
                                        gm.h(colorMatrix, this.q ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        gm.l2(colorMatrix, this.q ? 0.4f : 0.8f);
                                        gm.h(colorMatrix, this.q ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    gm.l2(colorMatrix, this.q ? 0.9f : 0.84f);
                                    gm.h(colorMatrix, this.q ? 0.04f : 0.06f);
                                }
                                d.setAlpha(nm7.d4);
                                d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                d.setShader(this.o);
                                d.setFilterBitmap(true);
                                d3.setAlpha(nm7.d4);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                gm.i(colorMatrix2, 0.26f);
                                gm.l2(colorMatrix2, 0.92f);
                                d3.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                d3.setShader(this.o);
                                d3.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                d.setColorFilter(null);
                                d.setShader(null);
                                d3.setColorFilter(null);
                                d3.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (d2 == null) {
                            d2 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", d2);
                        }
                        if (!this.D) {
                            if (k2 == 0) {
                                k2 = h(i3);
                            }
                            d2.setColor(k2);
                            d2.setColorFilter(null);
                            d2.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        gm.i(colorMatrix3, 2.5f);
                        gm.l2(colorMatrix3, 0.75f);
                        d2.setAlpha(64);
                        d2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        d2.setShader(this.o);
                        d2.setFilterBitmap(true);
                        return;
                    }
                }
            }
            tL_starGiftUnique = null;
            if (tL_starGiftUnique != null) {
                z = true;
                this.D = z2;
                if (z2) {
                }
                d = d("paintChatActionBackground");
                Paint d32 = d("paintChatActionBackgroundSelected");
                d2 = d("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (d != null) {
                }
                if (d2 == null) {
                }
                if (!this.D) {
                }
            }
        }
        z = false;
        this.D = z2;
        if (z2) {
        }
        d = d("paintChatActionBackground");
        Paint d322 = d("paintChatActionBackgroundSelected");
        d2 = d("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (d != null) {
        }
        if (d2 == null) {
        }
        if (!this.D) {
        }
    }

    public final boolean p(boolean z) {
        TLRPC.User user;
        yv1 yv1Var = this.G;
        if (yv1Var.h != null) {
            return false;
        }
        if (z) {
            return (yv1Var.e != null || (user = yv1Var.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (android.text.TextUtils.equals(uf2.h(r15), uf2.h(r8)) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(tz3 tz3Var, TLRPC.WallPaper wallPaper, boolean z, Boolean bool, boolean z2) {
        tk5 tk5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        tk5 tk5Var2;
        boolean equals;
        yv1 yv1Var = this.G;
        tk5Var = ((d) yv1Var).parentLayout;
        if (tk5Var == null || yv1Var.za != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.q;
        fnb fnbVar = tz3Var != null ? tz3Var.c : null;
        tz3 tz3Var2 = this.f;
        fnb fnbVar2 = tz3Var2 != null ? tz3Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.g;
        byte b = 1;
        byte b2 = 0;
        if (!z2) {
            if (!p(false)) {
                return;
            }
            if (fnb.a(fnbVar2, fnbVar) && this.q == booleanValue) {
                mp3 mp3Var = uf2.s;
                if (wallPaper != null) {
                    if (wallPaper2 != null) {
                        String str = wallPaper.uploadingImage;
                        if (str != null) {
                            equals = TextUtils.equals(wallPaper2.uploadingImage, str);
                        } else if (wallPaper.id == wallPaper2.id) {
                            if (TextUtils.equals(a92.e(wallPaper.settings), a92.e(wallPaper2.settings))) {
                            }
                        }
                    }
                    equals = false;
                }
                if (equals) {
                    return;
                }
            }
        }
        this.q = booleanValue;
        bmb B0 = booleanValue ? cmb.J : cmb.B0();
        sk5 sk5Var = new sk5(B0, B0.Z, B0.o(), !z);
        tz3 tz3Var3 = this.f;
        if (tz3Var3 == null && this.g == null) {
            Drawable s0 = cmb.s0();
            this.C = s0 instanceof ah7;
            o(s0);
            this.v = this.C ? -1 : cmb.w0(null, cmb.Yc, false);
            this.w = this.C ? -1 : cmb.w0(null, cmb.Zc, false);
            this.x = this.C ? -1 : cmb.w0(null, cmb.Zc, false);
            this.y = this.C ? -1 : cmb.w0(null, cmb.ad, false);
        } else {
            if (this.C) {
                Drawable drawable = this.h;
                if (drawable instanceof ah7) {
                    Bitmap bitmap = ((ah7) drawable).k;
                    this.A = bitmap;
                    if (tz3Var3 != null) {
                        TLRPC.ChatTheme chatTheme = tz3Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null && this.q) {
                                    this.A = Bitmap.createBitmap(bitmap);
                                    new Canvas(this.A).drawColor(-870178270);
                                }
                            }
                        }
                        tL_starGiftUnique = null;
                        if (tL_starGiftUnique != null) {
                            this.A = Bitmap.createBitmap(bitmap);
                            new Canvas(this.A).drawColor(-870178270);
                        }
                    }
                }
            }
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                o(drawable2);
            }
        }
        this.z = this.B;
        this.v = this.C ? -1 : k(cmb.Yc, true);
        this.w = this.C ? -1 : k(cmb.Zc, true);
        this.x = this.C ? -1 : k(cmb.Zc, true);
        this.y = this.C ? -1 : k(cmb.ad, true);
        if (tz3Var != null || wallPaper != null) {
            int i = gm.q(this.h)[0];
            m();
            n();
        }
        sk5Var.f = false;
        if (yv1Var.l6 < 0) {
            sk5Var.g = false;
        }
        sk5Var.h = new rh((Object) this, (Object) tz3Var, (Object) wallPaper, z, (byte) 7);
        if (z) {
            sk5Var.k = new tv1(this);
            sk5Var.i = new qv1(this, b2);
            sk5Var.j = new qv1(this, b);
        } else {
            if (yv1Var.m1 != null) {
                yv1Var.Lc();
            }
            sk5Var.h.run();
        }
        sk5Var.e = true;
        sk5Var.m = this;
        sk5Var.l = (short) 250;
        tk5Var2 = ((d) yv1Var).parentLayout;
        ((ActionBarLayout) tk5Var2).e(sk5Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(tz3 tz3Var, TLRPC.WallPaper wallPaper, boolean z) {
        int indexOfKey;
        int i;
        int i2;
        ArrayList arrayList;
        amb ambVar;
        SparseIntArray R0;
        int indexOfKey2;
        bmb bmbVar;
        boolean z2;
        Drawable drawable;
        int i3;
        char c;
        bmb O0;
        int i4;
        bmb O02;
        tz3 tz3Var2 = tz3Var;
        yv1 yv1Var = this.G;
        if (yv1Var.za != null) {
            return;
        }
        this.f = tz3Var2;
        this.g = wallPaper;
        Drawable backgroundImage = yv1Var.fragmentView != null ? yv1Var.m1.getBackgroundImage() : null;
        ah7 ah7Var = backgroundImage instanceof ah7 ? (ah7) backgroundImage : null;
        int i5 = ah7Var != null ? ah7Var.i : 0;
        if ((tz3Var2 == null || tz3Var2.a) && wallPaper == null && (indexOfKey = cmb.km.indexOfKey(cmb.bd)) >= 0) {
            cmb.km.valueAt(indexOfKey);
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (tz3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s0 = cmb.s0();
            if (s0 instanceof ah7) {
                ((ah7) s0).t(i5);
            }
            this.h = null;
            if (cmb.I.o() == this.q) {
                O02 = cmb.I;
            } else {
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (cmb.O0(string) != null && !cmb.O0(string).o()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (cmb.O0(string2) != null && cmb.O0(string2).o()) {
                    str = string2;
                }
                O02 = this.q ? cmb.O0(str) : cmb.O0(str2);
            }
            cmb.t(O02, false, this.q);
            o(this.h);
            this.s = false;
            s();
            return;
        }
        this.s = false;
        if (a.b != null) {
            cmb.J(a.b, false);
        }
        if (tz3Var2 == null) {
            this.d = new SparseIntArray();
            i2 = 0;
        } else {
            i = ((d) this.G).currentAccount;
            boolean z3 = this.q;
            ArrayList arrayList2 = tz3Var2.f;
            bmb i6 = tz3Var2.i(z3 ? 1 : 0);
            if (i6 == null) {
                int i7 = ((sz3) tz3Var2.f.get(z3 ? 1 : 0)).d;
                i2 = 0;
                sz3 sz3Var = (sz3) ((el5) tz3Var2.f.get(z3 ? 1 : 0));
                TLRPC.ThemeSettings b = sz3Var.b(i7);
                TLRPC.TL_theme tL_theme = ((sz3) tz3Var2.f.get(z3 ? 1 : 0)).b;
                bmb bmbVar2 = new bmb(cmb.O0(cmb.q0(b)));
                arrayList = arrayList2;
                ambVar = bmbVar2.c(sz3Var.a(), b, tL_theme, i, true);
                bmbVar2.u(ambVar.a);
                i6 = bmbVar2;
            } else {
                i2 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i6.b0;
                ambVar = sparseArray != null ? (amb) sparseArray.get(((sz3) arrayList.get(z3 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i6.b != null) {
                R0 = cmb.R0(new File(i6.b), null, strArr);
            } else {
                String str3 = i6.d;
                R0 = str3 != null ? cmb.R0(null, str3, strArr) : new SparseIntArray();
            }
            ((sz3) arrayList.get(z3 ? 1 : 0)).g = strArr[i2];
            if (ambVar != null) {
                SparseIntArray clone = R0.clone();
                ambVar.d(R0, clone);
                fnb fnbVar = tz3Var2.c;
                if (fnbVar != null && !TextUtils.isEmpty(fnbVar.b) && (bmbVar = ambVar.b) != null && bmbVar.b == null && !bmbVar.o()) {
                    amb.g(clone);
                }
                R0 = clone;
            }
            SparseIntArray sparseIntArray = cmb.hm;
            for (int i8 = i2; i8 < sparseIntArray.size(); i8++) {
                int keyAt = sparseIntArray.keyAt(i8);
                int valueAt = sparseIntArray.valueAt(i8);
                if (R0.indexOfKey(keyAt) < 0 && (indexOfKey2 = R0.indexOfKey(valueAt)) >= 0) {
                    R0.put(keyAt, R0.valueAt(indexOfKey2));
                }
            }
            int[] iArr = cmb.gm;
            for (int i9 = i2; i9 < iArr.length; i9++) {
                if (R0.indexOfKey(i9) < 0) {
                    R0.put(i9, iArr[i9]);
                }
            }
            this.d = R0;
        }
        if (!TextUtils.isEmpty(uf2.h(this.g))) {
            Drawable drawable2 = this.h;
            i4 = ((d) this.G).currentAccount;
            this.h = cl8.e(drawable2, i4, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = a92.d(this.h, wallPaper, this.q);
        } else {
            if (tz3Var2.a) {
                bmb d = tz3.d(this.q);
                i3 = ((d) this.G).currentAccount;
                cmb.I(d, tz3Var2.g(i3, this.q ? 1 : 0), ((sz3) tz3Var2.f.get(this.q ? 1 : 0)).g, i5, i2);
                drawable = new ColorDrawable(-16777216);
            } else {
                int h = h(cmb.De);
                int h2 = h(cmb.Ee);
                int h3 = h(cmb.Fe);
                int h4 = h(cmb.Ge);
                ah7 ah7Var2 = new ah7();
                ah7Var2.r(tz3Var2.j(this.q ? 1 : 0).settings.intensity, ah7Var2.u);
                TLRPC.Document e = tz3Var2.e();
                if (ah7Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ah7Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ah7Var2.c;
                    if (weakReference != null) {
                        ah7Var2.y.p0((View) weakReference.get());
                    }
                    if (ah7Var2.T) {
                        ah7Var2.y.I();
                    }
                }
                ah7Var2.y.d0(gn5.b(e), "80_80", null, null, null, 0);
                ah7Var2.y.N(1);
                ah7Var2.y.M(1);
                ah7Var2.n(true, h, h2, h3, h4);
                ah7Var2.t(i5);
                int f = ah7Var2.f();
                boolean z4 = this.q;
                g11 g11Var = new g11((Object) this, (Object) ah7Var2, (byte) 19);
                sz3 sz3Var2 = (sz3) tz3Var2.f.get(z4 ? 1 : 0);
                if (sz3Var2 == null || sz3Var2.c == null) {
                    z2 = z4 ? 1 : 0;
                } else {
                    long h5 = tz3Var2.h(z4 ? 1 : 0);
                    TL_stars.StarGift starGift = sz3Var2.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z2 = z4 ? 1 : 0;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i10);
                            int i11 = i10 + 1;
                            int i12 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i12;
                                i10 = i11;
                            }
                        }
                    } else {
                        z2 = z4 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    gn5 b2 = gn5.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.d0(b2, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.h1 = new d12((Object) g11Var, h5, (byte) 4);
                    fn5.z().I(imageReceiver2, null);
                }
                tz3Var2 = tz3Var;
                tz3Var2.n(this.q ? 1 : 0, new sv1(this, tz3Var2, z2, ah7Var2, f));
                drawable = ah7Var2;
            }
            this.h = drawable;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z) {
            this.r = new AnimatorSet();
            if (ah7Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new rv1(ah7Var, (byte) 0));
                ofFloat.addListener(new uv1(ah7Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable3 = this.h;
            if (drawable3 instanceof ah7) {
                ah7 ah7Var3 = (ah7) drawable3;
                ah7Var3.q(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new rv1(ah7Var3, (byte) 1));
                ofFloat2.addListener(new vv1(ah7Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (tz3Var2 != null || this.G.l6 < 0) {
            c = 0;
        } else {
            if (cmb.I.o() == this.q) {
                O0 = cmb.I;
            } else {
                SharedPreferences sharedPreferences2 = a.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (cmb.O0(string3) != null && !cmb.O0(string3).o()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (cmb.O0(string4) != null && cmb.O0(string4).o()) {
                    str = string4;
                }
                O0 = this.q ? cmb.O0(str) : cmb.O0(str2);
            }
            c = 0;
            cmb.t(O0, false, this.q);
        }
        int i13 = gm.q(this.h)[c];
        m();
        n();
        o(this.h);
        t(1.0f);
    }

    public final void s() {
        yv1 yv1Var = this.G;
        if (yv1Var.za == null && this.f == null && this.g == null) {
            boolean z = yv1Var.U7() && !gda.D0;
            if (z || this.s) {
                this.s = z;
                this.b.clear();
                this.a.clear();
                if (z) {
                    if (a.b != null) {
                        cmb.J(a.b, false);
                    }
                    m();
                    n();
                }
                o(cmb.s0());
                t(1.0f);
            }
        }
    }

    public final void t(float f) {
        int k;
        int k2;
        int k3;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint d = d("paintChatActionBackground");
        Paint d2 = d("paintChatActionBackgroundSelected");
        Paint d3 = d("paintChatMessageBackgroundSelected");
        int i = this.B;
        boolean U7 = this.G.U7();
        int i2 = -1;
        if (this.C) {
            k = -1;
        } else {
            k = k(U7 ? cmb.Ea : cmb.Yc, true);
        }
        if (this.C) {
            k2 = -1;
        } else {
            k2 = k(U7 ? cmb.Ea : cmb.Zc, true);
        }
        if (this.C) {
            k3 = -1;
        } else {
            k3 = k(U7 ? cmb.Ga : cmb.Zc, true);
        }
        if (!this.C) {
            i2 = k(U7 ? cmb.Fa : cmb.ad, true);
        }
        if (f != 1.0f) {
            i = on2.f(f, this.z, i);
            k = on2.f(f, this.v, k);
            k2 = on2.f(f, this.w, k2);
            k3 = on2.f(f, this.x, k3);
            i2 = on2.f(f, this.y, i2);
        }
        if (d != null && !this.C) {
            d.setColor(i);
            d2.setColor(i);
        }
        Paint d4 = d("paintChatActionText");
        if (d4 != null) {
            ((TextPaint) d4).linkColor = k2;
            d("paintChatActionText").setColor(k);
            d("paintChatBotButton").setColor(k3);
        }
        cmb.A1(k, getDrawable("drawableMsgStickerCheck"));
        cmb.A1(k, getDrawable("drawableMsgStickerClock"));
        cmb.A1(k, getDrawable("drawableMsgStickerHalfCheck"));
        cmb.A1(k, getDrawable("drawableMsgStickerPinned"));
        cmb.A1(k, getDrawable("drawableMsgStickerReplies"));
        cmb.A1(k, getDrawable("drawableMsgStickerViews"));
        cmb.A1(i2, getDrawable("drawableBotInline"));
        cmb.A1(i2, getDrawable("drawableBotLink"));
        cmb.A1(i2, getDrawable("drawableBotLock"));
        cmb.A1(i2, getDrawable("drawable_botInvite"));
        cmb.A1(i2, getDrawable("drawableCommentSticker"));
        cmb.A1(i2, getDrawable("drawableGoIcon"));
        cmb.A1(i2, getDrawable("drawableReplyIcon"));
        cmb.A1(i2, getDrawable("drawableShareIcon"));
        if (this.m == null || (bitmap = this.k) == null) {
            return;
        }
        Rect rect = this.F;
        Rect rect2 = this.E;
        if (f == 1.0f || (bitmap2 = this.A) == null) {
            this.p = true;
            rect2.set(0, 0, bitmap.getWidth(), this.k.getHeight());
            rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
            this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
            if (d != null) {
                d.setShader(this.o);
                d2.setShader(this.o);
            }
            if (d3 != null) {
                d3.setShader(this.o);
                return;
            }
            return;
        }
        this.p = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.A, rect2, rect, (Paint) null);
        Paint paint = this.l;
        paint.setAlpha((int) (f * 255.0f));
        rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.k, rect2, rect, paint);
        if (d != null) {
            d.setShader(this.n);
            d2.setShader(this.n);
        }
        if (d3 != null) {
            d3.setShader(this.n);
        }
    }
}
