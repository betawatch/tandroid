package tg;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import ng.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
import vd.c;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout implements vd.b {
    public final vd.a a;
    public final vd.a b;
    public ImageView c;
    public ImageView d;
    public np e;
    public c6 f;
    public float h;
    public d n;

    public a(Context context) {
        super(context);
        jr jrVar = jr.h;
        this.a = new vd.a(0, this, jrVar, 320L, false);
        this.b = new vd.a(1, this, jrVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, lg.a aVar, og.a aVar2, c6 c6Var) {
        int v02 = g6.v0(g6.Wk, c6Var);
        a aVar3 = new a(context);
        aVar3.f = c6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = g6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(g6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    public static a d(Context context, lg.a aVar, og.a aVar2, c6 c6Var, int i10, int i11) {
        int v02 = g6.v0(g6.Wk, c6Var);
        a aVar3 = new a(context);
        aVar3.f = c6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i10, i11);
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = g6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(g6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, c cVar) {
        if (i10 == 0) {
            a();
            b();
        }
        if (i10 == 1) {
            a();
            b();
        }
    }

    public final void a() {
        float f9 = 1.0f - this.a.e;
        float lerp = AndroidUtilities.lerp(f9 / 2.0f, f9, this.b.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f9));
            this.c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f9) * this.h);
            this.c.setVisibility(f9 > 0.0f ? 0 : 8);
        }
    }

    public final void b() {
        float f9 = this.a.e;
        float lerp = AndroidUtilities.lerp(f9 / 2.0f, f9, this.b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.d.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f9));
            this.d.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f9));
            int i10 = f9 > 0.0f ? 0 : 8;
            if (this.d.getVisibility() != i10) {
                this.d.setVisibility(i10);
                this.e.c = -1L;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.n.draw(canvas);
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        super.setEnabled(z10);
        this.b.a(z10, z11);
    }

    public final void f(int i10, int i11) {
        if (this.c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, f6.e(i11, i11, 17));
            a();
        }
        this.c.setImageResource(i10);
    }

    public final void g() {
        d dVar = this.n;
        if (dVar != null) {
            dVar.u();
            invalidate();
        }
        int i10 = g6.Wk;
        int v02 = g6.v0(i10, this.f);
        setIconColor(g6.v0(i10, this.f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = g6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(g6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(d dVar) {
        this.n = dVar;
        dVar.o(AndroidUtilities.dp(6.0f));
        this.n.p(AndroidUtilities.dp(22.0f));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        e(z10, false);
    }

    public void setIcon(int i10) {
        f(i10, 48);
    }

    public void setIconColor(int i10) {
        BlendMode blendMode;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        } else {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i10, blendMode));
        }
    }

    public void setIconPadding(int i10) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setPadding(0, i10, 0, 0);
        }
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
