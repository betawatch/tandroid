package sg;

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
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d1 {
    public static d1 j;
    public final c1 a;
    public final Paint b;
    public Paint c;
    public final Drawable d;
    public final Drawable e;
    public b1 f;
    public b1 g;
    public final b1 h;
    public int i;

    public d1() {
        c1 c1Var = new c1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.a = c1Var;
        c1 c1Var2 = new c1(j6.fk, j6.gk, -1, -1, null);
        this.b = c1Var.f;
        this.e = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        this.f = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), c1Var);
        this.h = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_settings_premium), c1Var2);
        this.g = c(ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_normal), c1Var);
        this.d = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
        c1Var.a();
        b();
    }

    public static b1 c(Drawable drawable, c1 c1Var) {
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int minimumHeight = drawable.getMinimumHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, minimumHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, minimumHeight);
        drawable.draw(canvas);
        c1Var.f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        c1Var.d(0, -intrinsicWidth, 0, intrinsicWidth, 0.0f, minimumHeight);
        canvas.drawRect(0.0f, 0.0f, intrinsicWidth, minimumHeight, c1Var.f);
        c1Var.f.setXfermode(null);
        int[] iArr = c1Var.l;
        b1 b1Var = new b1(ApplicationLoader.applicationContext.getResources(), createBitmap);
        b1Var.b = drawable;
        int[] iArr2 = new int[iArr.length];
        b1Var.a = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return b1Var;
    }

    public static d1 d() {
        if (j == null) {
            j = new d1();
        }
        return j;
    }

    public final b1 a(b1 b1Var) {
        c1 c1Var = this.a;
        int[] iArr = c1Var.l;
        int i10 = iArr[0];
        int[] iArr2 = b1Var.a;
        return (i10 == iArr2[0] && iArr[1] == iArr2[1] && iArr[2] == iArr2[2] && iArr[3] == iArr2[3]) ? b1Var : c(b1Var.b, c1Var);
    }

    public final void b() {
        int i10 = j6.z9;
        if (j6.w0(null, i10, false) != this.i) {
            this.i = j6.w0(null, i10, false);
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
        this.c.setColor(j6.w0(null, j6.Oh, false));
        return this.c;
    }

    public final void f(float f7, float f10, int i10, int i11) {
        this.a.d(0, f7, 0, i10, f10, i11);
    }
}
