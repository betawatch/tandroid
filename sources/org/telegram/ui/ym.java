package org.telegram.ui;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ym implements org.telegram.ui.ActionBar.e6, org.telegram.ui.Components.ga0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ an G;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.p3 f;
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
    public org.telegram.ui.ActionBar.r4 t;
    public org.telegram.ui.ActionBar.r4 u;
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
    public boolean q = org.telegram.ui.ActionBar.j6.I.q();

    public ym(an anVar) {
        int i7;
        int i10;
        this.G = anVar;
        boolean z10 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            this.f = org.telegram.messenger.d4.f(i7).c(anVar.k6);
            i10 = ((org.telegram.ui.ActionBar.e2) anVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.d4.f(i10).d(anVar.k6);
            this.g = d;
            org.telegram.ui.ActionBar.p3 p3Var = this.f;
            if (p3Var != null || d != null) {
                s(p3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (z10 || ThemeEditorView.p != null) {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.c6(20));
        } else {
            org.telegram.ui.ActionBar.j6.t1(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        return (sparseIntArray == null || sparseIntArray.size() <= 0) ? org.telegram.ui.ActionBar.j6.I.q() : this.q;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void b(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h == null || (bitmap = this.j) == null || (bitmapShader = this.n) == null) {
            org.telegram.ui.ActionBar.j6.r(f10, f11, i7, i10);
            return;
        }
        boolean z10 = this.p;
        Matrix matrix = this.c;
        if (z10) {
            org.telegram.ui.ActionBar.j6.s(this.k, this.o, matrix, i7, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.j6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Paint d(String str) {
        if (this.f == null && this.h == null && !this.s) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean e() {
        return this.G.S9();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int f(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final boolean g() {
        return (this.h != null || this.s) ? this.n != null : org.telegram.ui.ActionBar.j6.d1();
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int h(int i7) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.s && (z02 = org.telegram.ui.ActionBar.j6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.j6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.j6.im.get(i7);
        return (i10 < 0 || (indexOfKey = this.d.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.j6.v0(i7) : this.d.valueAt(indexOfKey);
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final void i(int i7, int i10) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.e6
    public final int j(int i7) {
        return k(i7, false);
    }

    public final int k(int i7, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i7)) < 0) ? org.telegram.ui.ActionBar.j6.x0(null, i7, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.p3 l() {
        return this.f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.j6.t0();
    }

    public final void n() {
        Drawable r4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.dm.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    r4Var = new org.telegram.ui.ActionBar.r4(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    r4Var = new org.telegram.ui.ActionBar.r4(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    r4Var = new org.telegram.ui.ActionBar.r4(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    r4Var = new org.telegram.ui.ActionBar.r4(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    r4Var = new org.telegram.ui.ActionBar.r4(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    r4Var = new org.telegram.ui.ActionBar.r4(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    r4Var = new org.telegram.ui.ActionBar.r4(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    r4Var = new org.telegram.ui.ActionBar.r4(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    r4Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (r4Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.j6.em.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.j6.C1(h(intValue), r4Var);
                            break;
                        }
                    }
                    break;
            }
            if (r4Var != null) {
                this.a.put((String) entry.getKey(), r4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.fm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.j6.gm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(h(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(Drawable drawable) {
        float f10;
        boolean z10;
        float f11;
        Paint d;
        Paint d2;
        int i7;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        an anVar = this.G;
        if (anVar.ya != null) {
            return;
        }
        int i10 = org.telegram.messenger.g0.q(drawable2)[0];
        int k10 = k(org.telegram.ui.ActionBar.j6.cd, false);
        int i11 = org.telegram.ui.ActionBar.j6.yd;
        int k11 = k(i11, false);
        if (k10 != 0 && this.g == null) {
            i10 = k10;
        }
        boolean S9 = anVar.S9();
        if (S9) {
            i10 = i0.a.k(k(org.telegram.ui.ActionBar.j6.Ea, false), k(org.telegram.ui.ActionBar.j6.ua, false));
        }
        this.B = i10;
        if (drawable2 instanceof dn) {
            dn dnVar = (dn) drawable2;
            f10 = dnVar.f == null ? dnVar.d : 0.0f;
            drawable2 = dnVar.c(false);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = !S9 && ((drawable2 instanceof org.telegram.ui.Components.ra0) || (drawable2 instanceof BitmapDrawable)) && org.telegram.messenger.gz.o() != 0;
        this.C = z11;
        org.telegram.ui.ActionBar.p3 p3Var = this.f;
        if (p3Var != null) {
            TLRPC.ChatTheme chatTheme = p3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.q) {
                        z10 = true;
                        this.D = z11;
                        if (z11) {
                            boolean z12 = drawable2 instanceof BitmapDrawable;
                            Rect rect = this.F;
                            f11 = 0.0f;
                            Rect rect2 = this.E;
                            if (z12) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                int i12 = 40;
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i7 = (int) ((40 / bitmap.getWidth()) * bitmap.getHeight());
                                } else {
                                    i7 = 40;
                                    i12 = (int) ((40 / bitmap.getHeight()) * bitmap.getWidth());
                                }
                                this.j = Bitmap.createBitmap(i12, i7, Bitmap.Config.ARGB_8888);
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.j, 3);
                                this.m.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
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
                                Bitmap bitmap3 = ((org.telegram.ui.Components.ra0) drawable2).k;
                                this.k = bitmap3;
                                if (z10) {
                                    this.k = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.k).drawColor(-870178270);
                                }
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
                                this.m.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
                                if (z10) {
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
                            f11 = 0.0f;
                            this.j = null;
                            this.n = null;
                            this.k = null;
                            this.m = null;
                            this.p = false;
                        }
                        d = d("paintChatActionBackground");
                        Paint d10 = d("paintChatActionBackgroundSelected");
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
                                if (drawable2 instanceof org.telegram.ui.Components.ra0) {
                                    if (((org.telegram.ui.Components.ra0) drawable2).q >= f11) {
                                        colorMatrix.setSaturation(1.6f);
                                        org.telegram.messenger.g0.n2(colorMatrix, this.q ? 0.97f : 0.92f);
                                        org.telegram.messenger.g0.h(colorMatrix, this.q ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        org.telegram.messenger.g0.n2(colorMatrix, this.q ? 0.4f : 0.8f);
                                        org.telegram.messenger.g0.h(colorMatrix, this.q ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    org.telegram.messenger.g0.n2(colorMatrix, this.q ? 0.9f : 0.84f);
                                    org.telegram.messenger.g0.h(colorMatrix, this.q ? 0.04f : 0.06f);
                                }
                                d.setAlpha(org.telegram.messenger.ns.e4);
                                d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                d.setShader(this.o);
                                d.setFilterBitmap(true);
                                d10.setAlpha(org.telegram.messenger.ns.e4);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                org.telegram.messenger.g0.i(colorMatrix2, 0.26f);
                                org.telegram.messenger.g0.n2(colorMatrix2, 0.92f);
                                d10.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                d10.setShader(this.o);
                                d10.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                d.setColorFilter(null);
                                d.setShader(null);
                                d10.setColorFilter(null);
                                d10.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (d2 == null) {
                            d2 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", d2);
                        }
                        if (!this.D) {
                            if (k11 == 0) {
                                k11 = h(i11);
                            }
                            d2.setColor(k11);
                            d2.setColorFilter(null);
                            d2.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        org.telegram.messenger.g0.i(colorMatrix3, 2.5f);
                        org.telegram.messenger.g0.n2(colorMatrix3, 0.75f);
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
                z10 = true;
                this.D = z11;
                if (z11) {
                }
                d = d("paintChatActionBackground");
                Paint d102 = d("paintChatActionBackgroundSelected");
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
        z10 = false;
        this.D = z11;
        if (z11) {
        }
        d = d("paintChatActionBackground");
        Paint d1022 = d("paintChatActionBackgroundSelected");
        d2 = d("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (d != null) {
        }
        if (d2 == null) {
        }
        if (!this.D) {
        }
    }

    public final boolean q(boolean z10) {
        TLRPC.User user;
        an anVar = this.G;
        if (anVar.h != null) {
            return false;
        }
        if (z10) {
            return (anVar.e != null || (user = anVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        if (android.text.TextUtils.equals(org.telegram.messenger.d4.j(r15), org.telegram.messenger.d4.j(r8)) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(org.telegram.ui.ActionBar.p3 p3Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.o4 o4Var;
        boolean z12;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.o4 o4Var2;
        boolean z13;
        an anVar = this.G;
        o4Var = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
        if (o4Var == null || anVar.ya != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.q;
        ig.b bVar = p3Var != null ? p3Var.c : null;
        org.telegram.ui.ActionBar.p3 p3Var2 = this.f;
        ig.b bVar2 = p3Var2 != null ? p3Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.g;
        int i7 = 1;
        int i10 = 0;
        if (!z11) {
            if (!q(false)) {
                return;
            }
            if (ig.b.a(bVar2, bVar) && this.q == booleanValue) {
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.s;
                if (wallPaper != null || wallPaper2 != null) {
                    if (wallPaper != null && wallPaper2 != null) {
                        String str = wallPaper.uploadingImage;
                        if (str != null) {
                            z13 = TextUtils.equals(wallPaper2.uploadingImage, str);
                            if (z13) {
                                return;
                            }
                        } else if (wallPaper.id == wallPaper2.id) {
                            if (TextUtils.equals(dn.e(wallPaper.settings), dn.e(wallPaper2.settings))) {
                            }
                        }
                    }
                    z13 = false;
                    if (z13) {
                    }
                }
                z13 = true;
                if (z13) {
                }
            }
        }
        this.q = booleanValue;
        org.telegram.ui.ActionBar.i6 D0 = booleanValue ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.D0();
        org.telegram.ui.ActionBar.n4 n4Var = new org.telegram.ui.ActionBar.n4(D0, D0.Z, D0.q(), !z10);
        org.telegram.ui.ActionBar.p3 p3Var3 = this.f;
        if (p3Var3 == null && this.g == null) {
            Drawable t02 = org.telegram.ui.ActionBar.j6.t0();
            this.C = t02 instanceof org.telegram.ui.Components.ra0;
            p(t02);
            this.v = this.C ? -1 : org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Zc, false);
            this.w = this.C ? -1 : org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.ad, false);
            this.x = this.C ? -1 : org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.ad, false);
            this.y = this.C ? -1 : org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.bd, false);
        } else {
            if (this.C) {
                Drawable drawable = this.h;
                if (drawable instanceof org.telegram.ui.Components.ra0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.ra0) drawable).k;
                    this.A = bitmap;
                    if (p3Var3 != null) {
                        TLRPC.ChatTheme chatTheme = p3Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null) {
                                    z12 = true;
                                    if (!z12 && this.q) {
                                        this.A = Bitmap.createBitmap(bitmap);
                                        new Canvas(this.A).drawColor(-870178270);
                                    }
                                }
                            }
                        }
                        tL_starGiftUnique = null;
                        if (tL_starGiftUnique != null) {
                        }
                    }
                    z12 = false;
                    if (!z12 && this.q) {
                    }
                }
            }
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                p(drawable2);
            }
        }
        this.z = this.B;
        this.v = this.C ? -1 : k(org.telegram.ui.ActionBar.j6.Zc, true);
        this.w = this.C ? -1 : k(org.telegram.ui.ActionBar.j6.ad, true);
        this.x = this.C ? -1 : k(org.telegram.ui.ActionBar.j6.ad, true);
        this.y = this.C ? -1 : k(org.telegram.ui.ActionBar.j6.bd, true);
        if (p3Var != null || wallPaper != null) {
            int i11 = org.telegram.messenger.g0.q(this.h)[0];
            n();
            o();
        }
        n4Var.f = false;
        if (anVar.k6 < 0) {
            n4Var.g = false;
        }
        n4Var.h = new aa.c0(this, p3Var, wallPaper, z10, 29);
        if (z10) {
            n4Var.k = new vm(this);
            n4Var.i = new tm(this, i10);
            n4Var.j = new tm(this, i7);
        } else {
            if (anVar.m1 != null) {
                anVar.Mc();
            }
            n4Var.h.run();
        }
        n4Var.e = true;
        n4Var.m = this;
        n4Var.l = 250L;
        o4Var2 = ((org.telegram.ui.ActionBar.e2) anVar).parentLayout;
        ((ActionBarLayout) o4Var2).f(n4Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(org.telegram.ui.ActionBar.p3 p3Var, TLRPC.WallPaper wallPaper, boolean z10) {
        int i7;
        int i10;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.g6 g6Var;
        SparseIntArray T0;
        int indexOfKey;
        org.telegram.ui.ActionBar.i6 i6Var;
        boolean z11;
        Drawable drawable;
        int i11;
        char c10;
        org.telegram.ui.ActionBar.i6 Q0;
        int i12;
        org.telegram.ui.ActionBar.i6 Q02;
        org.telegram.ui.ActionBar.p3 p3Var2 = p3Var;
        an anVar = this.G;
        if (anVar.ya != null) {
            return;
        }
        this.f = p3Var2;
        this.g = wallPaper;
        Drawable backgroundImage = anVar.fragmentView != null ? anVar.m1.getBackgroundImage() : null;
        org.telegram.ui.Components.ra0 ra0Var = backgroundImage instanceof org.telegram.ui.Components.ra0 ? (org.telegram.ui.Components.ra0) backgroundImage : null;
        int i13 = ra0Var != null ? ra0Var.i : 0;
        if ((p3Var2 == null || p3Var2.a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.j6.lm.indexOfKey(org.telegram.ui.ActionBar.j6.cd);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.j6.lm.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (p3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.j6.t0();
            if (t02 instanceof org.telegram.ui.Components.ra0) {
                ((org.telegram.ui.Components.ra0) t02).u(i13);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.j6.I.q() == this.q) {
                Q02 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string) != null && !org.telegram.ui.ActionBar.j6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string2) != null && org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
                    str = string2;
                }
                Q02 = this.q ? org.telegram.ui.ActionBar.j6.Q0(str) : org.telegram.ui.ActionBar.j6.Q0(str2);
            }
            org.telegram.ui.ActionBar.j6.u(Q02, false, this.q);
            p(this.h);
            this.s = false;
            t();
            return;
        }
        this.s = false;
        if (org.telegram.messenger.t0.b != null) {
            org.telegram.ui.ActionBar.j6.K(org.telegram.messenger.t0.b, false);
        }
        if (p3Var2 == null) {
            this.d = new SparseIntArray();
            i10 = 0;
        } else {
            i7 = ((org.telegram.ui.ActionBar.e2) this.G).currentAccount;
            boolean z12 = this.q;
            ArrayList arrayList2 = p3Var2.f;
            org.telegram.ui.ActionBar.i6 i15 = p3Var2.i(z12 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.o3) p3Var2.f.get(z12 ? 1 : 0)).d;
                i10 = 0;
                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) ((ig.a) p3Var2.f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = o3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) p3Var2.f.get(z12 ? 1 : 0)).b;
                org.telegram.ui.ActionBar.i6 i6Var2 = new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.j6.Q0(org.telegram.ui.ActionBar.j6.r0(b10)));
                arrayList = arrayList2;
                g6Var = i6Var2.e(o3Var.a(), b10, tL_theme, i7, true);
                i6Var2.u(g6Var.a);
                i15 = i6Var2;
            } else {
                i10 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.b0;
                g6Var = sparseArray != null ? (org.telegram.ui.ActionBar.g6) sparseArray.get(((org.telegram.ui.ActionBar.o3) arrayList.get(z12 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i15.b != null) {
                T0 = org.telegram.ui.ActionBar.j6.T0(new File(i15.b), null, strArr);
            } else {
                String str3 = i15.d;
                T0 = str3 != null ? org.telegram.ui.ActionBar.j6.T0(null, str3, strArr) : new SparseIntArray();
            }
            ((org.telegram.ui.ActionBar.o3) arrayList.get(z12 ? 1 : 0)).g = strArr[i10];
            if (g6Var != null) {
                SparseIntArray clone = T0.clone();
                g6Var.d(T0, clone);
                ig.b bVar = p3Var2.c;
                if (bVar != null && !TextUtils.isEmpty(bVar.b) && (i6Var = g6Var.b) != null && i6Var.b == null && !i6Var.q()) {
                    org.telegram.ui.ActionBar.g6.h(clone);
                }
                T0 = clone;
            }
            SparseIntArray sparseIntArray = org.telegram.ui.ActionBar.j6.im;
            for (int i17 = i10; i17 < sparseIntArray.size(); i17++) {
                int keyAt = sparseIntArray.keyAt(i17);
                int valueAt = sparseIntArray.valueAt(i17);
                if (T0.indexOfKey(keyAt) < 0 && (indexOfKey = T0.indexOfKey(valueAt)) >= 0) {
                    T0.put(keyAt, T0.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.j6.hm;
            for (int i18 = i10; i18 < iArr.length; i18++) {
                if (T0.indexOfKey(i18) < 0) {
                    T0.put(i18, iArr[i18]);
                }
            }
            this.d = T0;
        }
        if (!TextUtils.isEmpty(org.telegram.messenger.d4.j(this.g))) {
            Drawable drawable2 = this.h;
            i12 = ((org.telegram.ui.ActionBar.e2) this.G).currentAccount;
            this.h = hi.x5.f(drawable2, i12, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = dn.d(this.h, wallPaper, this.q);
        } else {
            if (p3Var2.a) {
                org.telegram.ui.ActionBar.i6 d = org.telegram.ui.ActionBar.p3.d(this.q);
                i11 = ((org.telegram.ui.ActionBar.e2) this.G).currentAccount;
                org.telegram.ui.ActionBar.j6.I(d, p3Var2.g(i11, this.q ? 1 : 0), ((org.telegram.ui.ActionBar.o3) p3Var2.f.get(this.q ? 1 : 0)).g, i13, i10);
                drawable = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.j6.Ee);
                int h7 = h(org.telegram.ui.ActionBar.j6.Fe);
                int h10 = h(org.telegram.ui.ActionBar.j6.Ge);
                int h11 = h(org.telegram.ui.ActionBar.j6.He);
                org.telegram.ui.Components.ra0 ra0Var2 = new org.telegram.ui.Components.ra0();
                ra0Var2.s(p3Var2.j(this.q ? 1 : 0).settings.intensity, ra0Var2.u);
                TLRPC.Document e10 = p3Var2.e();
                if (ra0Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    ra0Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = ra0Var2.c;
                    if (weakReference != null) {
                        ra0Var2.y.H0((View) weakReference.get());
                    }
                    if (ra0Var2.T) {
                        ra0Var2.y.P();
                    }
                }
                ra0Var2.y.q0(org.telegram.messenger.gc.b(e10), "80_80", null, null, null, 0);
                ra0Var2.y.X(1);
                ra0Var2.y.W(1);
                ra0Var2.o(h, h7, h10, h11, 0, true);
                ra0Var2.u(i13);
                int f10 = ra0Var2.f();
                boolean z13 = this.q;
                m2.d dVar = new m2.d(20, this, ra0Var2);
                org.telegram.ui.ActionBar.o3 o3Var2 = (org.telegram.ui.ActionBar.o3) p3Var2.f.get(z13 ? 1 : 0);
                if (o3Var2 == null || o3Var2.c == null) {
                    z11 = z13 ? 1 : 0;
                } else {
                    long h12 = p3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = o3Var2.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i19);
                            int i20 = i19 + 1;
                            int i21 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i21;
                                i19 = i20;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.gc b11 = org.telegram.messenger.gc.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.h1 = new ai.d0(dVar, h12, 3);
                    org.telegram.messenger.fc.D().M(imageReceiver2, null);
                }
                p3Var2 = p3Var;
                p3Var2.n(this.q ? 1 : 0, new org.telegram.messenger.r6(this, p3Var2, z11, ra0Var2, f10));
                drawable = ra0Var2;
            }
            this.h = drawable;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.r = new AnimatorSet();
            if (ra0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new um(ra0Var, 0));
                ofFloat.addListener(new wm(ra0Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable3 = this.h;
            if (drawable3 instanceof org.telegram.ui.Components.ra0) {
                org.telegram.ui.Components.ra0 ra0Var3 = (org.telegram.ui.Components.ra0) drawable3;
                ra0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new um(ra0Var3, 1));
                ofFloat2.addListener(new xm(ra0Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (p3Var2 != null || this.G.k6 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.q) {
                Q0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string3) != null && !org.telegram.ui.ActionBar.j6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string4) != null && org.telegram.ui.ActionBar.j6.Q0(string4).q()) {
                    str = string4;
                }
                Q0 = this.q ? org.telegram.ui.ActionBar.j6.Q0(str) : org.telegram.ui.ActionBar.j6.Q0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.j6.u(Q0, false, this.q);
        }
        int i22 = org.telegram.messenger.g0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        an anVar = this.G;
        if (anVar.ya == null && this.f == null && this.g == null) {
            boolean z10 = anVar.S9() && !org.telegram.messenger.gz.H0;
            if (z10 || this.s) {
                this.s = z10;
                this.b.clear();
                this.a.clear();
                if (z10) {
                    if (org.telegram.messenger.t0.b != null) {
                        org.telegram.ui.ActionBar.j6.K(org.telegram.messenger.t0.b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.j6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f10) {
        int k10;
        int k11;
        int k12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint d = d("paintChatActionBackground");
        Paint d2 = d("paintChatActionBackgroundSelected");
        Paint d10 = d("paintChatMessageBackgroundSelected");
        int i7 = this.B;
        boolean S9 = this.G.S9();
        int i10 = -1;
        if (this.C) {
            k10 = -1;
        } else {
            k10 = k(S9 ? org.telegram.ui.ActionBar.j6.Fa : org.telegram.ui.ActionBar.j6.Zc, true);
        }
        if (this.C) {
            k11 = -1;
        } else {
            k11 = k(S9 ? org.telegram.ui.ActionBar.j6.Fa : org.telegram.ui.ActionBar.j6.ad, true);
        }
        if (this.C) {
            k12 = -1;
        } else {
            k12 = k(S9 ? org.telegram.ui.ActionBar.j6.Ha : org.telegram.ui.ActionBar.j6.ad, true);
        }
        if (!this.C) {
            i10 = k(S9 ? org.telegram.ui.ActionBar.j6.Ga : org.telegram.ui.ActionBar.j6.bd, true);
        }
        if (f10 != 1.0f) {
            i7 = i0.a.f(f10, this.z, i7);
            k10 = i0.a.f(f10, this.v, k10);
            k11 = i0.a.f(f10, this.w, k11);
            k12 = i0.a.f(f10, this.x, k12);
            i10 = i0.a.f(f10, this.y, i10);
        }
        if (d != null && !this.C) {
            d.setColor(i7);
            d2.setColor(i7);
        }
        Paint d11 = d("paintChatActionText");
        if (d11 != null) {
            ((TextPaint) d11).linkColor = k11;
            d("paintChatActionText").setColor(k10);
            d("paintChatBotButton").setColor(k12);
        }
        org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.j6.C1(k10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.j6.C1(i10, getDrawable("drawableShareIcon"));
        if (this.m == null || (bitmap = this.k) == null) {
            return;
        }
        Rect rect = this.F;
        Rect rect2 = this.E;
        if (f10 == 1.0f || (bitmap2 = this.A) == null) {
            this.p = true;
            rect2.set(0, 0, bitmap.getWidth(), this.k.getHeight());
            rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
            this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
            if (d != null) {
                d.setShader(this.o);
                d2.setShader(this.o);
            }
            if (d10 != null) {
                d10.setShader(this.o);
                return;
            }
            return;
        }
        this.p = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.A, rect2, rect, (Paint) null);
        Paint paint = this.l;
        paint.setAlpha((int) (f10 * 255.0f));
        rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.k, rect2, rect, paint);
        if (d != null) {
            d.setShader(this.n);
            d2.setShader(this.n);
        }
        if (d10 != null) {
            d10.setShader(this.n);
        }
    }
}
