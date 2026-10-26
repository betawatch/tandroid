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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class xn extends Drawable {
    public final boolean a;
    public View b;
    public int c = 255;
    public final float d;
    public final di.f3 e;
    public final org.telegram.ui.Components.uc0 f;
    public final TLRPC.WallPaper g;
    public boolean h;
    public boolean i;
    public final ArrayList j;

    public xn(TLRPC.WallPaper wallPaper, boolean z10, boolean z11) {
        TLRPC.WallPaperSettings wallPaperSettings;
        String n10;
        TLRPC.WallPaperSettings wallPaperSettings2;
        di.f3 f3Var = new di.f3(this, 3);
        this.e = f3Var;
        this.j = new ArrayList();
        f3Var.setInvalidateAll(true);
        boolean z12 = wallPaper.pattern;
        this.g = wallPaper;
        this.a = z10;
        if (z10 && ((wallPaper.document != null || wallPaper.uploadingImage != null) && !z12 && (wallPaperSettings2 = wallPaper.settings) != null)) {
            this.d = wallPaperSettings2.intensity / 100.0f;
        }
        if ((z12 || wallPaper.document == null) && (wallPaperSettings = wallPaper.settings) != null && wallPaperSettings.second_background_color != 0 && wallPaperSettings.third_background_color != 0) {
            org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0();
            this.f = uc0Var;
            TLRPC.WallPaperSettings wallPaperSettings3 = wallPaper.settings;
            uc0Var.n(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            int i10 = UserConfig.selectedAccount;
            long j10 = wallPaper.id;
            li.s2 s2Var = new li.s2(22, this, wallPaper);
            int[] iArr = org.telegram.ui.ActionBar.h4.h;
            boolean z13 = wallPaper.pattern;
            ChatThemeController.getInstance(i10).loadWallpaperBitmap(j10, z13 ? 1 : 0, new org.telegram.ui.ActionBar.f4(s2Var, wallPaper, z13 ? 1 : 0, i10, j10));
            return;
        }
        Point point = AndroidUtilities.displaySize;
        int min = Math.min(point.x, point.y);
        Point point2 = AndroidUtilities.displaySize;
        int max = Math.max(point2.x, point2.y);
        if (z11) {
            n10 = "150_150_wallpaper";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((int) (min / AndroidUtilities.density));
            sb2.append("_");
            n10 = a1.g.n((int) (max / AndroidUtilities.density), "_wallpaper", sb2);
        }
        StringBuilder u10 = a1.g.u(n10);
        u10.append(wallPaper.id);
        StringBuilder u11 = a1.g.u(u10.toString());
        u11.append(e(wallPaper.settings));
        String sb3 = u11.toString();
        Drawable b10 = b(wallPaper);
        String str = wallPaper.uploadingImage;
        if (str != null) {
            f3Var.setImage(ImageLocation.getForPath(str), sb3, b10, null, wallPaper, 1);
            return;
        }
        TLRPC.Document document = wallPaper.document;
        if (document != null) {
            f3Var.setImage(ImageLocation.getForDocument(document), sb3, b10, null, wallPaper, 1);
        } else {
            f3Var.setImageBitmap(b10);
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
                    a2 = new BitmapDrawable(ImageLoader.getStrippedPhotoBitmap(wallPaper.document.thumbs.get(r2).bytes, "b"));
                }
                r2++;
            }
        } else {
            TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
            if (wallPaperSettings == null || wallPaperSettings.intensity < 0) {
                a2 = a(new ColorDrawable(-16777216));
            } else if (wallPaperSettings.second_background_color == 0) {
                a2 = a(new ColorDrawable(i0.a.o(wallPaper.settings.background_color, 255)));
            } else if (wallPaperSettings.third_background_color == 0) {
                a2 = a(new GradientDrawable(org.telegram.ui.Components.x9.d(wallPaper.settings.rotation), new int[]{i0.a.o(wallPaperSettings.background_color, 255), i0.a.o(wallPaper.settings.second_background_color, 255)}));
            } else {
                int o10 = i0.a.o(wallPaperSettings.background_color, 255);
                int o11 = i0.a.o(wallPaper.settings.second_background_color, 255);
                int o12 = i0.a.o(wallPaper.settings.third_background_color, 255);
                int i10 = wallPaper.settings.fourth_background_color;
                r2 = i10 != 0 ? i0.a.o(i10, 255) : 0;
                org.telegram.ui.Components.uc0 uc0Var = new org.telegram.ui.Components.uc0();
                uc0Var.n(o10, o11, o12, r2);
                a2 = new BitmapDrawable(uc0Var.k);
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
        org.telegram.ui.Components.uc0 uc0Var = this.f;
        if (uc0Var != null) {
            return uc0Var;
        }
        di.f3 f3Var = this.e;
        return (!z10 || f3Var.getStaticThumb() == null) ? f3Var.getThumb() != null ? f3Var.getThumb() : f3Var.getDrawable() != null ? f3Var.getDrawable() : f3Var.getStaticThumb() : f3Var.getStaticThumb();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        org.telegram.ui.Components.uc0 uc0Var = this.f;
        if (uc0Var != null) {
            uc0Var.setBounds(getBounds());
            uc0Var.setAlpha(this.c);
            uc0Var.draw(canvas);
            return;
        }
        di.f3 f3Var = this.e;
        boolean hasImageLoaded = f3Var.hasImageLoaded();
        float f7 = this.d;
        boolean z10 = true;
        if (hasImageLoaded && f3Var.getCurrentAlpha() == 1.0f) {
            if (!this.h) {
                this.h = true;
                f3Var.setColorFilter(new PorterDuffColorFilter(i0.a.o(-16777216, (int) (f7 * 255.0f)), PorterDuff.Mode.DARKEN));
            }
            z10 = false;
        }
        f3Var.setImageCoords(getBounds());
        f3Var.setAlpha(this.c / 255.0f);
        f3Var.draw(canvas);
        if (!z10 || f7 == 0.0f) {
            return;
        }
        canvas.drawColor(i0.a.o(-16777216, (int) (f7 * 255.0f)));
    }

    public final void f(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
        int size = arrayList.size();
        di.f3 f3Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            f3Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            f3Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.uc0 uc0Var = this.f;
        if (uc0Var != null) {
            uc0Var.k();
        }
    }

    public final void g(View view) {
        ArrayList arrayList = this.j;
        if (!arrayList.contains(view)) {
            arrayList.remove(view);
        }
        int size = arrayList.size();
        di.f3 f3Var = this.e;
        if (size > 0 && !this.i) {
            this.i = true;
            f3Var.onAttachedToWindow();
        } else if (arrayList.size() <= 0 && this.i) {
            this.i = false;
            f3Var.onDetachedFromWindow();
        }
        org.telegram.ui.Components.uc0 uc0Var = this.f;
        if (uc0Var != null) {
            uc0Var.l();
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
