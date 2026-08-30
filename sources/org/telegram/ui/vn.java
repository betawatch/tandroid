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
import android.util.SparseIntArray;
import android.view.View;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vn implements org.telegram.ui.ActionBar.f6, org.telegram.ui.Components.sb0 {
    public BitmapShader B;
    public boolean C;
    public AnimatorSet E;
    public org.telegram.ui.ActionBar.g5 F;
    public org.telegram.ui.ActionBar.g5 G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public Bitmap M;
    public int N;
    public boolean O;
    public boolean P;
    public final /* synthetic */ xn S;
    public SparseIntArray e;
    public org.telegram.ui.ActionBar.e4 f;
    public TLRPC.WallPaper h;
    public Drawable n;
    public ValueAnimator r;
    public Bitmap s;
    public Bitmap v;
    public Canvas x;
    public BitmapShader y;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final Matrix c = new Matrix();
    public SparseIntArray d = new SparseIntArray();
    public final Paint w = new Paint();
    public final Rect Q = new Rect();
    public final Rect R = new Rect();
    public boolean D = org.telegram.ui.ActionBar.j6.I.q();

    public vn(xn xnVar) {
        int i10;
        int i11;
        this.S = xnVar;
        if (h(false)) {
            i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            this.f = ChatThemeController.getInstance(i10).getDialogTheme(xnVar.Q5);
            i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
            TLRPC.WallPaper dialogWallpaper = ChatThemeController.getInstance(i11).getDialogWallpaper(xnVar.Q5);
            this.h = dialogWallpaper;
            org.telegram.ui.ActionBar.e4 e4Var = this.f;
            if (e4Var != null || dialogWallpaper != null) {
                j(e4Var, dialogWallpaper, false);
                AndroidUtilities.runOnUIThread(new cg.n0(23));
            }
        }
        if (ThemeEditorView.n == null) {
            org.telegram.ui.ActionBar.j6.n1(true, true);
            return;
        }
        AndroidUtilities.runOnUIThread(new cg.n0(23));
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Paint G(String str) {
        if (this.f == null && this.n == null) {
            return null;
        }
        return (Paint) this.b.get(str);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void K0(int i10, int i11) {
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null) {
            sparseIntArray.put(i10, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    public final int b(int i10, boolean z4) {
        int indexOfKey;
        SparseIntArray sparseIntArray;
        int indexOfKey2;
        if (this.f == null && this.n == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        if (!z4 && (sparseIntArray = this.e) != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        SparseIntArray sparseIntArray2 = this.d;
        return (sparseIntArray2 == null || (indexOfKey = sparseIntArray2.indexOfKey(i10)) < 0) ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : this.d.valueAt(indexOfKey);
    }

    public final org.telegram.ui.ActionBar.e4 c() {
        return this.f;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int c0(int i10) {
        return x0(i10);
    }

    public final Drawable d() {
        Drawable drawable = this.n;
        return drawable != null ? drawable : org.telegram.ui.ActionBar.j6.s0();
    }

    public final void e() {
        Drawable g5Var;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.jl.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
            switch (str) {
                case "drawableMsgIn":
                    g5Var = new org.telegram.ui.ActionBar.g5(0, false, false, this);
                    break;
                case "drawableMsgInMedia":
                    g5Var = new org.telegram.ui.ActionBar.g5(1, false, false, this);
                    break;
                case "drawableMsgInMediaSelected":
                    g5Var = new org.telegram.ui.ActionBar.g5(1, false, true, this);
                    break;
                case "drawableMsgOutMedia":
                    g5Var = new org.telegram.ui.ActionBar.g5(1, true, false, this);
                    break;
                case "drawableMsgOutSelected":
                    g5Var = new org.telegram.ui.ActionBar.g5(0, true, true, this);
                    break;
                case "drawableMsgOutMediaSelected":
                    g5Var = new org.telegram.ui.ActionBar.g5(1, true, true, this);
                    break;
                case "drawableMsgInSelected":
                    g5Var = new org.telegram.ui.ActionBar.g5(0, false, true, this);
                    break;
                case "drawableMsgOut":
                    g5Var = new org.telegram.ui.ActionBar.g5(0, true, false, this);
                    break;
                default:
                    Drawable.ConstantState constantState = ((Drawable) entry.getValue()).getConstantState();
                    g5Var = constantState != null ? constantState.newDrawable().mutate() : null;
                    if (g5Var != null) {
                        int intValue = ((Integer) org.telegram.ui.ActionBar.j6.kl.get((String) entry.getKey())).intValue();
                        if (intValue >= 0) {
                            org.telegram.ui.ActionBar.j6.w1(x0(intValue), g5Var);
                            break;
                        }
                    }
                    break;
            }
            if (g5Var != null) {
                this.a.put((String) entry.getKey(), g5Var);
            }
        }
    }

    public final void f() {
        Paint paint;
        for (Map.Entry entry : org.telegram.ui.ActionBar.j6.ll.entrySet()) {
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
            int intValue = ((Integer) org.telegram.ui.ActionBar.j6.ml.get((String) entry.getKey())).intValue();
            if (intValue >= 0 && !"paintChatActionBackgroundDarken".equals(entry.getKey())) {
                paint.setColor(x0(intValue));
            }
            this.b.put((String) entry.getKey(), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Drawable drawable) {
        float f10;
        boolean z4;
        float f11;
        Paint G;
        Paint G2;
        int i10;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        Drawable drawable2 = drawable;
        if (this.S.Z9 != null) {
            return;
        }
        int i11 = AndroidUtilities.calcDrawableColor(drawable2)[0];
        int b10 = b(org.telegram.ui.ActionBar.j6.lc, false);
        int i12 = org.telegram.ui.ActionBar.j6.Hc;
        int b11 = b(i12, false);
        if (b10 != 0 && this.h == null) {
            i11 = b10;
        }
        this.N = i11;
        if (drawable2 instanceof ao) {
            ao aoVar = (ao) drawable2;
            f10 = aoVar.f == null ? aoVar.d : 0.0f;
            drawable2 = aoVar.c(false);
        } else {
            f10 = 0.0f;
        }
        boolean z10 = drawable2 instanceof org.telegram.ui.Components.dc0;
        boolean z11 = (z10 || (drawable2 instanceof BitmapDrawable)) && SharedConfig.getDevicePerformanceClass() != 0;
        this.O = z11;
        org.telegram.ui.ActionBar.e4 e4Var = this.f;
        if (e4Var != null) {
            TLRPC.ChatTheme chatTheme = e4Var.d;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    if (tL_starGiftUnique != null && this.D) {
                        z4 = true;
                        this.P = z11;
                        if (z11) {
                            boolean z12 = drawable2 instanceof BitmapDrawable;
                            f11 = 0.0f;
                            Rect rect = this.R;
                            Rect rect2 = this.Q;
                            if (z12) {
                                Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                                int i13 = 40;
                                if (bitmap.getWidth() > bitmap.getHeight()) {
                                    i10 = (int) ((40 / bitmap.getWidth()) * bitmap.getHeight());
                                } else {
                                    i13 = (int) ((40 / bitmap.getHeight()) * bitmap.getWidth());
                                    i10 = 40;
                                }
                                this.s = Bitmap.createBitmap(i13, i10, Bitmap.Config.ARGB_8888);
                                this.x = new Canvas(this.s);
                                rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
                                this.x.drawBitmap(bitmap, rect2, rect, (Paint) null);
                                Utilities.blurBitmap(this.s, 3);
                                this.x.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
                                Bitmap bitmap2 = this.s;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                this.y = new BitmapShader(bitmap2, tileMode, tileMode);
                                this.v = Bitmap.createBitmap(this.s);
                                this.B = new BitmapShader(this.v, tileMode, tileMode);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.y.setFilterMode(2);
                                    this.B.setFilterMode(2);
                                }
                                this.C = true;
                            } else {
                                this.s = Bitmap.createBitmap(60, 80, Bitmap.Config.ARGB_8888);
                                Bitmap bitmap3 = ((org.telegram.ui.Components.dc0) drawable2).k;
                                this.v = bitmap3;
                                if (z4) {
                                    this.v = Bitmap.createBitmap(bitmap3);
                                    new Canvas(this.v).drawColor(-870178270);
                                }
                                this.x = new Canvas(this.s);
                                rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
                                rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
                                this.x.drawBitmap(this.v, rect2, rect, (Paint) null);
                                this.x.drawColor(i0.a.k(-16777216, (int) (f10 * 255.0f)));
                                if (z4) {
                                    this.x.drawColor(-870178270);
                                }
                                Bitmap bitmap4 = this.s;
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                this.y = new BitmapShader(bitmap4, tileMode2, tileMode2);
                                this.B = new BitmapShader(this.v, tileMode2, tileMode2);
                                if (Build.VERSION.SDK_INT >= 33) {
                                    this.y.setFilterMode(2);
                                    this.B.setFilterMode(2);
                                }
                                this.C = true;
                            }
                        } else {
                            f11 = 0.0f;
                            this.s = null;
                            this.y = null;
                            this.v = null;
                            this.x = null;
                            this.C = false;
                        }
                        G = G("paintChatActionBackground");
                        Paint G3 = G("paintChatActionBackgroundSelected");
                        G2 = G("paintChatMessageBackgroundSelected");
                        HashMap hashMap = this.b;
                        if (G != null) {
                            Paint paint = (Paint) hashMap.get("paintChatActionBackgroundDarken");
                            if (paint == null) {
                                paint = new Paint(1);
                                hashMap.put("paintChatActionBackgroundDarken", paint);
                                paint.setColor(0);
                            }
                            if (this.O) {
                                ColorMatrix colorMatrix = new ColorMatrix();
                                if (z10) {
                                    if (((org.telegram.ui.Components.dc0) drawable2).q >= f11) {
                                        colorMatrix.setSaturation(1.6f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.D ? 0.97f : 0.92f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.D ? 0.12f : -0.06f);
                                    } else {
                                        colorMatrix.setSaturation(1.1f);
                                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.D ? 0.4f : 0.8f);
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.D ? 0.08f : -0.06f);
                                    }
                                } else {
                                    colorMatrix.setSaturation(1.6f);
                                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, this.D ? 0.9f : 0.84f);
                                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, this.D ? 0.04f : 0.06f);
                                }
                                G.setAlpha(255);
                                G.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                                G.setShader(this.B);
                                G.setFilterBitmap(true);
                                G3.setAlpha(255);
                                ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.26f);
                                AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix2, 0.92f);
                                G3.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                                G3.setShader(this.B);
                                G3.setFilterBitmap(true);
                                paint.setAlpha(0);
                            } else {
                                G.setColorFilter(null);
                                G.setShader(null);
                                G3.setColorFilter(null);
                                G3.setShader(null);
                                paint.setAlpha(21);
                            }
                        }
                        if (G2 == null) {
                            G2 = new Paint(1);
                            hashMap.put("paintChatMessageBackgroundSelected", G2);
                        }
                        if (!this.P) {
                            if (b11 == 0) {
                                b11 = x0(i12);
                            }
                            G2.setColor(b11);
                            G2.setColorFilter(null);
                            G2.setShader(null);
                            return;
                        }
                        ColorMatrix colorMatrix3 = new ColorMatrix();
                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 2.5f);
                        AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix3, 0.75f);
                        G2.setAlpha(64);
                        G2.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                        G2.setShader(this.B);
                        G2.setFilterBitmap(true);
                        return;
                    }
                }
            }
            tL_starGiftUnique = null;
            if (tL_starGiftUnique != null) {
                z4 = true;
                this.P = z11;
                if (z11) {
                }
                G = G("paintChatActionBackground");
                Paint G32 = G("paintChatActionBackgroundSelected");
                G2 = G("paintChatMessageBackgroundSelected");
                HashMap hashMap2 = this.b;
                if (G != null) {
                }
                if (G2 == null) {
                }
                if (!this.P) {
                }
            }
        }
        z4 = false;
        this.P = z11;
        if (z11) {
        }
        G = G("paintChatActionBackground");
        Paint G322 = G("paintChatActionBackgroundSelected");
        G2 = G("paintChatMessageBackgroundSelected");
        HashMap hashMap22 = this.b;
        if (G != null) {
        }
        if (G2 == null) {
        }
        if (!this.P) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int g1(int i10) {
        return b(i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final Drawable getDrawable(String str) {
        HashMap hashMap = this.a;
        if (hashMap.isEmpty()) {
            return null;
        }
        return (Drawable) hashMap.get(str);
    }

    public final boolean h(boolean z4) {
        TLRPC.User user;
        xn xnVar = this.S;
        if (xnVar.h != null) {
            return false;
        }
        if (z4) {
            return (xnVar.e != null || (user = xnVar.f) == null || user.bot) ? false : true;
        }
        return true;
    }

    public final void i(org.telegram.ui.ActionBar.e4 e4Var, TLRPC.WallPaper wallPaper, boolean z4, Boolean bool, boolean z10) {
        org.telegram.ui.ActionBar.e5 e5Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        org.telegram.ui.ActionBar.e5 e5Var2;
        xn xnVar = this.S;
        e5Var = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
        if (e5Var == null || xnVar.Z9 != null) {
            return;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.D;
        sf.b bVar = e4Var != null ? e4Var.c : null;
        org.telegram.ui.ActionBar.e4 e4Var2 = this.f;
        sf.b bVar2 = e4Var2 != null ? e4Var2.c : null;
        TLRPC.WallPaper wallPaper2 = this.h;
        if (!z10) {
            if (!h(false)) {
                return;
            }
            if (sf.b.a(bVar2, bVar) && this.D == booleanValue && ChatThemeController.equals(wallPaper, wallPaper2)) {
                return;
            }
        }
        this.D = booleanValue;
        org.telegram.ui.ActionBar.i6 A0 = booleanValue ? org.telegram.ui.ActionBar.j6.J : org.telegram.ui.ActionBar.j6.A0();
        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(A0, A0.V, A0.q(), !z4);
        org.telegram.ui.ActionBar.e4 e4Var3 = this.f;
        if (e4Var3 == null && this.h == null) {
            Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
            this.O = s02 instanceof org.telegram.ui.Components.dc0;
            g(s02);
            this.H = this.O ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ic, false);
            this.I = this.O ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jc, false);
            this.J = this.O ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jc, false);
            this.K = this.O ? -1 : org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kc, false);
        } else {
            if (this.O) {
                Drawable drawable = this.n;
                if (drawable instanceof org.telegram.ui.Components.dc0) {
                    Bitmap bitmap = ((org.telegram.ui.Components.dc0) drawable).k;
                    this.M = bitmap;
                    if (e4Var3 != null) {
                        TLRPC.ChatTheme chatTheme = e4Var3.d;
                        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                            TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                                tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                                if (tL_starGiftUnique != null && this.D) {
                                    this.M = Bitmap.createBitmap(bitmap);
                                    new Canvas(this.M).drawColor(-870178270);
                                }
                            }
                        }
                        tL_starGiftUnique = null;
                        if (tL_starGiftUnique != null) {
                            this.M = Bitmap.createBitmap(bitmap);
                            new Canvas(this.M).drawColor(-870178270);
                        }
                    }
                }
            }
            Drawable drawable2 = this.n;
            if (drawable2 != null) {
                g(drawable2);
            }
        }
        this.L = this.N;
        this.H = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.ic, true);
        this.I = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        this.J = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        this.K = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.kc, true);
        if (e4Var != null || wallPaper != null) {
            int i10 = AndroidUtilities.calcDrawableColor(this.n)[0];
            e();
            f();
        }
        d5Var.f = false;
        if (xnVar.Q5 < 0) {
            d5Var.g = false;
        }
        d5Var.h = new cg.u0(this, e4Var, wallPaper, z4, 8);
        if (z4) {
            d5Var.k = new sn(this);
            d5Var.i = new qn(this, 0);
            d5Var.j = new qn(this, 1);
        } else {
            if (xnVar.U0 != null) {
                xnVar.ec();
            }
            d5Var.h.run();
        }
        d5Var.e = true;
        d5Var.m = this;
        d5Var.l = 250L;
        e5Var2 = ((org.telegram.ui.ActionBar.p2) xnVar).parentLayout;
        ((ActionBarLayout) e5Var2).f(d5Var, null);
    }

    public final void j(org.telegram.ui.ActionBar.e4 e4Var, TLRPC.WallPaper wallPaper, boolean z4) {
        int i10;
        boolean z10;
        Drawable drawable;
        int i11;
        char c3;
        org.telegram.ui.ActionBar.i6 N0;
        int i12;
        org.telegram.ui.ActionBar.i6 N02;
        org.telegram.ui.ActionBar.e4 e4Var2 = e4Var;
        xn xnVar = this.S;
        if (xnVar.Z9 != null) {
            return;
        }
        this.f = e4Var2;
        this.h = wallPaper;
        Drawable backgroundImage = xnVar.fragmentView != null ? xnVar.U0.getBackgroundImage() : null;
        org.telegram.ui.Components.dc0 dc0Var = backgroundImage instanceof org.telegram.ui.Components.dc0 ? (org.telegram.ui.Components.dc0) backgroundImage : null;
        int i13 = dc0Var != null ? dc0Var.i : 0;
        if ((e4Var2 == null || e4Var2.a) && wallPaper == null) {
            int indexOfKey = org.telegram.ui.ActionBar.j6.rl.indexOfKey(org.telegram.ui.ActionBar.j6.lc);
            if (indexOfKey >= 0) {
                org.telegram.ui.ActionBar.j6.rl.valueAt(indexOfKey);
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.a;
            }
        }
        String str = "Dark Blue";
        String str2 = "Blue";
        if (e4Var2 == null && wallPaper == null) {
            this.d = new SparseIntArray();
            this.b.clear();
            this.a.clear();
            Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
            if (s02 instanceof org.telegram.ui.Components.dc0) {
                ((org.telegram.ui.Components.dc0) s02).v(i13);
            }
            this.n = null;
            if (org.telegram.ui.ActionBar.j6.I.q() == this.D) {
                N02 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) != null && !org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    str2 = string;
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) != null && org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    str = string2;
                }
                N02 = this.D ? org.telegram.ui.ActionBar.j6.N0(str) : org.telegram.ui.ActionBar.j6.N0(str2);
            }
            org.telegram.ui.ActionBar.j6.t(N02, false, this.D);
            g(this.n);
            return;
        }
        if (ApplicationLoader.applicationContext != null) {
            org.telegram.ui.ActionBar.j6.J(ApplicationLoader.applicationContext, false);
        }
        if (e4Var2 == null) {
            this.d = new SparseIntArray();
        } else {
            i10 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
            this.d = e4Var2.b(i10, this.D ? 1 : 0);
        }
        if (!TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(this.h))) {
            Drawable drawable2 = this.n;
            i12 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
            this.n = ph.l5.f(drawable2, i12, this.h, this.D);
        } else if (wallPaper != null) {
            this.n = ao.d(this.n, wallPaper, this.D);
        } else {
            if (e4Var2.a) {
                org.telegram.ui.ActionBar.i6 e = org.telegram.ui.ActionBar.e4.e(this.D);
                i11 = ((org.telegram.ui.ActionBar.p2) this.S).currentAccount;
                org.telegram.ui.ActionBar.j6.H(e, e4Var2.h(i11, this.D ? 1 : 0), ((org.telegram.ui.ActionBar.d4) e4Var2.f.get(this.D ? 1 : 0)).g, i13, false);
                drawable = new ColorDrawable(-16777216);
            } else {
                int x02 = x0(org.telegram.ui.ActionBar.j6.Nd);
                int x03 = x0(org.telegram.ui.ActionBar.j6.Od);
                int x04 = x0(org.telegram.ui.ActionBar.j6.Pd);
                int x05 = x0(org.telegram.ui.ActionBar.j6.Qd);
                org.telegram.ui.Components.dc0 dc0Var2 = new org.telegram.ui.Components.dc0();
                dc0Var2.t(dc0Var2.u, e4Var2.k(this.D ? 1 : 0).settings.intensity);
                TLRPC.Document f10 = e4Var2.f();
                if (dc0Var2.y == null) {
                    ImageReceiver imageReceiver = new ImageReceiver();
                    dc0Var2.y = imageReceiver;
                    imageReceiver.setAlpha(0.5f);
                    WeakReference weakReference = dc0Var2.c;
                    if (weakReference != null) {
                        dc0Var2.y.setParentView((View) weakReference.get());
                    }
                    if (dc0Var2.T) {
                        dc0Var2.y.onAttachedToWindow();
                    }
                }
                dc0Var2.y.setImage(ImageLocation.getForDocument(f10), "80_80", null, null, null, 0);
                dc0Var2.y.setAutoRepeatCount(1);
                dc0Var2.y.setAutoRepeat(1);
                dc0Var2.o(x02, x03, x04, x05, 0, true);
                dc0Var2.v(i13);
                int f11 = dc0Var2.f();
                boolean z11 = this.D;
                mg.w wVar = new mg.w(20, this, dc0Var2);
                org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) e4Var2.f.get(z11 ? 1 : 0);
                if (d4Var == null || d4Var.c == null) {
                    z10 = z11 ? 1 : 0;
                } else {
                    long i15 = e4Var2.i(z11 ? 1 : 0);
                    TL_stars.StarGift starGift = d4Var.c.gift;
                    TLRPC.Document document = starGift.sticker;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
                    if (arrayList != null && document == null) {
                        int size = arrayList.size();
                        z10 = z11 ? 1 : 0;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size) {
                                break;
                            }
                            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i16);
                            int i17 = i16 + 1;
                            int i18 = size;
                            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                            if (starGiftAttribute2 instanceof TL_stars.starGiftAttributePattern) {
                                document = ((TL_stars.starGiftAttributePattern) starGiftAttribute2).document;
                                break;
                            } else {
                                size = i18;
                                i16 = i17;
                            }
                        }
                    } else {
                        z10 = z11 ? 1 : 0;
                    }
                    TLRPC.Document document2 = document;
                    ImageLocation forDocument = ImageLocation.getForDocument(document2);
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    imageReceiver2.setAllowLoadingOnAttachedOnly(false);
                    imageReceiver2.setImage(forDocument, "40_40_firstframe", null, ".jpg", document2, 1);
                    imageReceiver2.setDelegate(new f3.e(wVar, i15, 2));
                    ImageLoader.getInstance().loadImageForImageReceiver(imageReceiver2);
                }
                e4Var2 = e4Var;
                e4Var2.o(this.D ? 1 : 0, new org.telegram.messenger.k2(this, e4Var2, z10, dc0Var2, f11));
                drawable = dc0Var2;
            }
            this.n = drawable;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            this.E = new AnimatorSet();
            if (dc0Var != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.addUpdateListener(new rn(dc0Var, 0));
                ofFloat.addListener(new tn(dc0Var));
                ofFloat.setDuration(200L);
                this.E.playTogether(ofFloat);
            }
            Drawable drawable3 = this.n;
            if (drawable3 instanceof org.telegram.ui.Components.dc0) {
                org.telegram.ui.Components.dc0 dc0Var3 = (org.telegram.ui.Components.dc0) drawable3;
                dc0Var3.s(0.0f);
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new rn(dc0Var3, 1));
                ofFloat2.addListener(new un(dc0Var3));
                ofFloat2.setDuration(250L);
                this.E.playTogether(ofFloat2);
            }
            this.E.start();
        }
        if (e4Var2 != null || this.S.Q5 < 0) {
            c3 = 0;
        } else {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.D) {
                N0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences2 = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string3 = sharedPreferences2.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string3) != null && !org.telegram.ui.ActionBar.j6.N0(string3).q()) {
                    str2 = string3;
                }
                String string4 = sharedPreferences2.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string4) != null && org.telegram.ui.ActionBar.j6.N0(string4).q()) {
                    str = string4;
                }
                N0 = this.D ? org.telegram.ui.ActionBar.j6.N0(str) : org.telegram.ui.ActionBar.j6.N0(str2);
            }
            c3 = 0;
            org.telegram.ui.ActionBar.j6.t(N0, false, this.D);
        }
        int i19 = AndroidUtilities.calcDrawableColor(this.n)[c3];
        e();
        f();
        g(this.n);
        k(1.0f);
    }

    public final void k(float f10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.b.isEmpty()) {
            return;
        }
        Paint G = G("paintChatActionBackground");
        Paint G2 = G("paintChatActionBackgroundSelected");
        Paint G3 = G("paintChatMessageBackgroundSelected");
        int i10 = this.N;
        int b10 = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.ic, true);
        int b11 = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        int b12 = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.jc, true);
        int b13 = this.O ? -1 : b(org.telegram.ui.ActionBar.j6.kc, true);
        if (f10 != 1.0f) {
            i10 = i0.a.d(f10, this.L, i10);
            b10 = i0.a.d(f10, this.H, b10);
            b11 = i0.a.d(f10, this.I, b11);
            b12 = i0.a.d(f10, this.J, b12);
            b13 = i0.a.d(f10, this.K, b13);
        }
        if (G != null && !this.O) {
            G.setColor(i10);
            G2.setColor(i10);
        }
        Paint G4 = G("paintChatActionText");
        if (G4 != null) {
            ((TextPaint) G4).linkColor = b11;
            G("paintChatActionText").setColor(b10);
            G("paintChatBotButton").setColor(b12);
        }
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerCheck"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerClock"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerHalfCheck"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerPinned"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerReplies"));
        org.telegram.ui.ActionBar.j6.w1(b10, getDrawable("drawableMsgStickerViews"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableBotInline"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableBotLink"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableBotLock"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawable_botInvite"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableCommentSticker"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableGoIcon"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableReplyIcon"));
        org.telegram.ui.ActionBar.j6.w1(b13, getDrawable("drawableShareIcon"));
        if (this.x == null || (bitmap = this.v) == null) {
            return;
        }
        Rect rect = this.R;
        Rect rect2 = this.Q;
        if (f10 == 1.0f || (bitmap2 = this.M) == null) {
            this.C = true;
            rect2.set(0, 0, bitmap.getWidth(), this.v.getHeight());
            rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
            this.x.drawBitmap(this.v, rect2, rect, (Paint) null);
            if (G != null) {
                G.setShader(this.B);
                G2.setShader(this.B);
            }
            if (G3 != null) {
                G3.setShader(this.B);
                return;
            }
            return;
        }
        this.C = false;
        rect2.set(0, 0, bitmap2.getWidth(), this.M.getHeight());
        rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
        this.x.drawBitmap(this.M, rect2, rect, (Paint) null);
        Paint paint = this.w;
        paint.setAlpha((int) (f10 * 255.0f));
        rect2.set(0, 0, this.v.getWidth(), this.v.getHeight());
        rect.set(0, 0, this.s.getWidth(), this.s.getHeight());
        this.x.drawBitmap(this.v, rect2, rect, paint);
        if (G != null) {
            G.setShader(this.y);
            G2.setShader(this.y);
        }
        if (G3 != null) {
            G3.setShader(this.y);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final void l(float f10, float f11, int i10, int i11) {
        Bitmap bitmap;
        BitmapShader bitmapShader;
        if (this.n == null || (bitmap = this.s) == null || (bitmapShader = this.y) == null) {
            org.telegram.ui.ActionBar.j6.q(f10, f11, i10, i11);
            return;
        }
        boolean z4 = this.C;
        Matrix matrix = this.c;
        if (z4) {
            org.telegram.ui.ActionBar.j6.r(this.v, this.B, matrix, i10, i11, f10, f11);
        } else {
            org.telegram.ui.ActionBar.j6.r(bitmap, bitmapShader, matrix, i10, i11, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final boolean m0() {
        return this.n != null ? this.y != null : org.telegram.ui.ActionBar.j6.a1();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final ColorFilter x() {
        return org.telegram.ui.ActionBar.j6.v3;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public final int x0(int i10) {
        int indexOfKey;
        int indexOfKey2;
        SparseIntArray sparseIntArray = this.e;
        if (sparseIntArray != null && (indexOfKey2 = sparseIntArray.indexOfKey(i10)) >= 0) {
            return this.e.valueAt(indexOfKey2);
        }
        if (this.f == null) {
            return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        }
        int indexOfKey3 = this.d.indexOfKey(i10);
        if (indexOfKey3 >= 0) {
            return this.d.valueAt(indexOfKey3);
        }
        int i11 = org.telegram.ui.ActionBar.j6.ol.get(i10);
        return (i11 < 0 || (indexOfKey = this.d.indexOfKey(i11)) < 0) ? org.telegram.ui.ActionBar.j6.w0(null, i10, false) : this.d.valueAt(indexOfKey);
    }
}
