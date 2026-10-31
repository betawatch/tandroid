package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.g9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q2 extends FrameLayout {
    public final g9 a;
    public final v2 b;
    public final org.telegram.ui.Components.f6 c;
    public TL_stars.starGiftAttributeBackdrop d;
    public TL_stars.starGiftAttributePattern e;
    public float f;

    public q2(Context context) {
        super(context);
        g9 g9Var = new g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(13.0f));
        addView(g9Var, w7.b6.d(26, 26.0f, 49, 0.0f, 11.33f, 0.0f, 0.0f));
        v2 v2Var = new v2(context);
        this.b = v2Var;
        v2Var.e = org.telegram.messenger.i0.L(18.0f);
        v2Var.a.setStrokeWidth(org.telegram.messenger.i0.L(3.0f));
        addView(v2Var, w7.b6.d(48, 48.0f, 49, 0.0f, 0.66f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.c = f6Var;
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setGravity(17);
        f6Var.setTextSize(org.telegram.messenger.i0.L(12.0f));
        f6Var.setTextColor(-1);
        addView(f6Var, w7.b6.d(-1, 14.0f, 48, 0.0f, 39.0f, 0.0f, 0.0f));
        c(false, 0.0f);
        w7.e6.a(this);
    }

    public final void a(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.d = stargiftattributebackdrop;
        this.e = null;
        g9 g9Var = this.a;
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        if (stargiftattributebackdrop == null) {
            g9Var.setAlpha(1.0f);
            g9Var.setImageDrawable(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(26.0f), org.telegram.ui.ActionBar.t6.r1(0.25f, -1)));
            return;
        }
        g9Var.setAlpha(1.0f);
        OvalShape ovalShape = new OvalShape();
        ovalShape.resize(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f));
        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        shapeDrawable.setIntrinsicWidth(org.telegram.messenger.i0.L(26.0f));
        shapeDrawable.setIntrinsicHeight(org.telegram.messenger.i0.L(26.0f));
        shapeDrawable.getPaint().setShader(new RadialGradient(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        g9Var.setImageDrawable(shapeDrawable);
    }

    public final void b(TL_stars.starGiftAttributePattern stargiftattributepattern) {
        this.d = null;
        this.e = stargiftattributepattern;
        g9 g9Var = this.a;
        if (stargiftattributepattern == null) {
            g9Var.setAlpha(0.25f);
            g9Var.setScaleX(0.75f);
            g9Var.setScaleY(0.75f);
            g9Var.setTranslationY(0.0f);
            g9Var.setAnimatedEmojiDrawable(null);
            g9Var.setImageResource(R.drawable.mini_roll);
            return;
        }
        g9Var.setAlpha(1.0f);
        g9Var.setScaleX(0.95f);
        g9Var.setScaleY(0.95f);
        g9Var.setTranslationY(org.telegram.messenger.i0.L(2.0f));
        org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(d20.s0, 9, stargiftattributepattern.document);
        l4.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        g9Var.setAnimatedEmojiDrawable(l4);
    }

    public final void c(boolean z10, float f7) {
        this.f = f7;
        v2 v2Var = this.b;
        v2Var.d = f7;
        if (!z10) {
            v2Var.b.e(true, f7);
        }
        v2Var.invalidate();
        this.c.c(Math.round(f7 * 100.0f) + "%", z10, true);
    }
}
