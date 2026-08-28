package qg;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import kg.d;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jp;
import td.c;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout implements td.b {
    public final td.a a;
    public final td.a b;
    public ImageView c;
    public ImageView d;
    public jp e;
    public b6 f;
    public float h;
    public d n;

    public a(Context context) {
        super(context);
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 320L, false);
        this.b = new td.a(1, this, grVar, 320L, true);
        this.h = 1.0f;
    }

    public static a c(Context context, ig.a aVar, lg.a aVar2, b6 b6Var) {
        int v02 = f6.v0(f6.Wk, b6Var);
        a aVar3 = new a(context);
        aVar3.f = b6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = f6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(f6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    public static a d(Context context, ig.a aVar, lg.a aVar2, b6 b6Var, int i9, int i10) {
        int v02 = f6.v0(f6.Wk, b6Var);
        a aVar3 = new a(context);
        aVar3.f = b6Var;
        aVar3.setBlurredBackgroundDrawable(aVar.c(aVar3, aVar2, false));
        aVar3.f(i9, i10);
        aVar3.setIconColor(v02);
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = f6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        aVar3.setBackground(f6.W(dp, l1, dp2, dp2, dp2, dp2));
        return aVar3;
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, c cVar) {
        if (i9 == 0) {
            a();
            b();
        }
        if (i9 == 1) {
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
            int i9 = f10 > 0.0f ? 0 : 8;
            if (this.d.getVisibility() != i9) {
                this.d.setVisibility(i9);
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

    public final void f(int i9, int i10) {
        if (this.c == null) {
            if (i9 == 0) {
                return;
            }
            ImageView imageView = new ImageView(getContext());
            this.c = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.c, e6.e(i10, i10, 17));
            a();
        }
        this.c.setImageResource(i9);
    }

    public final void g() {
        d dVar = this.n;
        if (dVar != null) {
            dVar.u();
            invalidate();
        }
        int i9 = f6.Wk;
        int v02 = f6.v0(i9, this.f);
        setIconColor(f6.v0(i9, this.f));
        int dp = AndroidUtilities.dp(22.0f);
        int l1 = f6.l1(0.15f, v02);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(f6.W(dp, l1, dp2, dp2, dp2, dp2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.n.setBounds(0, 0, i9, i10);
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

    public void setIcon(int i9) {
        f(i9, 48);
    }

    public void setIconColor(int i9) {
        BlendMode blendMode;
        ImageView imageView = this.c;
        if (imageView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29) {
            imageView.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        } else {
            blendMode = BlendMode.SRC_IN;
            imageView.setColorFilter(new BlendModeColorFilter(i9, blendMode));
        }
    }

    public void setIconPadding(int i9) {
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setPadding(0, i9, 0, 0);
        }
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
