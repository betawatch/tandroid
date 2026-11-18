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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zm implements org.telegram.ui.ActionBar.i6, org.telegram.ui.Components.qa0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ bn G;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.t3 f;
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
    public org.telegram.ui.ActionBar.v4 t;
    public org.telegram.ui.ActionBar.v4 u;
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
    public boolean q = org.telegram.ui.ActionBar.n6.I.q();

    public zm(bn bnVar) {
        int i7;
        int i10;
        this.G = bnVar;
        boolean z10 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            this.f = org.telegram.messenger.f4.f(i7).c(bnVar.l6);
            i10 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.f4.f(i10).d(bnVar.l6);
            this.g = d;
            org.telegram.ui.ActionBar.t3 t3Var = this.f;
            if (t3Var != null || d != null) {
                s(t3Var, d, false);
                z10 = true;
            }
        }
        if (!z10) {
            t();
        }
        if (z10 || ThemeEditorView.p != null) {
            org.telegram.messenger.g0.g3(new org.telegram.messenger.j2(22));
        } else {
            org.telegram.ui.ActionBar.n6.t1(true, true);
        }
    }

    public final int a(int i7, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i7)) < 0) ? org.telegram.ui.ActionBar.n6.x0(null, i7, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.t3 b() {
        return this.f;
    }

    public final Drawable c() {
        Drawable drawable = this.h;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.n6.t0();
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean d() {
        SparseIntArray sparseIntArray = this.d;
        return (sparseIntArray == null || sparseIntArray.size() <= 0) ? org.telegram.ui.ActionBar.n6.I.q() : this.q;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void e(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h == null || (bitmap = this.j) == null || (bitmapShader = this.n) == null) {
            org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
            return;
        }
        boolean z10 = this.p;
        Matrix matrix = this.c;
        if (z10) {
            org.telegram.ui.ActionBar.n6.s(this.k, this.o, matrix, i7, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.n6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter f() {
        return org.telegram.ui.ActionBar.n6.v3;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint g(String str) {
        if (this.f == null && this.h == null && !this.s) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean h() {
        return this.G.S9();
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        return k(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean j() {
        return (this.h != null || this.s) ? this.n != null : org.telegram.ui.ActionBar.n6.d1();
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.s && (z02 = org.telegram.ui.ActionBar.n6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.n6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.n6.im.get(i7);
        return (i10 < 0 || (indexOfKey = this.d.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.n6.v0(i7) : this.d.valueAt(indexOfKey);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void l(int i7, int i10) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int m(int i7) {
        return a(i7, false);
    }

    public final void n() {
        Drawable v4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.n6.dm.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    v4Var = new org.telegram.ui.ActionBar.v4(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    v4Var = new org.telegram.ui.ActionBar.v4(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    v4Var = new org.telegram.ui.ActionBar.v4(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    v4Var = new org.telegram.ui.ActionBar.v4(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    v4Var = new org.telegram.ui.ActionBar.v4(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    v4Var = new org.telegram.ui.ActionBar.v4(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    v4Var = new org.telegram.ui.ActionBar.v4(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    v4Var = new org.telegram.ui.ActionBar.v4(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    v4Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (v4Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.n6.em.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.n6.C1(k(intValue), v4Var);
                            break;
                        }
                    }
                    break;
            }
            if (v4Var != null) {
                this.a.put((String) entry.getKey(), v4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.n6.fm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.n6.gm.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(k(intValue));
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
        Paint g10;
        Paint g11;
        int i7;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        bn bnVar = this.G;
        if (bnVar.za != null) {
            return;
        }
        int i10 = org.telegram.messenger.g0.q(drawable2)[0];
        int a10 = a(org.telegram.ui.ActionBar.n6.cd, false);
        int i11 = org.telegram.ui.ActionBar.n6.yd;
        int a11 = a(i11, false);
        if (a10 != 0 && this.g == null) {
            i10 = a10;
        }
        boolean S9 = bnVar.S9();
        if (S9) {
            i10 = i0.a.k(a(org.telegram.ui.ActionBar.n6.Ea, false), a(org.telegram.ui.ActionBar.n6.ua, false));
        }
        this.B = i10;
        if (drawable2 instanceof en) {
            en enVar = (en) drawable2;
            f10 = enVar.f == null ? enVar.d : 0.0f;
            drawable2 = enVar.c(false);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = !S9 && ((drawable2 instanceof org.telegram.ui.Components.bb0) || (drawable2 instanceof BitmapDrawable)) && org.telegram.messenger.bz.o() != 0;
        this.C = z11;
        org.telegram.ui.ActionBar.t3 t3Var = this.f;
        if (t3Var != null) {
            TLRPC.ChatTheme chatTheme = t3Var.d;
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
                                Bitmap bitmap3 = ((org.telegram.ui.Components.bb0) drawable2).k;
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
                        g10 = g("paintChatActionBackground");
                        Paint g12 = g("paintChatActionBackgroundSelected");
                        g11 = g("paintChatMessageBackgroundSelected");
                        HashMap hashMap = this.b;
                        if (g10 != null) {
                            Paint paint = (Paint) hashMap.get("paintChatActionBackgroundDarken");
                            if (paint == null) {
                                paint = new Paint(1);
                                hashMap.put("paintChatActionBackgroundDarken", paint);
                                paint.setColor(0);
                            }
                            if (this.C) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (drawable2 instanceof org.telegram.ui.Components.bb0) {
                                    if (((org.telegram.ui.Components.bb0) drawable2).q >= f11) {
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
                                g10.setAlpha(org.telegram.messenger.ks.e4);
                                g10.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                g10.setShader(this.o);
                                g10.setFilterBitmap(true);
                                g12.setAlpha(org.telegram.messenger.ks.e4);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                org.telegram.messenger.g0.i(colorMatrix2, 0.26f);
                                org.telegram.messenger.g0.n2(colorMatrix2, 0.92f);
                                g12.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                g12.setShader(this.o);
                                g12.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                g10.setColorFilter(null);
                                g10.setShader(null);
                                g12.setColorFilter(null);
                                g12.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (g11 == null) {
                            g11 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", g11);
                        }
                        if (!this.D) {
                            if (a11 == 0) {
                                a11 = k(i11);
                            }
                            g11.setColor(a11);
                            g11.setColorFilter(null);
                            g11.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        org.telegram.messenger.g0.i(colorMatrix3, 2.5f);
                        org.telegram.messenger.g0.n2(colorMatrix3, 0.75f);
                        g11.setAlpha(64);
                        g11.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        g11.setShader(this.o);
                        g11.setFilterBitmap(true);
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
                g10 = g("paintChatActionBackground");
                Paint g122 = g("paintChatActionBackgroundSelected");
                g11 = g("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (g10 != null) {
                }
                if (g11 == null) {
                }
                if (!this.D) {
                }
            }
        }
        z10 = false;
        this.D = z11;
        if (z11) {
        }
        g10 = g("paintChatActionBackground");
        Paint g1222 = g("paintChatActionBackgroundSelected");
        g11 = g("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (g10 != null) {
        }
        if (g11 == null) {
        }
        if (!this.D) {
        }
    }

    public final boolean q(boolean z10) {
        TLRPC.User user;
        bn bnVar = this.G;
        if (bnVar.h != null) {
            return false;
        }
        if (z10) {
            return (bnVar.e != null || (user = bnVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0079, code lost:
    
        if (android.text.TextUtils.equals(org.telegram.messenger.f4.j(r15), org.telegram.messenger.f4.j(r8)) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(org.telegram.ui.ActionBar.t3 t3Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.s4 s4Var;
        boolean z12;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.s4 s4Var2;
        boolean z13;
        bn bnVar = this.G;
        s4Var = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
        if (s4Var == null || bnVar.za != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.q;
        ig.b bVar = t3Var != null ? t3Var.c : null;
        org.telegram.ui.ActionBar.t3 t3Var2 = this.f;
        ig.b bVar2 = t3Var2 != null ? t3Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.g;
        int i7 = 1;
        int i10 = 0;
        if (!z11) {
            if (!q(false)) {
                return;
            }
            if (ig.b.a(bVar2, bVar) && this.q == booleanValue) {
                org.telegram.messenger.q5 q5Var = org.telegram.messenger.f4.s;
                if (wallPaper != null || wallPaper2 != null) {
                    if (wallPaper != null && wallPaper2 != null) {
                        String str = wallPaper.uploadingImage;
                        if (str != null) {
                            z13 = TextUtils.equals(wallPaper2.uploadingImage, str);
                            if (z13) {
                                return;
                            }
                        } else if (wallPaper.id == wallPaper2.id) {
                            if (TextUtils.equals(en.e(wallPaper.settings), en.e(wallPaper2.settings))) {
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
        org.telegram.ui.ActionBar.m6 D0 = booleanValue ? org.telegram.ui.ActionBar.n6.J : org.telegram.ui.ActionBar.n6.D0();
        org.telegram.ui.ActionBar.r4 r4Var = new org.telegram.ui.ActionBar.r4(D0, D0.Z, D0.q(), !z10);
        org.telegram.ui.ActionBar.t3 t3Var3 = this.f;
        if (t3Var3 == null && this.g == null) {
            Drawable t02 = org.telegram.ui.ActionBar.n6.t0();
            this.C = t02 instanceof org.telegram.ui.Components.bb0;
            p(t02);
            this.v = this.C ? -1 : org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zc, false);
            this.w = this.C ? -1 : org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ad, false);
            this.x = this.C ? -1 : org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ad, false);
            this.y = this.C ? -1 : org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.bd, false);
        } else {
            if (this.C) {
                Drawable drawable = this.h;
                if (drawable instanceof org.telegram.ui.Components.bb0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.bb0) drawable).k;
                    this.A = bitmap;
                    if (t3Var3 != null) {
                        TLRPC.ChatTheme chatTheme = t3Var3.d;
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
        this.v = this.C ? -1 : a(org.telegram.ui.ActionBar.n6.Zc, true);
        this.w = this.C ? -1 : a(org.telegram.ui.ActionBar.n6.ad, true);
        this.x = this.C ? -1 : a(org.telegram.ui.ActionBar.n6.ad, true);
        this.y = this.C ? -1 : a(org.telegram.ui.ActionBar.n6.bd, true);
        if (t3Var != null || wallPaper != null) {
            int i11 = org.telegram.messenger.g0.q(this.h)[0];
            n();
            o();
        }
        r4Var.f = false;
        if (bnVar.l6 < 0) {
            r4Var.g = false;
        }
        r4Var.h = new aa.c0(this, t3Var, wallPaper, z10, 29);
        if (z10) {
            r4Var.k = new wm(this);
            r4Var.i = new um(this, i10);
            r4Var.j = new um(this, i7);
        } else {
            if (bnVar.m1 != null) {
                bnVar.Mc();
            }
            r4Var.h.run();
        }
        r4Var.e = true;
        r4Var.m = this;
        r4Var.l = 250L;
        s4Var2 = ((org.telegram.ui.ActionBar.h2) bnVar).parentLayout;
        ((ActionBarLayout) s4Var2).f(r4Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(org.telegram.ui.ActionBar.t3 t3Var, TLRPC.WallPaper wallPaper, boolean z10) {
        int i7;
        int i10;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k6 k6Var;
        SparseIntArray T0;
        int indexOfKey;
        org.telegram.ui.ActionBar.m6 m6Var;
        boolean z11;
        Drawable drawable;
        int i11;
        char c10;
        org.telegram.ui.ActionBar.m6 Q0;
        int i12;
        org.telegram.ui.ActionBar.m6 Q02;
        org.telegram.ui.ActionBar.t3 t3Var2 = t3Var;
        bn bnVar = this.G;
        if (bnVar.za != null) {
            return;
        }
        this.f = t3Var2;
        this.g = wallPaper;
        Drawable backgroundImage = bnVar.fragmentView != null ? bnVar.m1.getBackgroundImage() : null;
        org.telegram.ui.Components.bb0 bb0Var = backgroundImage instanceof org.telegram.ui.Components.bb0 ? (org.telegram.ui.Components.bb0) backgroundImage : null;
        int i13 = bb0Var != null ? bb0Var.i : 0;
        if ((t3Var2 == null || t3Var2.a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.n6.lm.indexOfKey(org.telegram.ui.ActionBar.n6.cd);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.n6.lm.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.n6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (t3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.n6.t0();
            if (t02 instanceof org.telegram.ui.Components.bb0) {
                ((org.telegram.ui.Components.bb0) t02).u(i13);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.n6.I.q() == this.q) {
                Q02 = org.telegram.ui.ActionBar.n6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string) != null && !org.telegram.ui.ActionBar.n6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string2) != null && org.telegram.ui.ActionBar.n6.Q0(string2).q()) {
                    str = string2;
                }
                Q02 = this.q ? org.telegram.ui.ActionBar.n6.Q0(str) : org.telegram.ui.ActionBar.n6.Q0(str2);
            }
            org.telegram.ui.ActionBar.n6.u(Q02, false, this.q);
            p(this.h);
            this.s = false;
            t();
            return;
        }
        this.s = false;
        if (org.telegram.messenger.t0.b != null) {
            org.telegram.ui.ActionBar.n6.K(org.telegram.messenger.t0.b, false);
        }
        if (t3Var2 == null) {
            this.d = new SparseIntArray();
            i10 = 0;
        } else {
            i7 = ((org.telegram.ui.ActionBar.h2) this.G).currentAccount;
            boolean z12 = this.q;
            ArrayList arrayList2 = t3Var2.f;
            org.telegram.ui.ActionBar.m6 i15 = t3Var2.i(z12 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.s3) t3Var2.f.get(z12 ? 1 : 0)).d;
                i10 = 0;
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) ((ig.a) t3Var2.f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = s3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.s3) t3Var2.f.get(z12 ? 1 : 0)).b;
                org.telegram.ui.ActionBar.m6 m6Var2 = new org.telegram.ui.ActionBar.m6(org.telegram.ui.ActionBar.n6.Q0(org.telegram.ui.ActionBar.n6.r0(b10)));
                arrayList = arrayList2;
                k6Var = m6Var2.e(s3Var.a(), b10, tL_theme, i7, true);
                m6Var2.u(k6Var.a);
                i15 = m6Var2;
            } else {
                i10 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.b0;
                k6Var = sparseArray != null ? (org.telegram.ui.ActionBar.k6) sparseArray.get(((org.telegram.ui.ActionBar.s3) arrayList.get(z12 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i15.b != null) {
                T0 = org.telegram.ui.ActionBar.n6.T0(new File(i15.b), null, strArr);
            } else {
                String str3 = i15.d;
                T0 = str3 != null ? org.telegram.ui.ActionBar.n6.T0(null, str3, strArr) : new SparseIntArray();
            }
            ((org.telegram.ui.ActionBar.s3) arrayList.get(z12 ? 1 : 0)).g = strArr[i10];
            if (k6Var != null) {
                SparseIntArray clone = T0.clone();
                k6Var.d(T0, clone);
                ig.b bVar = t3Var2.c;
                if (bVar != null && !TextUtils.isEmpty(bVar.b) && (m6Var = k6Var.b) != null && m6Var.b == null && !m6Var.q()) {
                    org.telegram.ui.ActionBar.k6.h(clone);
                }
                T0 = clone;
            }
            SparseIntArray sparseIntArray = org.telegram.ui.ActionBar.n6.im;
            for (int i17 = i10; i17 < sparseIntArray.size(); i17++) {
                int keyAt = sparseIntArray.keyAt(i17);
                int valueAt = sparseIntArray.valueAt(i17);
                if (T0.indexOfKey(keyAt) < 0 && (indexOfKey = T0.indexOfKey(valueAt)) >= 0) {
                    T0.put(keyAt, T0.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.n6.hm;
            for (int i18 = i10; i18 < iArr.length; i18++) {
                if (T0.indexOfKey(i18) < 0) {
                    T0.put(i18, iArr[i18]);
                }
            }
            this.d = T0;
        }
        if (!TextUtils.isEmpty(org.telegram.messenger.f4.j(this.g))) {
            Drawable drawable2 = this.h;
            i12 = ((org.telegram.ui.ActionBar.h2) this.G).currentAccount;
            this.h = hi.w5.f(drawable2, i12, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = en.d(this.h, wallPaper, this.q);
        } else {
            if (t3Var2.a) {
                org.telegram.ui.ActionBar.m6 d = org.telegram.ui.ActionBar.t3.d(this.q);
                i11 = ((org.telegram.ui.ActionBar.h2) this.G).currentAccount;
                org.telegram.ui.ActionBar.n6.I(d, t3Var2.g(i11, this.q ? 1 : 0), ((org.telegram.ui.ActionBar.s3) t3Var2.f.get(this.q ? 1 : 0)).g, i13, i10);
                drawable = new ColorDrawable(-16777216);
            } else {
                int k10 = k(org.telegram.ui.ActionBar.n6.Ee);
                int k11 = k(org.telegram.ui.ActionBar.n6.Fe);
                int k12 = k(org.telegram.ui.ActionBar.n6.Ge);
                int k13 = k(org.telegram.ui.ActionBar.n6.He);
                org.telegram.ui.Components.bb0 bb0Var2 = new org.telegram.ui.Components.bb0();
                bb0Var2.s(t3Var2.j(this.q ? 1 : 0).settings.intensity, bb0Var2.u);
                TLRPC.Document e10 = t3Var2.e();
                if (bb0Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    bb0Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = bb0Var2.c;
                    if (weakReference != null) {
                        bb0Var2.y.H0((View) weakReference.get());
                    }
                    if (bb0Var2.T) {
                        bb0Var2.y.P();
                    }
                }
                bb0Var2.y.q0(org.telegram.messenger.fc.b(e10), "80_80", null, null, null, 0);
                bb0Var2.y.X(1);
                bb0Var2.y.W(1);
                bb0Var2.o(k10, k11, k12, k13, 0, true);
                bb0Var2.u(i13);
                int f10 = bb0Var2.f();
                boolean z13 = this.q;
                oi.e0 e0Var = new oi.e0(18, this, bb0Var2);
                org.telegram.ui.ActionBar.s3 s3Var2 = (org.telegram.ui.ActionBar.s3) t3Var2.f.get(z13 ? 1 : 0);
                if (s3Var2 == null || s3Var2.c == null) {
                    z11 = z13 ? 1 : 0;
                } else {
                    long h = t3Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = s3Var2.c.gift;
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
                    org.telegram.messenger.fc b11 = org.telegram.messenger.fc.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.A1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.h1 = new ai.d0(e0Var, h, 3);
                    org.telegram.messenger.ec.D().M(imageReceiver2, null);
                }
                t3Var2 = t3Var;
                t3Var2.n(this.q ? 1 : 0, new org.telegram.messenger.r6(this, t3Var2, z11, bb0Var2, f10));
                drawable = bb0Var2;
            }
            this.h = drawable;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.r = new AnimatorSet();
            if (bb0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new vm(bb0Var, 0));
                ofFloat.addListener(new xm(bb0Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable3 = this.h;
            if (drawable3 instanceof org.telegram.ui.Components.bb0) {
                org.telegram.ui.Components.bb0 bb0Var3 = (org.telegram.ui.Components.bb0) drawable3;
                bb0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new vm(bb0Var3, 1));
                ofFloat2.addListener(new ym(bb0Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (t3Var2 != null || this.G.l6 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.n6.I.q() == this.q) {
                Q0 = org.telegram.ui.ActionBar.n6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string3) != null && !org.telegram.ui.ActionBar.n6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.n6.Q0(string4) != null && org.telegram.ui.ActionBar.n6.Q0(string4).q()) {
                    str = string4;
                }
                Q0 = this.q ? org.telegram.ui.ActionBar.n6.Q0(str) : org.telegram.ui.ActionBar.n6.Q0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.n6.u(Q0, false, this.q);
        }
        int i22 = org.telegram.messenger.g0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        bn bnVar = this.G;
        if (bnVar.za == null && this.f == null && this.g == null) {
            boolean z10 = bnVar.S9() && !org.telegram.messenger.bz.H0;
            if (z10 || this.s) {
                this.s = z10;
                this.b.clear();
                this.a.clear();
                if (z10) {
                    if (org.telegram.messenger.t0.b != null) {
                        org.telegram.ui.ActionBar.n6.K(org.telegram.messenger.t0.b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.n6.t0());
                u(1.0f);
            }
        }
    }

    public final void u(float f10) {
        int a10;
        int a11;
        int a12;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint g10 = g("paintChatActionBackground");
        Paint g11 = g("paintChatActionBackgroundSelected");
        Paint g12 = g("paintChatMessageBackgroundSelected");
        int i7 = this.B;
        boolean S9 = this.G.S9();
        int i10 = -1;
        if (this.C) {
            a10 = -1;
        } else {
            a10 = a(S9 ? org.telegram.ui.ActionBar.n6.Fa : org.telegram.ui.ActionBar.n6.Zc, true);
        }
        if (this.C) {
            a11 = -1;
        } else {
            a11 = a(S9 ? org.telegram.ui.ActionBar.n6.Fa : org.telegram.ui.ActionBar.n6.ad, true);
        }
        if (this.C) {
            a12 = -1;
        } else {
            a12 = a(S9 ? org.telegram.ui.ActionBar.n6.Ha : org.telegram.ui.ActionBar.n6.ad, true);
        }
        if (!this.C) {
            i10 = a(S9 ? org.telegram.ui.ActionBar.n6.Ga : org.telegram.ui.ActionBar.n6.bd, true);
        }
        if (f10 != 1.0f) {
            i7 = i0.a.f(f10, this.z, i7);
            a10 = i0.a.f(f10, this.v, a10);
            a11 = i0.a.f(f10, this.w, a11);
            a12 = i0.a.f(f10, this.x, a12);
            i10 = i0.a.f(f10, this.y, i10);
        }
        if (g10 != null && !this.C) {
            g10.setColor(i7);
            g11.setColor(i7);
        }
        Paint g13 = g("paintChatActionText");
        if (g13 != null) {
            ((TextPaint) g13).linkColor = a11;
            g("paintChatActionText").setColor(a10);
            g("paintChatBotButton").setColor(a12);
        }
        org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.n6.C1(a10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.n6.C1(i10, getDrawable("drawableShareIcon"));
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
            if (g10 != null) {
                g10.setShader(this.o);
                g11.setShader(this.o);
            }
            if (g12 != null) {
                g12.setShader(this.o);
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
        if (g10 != null) {
            g10.setShader(this.n);
            g11.setShader(this.n);
        }
        if (g12 != null) {
            g12.setShader(this.n);
        }
    }
}
