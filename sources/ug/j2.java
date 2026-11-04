package ug;

import ai.v2;
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
import b8.mf;
import gi.j8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j2 extends Dialog {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public g0 H;
    public v2 I;
    public final int a;
    public final kw0 b;
    public final ci.q c;
    public final ci.l1 d;
    public final ImageView e;
    public final h2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final ca0 x;
    public final ca0 y;

    public j2(Context context, final int i3) {
        super(context, R.style.TransparentDialog);
        ei.b bVar = new ei.b();
        this.h = new Rect();
        final int i10 = 0;
        this.G = false;
        this.a = i3;
        kw0 kw0Var = new kw0(10, context, this);
        this.b = kw0Var;
        kw0Var.setOnClickListener(new ii.m(this, 28));
        ci.q qVar = new ci.q(context, 12);
        this.c = qVar;
        final int i11 = 1;
        qVar.setOrientation(1);
        kw0Var.addView(qVar, mf.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        ci.l1 l1Var = new ci.l1(this, context, 12);
        l1Var.setWillNotDraw(false);
        qVar.addView(l1Var, mf.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        l1Var.addView(frameLayout, mf.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(bd.M0(2131744643, null));
        textView.setTextColor(-1);
        k2.p1.t(textView, 1, 18.0f);
        TextView m10 = org.telegram.ui.Cells.f1.m(frameLayout, textView, mf.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        m10.setText(bd.M0(2131744644, null));
        m10.setTextColor(-8421505);
        m10.setTextSize(1, 14.0f);
        frameLayout.addView(m10, mf.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        ci.l1 l1Var2 = new ci.l1(this, context, 13);
        this.d = l1Var2;
        l1Var.addView(l1Var2, mf.d(-1, -1.0f, hs.E1, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        l1Var2.addView(imageView, mf.e(-1, -1, hs.E1));
        h2 h2Var = new h2(this, context, org.telegram.messenger.g0.p);
        this.f = h2Var;
        l1Var2.addView(h2Var, mf.e(-2, -2, 17));
        f60 F = f60.F(kw0Var, bVar, kw0Var);
        ca0 ca0Var = new ca0(getContext(), R.raw.position_below, bd.M0(2131744654, null), R.raw.position_above, bd.M0(2131744653, null), bVar);
        this.x = ca0Var;
        ca0Var.setOnClickListener(new View.OnClickListener(this) { // from class: ug.g2
            public final /* synthetic */ j2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        j2 j2Var = this.b;
                        g0 g0Var = j2Var.H;
                        boolean z10 = g0Var.f;
                        g0Var.f = !z10;
                        j2Var.x.a(z10, true);
                        j2Var.f.b(i3, j2Var.H, true);
                        break;
                    default:
                        j2 j2Var2 = this.b;
                        g0 g0Var2 = j2Var2.H;
                        boolean z11 = g0Var2.e;
                        g0Var2.e = !z11;
                        j2Var2.y.a(z11, true);
                        j2Var2.f.b(i3, j2Var2.H, true);
                        break;
                }
            }
        });
        F.q(ca0Var);
        ca0 ca0Var2 = new ca0(context, R.raw.media_shrink, bd.M0(2131748907, null), R.raw.media_enlarge, bd.M0(2131748906, null), bVar);
        this.y = ca0Var2;
        ca0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ug.g2
            public final /* synthetic */ j2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        j2 j2Var = this.b;
                        g0 g0Var = j2Var.H;
                        boolean z10 = g0Var.f;
                        g0Var.f = !z10;
                        j2Var.x.a(z10, true);
                        j2Var.f.b(i3, j2Var.H, true);
                        break;
                    default:
                        j2 j2Var2 = this.b;
                        g0 g0Var2 = j2Var2.H;
                        boolean z11 = g0Var2.e;
                        g0Var2.e = !z11;
                        j2Var2.y.a(z11, true);
                        j2Var2.f.b(i3, j2Var2.H, true);
                        break;
                }
            }
        });
        F.q(ca0Var2);
        F.k();
        F.c(R.drawable.msg_select, bd.M0(2131754218, null), new e2(this, 2), false);
        F.c(R.drawable.msg_delete, bd.M0(2131751362, null), new e2(this, 3), true);
        qVar.addView(F.A, mf.p(-2, -2, 0.0f, 85));
        kw0Var.setFitsSystemWindows(true);
        kw0Var.setOnApplyWindowInsetsListener(new i2(this));
    }

    public final void b(boolean z10, e2 e2Var) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z10 ? 1.0f : 0.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new f2(this, 0));
        this.F.addListener(new androidx.fragment.app.g(this, z10, e2Var, 15));
        this.F.setInterpolator(xq.h);
        this.F.setDuration(z10 ? 420L : 320L);
        this.F.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.G) {
            return;
        }
        v2 v2Var = this.I;
        if (v2Var != null) {
            v2Var.a(this.H);
            this.I = null;
        }
        this.G = true;
        b(false, new e2(this, 1));
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
        kw0 kw0Var = this.b;
        setContentView(kw0Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = hs.E1;
        attributes.dimAmount = 0.0f;
        int i3 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i3;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i3 | (-1945959040);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        kw0Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(kw0Var, !k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.messenger.g0.l2(new j8(this, 26), 14.0f);
            b(true, null);
        }
    }
}
