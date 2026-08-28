package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a1 {
    public static a1 j;
    public final z0 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public y0 f;
    public y0 g;
    public final y0 h;
    public int i;

    public a1() {
        z0 z0Var = new z0(f6.Lj, f6.Mj, f6.Nj, f6.Oj, null);
        this.a = z0Var;
        z0 z0Var2 = new z0(f6.fk, f6.gk, -1, -1, null);
        this.b = z0Var.f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), z0Var2);
        this.g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), z0Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        z0Var.a();
        b();
    }

    public static y0 c(Drawable drawable, z0 z0Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        z0Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        z0Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, z0Var.f);
        z0Var.f.setXfermode(null);
        int[] iArr = z0Var.l;
        y0 y0Var = new y0(ApplicationLoader.applicationContext.getResources(), createBitmap);
        y0Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        y0Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return y0Var;
    }

    public static a1 d() {
        if (j == null) {
            j = new a1();
        }
        return j;
    }

    public final y0 a(y0 y0Var) {
        z0 z0Var = this.a;
        int[] iArr = z0Var.l;
        int i9 = iArr[0];
        int[] iArr2 = y0Var.a;
        return (i9 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? y0Var : c(y0Var.b, z0Var);
    }

    public final void b() {
        int i9 = f6.z9;
        if (f6.w0(null, i9, false) != this.i) {
            this.i = f6.w0(null, i9, false);
            this.e.setColorFilter(new PorterDuffColorFilter(this.i, PorterDuff.Mode.MULTIPLY));
        }
        this.f = a(this.f);
        this.g = a(this.g);
    }

    public final Paint e() {
        if (!MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked()) {
            return this.b;
        }
        if (this.c == null) {
            this.c = new Paint(1);
        }
        this.c.setColor(f6.w0(null, f6.Oh, false));
        return this.c;
    }

    public final void f(float f10, float f11, int i9, int i10) {
        this.a.d(0, f10, 0, i9, f11, i10);
    }
}
