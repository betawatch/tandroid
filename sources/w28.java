// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class w28 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final ep g = new ep((byte) 1);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k = new RectF();
    public final Paint l = new Paint();
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public final oy8 t;
    public final oy8 u;

    public w28(Context context) {
        this.m = context.getDrawable(R.drawable.media_share);
        this.o = context.getDrawable(R.drawable.media_like);
        this.n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(R.drawable.media_more);
        this.r = context.getDrawable(R.drawable.menu_stream_pip);
        this.s = context.getDrawable(R.drawable.msg_delete);
        this.u = new oy8(R.raw.media_mute_unmute, gl.L(28.0f), gl.L(28.0f), true, null);
        oy8 oy8Var = new oy8(R.raw.media_mute_unmute, gl.L(28.0f), gl.L(28.0f), true, null);
        this.t = oy8Var;
        oy8Var.I(20, false, true);
        oy8Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int o = bm2.o(-16777216, kk7.m1);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(o);
        this.f = new ColorDrawable(bm2.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z, boolean z2) {
        oy8 oy8Var = this.u;
        if (!z2) {
            oy8Var.I(z ? 20 : 0, false, false);
            oy8Var.K(z ? 20 : 0);
            return;
        }
        if (z) {
            if (oy8Var.b0 > 20) {
                oy8Var.I(0, false, false);
            }
            oy8Var.K(20);
            oy8Var.start();
            return;
        }
        int i = oy8Var.b0;
        if (i == 0 || i >= 43) {
            return;
        }
        oy8Var.K(43);
        oy8Var.start();
    }
}
