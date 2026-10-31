package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class xn extends Drawable {
    public final boolean a;
    public View b;
    public int c = org.telegram.messenger.zs.e4;
    public final float d;
    public final ag.c2 e;
    public final org.telegram.ui.Components.jb0 f;
    public final TLRPC.WallPaper g;
    public boolean h;
    public boolean i;
    public final ArrayList j;

    public xn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String p5;
        TLRPC.WallPaperSettings wallPaperSettings2;
        ag.c2 c2Var = new ag.c2(this, 2);
        this.e = c2Var;
        this.j = new ArrayList();
        c2Var.J0 = true;
        boolean z12 = wallPaper.pattern;
        this.g = wallPaper;
        this.a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0();
            this.f = jb0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            jb0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            org.telegram.ui.ActionBar.y3.o(org.telegram.messenger.d20.s0, wallPaper.id, wallPaper, new ag.e0(28, this, wallPaper));
            return;
        }
        Point point = org.telegram.messenger.i0.q;
        int min = Math.min(point.x, point.y);
        int max = Math.max(point.x, point.y);
        if (z11) {
            p5 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / org.telegram.messenger.i0.p));
            sb2.append("_");
            p5 = a1.g.p(sb2, (int) (max / org.telegram.messenger.i0.p), "_wallpaper");
        }
        StringBuilder t10 = a1.g.t(p5);
        t10.append(wallPaper.id);
        StringBuilder t11 = a1.g.t(t10.toString());
        t11.append(e(wallPaper.settings));
        String sb3 = t11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            c2Var.q0(org.telegram.messenger.ic.g(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            c2Var.q0(org.telegram.messenger.ic.b(document), sb3, b10, null, wallPaper, 1);
        } else {
            c2Var.w0(b10);
        }
    }

    public static BitmapDrawable a(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, 20, 20);
        drawable.draw(canvas);
        return new BitmapDrawable(createBitmap);
    }

    public static Drawable b(TLRPC.WallPaper wallPaper) {
        BitmapDrawable a2;
        Drawable drawable = wallPaper.thumbDrawable;
        if (drawable != null) {
            return drawable;
        }
        if (wallPaper.stripedThumb != null) {
            return new BitmapDrawable(wallPaper.stripedThumb);
        }
        if (wallPaper.pattern && wallPaper.settings == null) {
            return new ColorDrawable(-16777216);
        }
        if (wallPaper.document != null) {
            a2 = null;
            while (r2 < wallPaper.document.thumbs.size()) {
                if (wallPaper.document.thumbs.get(r2) instanceof TLRPC.TL_photoStrippedSize) {
                    a2 = new BitmapDrawable(org.telegram.messenger.hc.F("b", wallPaper.document.thumbs.get(r2).bytes));
                }
                r2++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                a2 = a(new ColorDrawable(-16777216));
            } else if (wallPaperSettings.second_background_color == 0) {
                a2 = a(new ColorDrawable(i0.b.o(wallPaper.settings.background_color, org.telegram.messenger.zs.e4)));
            } else if (wallPaperSettings.third_background_color == 0) {
                a2 = a(new GradientDrawable(org.telegram.ui.Components.f9.d(wallPaper.settings.rotation), new int[]{i0.b.o(wallPaperSettings.background_color, org.telegram.messenger.zs.e4), i0.b.o(wallPaper.settings.second_background_color, org.telegram.messenger.zs.e4)}));
            } else {
                int o10 = i0.b.o(wallPaperSettings.background_color, org.telegram.messenger.zs.e4);
                int o11 = i0.b.o(wallPaper.settings.second_background_color, org.telegram.messenger.zs.e4);
                int o12 = i0.b.o(wallPaper.settings.third_background_color, org.telegram.messenger.zs.e4);
                int i10 = wallPaper.settings.fourth_background_color;
                r2 = i10 != 0 ? i0.b.o(i10, org.telegram.messenger.zs.e4) : 0;
                org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0();
                jb0Var.n(o10, o11, o12, r2);
                a2 = new BitmapDrawable(jb0Var.k);
            }
        }
        wallPaper.thumbDrawable = a2;
        return a2;
    }

    public static xn d(Drawable drawable, TLRPC.WallPaper wallPaper, boolean z10) {
        TLRPC.WallPaperSettings wallPaperSettings;
        TLRPC.WallPaperSettings wallPaperSettings2;
        if (drawable instanceof xn) {
            xn xnVar = (xn) drawable;
            boolean z11 = xnVar.a;
            TLRPC.WallPaper wallPaper2 = xnVar.g;
            String str = wallPaper.uploadingImage;
            if (str == null ? !(wallPaper.id != wallPaper2.id || !TextUtils.equals(e(wallPaper.settings), e(wallPaper2.settings)) || (wallPaper.document != null && !wallPaper.pattern && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.intensity > 0 && z11 != z10)) : !(!str.equals(wallPaper2.uploadingImage) || ((wallPaperSettings2 = wallPaper.settings) != null && wallPaper2.settings != null && wallPaperSettings2.intensity > 0 && z11 != z10))) {
                return xnVar;
            }
        }
        return new xn(wallPaper, z10, false);
    }

    public static String e(TLRPC.WallPaperSettings wallPaperSettings) {
        return wallPaperSettings == null ? "" : String.valueOf(Objects.hash(Boolean.valueOf(wallPaperSettings.blur), Boolean.valueOf(wallPaperSettings.motion), Integer.valueOf(wallPaperSettings.intensity), Integer.valueOf(wallPaperSettings.background_color), Integer.valueOf(wallPaperSettings.second_background_color), Integer.valueOf(wallPaperSettings.third_background_color), Integer.valueOf(wallPaperSettings.fourth_background_color)));
    }

    public final Drawable c(boolean z10) {
        Drawable drawable;
        org.telegram.ui.Components.jb0 jb0Var = this.f;
        if (jb0Var != null) {
            return jb0Var;
        }
        ag.c2 c2Var = this.e;
        if (z10 && (drawable = c2Var.m0) != null) {
            return drawable;
        }
        Drawable drawable2 = c2Var.a0;
        return drawable2 != null ? drawable2 : c2Var.t() != null ? c2Var.t() : c2Var.m0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.jb0 jb0Var = this.f;
        if (jb0Var != null) {
            jb0Var.setBounds(getBounds());
            jb0Var.setAlpha(this.c);
            jb0Var.draw(canvas);
            return;
        }
        ag.c2 c2Var = this.e;
        boolean J = c2Var.J();
        float f7 = this.d;
        boolean z10 = true;
        if (J && c2Var.h1 == 1.0f) {
            if (!this.h) {
                this.h = true;
                c2Var.o1 = new PorterDuffColorFilter(i0.b.o(-16777216, (int) (f7 * 255.0f)), PorterDuff.Mode.DARKEN);
            }
            z10 = false;
        }
        c2Var.z0(getBounds());
        c2Var.setAlpha(this.c / 255.0f);
        c2Var.h(canvas, null);
        if (!z10 || f7 == 0.0f) {
            return;
        }
        canvas.drawColor(i0.b.o(-16777216, (int) (f7 * 255.0f)));
    }

    public final void f(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        ag.c2 c2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            c2Var.P();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            c2Var.R();
        }
        org.telegram.ui.Components.jb0 jb0Var = this.f;
        if (jb0Var != null) {
            jb0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.j;
        arrayList.remove(view);
        int size = arrayList.size();
        ag.c2 c2Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            c2Var.P();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            c2Var.R();
        }
        org.telegram.ui.Components.jb0 jb0Var = this.f;
        if (jb0Var != null) {
            jb0Var.l();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.c != i10) {
            this.c = i10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
