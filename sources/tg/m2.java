package tg;

import ai.q2;
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
import c8.ja;
import hi.g7;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.m60;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class m2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public h0 H;
    public g7 I;
    public final int a;
    public final m01 b;
    public final q2 c;
    public final di.e1 d;
    public final ImageView e;
    public final k2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final ia0 x;
    public final ia0 y;

    public m2(Context context, final int i7) {
        super(context, R.style.TransparentDialog);
        fi.b bVar = new fi.b();
        this.h = new Rect();
        final int i10 = 0;
        this.G = false;
        this.a = i7;
        m01 m01Var = new m01(10, context, this);
        this.b = m01Var;
        m01Var.setOnClickListener(new i2(this, i10));
        q2 q2Var = new q2(context, 12);
        this.c = q2Var;
        final int i11 = 1;
        q2Var.setOrientation(1);
        m01Var.addView(q2Var, ja.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        di.e1 e1Var = new di.e1(this, context, 12);
        e1Var.setWillNotDraw(false);
        q2Var.addView(e1Var, ja.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        e1Var.addView(frameLayout, ja.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744633, null));
        textView.setTextColor(-1);
        i5.c.v(textView, 1, 18.0f);
        TextView k10 = org.telegram.ui.Cells.y0.k(frameLayout, textView, ja.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        k10.setText(hd.M0(2131744634, null));
        k10.setTextColor(-8421505);
        k10.setTextSize(1, 14.0f);
        frameLayout.addView(k10, ja.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        di.e1 e1Var2 = new di.e1(this, context, 13);
        this.d = e1Var2;
        e1Var.addView(e1Var2, ja.d(-1, -1.0f, ns.E1, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        e1Var2.addView(imageView, ja.e(-1, -1, ns.E1));
        k2 k2Var = new k2(this, context, org.telegram.messenger.g0.p);
        this.f = k2Var;
        e1Var2.addView(k2Var, ja.e(-2, -2, 17));
        m60 F = m60.F(m01Var, bVar, m01Var);
        ia0 ia0Var = new ia0(getContext(), R.raw.position_below, hd.M0(2131744644, null), R.raw.position_above, hd.M0(2131744643, null), bVar);
        this.x = ia0Var;
        ia0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.j2
            public final /* synthetic */ m2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        m2 m2Var = this.b;
                        h0 h0Var = m2Var.H;
                        boolean z10 = h0Var.f;
                        h0Var.f = !z10;
                        m2Var.x.a(z10, true);
                        m2Var.f.b(i7, m2Var.H, true);
                        break;
                    default:
                        m2 m2Var2 = this.b;
                        h0 h0Var2 = m2Var2.H;
                        boolean z11 = h0Var2.e;
                        h0Var2.e = !z11;
                        m2Var2.y.a(z11, true);
                        m2Var2.f.b(i7, m2Var2.H, true);
                        break;
                }
            }
        });
        F.q(ia0Var);
        ia0 ia0Var2 = new ia0(context, R.raw.media_shrink, hd.M0(2131748899, null), R.raw.media_enlarge, hd.M0(2131748898, null), bVar);
        this.y = ia0Var2;
        ia0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.j2
            public final /* synthetic */ m2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        m2 m2Var = this.b;
                        h0 h0Var = m2Var.H;
                        boolean z10 = h0Var.f;
                        h0Var.f = !z10;
                        m2Var.x.a(z10, true);
                        m2Var.f.b(i7, m2Var.H, true);
                        break;
                    default:
                        m2 m2Var2 = this.b;
                        h0 h0Var2 = m2Var2.H;
                        boolean z11 = h0Var2.e;
                        h0Var2.e = !z11;
                        m2Var2.y.a(z11, true);
                        m2Var2.f.b(i7, m2Var2.H, true);
                        break;
                }
            }
        });
        F.q(ia0Var2);
        F.k();
        F.c(R.drawable.msg_select, hd.M0(2131754218, null), new h2(this, 2), false);
        F.c(R.drawable.msg_delete, hd.M0(2131751361, null), new h2(this, 3), true);
        q2Var.addView(F.A, ja.p(-2, -2, 0.0f, 85));
        m01Var.setFitsSystemWindows(true);
        m01Var.setOnApplyWindowInsetsListener(new l2(this));
    }

    public final void b(boolean z10, h2 h2Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new y1(this, 1));
        this.F.addListener(new androidx.fragment.app.g(this, z10, h2Var, 15));
        this.F.setInterpolator(er.h);
        this.F.setDuration(z10 ? 420L : 320L);
        this.F.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.G) {
            return;
        }
        g7 g7Var = this.I;
        if (g7Var != null) {
            g7Var.a(this.H);
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
        m01 m01Var = this.b;
        setContentView(m01Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = ns.E1;
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
        m01Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(m01Var, !j6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.messenger.g0.l2(new g7(this, 28), 14.0f);
            b(true, null);
        }
    }
}
