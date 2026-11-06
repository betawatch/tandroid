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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class ym implements org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.ea0 {
    public Bitmap A;
    public int B;
    public boolean C;
    public boolean D;
    public final /* synthetic */ an G;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.r3 f;
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
    public org.telegram.ui.ActionBar.t4 t;
    public org.telegram.ui.ActionBar.t4 u;
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
    public boolean q = org.telegram.ui.ActionBar.k6.I.q();

    public ym(an anVar) {
        int i7;
        int i10;
        this.G = anVar;
        boolean z9 = false;
        if (q(false)) {
            i7 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            this.f = org.telegram.messenger.d4.f(i7).c(anVar.j6);
            i10 = ((org.telegram.ui.ActionBar.f2) anVar).currentAccount;
            TLRPC.WallPaper d = org.telegram.messenger.d4.f(i10).d(anVar.j6);
            this.g = d;
            org.telegram.ui.ActionBar.r3 r3Var = this.f;
            if (r3Var != null || d != null) {
                s(r3Var, d, false);
                z9 = true;
            }
        }
        if (!z9) {
            t();
        }
        if (z9 || ThemeEditorView.p != null) {
            org.telegram.messenger.g0.h3(new org.telegram.messenger.pd(14));
        } else {
            org.telegram.ui.ActionBar.k6.t1(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        return (sparseIntArray == null || sparseIntArray.size() <= 0) ? org.telegram.ui.ActionBar.k6.I.q() : this.q;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void b(float f10, float f11, int i7, int i10) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h == null || (bitmap = this.j) == null || (bitmapShader = this.n) == null) {
            org.telegram.ui.ActionBar.k6.r(f10, f11, i7, i10);
            return;
        }
        boolean z9 = this.p;
        Matrix matrix = this.c;
        if (z9) {
            org.telegram.ui.ActionBar.k6.s(this.k, this.o, matrix, i7, i10, f10, f11);
        } else {
            org.telegram.ui.ActionBar.k6.s(bitmap, bitmapShader, matrix, i7, i10, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint d(String str) {
        if (this.f == null && this.h == null && !this.s) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean e() {
        return this.G.Q9();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int f(int i7) {
        return h(i7);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean g() {
        return (this.h != null || this.s) ? this.n != null : org.telegram.ui.ActionBar.k6.d1();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int h(int i7) {
        int indexOfKey;
        Integer z02;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.s && (z02 = org.telegram.ui.ActionBar.k6.z0(i7, this)) != null) {
            return z02.intValue();
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.k6.v0(i7);
        }
        int indexOfKey3 = this.d.indexOfKey(i7);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i10 = org.telegram.ui.ActionBar.k6.fm.get(i7);
        return (i10 < 0 || (indexOfKey = this.d.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.k6.v0(i7) : this.d.valueAt(indexOfKey);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void i(int i7, int i10) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i7, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int j(int i7) {
        return k(i7, false);
    }

    public final int k(int i7, boolean z9) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        }
        if (!z9 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i7)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i7)) < 0) ? org.telegram.ui.ActionBar.k6.x0(null, i7, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.r3 l() {
        return this.f;
    }

    public final Drawable m() {
        Drawable drawable = this.h;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.k6.t0();
    }

    public final void n() {
        Drawable t4Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.am.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    t4Var = new org.telegram.ui.ActionBar.t4(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    t4Var = new org.telegram.ui.ActionBar.t4(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    t4Var = new org.telegram.ui.ActionBar.t4(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    t4Var = new org.telegram.ui.ActionBar.t4(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    t4Var = new org.telegram.ui.ActionBar.t4(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    t4Var = new org.telegram.ui.ActionBar.t4(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    t4Var = new org.telegram.ui.ActionBar.t4(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    t4Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (t4Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.k6.bm.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.k6.C1(h(intValue), t4Var);
                            break;
                        }
                    }
                    break;
            }
            if (t4Var != null) {
                this.a.put((String) entry.getKey(), t4Var);
            }
        }
    }

    public final void o() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.k6.cm.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.k6.dm.get((String) entry.getKey())).intValue();
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
        boolean z9;
        float f11;
        Paint d;
        Paint d2;
        int i7;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        an anVar = this.G;
        if (anVar.va != null) {
            return;
        }
        int i10 = org.telegram.messenger.g0.q(drawable2)[0];
        int k10 = k(org.telegram.ui.ActionBar.k6.Zc, false);
        int i11 = org.telegram.ui.ActionBar.k6.vd;
        int k11 = k(i11, false);
        if (k10 != 0 && this.g == null) {
            i10 = k10;
        }
        boolean Q9 = anVar.Q9();
        if (Q9) {
            i10 = i0.a.k(k(org.telegram.ui.ActionBar.k6.Ea, false), k(org.telegram.ui.ActionBar.k6.ua, false));
        }
        this.B = i10;
        if (drawable2 instanceof dn) {
            dn dnVar = (dn) drawable2;
            f10 = dnVar.f == null ? dnVar.d : 0.0f;
            drawable2 = dnVar.c(false);
        } else {
            f10 = 0.0f;
        }
        boolean z10 = !Q9 && ((drawable2 instanceof org.telegram.ui.Components.qa0) || (drawable2 instanceof BitmapDrawable)) && org.telegram.messenger.iz.o() != 0;
        this.C = z10;
        org.telegram.ui.ActionBar.r3 r3Var = this.f;
        if (r3Var != null) {
            TLRPC.ChatTheme chatTheme = r3Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.q) {
                        z9 = true;
                        this.D = z10;
                        if (z10) {
                            boolean z11 = drawable2 instanceof BitmapDrawable;
                            Rect rect = this.F;
                            f11 = 0.0f;
                            Rect rect2 = this.E;
                            if (z11) {
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
                                Bitmap bitmap3 = ((org.telegram.ui.Components.qa0) drawable2).k;
                                this.k = bitmap3;
                                if (z9) {
                                    this.k = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.k).drawColor(-870178270);
                                }
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
                                this.m.drawColor(i0.a.o(-16777216, (int) (f10 * 255.0f)));
                                if (z9) {
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
                                if (drawable2 instanceof org.telegram.ui.Components.qa0) {
                                    if (((org.telegram.ui.Components.qa0) drawable2).q >= f11) {
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
                                d.setAlpha(org.telegram.messenger.qs.e4);
                                d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                d.setShader(this.o);
                                d.setFilterBitmap(true);
                                d10.setAlpha(org.telegram.messenger.qs.e4);
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
                z9 = true;
                this.D = z10;
                if (z10) {
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
        z9 = false;
        this.D = z10;
        if (z10) {
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

    public final boolean q(boolean z9) {
        TLRPC.User user;
        an anVar = this.G;
        if (anVar.h != null) {
            return false;
        }
        if (z9) {
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
    public final void r(org.telegram.ui.ActionBar.r3 r3Var, TLRPC.WallPaper wallPaper, boolean z9, Boolean bool, boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        boolean z11;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.q4 q4Var2;
        boolean z12;
        an anVar = this.G;
        q4Var = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
        if (q4Var == null || anVar.va != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.q;
        ig.b bVar = r3Var != null ? r3Var.c : null;
        org.telegram.ui.ActionBar.r3 r3Var2 = this.f;
        ig.b bVar2 = r3Var2 != null ? r3Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.g;
        int i7 = 1;
        int i10 = 0;
        if (!z10) {
            if (!q(false)) {
                return;
            }
            if (ig.b.a(bVar2, bVar) && this.q == booleanValue) {
                org.telegram.messenger.p5 p5Var = org.telegram.messenger.d4.s;
                if (wallPaper != null || wallPaper2 != null) {
                    if (wallPaper != null && wallPaper2 != null) {
                        String str = wallPaper.uploadingImage;
                        if (str != null) {
                            z12 = TextUtils.equals(wallPaper2.uploadingImage, str);
                            if (z12) {
                                return;
                            }
                        } else if (wallPaper.id == wallPaper2.id) {
                            if (TextUtils.equals(dn.e(wallPaper.settings), dn.e(wallPaper2.settings))) {
                            }
                        }
                    }
                    z12 = false;
                    if (z12) {
                    }
                }
                z12 = true;
                if (z12) {
                }
            }
        }
        this.q = booleanValue;
        org.telegram.ui.ActionBar.j6 D0 = booleanValue ? org.telegram.ui.ActionBar.k6.J : org.telegram.ui.ActionBar.k6.D0();
        org.telegram.ui.ActionBar.p4 p4Var = new org.telegram.ui.ActionBar.p4(D0, D0.Y, D0.q(), !z9);
        org.telegram.ui.ActionBar.r3 r3Var3 = this.f;
        if (r3Var3 == null && this.g == null) {
            Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
            this.C = t02 instanceof org.telegram.ui.Components.qa0;
            p(t02);
            this.v = this.C ? -1 : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wc, false);
            this.w = this.C ? -1 : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xc, false);
            this.x = this.C ? -1 : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xc, false);
            this.y = this.C ? -1 : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yc, false);
        } else {
            if (this.C) {
                Drawable drawable = this.h;
                if (drawable instanceof org.telegram.ui.Components.qa0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.qa0) drawable).k;
                    this.A = bitmap;
                    if (r3Var3 != null) {
                        TLRPC.ChatTheme chatTheme = r3Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null) {
                                    z11 = true;
                                    if (!z11 && this.q) {
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
                    z11 = false;
                    if (!z11 && this.q) {
                    }
                }
            }
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                p(drawable2);
            }
        }
        this.z = this.B;
        this.v = this.C ? -1 : k(org.telegram.ui.ActionBar.k6.Wc, true);
        this.w = this.C ? -1 : k(org.telegram.ui.ActionBar.k6.Xc, true);
        this.x = this.C ? -1 : k(org.telegram.ui.ActionBar.k6.Xc, true);
        this.y = this.C ? -1 : k(org.telegram.ui.ActionBar.k6.Yc, true);
        if (r3Var != null || wallPaper != null) {
            int i11 = org.telegram.messenger.g0.q(this.h)[0];
            n();
            o();
        }
        p4Var.f = false;
        if (anVar.j6 < 0) {
            p4Var.g = false;
        }
        p4Var.h = new aa.d0(this, r3Var, wallPaper, z9, 29);
        if (z9) {
            p4Var.k = new vm(this);
            p4Var.i = new tm(this, i10);
            p4Var.j = new tm(this, i7);
        } else {
            if (anVar.l1 != null) {
                anVar.Ic();
            }
            p4Var.h.run();
        }
        p4Var.e = true;
        p4Var.m = this;
        p4Var.l = 250L;
        q4Var2 = ((org.telegram.ui.ActionBar.f2) anVar).parentLayout;
        ((ActionBarLayout) q4Var2).f(p4Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(org.telegram.ui.ActionBar.r3 r3Var, TLRPC.WallPaper wallPaper, boolean z9) {
        int i7;
        int i10;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.h6 h6Var;
        SparseIntArray T0;
        int indexOfKey;
        org.telegram.ui.ActionBar.j6 j6Var;
        boolean z10;
        Drawable drawable;
        int i11;
        char c10;
        org.telegram.ui.ActionBar.j6 Q0;
        int i12;
        org.telegram.ui.ActionBar.j6 Q02;
        org.telegram.ui.ActionBar.r3 r3Var2 = r3Var;
        an anVar = this.G;
        if (anVar.va != null) {
            return;
        }
        this.f = r3Var2;
        this.g = wallPaper;
        Drawable backgroundImage = anVar.fragmentView != null ? anVar.l1.getBackgroundImage() : null;
        org.telegram.ui.Components.qa0 qa0Var = backgroundImage instanceof org.telegram.ui.Components.qa0 ? (org.telegram.ui.Components.qa0) backgroundImage : null;
        int i13 = qa0Var != null ? qa0Var.i : 0;
        if ((r3Var2 == null || r3Var2.a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.k6.im.indexOfKey(org.telegram.ui.ActionBar.k6.Zc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.k6.im.valueAt(indexOfKey2);
            } else {
                int i14 = org.telegram.ui.ActionBar.k6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (r3Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.k6.t0();
            if (t02 instanceof org.telegram.ui.Components.qa0) {
                ((org.telegram.ui.Components.qa0) t02).u(i13);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.k6.I.q() == this.q) {
                Q02 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string) != null && !org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string2) != null && org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                    str = string2;
                }
                Q02 = this.q ? org.telegram.ui.ActionBar.k6.Q0(str) : org.telegram.ui.ActionBar.k6.Q0(str2);
            }
            org.telegram.ui.ActionBar.k6.u(Q02, false, this.q);
            p(this.h);
            this.s = false;
            t();
            return;
        }
        this.s = false;
        if (org.telegram.messenger.t0.b != null) {
            org.telegram.ui.ActionBar.k6.K(org.telegram.messenger.t0.b, false);
        }
        if (r3Var2 == null) {
            this.d = new SparseIntArray();
            i10 = 0;
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
            boolean z11 = this.q;
            ArrayList arrayList2 = r3Var2.f;
            org.telegram.ui.ActionBar.j6 i15 = r3Var2.i(z11 ? 1 : 0);
            if (i15 == null) {
                int i16 = ((org.telegram.ui.ActionBar.q3) r3Var2.f.get(z11 ? 1 : 0)).d;
                i10 = 0;
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) ((ig.a) r3Var2.f.get(z11 ? 1 : 0));
                TLRPC.ThemeSettings b10 = q3Var.b(i16);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.q3) r3Var2.f.get(z11 ? 1 : 0)).b;
                org.telegram.ui.ActionBar.j6 j6Var2 = new org.telegram.ui.ActionBar.j6(org.telegram.ui.ActionBar.k6.Q0(org.telegram.ui.ActionBar.k6.r0(b10)));
                arrayList = arrayList2;
                h6Var = j6Var2.e(q3Var.a(), b10, tL_theme, i7, true);
                j6Var2.u(h6Var.a);
                i15 = j6Var2;
            } else {
                i10 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i15.a0;
                h6Var = sparseArray != null ? (org.telegram.ui.ActionBar.h6) sparseArray.get(((org.telegram.ui.ActionBar.q3) arrayList.get(z11 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i15.b != null) {
                T0 = org.telegram.ui.ActionBar.k6.T0(new File(i15.b), null, strArr);
            } else {
                String str3 = i15.d;
                T0 = str3 != null ? org.telegram.ui.ActionBar.k6.T0(null, str3, strArr) : new SparseIntArray();
            }
            ((org.telegram.ui.ActionBar.q3) arrayList.get(z11 ? 1 : 0)).g = strArr[i10];
            if (h6Var != null) {
                SparseIntArray clone = T0.clone();
                h6Var.d(T0, clone);
                ig.b bVar = r3Var2.c;
                if (bVar != null && !TextUtils.isEmpty(bVar.b) && (j6Var = h6Var.b) != null && j6Var.b == null && !j6Var.q()) {
                    org.telegram.ui.ActionBar.h6.h(clone);
                }
                T0 = clone;
            }
            SparseIntArray sparseIntArray = org.telegram.ui.ActionBar.k6.fm;
            for (int i17 = i10; i17 < sparseIntArray.size(); i17++) {
                int keyAt = sparseIntArray.keyAt(i17);
                int valueAt = sparseIntArray.valueAt(i17);
                if (T0.indexOfKey(keyAt) < 0 && (indexOfKey = T0.indexOfKey(valueAt)) >= 0) {
                    T0.put(keyAt, T0.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.k6.em;
            for (int i18 = i10; i18 < iArr.length; i18++) {
                if (T0.indexOfKey(i18) < 0) {
                    T0.put(i18, iArr[i18]);
                }
            }
            this.d = T0;
        }
        if (!TextUtils.isEmpty(org.telegram.messenger.d4.j(this.g))) {
            Drawable drawable2 = this.h;
            i12 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
            this.h = fi.y5.f(drawable2, i12, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = dn.d(this.h, wallPaper, this.q);
        } else {
            if (r3Var2.a) {
                org.telegram.ui.ActionBar.j6 d = org.telegram.ui.ActionBar.r3.d(this.q);
                i11 = ((org.telegram.ui.ActionBar.f2) this.G).currentAccount;
                org.telegram.ui.ActionBar.k6.I(d, r3Var2.g(i11, this.q ? 1 : 0), ((org.telegram.ui.ActionBar.q3) r3Var2.f.get(this.q ? 1 : 0)).g, i13, i10);
                drawable = new ColorDrawable(-16777216);
            } else {
                int h = h(org.telegram.ui.ActionBar.k6.Be);
                int h7 = h(org.telegram.ui.ActionBar.k6.Ce);
                int h10 = h(org.telegram.ui.ActionBar.k6.De);
                int h11 = h(org.telegram.ui.ActionBar.k6.Ee);
                org.telegram.ui.Components.qa0 qa0Var2 = new org.telegram.ui.Components.qa0();
                qa0Var2.s(qa0Var2.u, r3Var2.j(this.q ? 1 : 0).settings.intensity);
                TLRPC.Document e10 = r3Var2.e();
                if (qa0Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver(null);
                    qa0Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = qa0Var2.c;
                    if (weakReference != null) {
                        qa0Var2.y.H0((View) weakReference.get());
                    }
                    if (qa0Var2.T) {
                        qa0Var2.y.P();
                    }
                }
                qa0Var2.y.q0(org.telegram.messenger.hc.b(e10), "80_80", null, null, null, 0);
                qa0Var2.y.X(1);
                qa0Var2.y.W(1);
                qa0Var2.o(h, h7, h10, h11, 0, true);
                qa0Var2.u(i13);
                int f10 = qa0Var2.f();
                boolean z12 = this.q;
                ni.c cVar = new ni.c(16, this, qa0Var2);
                org.telegram.ui.ActionBar.q3 q3Var2 = (org.telegram.ui.ActionBar.q3) r3Var2.f.get(z12 ? 1 : 0);
                if (q3Var2 == null || q3Var2.c == null) {
                    z10 = z12 ? 1 : 0;
                } else {
                    long h12 = r3Var2.h(z12 ? 1 : 0);
                    TL_stars.StarGift starGift = q3Var2.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList3 = starGift.attributes;
                    if (arrayList3 != null && document == null) {
                        int size = arrayList3.size();
                        z10 = z12 ? 1 : 0;
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
                        z10 = z12 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    org.telegram.messenger.hc b11 = org.telegram.messenger.hc.b(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.z1 = false;
                    imageReceiver2.q0(b11, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.g1 = new di.c1(cVar, h12, 2);
                    org.telegram.messenger.gc.D().M(imageReceiver2, null);
                }
                r3Var2 = r3Var;
                r3Var2.n(this.q ? 1 : 0, new org.telegram.messenger.r6(this, r3Var2, z10, qa0Var2, f10));
                drawable = qa0Var2;
            }
            this.h = drawable;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z9) {
            this.r = new AnimatorSet();
            if (qa0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new um(qa0Var, 0));
                ofFloat.addListener(new wm(qa0Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable3 = this.h;
            if (drawable3 instanceof org.telegram.ui.Components.qa0) {
                org.telegram.ui.Components.qa0 qa0Var3 = (org.telegram.ui.Components.qa0) drawable3;
                qa0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new um(qa0Var3, 1));
                ofFloat2.addListener(new xm(qa0Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (r3Var2 != null || this.G.j6 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.k6.I.q() == this.q) {
                Q0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences2 = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string3) != null && !org.telegram.ui.ActionBar.k6.Q0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string4) != null && org.telegram.ui.ActionBar.k6.Q0(string4).q()) {
                    str = string4;
                }
                Q0 = this.q ? org.telegram.ui.ActionBar.k6.Q0(str) : org.telegram.ui.ActionBar.k6.Q0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.k6.u(Q0, false, this.q);
        }
        int i22 = org.telegram.messenger.g0.q(this.h)[c10];
        n();
        o();
        p(this.h);
        u(1.0f);
    }

    public final void t() {
        an anVar = this.G;
        if (anVar.va == null && this.f == null && this.g == null) {
            boolean z9 = anVar.Q9() && !org.telegram.messenger.iz.H0;
            if (z9 || this.s) {
                this.s = z9;
                this.b.clear();
                this.a.clear();
                if (z9) {
                    if (org.telegram.messenger.t0.b != null) {
                        org.telegram.ui.ActionBar.k6.K(org.telegram.messenger.t0.b, false);
                    }
                    n();
                    o();
                }
                p(org.telegram.ui.ActionBar.k6.t0());
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
        boolean Q9 = this.G.Q9();
        int i10 = -1;
        if (this.C) {
            k10 = -1;
        } else {
            k10 = k(Q9 ? org.telegram.ui.ActionBar.k6.Fa : org.telegram.ui.ActionBar.k6.Wc, true);
        }
        if (this.C) {
            k11 = -1;
        } else {
            k11 = k(Q9 ? org.telegram.ui.ActionBar.k6.Fa : org.telegram.ui.ActionBar.k6.Xc, true);
        }
        if (this.C) {
            k12 = -1;
        } else {
            k12 = k(Q9 ? org.telegram.ui.ActionBar.k6.Ha : org.telegram.ui.ActionBar.k6.Xc, true);
        }
        if (!this.C) {
            i10 = k(Q9 ? org.telegram.ui.ActionBar.k6.Ga : org.telegram.ui.ActionBar.k6.Yc, true);
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
        org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.k6.C1(k10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.k6.C1(i10, getDrawable("drawableShareIcon"));
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
