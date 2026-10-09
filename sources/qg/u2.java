package qg;

import ai.x7;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.yd;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u2 extends Dialog {
    public ValueAnimator E;
    public boolean F;
    public n0 G;
    public ai.y1 H;
    public final int a;
    public final ai.f0 b;
    public final yd c;
    public final x7 d;
    public final ImageView e;
    public final s2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix v;
    public final uc0 w;
    public final uc0 x;
    public float y;

    public u2(Context context, final int i10) {
        super(context, R.style.TransparentDialog);
        ai.d dVar = new ai.d();
        this.h = new Rect();
        this.F = false;
        this.a = i10;
        ai.f0 f0Var = new ai.f0(this, context, 28);
        this.b = f0Var;
        f0Var.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 7));
        yd ydVar = new yd(context, 8);
        this.c = ydVar;
        ydVar.setOrientation(1);
        f0Var.addView(ydVar, x5.a(-2.0f, 8.0f, 8.0f, 8.0f, 8.0f, -2, 17));
        x7 x7Var = new x7(this, context, 10);
        x7Var.setWillNotDraw(false);
        ydVar.addView(x7Var, x5.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        x7Var.addView(frameLayout, x5.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView g10 = org.telegram.ui.Cells.c1.g(frameLayout, textView, x5.a(-2.0f, 18.0f, 8.33f, 18.0f, 0.0f, -1, 55), context);
        g10.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        g10.setTextColor(-8421505);
        g10.setTextSize(1, 14.0f);
        frameLayout.addView(g10, x5.a(-2.0f, 18.0f, 31.0f, 18.0f, 0.0f, -1, 55));
        x7 x7Var2 = new x7(this, context, 11);
        this.d = x7Var2;
        x7Var.addView(x7Var2, x5.a(-1.0f, 0.0f, 56.0f, 0.0f, 0.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        x7Var2.addView(imageView, x5.e(-1, -1, 119));
        s2 s2Var = new s2(this, context, AndroidUtilities.density);
        this.f = s2Var;
        x7Var2.addView(s2Var, x5.e(-2, -2, 17));
        p80 F = p80.F(f0Var, dVar, f0Var);
        uc0 uc0Var = new uc0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), dVar);
        this.w = uc0Var;
        final int i11 = 0;
        uc0Var.setOnClickListener(new View.OnClickListener(this) { // from class: qg.r2
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
        F.q(uc0Var);
        uc0 uc0Var2 = new uc0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), dVar);
        this.x = uc0Var2;
        final int i12 = 1;
        uc0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: qg.r2
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
        F.q(uc0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new q2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new q2(this, 3), true);
        ydVar.addView(F.A, x5.o(-2, -2, 0.0f, 85));
        f0Var.setFitsSystemWindows(true);
        f0Var.setOnApplyWindowInsetsListener(new t2(this));
    }

    public final void b(boolean z10, q2 q2Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 13));
        this.E.addListener(new androidx.fragment.app.g(this, z10, q2Var, 12));
        this.E.setInterpolator(hs.h);
        this.E.setDuration(z10 ? 420L : 320L);
        this.E.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.F) {
            return;
        }
        ai.y1 y1Var = this.H;
        if (y1Var != null) {
            y1Var.run(this.G);
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
        ai.f0 f0Var = this.b;
        setContentView(f0Var, layoutParams);
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
        f0Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(f0Var, !i6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new ii.q1(this, 9), 14.0f);
            b(true, null);
        }
    }
}
