package yf;

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
import g7.e6;
import kh.g4;
import kh.i9;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t2 extends Dialog {
    public ValueAnimator A;
    public boolean B;
    public m0 C;
    public bg.i D;
    public final int a;
    public final q2 b;
    public final gh.m c;
    public final gh.h1 d;
    public final ImageView e;
    public final r2 f;
    public final Rect h;
    public Bitmap n;
    public BitmapShader r;
    public Paint s;
    public Matrix v;
    public final bb0 w;
    public final bb0 x;
    public float y;

    public t2(Context context, final int i9) {
        super(context, R.style.TransparentDialog);
        ih.b bVar = new ih.b();
        this.h = new Rect();
        this.B = false;
        this.a = i9;
        q2 q2Var = new q2(this, context, 0);
        this.b = q2Var;
        q2Var.setOnClickListener(new x8(this, 25));
        gh.m mVar = new gh.m(context, 10);
        this.c = mVar;
        mVar.setOrientation(1);
        q2Var.addView(mVar, e6.d(-2, -2.0f, 17, 8.0f, 8.0f, 8.0f, 8.0f));
        gh.h1 h1Var = new gh.h1(this, context, 11);
        h1Var.setWillNotDraw(false);
        mVar.addView(h1Var, e6.p(-1, -2, 1.0f, 49, 0, 0, 0, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-14737633);
        h1Var.addView(frameLayout, e6.e(-1, 56, 55));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.StoryLinkPreviewTitle));
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.0f);
        textView.setTypeface(AndroidUtilities.bold());
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, e6.d(-1, -2.0f, 55, 18.0f, 8.33f, 18.0f, 0.0f), context);
        g10.setText(LocaleController.getString(R.string.StoryLinkPreviewSubtitle));
        g10.setTextColor(-8421505);
        g10.setTextSize(1, 14.0f);
        frameLayout.addView(g10, e6.d(-1, -2.0f, 55, 18.0f, 31.0f, 18.0f, 0.0f));
        gh.h1 h1Var2 = new gh.h1(this, context, 12);
        this.d = h1Var2;
        h1Var.addView(h1Var2, e6.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        h1Var2.addView(imageView, e6.e(-1, -1, 119));
        r2 r2Var = new r2(this, context, AndroidUtilities.density);
        this.f = r2Var;
        h1Var2.addView(r2Var, e6.e(-2, -2, 17));
        x60 F = x60.F(q2Var, bVar, q2Var);
        bb0 bb0Var = new bb0(getContext(), R.raw.position_below, LocaleController.getString(R.string.StoryLinkCaptionAbove), R.raw.position_above, LocaleController.getString(R.string.StoryLinkCaptionBelow), bVar);
        this.w = bb0Var;
        final int i10 = 0;
        bb0Var.setOnClickListener(new View.OnClickListener(this) { // from class: yf.p2
            public final /* synthetic */ t2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        t2 t2Var = this.b;
                        m0 m0Var = t2Var.C;
                        boolean z10 = m0Var.f;
                        m0Var.f = !z10;
                        t2Var.w.a(z10, true);
                        t2Var.f.b(i9, t2Var.C, true);
                        break;
                    default:
                        t2 t2Var2 = this.b;
                        m0 m0Var2 = t2Var2.C;
                        boolean z11 = m0Var2.e;
                        m0Var2.e = !z11;
                        t2Var2.x.a(z11, true);
                        t2Var2.f.b(i9, t2Var2.C, true);
                        break;
                }
            }
        });
        F.q(bb0Var);
        bb0 bb0Var2 = new bb0(context, R.raw.media_shrink, LocaleController.getString(R.string.LinkMediaLarger), R.raw.media_enlarge, LocaleController.getString(R.string.LinkMediaSmaller), bVar);
        this.x = bb0Var2;
        final int i11 = 1;
        bb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: yf.p2
            public final /* synthetic */ t2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        t2 t2Var = this.b;
                        m0 m0Var = t2Var.C;
                        boolean z10 = m0Var.f;
                        m0Var.f = !z10;
                        t2Var.w.a(z10, true);
                        t2Var.f.b(i9, t2Var.C, true);
                        break;
                    default:
                        t2 t2Var2 = this.b;
                        m0 m0Var2 = t2Var2.C;
                        boolean z11 = m0Var2.e;
                        m0Var2.e = !z11;
                        t2Var2.x.a(z11, true);
                        t2Var2.f.b(i9, t2Var2.C, true);
                        break;
                }
            }
        });
        F.q(bb0Var2);
        F.k();
        F.c(R.drawable.msg_select, LocaleController.getString(R.string.ApplyChanges), new o2(this, 2), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DoNotLinkPreview), new o2(this, 3), true);
        mVar.addView(F.A, e6.o(-2, -2, 0.0f, 85));
        q2Var.setFitsSystemWindows(true);
        q2Var.setOnApplyWindowInsetsListener(new s2(this));
    }

    public final void b(boolean z10, o2 o2Var) {
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, z10 ? 1.0f : 0.0f);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new g4(this, 24));
        this.A.addListener(new androidx.fragment.app.g(this, z10, o2Var, 13));
        this.A.setInterpolator(gr.h);
        this.A.setDuration(z10 ? 420L : 320L);
        this.A.start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.B) {
            return;
        }
        bg.i iVar = this.D;
        if (iVar != null) {
            iVar.run(this.C);
            this.D = null;
        }
        this.B = true;
        b(false, new o2(this, 1));
        this.b.invalidate();
    }

    @Override // android.app.Dialog
    public final boolean isShowing() {
        return !this.B;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(R.style.DialogNoAnimation);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        q2 q2Var = this.b;
        setContentView(q2Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i9 = attributes.flags & (-3);
        attributes.softInputMode = 16;
        attributes.flags = 131072 | i9;
        int i10 = Build.VERSION.SDK_INT;
        attributes.flags = i9 | (-1945959040);
        if (i10 >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        q2Var.setSystemUiVisibility(256);
        AndroidUtilities.setLightNavigationBar(q2Var, !f6.I.q());
    }

    @Override // android.app.Dialog
    public final void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            super.show();
            AndroidUtilities.makeGlobalBlurBitmap(new i9(this, 23), 14.0f);
            b(true, null);
        }
    }
}
