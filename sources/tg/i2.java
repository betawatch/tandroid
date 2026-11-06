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
import c8.ha;
import fi.v3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i2 extends Dialog {
    public float D;
    public ValueAnimator E;
    public boolean F;
    public h0 G;
    public ai.i H;
    public final int a;
    public final p41 b;
    public final bi.t c;
    public final bi.s1 d;
    public final ImageView e;
    public final g2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix w;
    public final ha0 x;
    public final ha0 y;

    public i2(Context context, final int i7) {
        super(context, R.style.TransparentDialog);
        di.b bVar = new di.b();
        this.h = new Rect();
        final int i10 = 0;
        this.F = false;
        this.a = i7;
        p41 p41Var = new p41(9, context, this);
        this.b = p41Var;
        p41Var.setOnClickListener(new ii.g(this, 24));
        bi.t tVar = new bi.t(context, 12);
        this.c = tVar;
        final int i11 = 1;
        tVar.setOrientation(1);
        p41Var.addView(tVar, ha.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        bi.s1 s1Var = new bi.s1(this, context, 12);
        s1Var.setWillNotDraw(false);
        tVar.addView(s1Var, ha.q(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        s1Var.addView(frameLayout, ha.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744634, null));
        textView.setTextColor(-1);
        com.google.android.recaptcha.internal.a.q(textView, 1, 18.0f);
        TextView i12 = org.telegram.ui.Cells.f1.i(frameLayout, textView, ha.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        i12.setText(hd.M0(2131744635, null));
        i12.setTextColor(-8421505);
        i12.setTextSize(1, 14.0f);
        frameLayout.addView(i12, ha.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        bi.s1 s1Var2 = new bi.s1(this, context, 13);
        this.d = s1Var2;
        s1Var.addView(s1Var2, ha.d(-1, -1.0f, qs.E1, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        s1Var2.addView(imageView, ha.e(-1, -1, qs.E1));
        g2 g2Var = new g2(this, context, org.telegram.messenger.g0.p);
        this.f = g2Var;
        s1Var2.addView(g2Var, ha.e(-2, -2, 17));
        k60 F = k60.F(p41Var, bVar, p41Var);
        ha0 ha0Var = new ha0(getContext(), R.raw.position_below, hd.M0(2131744645, null), R.raw.position_above, hd.M0(2131744644, null), bVar);
        this.x = ha0Var;
        ha0Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        i2 i2Var = this.b;
                        h0 h0Var = i2Var.G;
                        boolean z9 = h0Var.f;
                        h0Var.f = !z9;
                        i2Var.x.a(z9, true);
                        i2Var.f.b(i7, i2Var.G, true);
                        break;
                    default:
                        i2 i2Var2 = this.b;
                        h0 h0Var2 = i2Var2.G;
                        boolean z10 = h0Var2.e;
                        h0Var2.e = !z10;
                        i2Var2.y.a(z10, true);
                        i2Var2.f.b(i7, i2Var2.G, true);
                        break;
                }
            }
        });
        F.q(ha0Var);
        ha0 ha0Var2 = new ha0(context, R.raw.media_shrink, hd.M0(2131748898, null), R.raw.media_enlarge, hd.M0(2131748897, null), bVar);
        this.y = ha0Var2;
        ha0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: tg.f2
            public final /* synthetic */ i2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        i2 i2Var = this.b;
                        h0 h0Var = i2Var.G;
                        boolean z9 = h0Var.f;
                        h0Var.f = !z9;
                        i2Var.x.a(z9, true);
                        i2Var.f.b(i7, i2Var.G, true);
                        break;
                    default:
                        i2 i2Var2 = this.b;
                        h0 h0Var2 = i2Var2.G;
                        boolean z10 = h0Var2.e;
                        h0Var2.e = !z10;
                        i2Var2.y.a(z10, true);
                        i2Var2.f.b(i7, i2Var2.G, true);
                        break;
                }
            }
        });
        F.q(ha0Var2);
        F.k();
        F.c(R.drawable.msg_select, hd.M0(2131754218, null), new e2(this, 2), false);
        F.c(R.drawable.msg_delete, hd.M0(2131751362, null), new e2(this, 3), true);
        tVar.addView(F.A, ha.p(-2, -2, 0.0f, 85));
        p41Var.setFitsSystemWindows(true);
        p41Var.setOnApplyWindowInsetsListener(new h2(this));
    }

    public final void b(boolean z9, e2 e2Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, z9 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new v3(this, 29));
        this.E.addListener(new ai.g0(this, z9, e2Var, 15));
        this.E.setInterpolator(xq.h);
        this.E.setDuration(z9 ? 420L : 320L);
        this.E.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.F) {
            return;
        }
        ai.i iVar = this.H;
        if (iVar != null) {
            iVar.a(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new e2(this, 1));
        this.b.invalidate();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.F;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        p41 p41Var = this.b;
        setContentView(p41Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = qs.E1;
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
        p41Var.setSystemUiVisibility(256);
        org.telegram.messenger.g0.o3(p41Var, !k6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (org.telegram.messenger.g0.M1(getContext())) {
            super.show();
            org.telegram.messenger.g0.l2(new ii.c(this, 23), 14.0f);
            b(true, null);
        }
    }
}
