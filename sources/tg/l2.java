package tg;

import ai.t2;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ma;
import hi.s6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.y01;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class l2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public i0 H;
    public s6 I;
    public final int a;
    public final y01 b;
    public final t2 c;
    public final di.d1 d;
    public final ImageView e;
    public final j2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final va0 x;
    public final va0 y;

    public l2(Context context, final int i7) {
        super(context, R.style.TransparentDialog);
        fi.b bVar = new fi.b();
        this.h = new Rect();
        final int i10 = 0;
        this.G = false;
        this.a = i7;
        y01 y01Var = new y01(9, context, this);
        this.b = y01Var;
        final int i11 = 1;
        y01Var.setOnClickListener(new u(this, i11));
        t2 t2Var = new t2(context, 11);
        this.c = t2Var;
        t2Var.setOrientation(1);
        y01Var.addView(t2Var, ma.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        di.d1 d1Var = new di.d1(this, context, 12);
        d1Var.setWillNotDraw(false);
        t2Var.addView(d1Var, ma.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        d1Var.addView(frameLayout, ma.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131744392, null));
        textView.setTextColor(-1);
        i5.c.x(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, ma.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(gd.N0(2131744393, null));
        m10.setTextColor(-8421505);
        m10.setTextSize(1, 14.0f);
        frameLayout.addView(m10, ma.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        di.d1 d1Var2 = new di.d1(this, context, 13);
        this.d = d1Var2;
        d1Var.addView(d1Var2, ma.d(-1, -1.0f, ks.E1, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        d1Var2.addView(imageView, ma.e(-1, -1, ks.E1));
        j2 j2Var = new j2(this, context, org.telegram.messenger.g0.p);
        this.f = j2Var;
        d1Var2.addView(j2Var, ma.e(-2, -2, 17));
        a70 G = a70.G(y01Var, bVar, y01Var);
        va0 va0Var = new va0(getContext(), R.raw.position_below, gd.N0(2131744403, null), R.raw.position_above, gd.N0(2131744402, null), bVar);
        this.x = va0Var;
        va0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.i2
            public final /* synthetic */ l2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        l2 l2Var = this.b;
                        i0 i0Var = l2Var.H;
                        boolean z10 = i0Var.f;
                        i0Var.f = !z10;
                        l2Var.x.a(z10, true);
                        l2Var.f.b(i7, l2Var.H, true);
                        break;
                    default:
                        l2 l2Var2 = this.b;
                        i0 i0Var2 = l2Var2.H;
                        boolean z11 = i0Var2.e;
                        i0Var2.e = !z11;
                        l2Var2.y.a(z11, true);
                        l2Var2.f.b(i7, l2Var2.H, true);
                        break;
                }
            }
        });
        G.q(va0Var);
        va0 va0Var2 = new va0(context, R.raw.media_shrink, gd.N0(2131748706, null), R.raw.media_enlarge, gd.N0(2131748705, null), bVar);
        this.y = va0Var2;
        va0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.i2
            public final /* synthetic */ l2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        l2 l2Var = this.b;
                        i0 i0Var = l2Var.H;
                        boolean z10 = i0Var.f;
                        i0Var.f = !z10;
                        l2Var.x.a(z10, true);
                        l2Var.f.b(i7, l2Var.H, true);
                        break;
                    default:
                        l2 l2Var2 = this.b;
                        i0 i0Var2 = l2Var2.H;
                        boolean z11 = i0Var2.e;
                        i0Var2.e = !z11;
                        l2Var2.y.a(z11, true);
                        l2Var2.f.b(i7, l2Var2.H, true);
                        break;
                }
            }
        });
        G.q(va0Var2);
        G.k();
        G.c(R.drawable.msg_select, gd.N0(2131754215, null), new h2(this, 2), false);
        G.c(R.drawable.msg_delete, gd.N0(2131751349, null), new h2(this, 3), true);
        t2Var.addView(G.A, ma.p(-2, -2, 0.0f, 85));
        y01Var.setFitsSystemWindows(true);
        y01Var.setOnApplyWindowInsetsListener(new k2(this));
    }

    public final void b(boolean z10, h2 h2Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new z1(this, 1));
        this.F.addListener(new androidx.fragment.app.g(this, z10, h2Var, 15));
        this.F.setInterpolator(nr.h);
        this.F.setDuration(z10 ? 420L : 320L);
        this.F.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.G) {
            return;
        }
        s6 s6Var = this.I;
        if (s6Var != null) {
            s6Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new h2(this, 1));
        this.b.invalidate();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.G;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        y01 y01Var = this.b;
        setContentView(y01Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = ks.E1;
        attributes.dimAmount = 0.0f;
        int i7 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i7;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i7 | (-1945959040);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        y01Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(y01Var, !m6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.messenger.g0.l2(new s6(this, 29), 14.0f);
            b(true, null);
        }
    }
}
