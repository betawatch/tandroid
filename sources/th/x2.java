package th;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ci0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x2 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final j2.f g = new j2.f(5);
    public final RectF h = new RectF();
    public final RectF i = new RectF();
    public final RectF j = new RectF();
    public final RectF k;
    public final Paint l;
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public final ci0 t;
    public final ci0 u;

    public x2(Context context) {
        new RectF();
        this.k = new RectF();
        this.l = new Paint();
        this.m = context.getDrawable(R.drawable.media_share);
        this.o = context.getDrawable(R.drawable.media_like);
        this.n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(R.drawable.media_more);
        this.r = context.getDrawable(R.drawable.menu_stream_pip);
        this.s = context.getDrawable(R.drawable.msg_delete);
        this.u = new ci0(R.raw.media_mute_unmute, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        ci0 ci0Var = new ci0(R.raw.media_mute_unmute, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
        this.t = ci0Var;
        ci0Var.N(20, false, true);
        ci0Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int o10 = i0.b.o(-16777216, at.n1);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(o10);
        this.f = new ColorDrawable(i0.b.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ci0 ci0Var = this.u;
        if (!z11) {
            ci0Var.N(z10 ? 20 : 0, false, false);
            ci0Var.P(z10 ? 20 : 0);
            return;
        }
        if (z10) {
            if (ci0Var.a0 > 20) {
                ci0Var.N(0, false, false);
            }
            ci0Var.P(20);
            ci0Var.start();
            return;
        }
        int i10 = ci0Var.a0;
        if (i10 == 0 || i10 >= 43) {
            return;
        }
        ci0Var.P(43);
        ci0Var.start();
    }
}
