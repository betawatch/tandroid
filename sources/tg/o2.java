package tg;

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
import c8.na;
import hi.c7;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.sa0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public m0 H;
    public c7 I;
    public final int a;
    public final w01 b;
    public final ai.l2 c;
    public final di.d1 d;
    public final ImageView e;
    public final m2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final sa0 x;
    public final sa0 y;

    public o2(Context context, final int i7) {
        super(context, R.style.TransparentDialog);
        fi.b bVar = new fi.b();
        this.h = new Rect();
        final int i10 = 0;
        this.G = false;
        this.a = i7;
        w01 w01Var = new w01(9, context, this);
        this.b = w01Var;
        final int i11 = 1;
        w01Var.setOnClickListener(new a0(this, i11));
        ai.l2 l2Var = new ai.l2(context, 11);
        this.c = l2Var;
        l2Var.setOrientation(1);
        w01Var.addView(l2Var, na.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        di.d1 d1Var = new di.d1(this, context, 12);
        d1Var.setWillNotDraw(false);
        l2Var.addView(d1Var, na.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        d1Var.addView(frameLayout, na.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(gd.N0(2131744389, null));
        textView.setTextColor(-1);
        i5.c.x(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.c0.m(frameLayout, textView, na.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(gd.N0(2131744390, null));
        m10.setTextColor(-8421505);
        m10.setTextSize(1, 14.0f);
        frameLayout.addView(m10, na.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        di.d1 d1Var2 = new di.d1(this, context, 13);
        this.d = d1Var2;
        d1Var.addView(d1Var2, na.d(-1, -1.0f, ks.E1, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        d1Var2.addView(imageView, na.e(-1, -1, ks.E1));
        m2 m2Var = new m2(this, context, org.telegram.messenger.g0.p);
        this.f = m2Var;
        d1Var2.addView(m2Var, na.e(-2, -2, 17));
        x60 G = x60.G(w01Var, bVar, w01Var);
        sa0 sa0Var = new sa0(getContext(), R.raw.position_below, gd.N0(2131744400, null), R.raw.position_above, gd.N0(2131744399, null), bVar);
        this.x = sa0Var;
        sa0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.l2
            public final /* synthetic */ o2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        o2 o2Var = this.b;
                        m0 m0Var = o2Var.H;
                        boolean z10 = m0Var.f;
                        m0Var.f = !z10;
                        o2Var.x.a(z10, true);
                        o2Var.f.b(i7, o2Var.H, true);
                        break;
                    default:
                        o2 o2Var2 = this.b;
                        m0 m0Var2 = o2Var2.H;
                        boolean z11 = m0Var2.e;
                        m0Var2.e = !z11;
                        o2Var2.y.a(z11, true);
                        o2Var2.f.b(i7, o2Var2.H, true);
                        break;
                }
            }
        });
        G.q(sa0Var);
        sa0 sa0Var2 = new sa0(context, R.raw.media_shrink, gd.N0(2131748706, null), R.raw.media_enlarge, gd.N0(2131748705, null), bVar);
        this.y = sa0Var2;
        sa0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.l2
            public final /* synthetic */ o2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        o2 o2Var = this.b;
                        m0 m0Var = o2Var.H;
                        boolean z10 = m0Var.f;
                        m0Var.f = !z10;
                        o2Var.x.a(z10, true);
                        o2Var.f.b(i7, o2Var.H, true);
                        break;
                    default:
                        o2 o2Var2 = this.b;
                        m0 m0Var2 = o2Var2.H;
                        boolean z11 = m0Var2.e;
                        m0Var2.e = !z11;
                        o2Var2.y.a(z11, true);
                        o2Var2.f.b(i7, o2Var2.H, true);
                        break;
                }
            }
        });
        G.q(sa0Var2);
        G.k();
        G.c(R.drawable.msg_select, gd.N0(2131754215, null), new k2(this, 2), false);
        G.c(R.drawable.msg_delete, gd.N0(2131751349, null), new k2(this, 3), true);
        l2Var.addView(G.A, na.p(-2, -2, 0.0f, 85));
        w01Var.setFitsSystemWindows(true);
        w01Var.setOnApplyWindowInsetsListener(new n2(this));
    }

    public final void b(boolean z10, k2 k2Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new c2(this, 1));
        this.F.addListener(new androidx.fragment.app.g(this, z10, k2Var, 15));
        this.F.setInterpolator(kr.h);
        this.F.setDuration(z10 ? 420L : 320L);
        this.F.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.G) {
            return;
        }
        c7 c7Var = this.I;
        if (c7Var != null) {
            c7Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new k2(this, 1));
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
            org.telegram.messenger.g0.l2(new c7(this, 29), 14.0f);
            b(true, null);
        }
    }
}
