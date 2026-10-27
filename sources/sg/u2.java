package sg;

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
import fi.e4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Wallet.p5;
import org.telegram.ui.d3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public n0 G;
    public ai.i H;
    public final int a;
    public final p5 b;
    public final bi.r c;
    public final bi.t1 d;
    public final ImageView e;
    public final s2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix v;
    public final nc0 w;
    public final nc0 x;
    public float y;

    public u2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        di.b bVar = new di.b();
        this.h = new Rect();
        this.F = false;
        this.a = i10;
        p5 p5Var = new p5(this, context, 4);
        this.b = p5Var;
        p5Var.setOnClickListener(new ig.d0(this, 19));
        bi.r rVar = new bi.r(context, 10);
        this.c = rVar;
        rVar.setOrientation(1);
        p5Var.addView(rVar, kb1.h(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        bi.t1 t1Var = new bi.t1(this, context, 12);
        t1Var.setWillNotDraw(false);
        rVar.addView(t1Var, kb1.t(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        t1Var.addView(frameLayout, kb1.i(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView k10 = d3.k(frameLayout, textView, kb1.h(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        k10.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        k10.setTextColor(-8421505);
        k10.setTextSize(1, 14.0f);
        frameLayout.addView(k10, kb1.h(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        bi.t1 t1Var2 = new bi.t1(this, context, 13);
        this.d = t1Var2;
        t1Var.addView(t1Var2, kb1.h(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        t1Var2.addView(imageView, kb1.i(-1, -1, 119));
        s2 s2Var = new s2(this, context, AndroidUtilities.density);
        this.f = s2Var;
        t1Var2.addView(s2Var, kb1.i(-2, -2, 17));
        l80 F = l80.F(p5Var, bVar, p5Var);
        nc0 nc0Var = new nc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.w = nc0Var;
        final int i11 = 0;
        nc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: sg.r2
            public final /* synthetic */ u2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        u2 u2Var = this.b;
                        n0 n0Var = u2Var.G;
                        boolean z10 = n0Var.f;
                        n0Var.f = !z10;
                        u2Var.w.a(z10, true);
                        u2Var.f.b(i10, u2Var.G, true);
                        break;
                    default:
                        u2 u2Var2 = this.b;
                        n0 n0Var2 = u2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        u2Var2.x.a(z11, true);
                        u2Var2.f.b(i10, u2Var2.G, true);
                        break;
                }
            }
        });
        F.q(nc0Var);
        nc0 nc0Var2 = new nc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.x = nc0Var2;
        final int i12 = 1;
        nc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: sg.r2
            public final /* synthetic */ u2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        u2 u2Var = this.b;
                        n0 n0Var = u2Var.G;
                        boolean z10 = n0Var.f;
                        n0Var.f = !z10;
                        u2Var.w.a(z10, true);
                        u2Var.f.b(i10, u2Var.G, true);
                        break;
                    default:
                        u2 u2Var2 = this.b;
                        n0 n0Var2 = u2Var2.G;
                        boolean z11 = n0Var2.e;
                        n0Var2.e = !z11;
                        u2Var2.x.a(z11, true);
                        u2Var2.f.b(i10, u2Var2.G, true);
                        break;
                }
            }
        });
        F.q(nc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new q2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new q2(this, 3), true);
        rVar.addView(F.A, kb1.s(-2, -2, 0.0f, 85));
        p5Var.setFitsSystemWindows(true);
        p5Var.setOnApplyWindowInsetsListener(new t2(this));
    }

    public final void b(boolean z10, q2 q2Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new e4(this, 24));
        this.E.addListener(new ai.l0(this, z10, q2Var, 15));
        this.E.setInterpolator(ds.h);
        this.E.setDuration(z10 ? 420L : 320L);
        this.E.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.F) {
            return;
        }
        ai.i iVar = this.H;
        if (iVar != null) {
            iVar.run(this.G);
            this.H = null;
        }
        this.F = true;
        b(false, new q2(this, 1));
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
        p5 p5Var = this.b;
        setContentView(p5Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i10 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i10;
        int i11 = Build.VERSION.SDK_INT;
        attributes.flags = i10 | (-1945959040);
        if (i11 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        p5Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(p5Var, !y6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new ig.o(this, 19), 14.0f);
            b(true, null);
        }
    }
}
