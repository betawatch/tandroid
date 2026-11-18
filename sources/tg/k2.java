package tg;

import ai.r2;
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
import hi.t6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public h0 H;
    public t6 I;
    public final int a;
    public final w01 b;
    public final r2 c;
    public final di.d1 d;
    public final ImageView e;
    public final i2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final ta0 x;
    public final ta0 y;

    public k2(Context context, final int i7) {
        super(context, R.style.TransparentDialog);
        fi.b bVar = new fi.b();
        this.h = new Rect();
        final int i10 = 0;
        this.G = false;
        this.a = i7;
        w01 w01Var = new w01(9, context, this);
        this.b = w01Var;
        int i11 = 2;
        w01Var.setOnClickListener(new sh.b(this, i11));
        r2 r2Var = new r2(context, 11);
        this.c = r2Var;
        final int i12 = 1;
        r2Var.setOrientation(1);
        w01Var.addView(r2Var, ma.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        di.d1 d1Var = new di.d1(this, context, 12);
        d1Var.setWillNotDraw(false);
        r2Var.addView(d1Var, ma.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        d1Var.addView(frameLayout, ma.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(gd.M0(2131744398, null));
        textView.setTextColor(-1);
        i5.c.x(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, ma.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(gd.M0(2131744399, null));
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
        i2 i2Var = new i2(this, context, org.telegram.messenger.g0.p);
        this.f = i2Var;
        d1Var2.addView(i2Var, ma.e(-2, -2, 17));
        y60 G = y60.G(w01Var, bVar, w01Var);
        ta0 ta0Var = new ta0(getContext(), R.raw.position_below, gd.M0(2131744409, null), R.raw.position_above, gd.M0(2131744408, null), bVar);
        this.x = ta0Var;
        ta0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.h2
            public final /* synthetic */ k2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k2 k2Var = this.b;
                        h0 h0Var = k2Var.H;
                        boolean z10 = h0Var.f;
                        h0Var.f = !z10;
                        k2Var.x.a(z10, true);
                        k2Var.f.b(i7, k2Var.H, true);
                        break;
                    default:
                        k2 k2Var2 = this.b;
                        h0 h0Var2 = k2Var2.H;
                        boolean z11 = h0Var2.e;
                        h0Var2.e = !z11;
                        k2Var2.y.a(z11, true);
                        k2Var2.f.b(i7, k2Var2.H, true);
                        break;
                }
            }
        });
        G.q(ta0Var);
        ta0 ta0Var2 = new ta0(context, R.raw.media_shrink, gd.M0(2131748707, null), R.raw.media_enlarge, gd.M0(2131748706, null), bVar);
        this.y = ta0Var2;
        ta0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.h2
            public final /* synthetic */ k2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        k2 k2Var = this.b;
                        h0 h0Var = k2Var.H;
                        boolean z10 = h0Var.f;
                        h0Var.f = !z10;
                        k2Var.x.a(z10, true);
                        k2Var.f.b(i7, k2Var.H, true);
                        break;
                    default:
                        k2 k2Var2 = this.b;
                        h0 h0Var2 = k2Var2.H;
                        boolean z11 = h0Var2.e;
                        h0Var2.e = !z11;
                        k2Var2.y.a(z11, true);
                        k2Var2.f.b(i7, k2Var2.H, true);
                        break;
                }
            }
        });
        G.q(ta0Var2);
        G.k();
        G.c(R.drawable.msg_select, gd.M0(2131754216, null), new g2(this, i11), false);
        G.c(R.drawable.msg_delete, gd.M0(2131751350, null), new g2(this, 3), true);
        r2Var.addView(G.A, ma.p(-2, -2, 0.0f, 85));
        w01Var.setFitsSystemWindows(true);
        w01Var.setOnApplyWindowInsetsListener(new j2(this));
    }

    public final void b(boolean z10, g2 g2Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new x1(this, 1));
        this.F.addListener(new androidx.fragment.app.g(this, z10, g2Var, 15));
        this.F.setInterpolator(lr.h);
        this.F.setDuration(z10 ? 420L : 320L);
        this.F.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.G) {
            return;
        }
        t6 t6Var = this.I;
        if (t6Var != null) {
            t6Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new g2(this, 1));
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
        w01 w01Var = this.b;
        setContentView(w01Var, layoutParams);
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
        w01Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.n3(w01Var, !n6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.messenger.g0.l2(new t6(this, 29), 14.0f);
            b(true, null);
        }
    }
}
