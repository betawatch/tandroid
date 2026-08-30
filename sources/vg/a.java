package vg;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rp;
import xd.c;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout implements xd.b {
    public final xd.a a;
    public final xd.a b;
    public ImageView c;
    public ImageView d;
    public rp e;
    public f6 f;
    public float h;
    public pg.b n;

    public a(Context context) {
        super(context);
        nr nrVar = nr.h;
        this.a = new xd.a(0, this, nrVar, 320L, false);
        this.b = new xd.a(1, this, nrVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, ng.a aVar, f6 f6Var, qg.a aVar2) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar3 = new a(context);
        aVar3.f = f6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    public static a d(Context context, ng.a aVar, qg.a aVar2, f6 f6Var, int i10, int i11) {
        int v02 = j6.v0(j6.Wk, f6Var);
        a aVar3 = new a(context);
        aVar3.f = f6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i10, i11);
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, c cVar) {
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
        float f10 = 1.0f - this.a.e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.b.e);
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.c.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.c.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10) * this.h);
            this.c.setVisibility(f10 > 0.0f ? 0 : 8);
        }
    }

    public final void b() {
        float f10 = this.a.e;
        float lerp = AndroidUtilities.lerp(f10 / 2.0f, f10, this.b.e);
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setAlpha(lerp);
            this.d.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            this.d.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
            int i10 = f10 > 0.0f ? 0 : 8;
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

    public final void e(boolean z4, boolean z10) {
        super.setEnabled(z4);
        this.b.a(z4, z10);
    }

    public final void f(int i10, int i11) {
        if (this.c == null) {
            if (i10 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, b6.e(i11, i11, 17));
            a();
        }
        this.c.setImageResource(i10);
    }

    public final void g() {
        pg.b bVar = this.n;
        if (bVar != null) {
            bVar.u();
            invalidate();
        }
        int i10 = j6.Wk;
        int v02 = j6.v0(i10, this.f);
        setIconColor(j6.v0(i10, this.f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = j6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(j6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.n.setBounds(0, 0, i10, i11);
    }

    public void setBlurredBackgroundDrawable(pg.b bVar) {
        this.n = bVar;
        bVar.o(AndroidUtilities.dp(6.0f));
        this.n.p(AndroidUtilities.dp(22.0f));
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        e(z4, false);
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

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
