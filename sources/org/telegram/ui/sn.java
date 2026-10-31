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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sn implements org.telegram.ui.ActionBar.p6, org.telegram.ui.Components.wa0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ un G;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.y3 f;
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
    public org.telegram.ui.ActionBar.c5 t;
    public org.telegram.ui.ActionBar.c5 u;
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
    public boolean q = org.telegram.ui.ActionBar.t6.I.q();

    public sn(un unVar) {
        int i10;
        int i11;
        this.G = unVar;
        boolean z10 = false;
        if (q(false)) {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            this.f = org.telegram.messenger.g4.f(i10).c(unVar.j6);
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.g4.f(i11).d(unVar.j6);
            this.g = d;
            org.telegram.ui.ActionBar.y3 y3Var = this.f;
            if (y3Var != null || d != null) {
                s(y3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (z10 || ThemeEditorView.p != null) {
            org.telegram.messenger.i0.g3(new org.telegram.messenger.rz(5));
        } else {
            org.telegram.ui.ActionBar.t6.t1(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        return (sparseIntArray == null || sparseIntArray.size() <= 0) ? org.telegram.ui.ActionBar.t6.I.q() : this.q;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void b(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h == null || (bitmap = this.j) == null || (bitmapShader = this.n) == null) {
            org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
            return;
        }
        boolean z10 = this.p;
        Matrix matrix = this.c;
        if (z10) {
            org.telegram.ui.ActionBar.t6.s(this.k, this.o, matrix, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.t6.s(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.t6.v3;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Paint d(String str) {
        if (this.f == null && this.h == null && !this.s) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean e() {
        return this.G.G9();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int f(int i10) {
        return h(i10);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final boolean g() {
        return (this.h != null || this.s) ? this.n != null : org.telegram.ui.ActionBar.t6.d1();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int h(int i10) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.s && (z02 = org.telegram.ui.ActionBar.t6.z0(i10, this)) != null) {
            return z02.intValue();
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.t6.v0(i10);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.t6.fm.get(i10);
        return (i11 < 0 || (indexOfKey = this.d.indexOfKey(i11)) < 0) ? org.telegram.ui.ActionBar.t6.v0(i10) : this.d.valueAt(indexOfKey);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void i(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final int j(int i10) {
        return k(i10, false);
    }

    public final int k(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.t6.x0(null, i10, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.y3 l() {
        return this.f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.t6.t0();
    }

    public final void n() {
        Drawable c5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.t6.am.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    c5Var = new org.telegram.ui.ActionBar.c5(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    c5Var = new org.telegram.ui.ActionBar.c5(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    c5Var = new org.telegram.ui.ActionBar.c5(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    c5Var = new org.telegram.ui.ActionBar.c5(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    c5Var = new org.telegram.ui.ActionBar.c5(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    c5Var = new org.telegram.ui.ActionBar.c5(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    c5Var = new org.telegram.ui.ActionBar.c5(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    c5Var = new org.telegram.ui.ActionBar.c5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    c5Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (c5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.t6.bm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.t6.C1(h(intValue), c5Var);
                            break;
                        }
                    }
                    break;
            }
            if (c5Var != null) {
                this.a.put((String) entry.getKey(), c5Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.t6.cm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.t6.dm.get((String) entry.getKey())).intValue();
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
        float f7;
        boolean z10;
        float f10;
        Paint d;
        Paint d10;
        int i10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        un unVar = this.G;
        if (unVar.va != null) {
            return;
        }
        int i11 = org.telegram.messenger.i0.q(drawable2)[0];
        int k10 = k(org.telegram.ui.ActionBar.t6.Zc, false);
        int i12 = org.telegram.ui.ActionBar.t6.vd;
        int k11 = k(i12, false);
        if (k10 != 0 && this.g == null) {
            i11 = k10;
        }
        boolean G9 = unVar.G9();
        if (G9) {
            i11 = i0.b.k(k(org.telegram.ui.ActionBar.t6.Ea, false), k(org.telegram.ui.ActionBar.t6.ua, false));
        }
        this.B = i11;
        if (drawable2 instanceof xn) {
            xn xnVar = (xn) drawable2;
            f7 = xnVar.f == null ? xnVar.d : 0.0f;
            drawable2 = xnVar.c(false);
        } else {
            f7 = 0.0f;
        }
        boolean z11 = !G9 && ((drawable2 instanceof org.telegram.ui.Components.jb0) || (drawable2 instanceof BitmapDrawable)) && org.telegram.messenger.tz.o() != 0;
        this.C = z11;
        org.telegram.ui.ActionBar.y3 y3Var = this.f;
        if (y3Var != null) {
            TLRPC.ChatTheme chatTheme = y3Var.d;
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
                            f10 = 0.0f;
                            Rect rect2 = this.E;
                            if (z12) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                int i13 = 40;
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i10 = (int) ((40 / bitmap.getWidth()) * bitmap.getHeight());
                                } else {
                                    i10 = 40;
                                    i13 = (int) ((40 / bitmap.getHeight()) * bitmap.getWidth());
                                }
                                this.j = Bitmap.createBitmap(i13, i10, Bitmap.Config.ARGB_8888);
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.j, 3);
                                this.m.drawColor(i0.b.o(-16777216, (int) (f7 * 255.0f)));
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
                                Bitmap bitmap3 = ((org.telegram.ui.Components.jb0) drawable2).k;
                                this.k = bitmap3;
                                if (z10) {
                                    this.k = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.k).drawColor(-870178270);
                                }
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
                                this.m.drawColor(i0.b.o(-16777216, (int) (f7 * 255.0f)));
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
                            f10 = 0.0f;
                            this.j = null;
                            this.n = null;
                            this.k = null;
                            this.m = null;
                            this.p = false;
                        }
                        d = d("paintChatActionBackground");
                        Paint d11 = d("paintChatActionBackgroundSelected");
                        d10 = d("paintChatMessageBackgroundSelected");
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
                                if (drawable2 instanceof org.telegram.ui.Components.jb0) {
                                    if (((org.telegram.ui.Components.jb0) drawable2).q >= f10) {
                                        colorMatrix.setSaturation(1.6f);
                                        org.telegram.messenger.i0.n2(colorMatrix, this.q ? 0.97f : 0.92f);
                                        org.telegram.messenger.i0.h(colorMatrix, this.q ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        org.telegram.messenger.i0.n2(colorMatrix, this.q ? 0.4f : 0.8f);
                                        org.telegram.messenger.i0.h(colorMatrix, this.q ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    org.telegram.messenger.i0.n2(colorMatrix, this.q ? 0.9f : 0.84f);
                                    org.telegram.messenger.i0.h(colorMatrix, this.q ? 0.04f : 0.06f);
                                }
                                d.setAlpha(org.telegram.messenger.zs.e4);
                                d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                d.setShader(this.o);
                                d.setFilterBitmap(true);
                                d11.setAlpha(org.telegram.messenger.zs.e4);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                org.telegram.messenger.i0.i(colorMatrix2, 0.26f);
                                org.telegram.messenger.i0.n2(colorMatrix2, 0.92f);
                                d11.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                d11.setShader(this.o);
                                d11.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                d.setColorFilter(null);
                                d.setShader(null);
                                d11.setColorFilter(null);
                                d11.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (d10 == null) {
                            d10 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", d10);
                        }
                        if (!this.D) {
                            if (k11 == 0) {
                                k11 = h(i12);
                            }
                            d10.setColor(k11);
                            d10.setColorFilter(null);
                            d10.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        org.telegram.messenger.i0.i(colorMatrix3, 2.5f);
                        org.telegram.messenger.i0.n2(colorMatrix3, 0.75f);
                        d10.setAlpha(64);
                        d10.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        d10.setShader(this.o);
                        d10.setFilterBitmap(true);
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
                Paint d112 = d("paintChatActionBackgroundSelected");
                d10 = d("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (d != null) {
                }
                if (d10 == null) {
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
        Paint d1122 = d("paintChatActionBackgroundSelected");
        d10 = d("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (d != null) {
        }
        if (d10 == null) {
        }
        if (!this.D) {
        }
    }

    public final boolean q(boolean z10) {
        TLRPC.User user;
        un unVar = this.G;
        if (unVar.h != null) {
            return false;
        }
        if (z10) {
            return (unVar.e != null || (user = unVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        if (android.text.TextUtils.equals(org.telegram.messenger.g4.j(r15), org.telegram.messenger.g4.j(r8)) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(org.telegram.ui.ActionBar.y3 y3Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.z4 z4Var;
        boolean z12;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.z4 z4Var2;
        boolean z13;
        un unVar = this.G;
        z4Var = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
        if (z4Var == null || unVar.va != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.q;
        yf.b bVar = y3Var != null ? y3Var.c : null;
        org.telegram.ui.ActionBar.y3 y3Var2 = this.f;
        yf.b bVar2 = y3Var2 != null ? y3Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.g;
        int i10 = 1;
        int i11 = 0;
        if (!z11) {
            if (!q(false)) {
                return;
            }
            if (yf.b.a(bVar2, bVar) && this.q == booleanValue) {
                org.telegram.messenger.r5 r5Var = org.telegram.messenger.g4.s;
                if (wallPaper != null || wallPaper2 != null) {
                    if (wallPaper != null && wallPaper2 != null) {
                        String str = wallPaper.uploadingImage;
                        if (str != null) {
                            z13 = TextUtils.equals(wallPaper2.uploadingImage, str);
                            if (z13) {
                                return;
                            }
                        } else if (wallPaper.id == wallPaper2.id) {
                            if (TextUtils.equals(xn.e(wallPaper.settings), xn.e(wallPaper2.settings))) {
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
        org.telegram.ui.ActionBar.s6 D0 = booleanValue ? org.telegram.ui.ActionBar.t6.J : org.telegram.ui.ActionBar.t6.D0();
        org.telegram.ui.ActionBar.y4 y4Var = new org.telegram.ui.ActionBar.y4(D0, D0.Y, D0.q(), !z10);
        org.telegram.ui.ActionBar.y3 y3Var3 = this.f;
        if (y3Var3 == null && this.g == null) {
            Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
            this.C = t02 instanceof org.telegram.ui.Components.jb0;
            p(t02);
            this.v = this.C ? -1 : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wc, false);
            this.w = this.C ? -1 : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xc, false);
            this.x = this.C ? -1 : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xc, false);
            this.y = this.C ? -1 : org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yc, false);
        } else {
            if (this.C) {
                Drawable drawable = this.h;
                if (drawable instanceof org.telegram.ui.Components.jb0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.jb0) drawable).k;
                    this.A = bitmap;
                    if (y3Var3 != null) {
                        TLRPC.ChatTheme chatTheme = y3Var3.d;
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
        this.v = this.C ? -1 : k(org.telegram.ui.ActionBar.t6.Wc, true);
        this.w = this.C ? -1 : k(org.telegram.ui.ActionBar.t6.Xc, true);
        this.x = this.C ? -1 : k(org.telegram.ui.ActionBar.t6.Xc, true);
        this.y = this.C ? -1 : k(org.telegram.ui.ActionBar.t6.Yc, true);
        if (y3Var != null || wallPaper != null) {
            int i12 = org.telegram.messenger.i0.q(this.h)[0];
            n();
            o();
        }
        y4Var.f = false;
        if (unVar.j6 < 0) {
            y4Var.g = false;
        }
        y4Var.h = new bi.n4(this, y3Var, wallPaper, z10, 27);
        if (z10) {
            y4Var.k = new pn(this);
            y4Var.i = new nn(this, i11);
            y4Var.j = new nn(this, i10);
        } else {
            if (unVar.l1 != null) {
                unVar.yc();
            }
            y4Var.h.run();
        }
        y4Var.e = true;
        y4Var.m = this;
        y4Var.l = 250L;
        z4Var2 = ((org.telegram.ui.ActionBar.k2) unVar).parentLayout;
        ((ActionBarLayout) z4Var2).f(y4Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(org.telegram.ui.ActionBar.y3 y3Var, TLRPC.WallPaper wallPaper, boolean z10) {
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.r6 r6Var;
        SparseIntArray T0;
        int indexOfKey;
        org.telegram.ui.ActionBar.s6 s6Var;
        boolean z11;
        Drawable drawable;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.s6 Q0;
        int i13;
        org.telegram.ui.ActionBar.s6 Q02;
        org.telegram.ui.ActionBar.y3 y3Var2 = y3Var;
        un unVar = this.G;
        if (unVar.va != null) {
            return;
        }
        this.f = y3Var2;
        this.g = wallPaper;
        Drawable backgroundImage = unVar.fragmentView != null ? unVar.l1.getBackgroundImage() : null;
        org.telegram.ui.Components.jb0 jb0Var = backgroundImage instanceof org.telegram.ui.Components.jb0 ? (org.telegram.ui.Components.jb0) backgroundImage : null;
        int i14 = jb0Var != null ? jb0Var.i : 0;
        if ((y3Var2 == null || y3Var2.a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.t6.im.indexOfKey(org.telegram.ui.ActionBar.t6.Zc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.t6.im.valueAt(indexOfKey2);
            } else {
                int i15 = org.telegram.ui.ActionBar.t6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (y3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.t6.t0();
            if (t02 instanceof org.telegram.ui.Components.jb0) {
                ((org.telegram.ui.Components.jb0) t02).u(i14);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.t6.I.q() == this.q) {
                Q02 = org.telegram.ui.ActionBar.t6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string) != null && !org.telegram.ui.ActionBar.t6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string2) != null && org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
                    str = string2;
                }
                Q02 = this.q ? org.telegram.ui.ActionBar.t6.Q0(str) : org.telegram.ui.ActionBar.t6.Q0(str2);
            }
            org.telegram.ui.ActionBar.t6.u(Q02, false, this.q);
            p(this.h);
            this.s = false;
            t();
            return;
        }
        this.s = false;
        if (org.telegram.messenger.w0.b != null) {
            org.telegram.ui.ActionBar.t6.K(org.telegram.messenger.w0.b, false);
        }
        if (y3Var2 == null) {
            this.d = new SparseIntArray();
            i11 = 0;
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) this.G).currentAccount;
            boolean z12 = this.q;
            ArrayList arrayList2 = y3Var2.f;
            org.telegram.ui.ActionBar.s6 i16 = y3Var2.i(z12 ? 1 : 0);
            if (i16 == null) {
                int i17 = ((org.telegram.ui.ActionBar.x3) y3Var2.f.get(z12 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.x3 x3Var = (org.telegram.ui.ActionBar.x3) ((yf.a) y3Var2.f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = x3Var.b(i17);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.x3) y3Var2.f.get(z12 ? 1 : 0)).b;
                org.telegram.ui.ActionBar.s6 s6Var2 = new org.telegram.ui.ActionBar.s6(org.telegram.ui.ActionBar.t6.Q0(org.telegram.ui.ActionBar.t6.r0(b10)));
                arrayList = arrayList2;
                r6Var = s6Var2.e(x3Var.a(), b10, tL_theme, i10, true);
                s6Var2.u(r6Var.a);
                i16 = s6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i16.a0;
                r6Var = sparseArray != null ? (org.telegram.ui.ActionBar.r6) sparseArray.get(((org.telegram.ui.ActionBar.x3) arrayList.get(z12 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i16.b != null) {
                T0 = org.telegram.ui.ActionBar.t6.T0(new File(i16.b), null, strArr);
            } else {
                String str3 = i16.d;
                T0 = str3 != null ? org.telegram.ui.ActionBar.t6.T0(null, str3, strArr) : new SparseIntArray();
            }
            ((org.telegram.ui.ActionBar.x3) arrayList.get(z12 ? 1 : 0)).g = strArr[i11];
            if (r6Var != null) {
                SparseIntArray clone = T0.clone();
                r6Var.d(T0, clone);
                yf.b bVar = y3Var2.c;
                if (bVar != null && !TextUtils.isEmpty(bVar.b) && (s6Var = r6Var.b) != null && s6Var.b == null && !s6Var.q()) {
                    org.telegram.ui.ActionBar.r6.h(clone);
                }
                T0 = clone;
            }
            SparseIntArray sparseIntArray = org.telegram.ui.ActionBar.t6.fm;
            for (int i18 = i11; i18 < sparseIntArray.size(); i18++) {
                int keyAt = sparseIntArray.keyAt(i18);
                int valueAt = sparseIntArray.valueAt(i18);
                if (T0.indexOfKey(keyAt) < 0 && (indexOfKey = T0.indexOfKey(valueAt)) >= 0) {
                    T0.put(keyAt, T0.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.t6.em;
            for (int i19 = i11; i19 < iArr.length; i19++) {
                if (T0.indexOfKey(i19) < 0) {
                    T0.put(i19, iArr[i19]);
                }
            }
            this.d = T0;
        }
        if (!TextUtils.isEmpty(org.telegram.messenger.g4.j(this.g))) {
            Drawable drawable2 = this.h;
            i13 = ((org.telegram.ui.ActionBar.k2) this.G).currentAccount;
            this.h = vh.k4.f(drawable2, i13, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = xn.d(this.h, wallPaper, this.q);
        } else {
            if (y3Var2.a) {
                org.telegram.ui.ActionBar.s6 d = org.telegram.ui.ActionBar.y3.d(this.q);
                i12 = ((org.telegram.ui.ActionBar.k2) this.G).currentAccount;
                org.telegram.ui.ActionBar.t6.I(d, y3Var2.g(i12, this.q ? 1 : 0), ((org.telegram.ui.ActionBar.x3) y3Var2.f.get(this.q ? 1 : 0)).g, i14, i11);
                drawable = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.t6.Be);
                int h10 = h(org.telegram.ui.ActionBar.t6.Ce);
                int h11 = h(org.telegram.ui.ActionBar.t6.De);
                int h12 = h(org.telegram.ui.ActionBar.t6.Ee);
                org.telegram.ui.Components.jb0 jb0Var2 = new org.telegram.ui.Components.jb0();
                jb0Var2.s(jb0Var2.u, y3Var2.j(this.q ? 1 : 0).settings.intensity);
                TLRPC.Document e = y3Var2.e();
                if (jb0Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    jb0Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = jb0Var2.c;
                    if (weakReference != null) {
                        jb0Var2.y.H0((View) weakReference.get());
                    }
                    if (jb0Var2.T) {
                        jb0Var2.y.P();
                    }
                }
                jb0Var2.y.q0(org.telegram.messenger.ic.b(e), "80_80", null, null, null, 0);
                jb0Var2.y.X(1);
                jb0Var2.y.W(1);
                jb0Var2.o(h, h10, h11, h12, 0, true);
                jb0Var2.u(i14);
                int f7 = jb0Var2.f();
                boolean z13 = this.q;
                ng.d dVar = new ng.d(16, this, jb0Var2);
                org.telegram.ui.ActionBar.x3 x3Var2 = (org.telegram.ui.ActionBar.x3) y3Var2.f.get(z13 ? 1 : 0);
                if (x3Var2 == null || x3Var2.c == null) {
                    z11 = z13 ? 1 : 0;
                } else {
                    long h13 = y3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = x3Var2.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z11 = z13 ? 1 : 0;
                        int i20 = 0;
                        while (true) {
                            if (i20 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList3.get(i20);
                            int i21 = i20 + 1;
                            int i22 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i22;
                                i20 = i21;
                            }
                        }
                    } else {
                        z11 = z13 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.ic b11 = org.telegram.messenger.ic.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.z1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.g1 = new m4.x0(dVar, h13, 1);
                    org.telegram.messenger.hc.D().M(imageReceiver2, null);
                }
                y3Var2 = y3Var;
                y3Var2.n(this.q ? 1 : 0, new org.telegram.messenger.u6(this, y3Var2, z11, jb0Var2, f7));
                drawable = jb0Var2;
            }
            this.h = drawable;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.r = new AnimatorSet();
            if (jb0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new on(jb0Var, 0));
                ofFloat.addListener(new qn(jb0Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable3 = this.h;
            if (drawable3 instanceof org.telegram.ui.Components.jb0) {
                org.telegram.ui.Components.jb0 jb0Var3 = (org.telegram.ui.Components.jb0) drawable3;
                jb0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new on(jb0Var3, 1));
                ofFloat2.addListener(new rn(jb0Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (y3Var2 != null || this.G.j6 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.t6.I.q() == this.q) {
                Q0 = org.telegram.ui.ActionBar.t6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string3) != null && !org.telegram.ui.ActionBar.t6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.t6.Q0(string4) != null && org.telegram.ui.ActionBar.t6.Q0(string4).q()) {
                    str = string4;
                }
                Q0 = this.q ? org.telegram.ui.ActionBar.t6.Q0(str) : org.telegram.ui.ActionBar.t6.Q0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.t6.u(Q0, false, this.q);
        }
        int i23 = org.telegram.messenger.i0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        un unVar = this.G;
        if (unVar.va == null && this.f == null && this.g == null) {
            boolean z10 = unVar.G9() && !org.telegram.messenger.tz.H0;
            if (z10 || this.s) {
                this.s = z10;
                this.b.clear();
                this.a.clear();
                if (z10) {
                    if (org.telegram.messenger.w0.b != null) {
                        org.telegram.ui.ActionBar.t6.K(org.telegram.messenger.w0.b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.t6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f7) {
        int k10;
        int k11;
        int k12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint d = d("paintChatActionBackground");
        Paint d10 = d("paintChatActionBackgroundSelected");
        Paint d11 = d("paintChatMessageBackgroundSelected");
        int i10 = this.B;
        boolean G9 = this.G.G9();
        int i11 = -1;
        if (this.C) {
            k10 = -1;
        } else {
            k10 = k(G9 ? org.telegram.ui.ActionBar.t6.Fa : org.telegram.ui.ActionBar.t6.Wc, true);
        }
        if (this.C) {
            k11 = -1;
        } else {
            k11 = k(G9 ? org.telegram.ui.ActionBar.t6.Fa : org.telegram.ui.ActionBar.t6.Xc, true);
        }
        if (this.C) {
            k12 = -1;
        } else {
            k12 = k(G9 ? org.telegram.ui.ActionBar.t6.Ha : org.telegram.ui.ActionBar.t6.Xc, true);
        }
        if (!this.C) {
            i11 = k(G9 ? org.telegram.ui.ActionBar.t6.Ga : org.telegram.ui.ActionBar.t6.Yc, true);
        }
        if (f7 != 1.0f) {
            i10 = i0.b.f(f7, this.z, i10);
            k10 = i0.b.f(f7, this.v, k10);
            k11 = i0.b.f(f7, this.w, k11);
            k12 = i0.b.f(f7, this.x, k12);
            i11 = i0.b.f(f7, this.y, i11);
        }
        if (d != null && !this.C) {
            d.setColor(i10);
            d10.setColor(i10);
        }
        Paint d12 = d("paintChatActionText");
        if (d12 != null) {
            ((TextPaint) d12).linkColor = k11;
            d("paintChatActionText").setColor(k10);
            d("paintChatBotButton").setColor(k12);
        }
        org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.t6.C1(k10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.t6.C1(i11, getDrawable("drawableShareIcon"));
        if (this.m == null || (bitmap = this.k) == null) {
            return;
        }
        Rect rect = this.F;
        Rect rect2 = this.E;
        if (f7 == 1.0f || (bitmap2 = this.A) == null) {
            this.p = true;
            rect2.set(0, 0, bitmap.getWidth(), this.k.getHeight());
            rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
            this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
            if (d != null) {
                d.setShader(this.o);
                d10.setShader(this.o);
            }
            if (d11 != null) {
                d11.setShader(this.o);
                return;
            }
            return;
        }
        this.p = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.A.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.A, rect2, rect, (Paint) null);
        Paint paint = this.l;
        paint.setAlpha((int) (f7 * 255.0f));
        rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.k, rect2, rect, paint);
        if (d != null) {
            d.setShader(this.n);
            d10.setShader(this.n);
        }
        if (d11 != null) {
            d11.setShader(this.n);
        }
    }
}
