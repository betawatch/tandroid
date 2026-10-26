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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sn implements org.telegram.ui.ActionBar.u6, org.telegram.ui.Components.jc0 {
    public int A;
    public boolean B;
    public boolean C;
    public final /* synthetic */ un F;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.h4 f;
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
    public org.telegram.ui.ActionBar.l5 s;
    public org.telegram.ui.ActionBar.l5 t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public Bitmap z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Matrix c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint l = new Paint();
    public final Rect D = new Rect();
    public final Rect E = new Rect();
    public boolean q = org.telegram.ui.ActionBar.y6.I.q();

    public sn(un unVar) {
        int i10;
        int i11;
        this.F = unVar;
        if (p(false)) {
            i10 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            this.f = ChatThemeController.getInstance(i10).getDialogTheme(unVar.f6);
            i11 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(unVar.f6);
            this.g = dialogWallpaper;
            org.telegram.ui.ActionBar.h4 h4Var = this.f;
            if (h4Var != null || dialogWallpaper != null) {
                r(h4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new ag.c(27));
            }
        }
        if (ThemeEditorView.p == null) {
            org.telegram.ui.ActionBar.y6.q1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new ag.c(27));
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean a() {
        SparseIntArray sparseIntArray = this.d;
        return (sparseIntArray == null || sparseIntArray.size() <= 0) ? org.telegram.ui.ActionBar.y6.I.q() : this.q;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void b(float f7, float f10, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.h == null || (bitmap = this.j) == null || (bitmapShader = this.n) == null) {
            org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
            return;
        }
        boolean z10 = this.p;
        Matrix matrix = this.c;
        if (z10) {
            org.telegram.ui.ActionBar.y6.r(this.k, this.o, matrix, i10, i11, f7, f10);
        } else {
            org.telegram.ui.ActionBar.y6.r(bitmap, bitmapShader, matrix, i10, i11, f7, f10);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.y6.v3;
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Paint d(String str) {
        if (this.f == null && this.h == null) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int e(int i10) {
        return g(i10);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final boolean f() {
        return this.h != null ? this.n != null : org.telegram.ui.ActionBar.y6.c1();
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int g(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.y6.rl.get(i10);
        return (i11 < 0 || (indexOfKey = this.d.indexOfKey(i11)) < 0) ? org.telegram.ui.ActionBar.y6.x0(null, i10, false) : this.d.valueAt(indexOfKey);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final void h(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.u6
    public final int i(int i10) {
        return j(i10, false);
    }

    public final int j(int i10, boolean z10) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.h == null) {
            return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        }
        if (!z10 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.y6.x0(null, i10, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.h4 k() {
        return this.f;
    }

    public final Drawable l() {
        Drawable drawable = this.h;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.y6.t0();
    }

    public final void m() {
        Drawable l5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.y6.ml.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    l5Var = new org.telegram.ui.ActionBar.l5(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    l5Var = new org.telegram.ui.ActionBar.l5(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    l5Var = new org.telegram.ui.ActionBar.l5(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    l5Var = new org.telegram.ui.ActionBar.l5(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    l5Var = new org.telegram.ui.ActionBar.l5(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    l5Var = new org.telegram.ui.ActionBar.l5(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    l5Var = new org.telegram.ui.ActionBar.l5(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    l5Var = new org.telegram.ui.ActionBar.l5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    l5Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (l5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.y6.nl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.y6.z1(g(intValue), l5Var);
                            break;
                        }
                    }
                    break;
            }
            if (l5Var != null) {
                this.a.put((String) entry.getKey(), l5Var);
            }
        }
    }

    public final void n() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.y6.ol.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.y6.pl.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(g(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Drawable drawable) {
        float f7;
        boolean z10;
        float f10;
        Paint d;
        Paint d10;
        int i10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        if (this.F.oa != null) {
            return;
        }
        int i11 = AndroidUtilities.calcDrawableColor(drawable2)[0];
        int j10 = j(org.telegram.ui.ActionBar.y6.lc, false);
        int i12 = org.telegram.ui.ActionBar.y6.Hc;
        int j11 = j(i12, false);
        if (j10 != 0 && this.g == null) {
            i11 = j10;
        }
        this.A = i11;
        if (drawable2 instanceof xn) {
            xn xnVar = (xn) drawable2;
            f7 = xnVar.f == null ? xnVar.d : 0.0f;
            drawable2 = xnVar.c(false);
        } else {
            f7 = 0.0f;
        }
        boolean z11 = drawable2 instanceof org.telegram.ui.Components.uc0;
        boolean z12 = (z11 || (drawable2 instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0;
        this.B = z12;
        org.telegram.ui.ActionBar.h4 h4Var = this.f;
        if (h4Var != null) {
            TLRPC.ChatTheme chatTheme = h4Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.q) {
                        z10 = true;
                        this.C = z12;
                        if (z12) {
                            boolean z13 = drawable2 instanceof BitmapDrawable;
                            f10 = 0.0f;
                            Rect rect = this.E;
                            Rect rect2 = this.D;
                            if (z13) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                int i13 = 40;
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i10 = (int) ((40 / bitmap.getWidth()) * bitmap.getHeight());
                                } else {
                                    i13 = (int) ((40 / bitmap.getHeight()) * bitmap.getWidth());
                                    i10 = 40;
                                }
                                this.j = Bitmap.createBitmap(i13, i10, Bitmap.Config.ARGB_8888);
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.j, 3);
                                this.m.drawColor(i0.a.o(-16777216, (int) (f7 * 255.0f)));
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
                                Bitmap bitmap3 = ((org.telegram.ui.Components.uc0) drawable2).k;
                                this.k = bitmap3;
                                if (z10) {
                                    this.k = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.k).drawColor(-870178270);
                                }
                                this.m = new Canvas(this.j);
                                rect2.set(0, 0, this.k.getWidth(), this.k.getHeight());
                                rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
                                this.m.drawBitmap(this.k, rect2, rect, (Paint) null);
                                this.m.drawColor(i0.a.o(-16777216, (int) (f7 * 255.0f)));
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
                            if (this.B) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (z11) {
                                    if (((org.telegram.ui.Components.uc0) drawable2).q >= f10) {
                                        colorMatrix.setSaturation(1.6f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.q ? 0.97f : 0.92f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.q ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.q ? 0.4f : 0.8f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.q ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.q ? 0.9f : 0.84f);
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.q ? 0.04f : 0.06f);
                                }
                                d.setAlpha(255);
                                d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                d.setShader(this.o);
                                d.setFilterBitmap(true);
                                d11.setAlpha(255);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.26f);
                                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.92f);
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
                        if (!this.C) {
                            if (j11 == 0) {
                                j11 = g(i12);
                            }
                            d10.setColor(j11);
                            d10.setColorFilter(null);
                            d10.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 2.5f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.75f);
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
                this.C = z12;
                if (z12) {
                }
                d = d("paintChatActionBackground");
                Paint d112 = d("paintChatActionBackgroundSelected");
                d10 = d("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (d != null) {
                }
                if (d10 == null) {
                }
                if (!this.C) {
                }
            }
        }
        z10 = false;
        this.C = z12;
        if (z12) {
        }
        d = d("paintChatActionBackground");
        Paint d1122 = d("paintChatActionBackgroundSelected");
        d10 = d("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (d != null) {
        }
        if (d10 == null) {
        }
        if (!this.C) {
        }
    }

    public final boolean p(boolean z10) {
        TLRPC.User user;
        un unVar = this.F;
        if (unVar.h != null) {
            return false;
        }
        if (z10) {
            return (unVar.e != null || (user = unVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    public final void q(org.telegram.ui.ActionBar.h4 h4Var, TLRPC.WallPaper wallPaper, boolean z10, Boolean bool, boolean z11) {
        org.telegram.ui.ActionBar.j5 j5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.j5 j5Var2;
        un unVar = this.F;
        j5Var = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
        if (j5Var == null || unVar.oa != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.q;
        hg.b bVar = h4Var != null ? h4Var.c : null;
        org.telegram.ui.ActionBar.h4 h4Var2 = this.f;
        hg.b bVar2 = h4Var2 != null ? h4Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.g;
        if (!z11) {
            if (!p(false)) {
                return;
            }
            if (hg.b.a(bVar2, bVar) && this.q == booleanValue && ChatThemeController.equals(wallPaper, wallPaper2)) {
                return;
            }
        }
        this.q = booleanValue;
        org.telegram.ui.ActionBar.x6 C0 = booleanValue ? org.telegram.ui.ActionBar.y6.J : org.telegram.ui.ActionBar.y6.C0();
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(C0, C0.Y, C0.q(), !z10);
        org.telegram.ui.ActionBar.h4 h4Var3 = this.f;
        if (h4Var3 == null && this.g == null) {
            Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
            this.B = t02 instanceof org.telegram.ui.Components.uc0;
            o(t02);
            this.u = this.B ? -1 : org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ic, false);
            this.v = this.B ? -1 : org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.jc, false);
            this.w = this.B ? -1 : org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.jc, false);
            this.x = this.B ? -1 : org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kc, false);
        } else {
            if (this.B) {
                Drawable drawable = this.h;
                if (drawable instanceof org.telegram.ui.Components.uc0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.uc0) drawable).k;
                    this.z = bitmap;
                    if (h4Var3 != null) {
                        TLRPC.ChatTheme chatTheme = h4Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null && this.q) {
                                    this.z = Bitmap.createBitmap(bitmap);
                                    new Canvas(this.z).drawColor(-870178270);
                                }
                            }
                        }
                        tL_starGiftUnique = null;
                        if (tL_starGiftUnique != null) {
                            this.z = Bitmap.createBitmap(bitmap);
                            new Canvas(this.z).drawColor(-870178270);
                        }
                    }
                }
            }
            Drawable drawable2 = this.h;
            if (drawable2 != null) {
                o(drawable2);
            }
        }
        this.y = this.A;
        this.u = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.ic, true);
        this.v = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.jc, true);
        this.w = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.jc, true);
        this.x = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.kc, true);
        if (h4Var != null || wallPaper != null) {
            int i10 = AndroidUtilities.calcDrawableColor(this.h)[0];
            m();
            n();
        }
        i5Var.f = false;
        if (unVar.f6 < 0) {
            i5Var.g = false;
        }
        i5Var.h = new bi.s9(this, h4Var, wallPaper, z10, 13);
        if (z10) {
            i5Var.k = new pn(this);
            i5Var.i = new nn(this, 0);
            i5Var.j = new nn(this, 1);
        } else {
            if (unVar.j1 != null) {
                unVar.rc();
            }
            i5Var.h.run();
        }
        i5Var.e = true;
        i5Var.m = this;
        i5Var.l = 250L;
        j5Var2 = ((org.telegram.ui.ActionBar.r2) unVar).parentLayout;
        ((ActionBarLayout) j5Var2).f(i5Var, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(org.telegram.ui.ActionBar.h4 h4Var, TLRPC.WallPaper wallPaper, boolean z10) {
        int i10;
        int i11;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.w6 w6Var;
        SparseIntArray S0;
        int indexOfKey;
        org.telegram.ui.ActionBar.x6 x6Var;
        boolean z11;
        Drawable drawable;
        int i12;
        char c10;
        org.telegram.ui.ActionBar.x6 P0;
        int i13;
        org.telegram.ui.ActionBar.x6 P02;
        org.telegram.ui.ActionBar.h4 h4Var2 = h4Var;
        un unVar = this.F;
        if (unVar.oa != null) {
            return;
        }
        this.f = h4Var2;
        this.g = wallPaper;
        Drawable backgroundImage = unVar.fragmentView != null ? unVar.j1.getBackgroundImage() : null;
        org.telegram.ui.Components.uc0 uc0Var = backgroundImage instanceof org.telegram.ui.Components.uc0 ? (org.telegram.ui.Components.uc0) backgroundImage : null;
        int i14 = uc0Var != null ? uc0Var.i : 0;
        if ((h4Var2 == null || h4Var2.a) && wallPaper == null) {
            int indexOfKey2 = org.telegram.ui.ActionBar.y6.ul.indexOfKey(org.telegram.ui.ActionBar.y6.lc);
            if (indexOfKey2 >= 0) {
                org.telegram.ui.ActionBar.y6.ul.valueAt(indexOfKey2);
            } else {
                int i15 = org.telegram.ui.ActionBar.y6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (h4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
            if (t02 instanceof org.telegram.ui.Components.uc0) {
                ((org.telegram.ui.Components.uc0) t02).u(i14);
            }
            this.h = null;
            if (org.telegram.ui.ActionBar.y6.I.q() == this.q) {
                P02 = org.telegram.ui.ActionBar.y6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string) != null && !org.telegram.ui.ActionBar.y6.P0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string2) != null && org.telegram.ui.ActionBar.y6.P0(string2).q()) {
                    str = string2;
                }
                P02 = this.q ? org.telegram.ui.ActionBar.y6.P0(str) : org.telegram.ui.ActionBar.y6.P0(str2);
            }
            org.telegram.ui.ActionBar.y6.t(P02, false, this.q);
            o(this.h);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.y6.J(ApplicationLoader.applicationContext, false);
        }
        if (h4Var2 == null) {
            this.d = new SparseIntArray();
            i11 = 0;
        } else {
            i10 = ((org.telegram.ui.ActionBar.r2) this.F).currentAccount;
            boolean z12 = this.q;
            ArrayList arrayList2 = h4Var2.f;
            org.telegram.ui.ActionBar.x6 i16 = h4Var2.i(z12 ? 1 : 0);
            if (i16 == null) {
                int i17 = ((org.telegram.ui.ActionBar.g4) h4Var2.f.get(z12 ? 1 : 0)).d;
                i11 = 0;
                org.telegram.ui.ActionBar.g4 g4Var = (org.telegram.ui.ActionBar.g4) ((hg.a) h4Var2.f.get(z12 ? 1 : 0));
                TLRPC.ThemeSettings b10 = g4Var.b(i17);
                TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.g4) h4Var2.f.get(z12 ? 1 : 0)).b;
                org.telegram.ui.ActionBar.x6 x6Var2 = new org.telegram.ui.ActionBar.x6(org.telegram.ui.ActionBar.y6.P0(org.telegram.ui.ActionBar.y6.r0(b10)));
                arrayList = arrayList2;
                w6Var = x6Var2.e(g4Var.a(), b10, tL_theme, i10, true);
                x6Var2.u(w6Var.a);
                i16 = x6Var2;
            } else {
                i11 = 0;
                arrayList = arrayList2;
                SparseArray sparseArray = i16.a0;
                w6Var = sparseArray != null ? (org.telegram.ui.ActionBar.w6) sparseArray.get(((org.telegram.ui.ActionBar.g4) arrayList.get(z12 ? 1 : 0)).e) : null;
            }
            String[] strArr = new String[1];
            if (i16.b != null) {
                S0 = org.telegram.ui.ActionBar.y6.S0(new File(i16.b), null, strArr);
            } else {
                String str3 = i16.d;
                S0 = str3 != null ? org.telegram.ui.ActionBar.y6.S0(null, str3, strArr) : new SparseIntArray();
            }
            ((org.telegram.ui.ActionBar.g4) arrayList.get(z12 ? 1 : 0)).g = strArr[i11];
            if (w6Var != null) {
                SparseIntArray clone = S0.clone();
                w6Var.c(S0, clone);
                hg.b bVar = h4Var2.c;
                if (bVar != null && !TextUtils.isEmpty(bVar.b) && (x6Var = w6Var.b) != null && x6Var.b == null && !x6Var.q()) {
                    org.telegram.ui.ActionBar.w6.g(clone);
                }
                S0 = clone;
            }
            SparseIntArray sparseIntArray = org.telegram.ui.ActionBar.y6.rl;
            for (int i18 = i11; i18 < sparseIntArray.size(); i18++) {
                int keyAt = sparseIntArray.keyAt(i18);
                int valueAt = sparseIntArray.valueAt(i18);
                if (S0.indexOfKey(keyAt) < 0 && (indexOfKey = S0.indexOfKey(valueAt)) >= 0) {
                    S0.put(keyAt, S0.valueAt(indexOfKey));
                }
            }
            int[] iArr = org.telegram.ui.ActionBar.y6.ql;
            for (int i19 = i11; i19 < iArr.length; i19++) {
                if (S0.indexOfKey(i19) < 0) {
                    S0.put(i19, iArr[i19]);
                }
            }
            this.d = S0;
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.g))) {
            Drawable drawable2 = this.h;
            i13 = ((org.telegram.ui.ActionBar.r2) this.F).currentAccount;
            this.h = fi.o6.f(drawable2, i13, this.g, this.q);
        } else if (wallPaper != null) {
            this.h = xn.d(this.h, wallPaper, this.q);
        } else {
            if (h4Var2.a) {
                org.telegram.ui.ActionBar.x6 d = org.telegram.ui.ActionBar.h4.d(this.q);
                i12 = ((org.telegram.ui.ActionBar.r2) this.F).currentAccount;
                org.telegram.ui.ActionBar.y6.H(d, h4Var2.g(i12, this.q ? 1 : 0), ((org.telegram.ui.ActionBar.g4) h4Var2.f.get(this.q ? 1 : 0)).g, i14, i11);
                drawable = new ColorDrawable(-16777216);
            } else {
                int g7 = g(org.telegram.ui.ActionBar.y6.Nd);
                int g10 = g(org.telegram.ui.ActionBar.y6.Od);
                int g11 = g(org.telegram.ui.ActionBar.y6.Pd);
                int g12 = g(org.telegram.ui.ActionBar.y6.Qd);
                org.telegram.ui.Components.uc0 uc0Var2 = new org.telegram.ui.Components.uc0();
                uc0Var2.s(uc0Var2.u, h4Var2.j(this.q ? 1 : 0).settings.intensity);
                TLRPC.Document e = h4Var2.e();
                if (uc0Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    uc0Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = uc0Var2.c;
                    if (weakReference != null) {
                        uc0Var2.y.setParentView((View) weakReference.get());
                    }
                    if (uc0Var2.T) {
                        uc0Var2.y.onAttachedToWindow();
                    }
                }
                uc0Var2.y.setImage(ImageLocation.getForDocument(e), "80_80", null, null, null, 0);
                uc0Var2.y.setAutoRepeatCount(1);
                uc0Var2.y.setAutoRepeat(1);
                uc0Var2.o(g7, g10, g11, g12, 0, true);
                uc0Var2.u(i14);
                int f7 = uc0Var2.f();
                boolean z13 = this.q;
                m4.s0 s0Var = new m4.s0(21, this, uc0Var2);
                org.telegram.ui.ActionBar.g4 g4Var2 = (org.telegram.ui.ActionBar.g4) h4Var2.f.get(z13 ? 1 : 0);
                if (g4Var2 == null || g4Var2.c == null) {
                    z11 = z13 ? 1 : 0;
                } else {
                    long h = h4Var2.h(z13 ? 1 : 0);
                    TL_stars.StarGift starGift = g4Var2.c.gift;
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
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new di.d1(s0Var, h, 3));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                }
                h4Var2 = h4Var;
                h4Var2.n(this.q ? 1 : 0, new org.telegram.messenger.o2(this, h4Var2, z11, uc0Var2, f7));
                drawable = uc0Var2;
            }
            this.h = drawable;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z10) {
            this.r = new AnimatorSet();
            if (uc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new on(uc0Var, 0));
                ofFloat.addListener(new qn(uc0Var));
                ofFloat.setDuration(200L);
                this.r.playTogether(ofFloat);
            }
            Drawable drawable3 = this.h;
            if (drawable3 instanceof org.telegram.ui.Components.uc0) {
                org.telegram.ui.Components.uc0 uc0Var3 = (org.telegram.ui.Components.uc0) drawable3;
                uc0Var3.r(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new on(uc0Var3, 1));
                ofFloat2.addListener(new rn(uc0Var3));
                ofFloat2.setDuration(250L);
                this.r.playTogether(ofFloat2);
            }
            this.r.start();
        }
        if (h4Var2 != null || this.F.f6 < 0) {
            c10 = 0;
        } else {
            if (org.telegram.ui.ActionBar.y6.I.q() == this.q) {
                P0 = org.telegram.ui.ActionBar.y6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string3) != null && !org.telegram.ui.ActionBar.y6.P0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.y6.P0(string4) != null && org.telegram.ui.ActionBar.y6.P0(string4).q()) {
                    str = string4;
                }
                P0 = this.q ? org.telegram.ui.ActionBar.y6.P0(str) : org.telegram.ui.ActionBar.y6.P0(str2);
            }
            c10 = 0;
            org.telegram.ui.ActionBar.y6.t(P0, false, this.q);
        }
        int i23 = AndroidUtilities.calcDrawableColor(this.h)[c10];
        m();
        n();
        o(this.h);
        s(1.0f);
    }

    public final void s(float f7) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint d = d("paintChatActionBackground");
        Paint d10 = d("paintChatActionBackgroundSelected");
        Paint d11 = d("paintChatMessageBackgroundSelected");
        int i10 = this.A;
        int j10 = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.ic, true);
        int j11 = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.jc, true);
        int j12 = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.jc, true);
        int j13 = this.B ? -1 : j(org.telegram.ui.ActionBar.y6.kc, true);
        if (f7 != 1.0f) {
            i10 = i0.a.f(f7, this.y, i10);
            j10 = i0.a.f(f7, this.u, j10);
            j11 = i0.a.f(f7, this.v, j11);
            j12 = i0.a.f(f7, this.w, j12);
            j13 = i0.a.f(f7, this.x, j13);
        }
        if (d != null && !this.B) {
            d.setColor(i10);
            d10.setColor(i10);
        }
        Paint d12 = d("paintChatActionText");
        if (d12 != null) {
            ((TextPaint) d12).linkColor = j11;
            d("paintChatActionText").setColor(j10);
            d("paintChatBotButton").setColor(j12);
        }
        org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.y6.z1(j10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.y6.z1(j13, getDrawable("drawableShareIcon"));
        if (this.m == null || (bitmap = this.k) == null) {
            return;
        }
        Rect rect = this.E;
        Rect rect2 = this.D;
        if (f7 == 1.0f || (bitmap2 = this.z) == null) {
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
        rect2.set(0, 0, bitmap2.getWidth(), this.z.getHeight());
        rect.set(0, 0, this.j.getWidth(), this.j.getHeight());
        this.m.drawBitmap(this.z, rect2, rect, (Paint) null);
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
