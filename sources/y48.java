// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class y48 {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Drawable d;
    public final Drawable e;
    public final ColorDrawable f;
    public final eq g = new eq((byte) 1);
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
    public final p09 t;
    public final p09 u;

    public y48(Context context) {
        this.m = context.getDrawable(R.drawable.media_share);
        this.o = context.getDrawable(R.drawable.media_like);
        this.n = context.getDrawable(R.drawable.media_repost);
        Drawable drawable = context.getDrawable(R.drawable.media_like_active);
        this.p = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(-53704, PorterDuff.Mode.MULTIPLY));
        this.q = context.getDrawable(R.drawable.media_more);
        this.r = context.getDrawable(R.drawable.menu_stream_pip);
        this.s = context.getDrawable(R.drawable.msg_delete);
        this.u = new p09(R.raw.media_mute_unmute, gm.L(28.0f), gm.L(28.0f), true, null);
        p09 p09Var = new p09(R.raw.media_mute_unmute, gm.L(28.0f), gm.L(28.0f), true, null);
        this.t = p09Var;
        p09Var.I(20, false, true);
        p09Var.stop();
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.b = paint2;
        paint2.setColor(-1);
        int p = on2.p(-16777216, nm7.m1);
        this.d = context.getDrawable(R.drawable.shadow_story_top);
        this.e = context.getDrawable(R.drawable.shadow_story_bottom);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(p);
        this.f = new ColorDrawable(on2.f(0.1f, -16777216, -1));
    }

    public final void a(boolean z, boolean z2) {
        p09 p09Var = this.u;
        if (!z2) {
            p09Var.I(z ? 20 : 0, false, false);
            p09Var.K(z ? 20 : 0);
            return;
        }
        if (z) {
            if (p09Var.b0 > 20) {
                p09Var.I(0, false, false);
            }
            p09Var.K(20);
            p09Var.start();
            return;
        }
        int i = p09Var.b0;
        if (i == 0 || i >= 43) {
            return;
        }
        p09Var.K(43);
        p09Var.start();
    }
}
