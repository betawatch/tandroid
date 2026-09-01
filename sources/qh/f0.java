package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public abstract class f0 extends FrameLayout {
    public boolean B;
    public final j5 a;
    public eg.t2 b;
    public final org.telegram.ui.Components.z5 c;
    public final org.telegram.ui.Components.z5 d;
    public final e0 e;
    public final FrameLayout f;
    public final a0 h;
    public final zf.e n;
    public final FrameLayout r;
    public float s;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public final zf.f y;

    public f0(Context context, j5 j5Var) {
        super(context);
        this.s = 0.0f;
        this.v = new int[2];
        this.w = new int[2];
        this.x = new int[2];
        this.y = new zf.f();
        this.a = j5Var;
        e0 e0Var = new e0(this, context);
        this.e = e0Var;
        pr prVar = pr.h;
        this.c = new org.telegram.ui.Components.z5(e0Var, 0L, 320L, prVar);
        this.d = new org.telegram.ui.Components.z5(e0Var, 0L, 320L, prVar);
        a0 a0Var = new a0(this, context, 1);
        this.h = a0Var;
        a0Var.setListener(new org.telegram.ui.web.e0(this, 5));
        addView(a0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        zf.e eVar = new zf.e(context);
        this.n = eVar;
        eVar.setListener(new xe0(2, this));
        frameLayout.addView(eVar, k7.c6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yh.p(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, k7.c6.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.d0
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((m9) this.b).C.l0(-1, false, true);
                        break;
                    case 1:
                        f0 f0Var = this.b;
                        f0Var.h.l(true);
                        zf.e eVar2 = f0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        f0 f0Var2 = this.b;
                        eg.t2 t2Var = f0Var2.b;
                        if (t2Var != null) {
                            t2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.b.D0);
                            eg.t2 t2Var2 = f0Var2.b;
                            t2Var2.D0.orientation = t2Var2.getOrientation();
                            f0Var2.b.k();
                            f0Var2.b.requestLayout();
                            f0Var2.b.w0.requestLayout();
                            f0Var2.b.w0.invalidate();
                            f0Var2.b.w0.post(new org.telegram.ui.web.s0(f0Var2, 11));
                        }
                        ((m9) f0Var2).C.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, k7.c6.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: qh.d0
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((m9) this.b).C.l0(-1, false, true);
                        break;
                    case 1:
                        f0 f0Var = this.b;
                        f0Var.h.l(true);
                        zf.e eVar2 = f0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        f0 f0Var2 = this.b;
                        eg.t2 t2Var = f0Var2.b;
                        if (t2Var != null) {
                            t2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.b.D0);
                            eg.t2 t2Var2 = f0Var2.b;
                            t2Var2.D0.orientation = t2Var2.getOrientation();
                            f0Var2.b.k();
                            f0Var2.b.requestLayout();
                            f0Var2.b.w0.requestLayout();
                            f0Var2.b.w0.invalidate();
                            f0Var2.b.w0.post(new org.telegram.ui.web.s0(f0Var2, 11));
                        }
                        ((m9) f0Var2).C.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.b.e(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, k7.c6.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: qh.d0
            public final /* synthetic */ f0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((m9) this.b).C.l0(-1, false, true);
                        break;
                    case 1:
                        f0 f0Var = this.b;
                        f0Var.h.l(true);
                        zf.e eVar2 = f0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        f0 f0Var2 = this.b;
                        eg.t2 t2Var = f0Var2.b;
                        if (t2Var != null) {
                            t2Var.D0 = new MediaController.CropState();
                            f0Var2.h.b(f0Var2.b.D0);
                            eg.t2 t2Var2 = f0Var2.b;
                            t2Var2.D0.orientation = t2Var2.getOrientation();
                            f0Var2.b.k();
                            f0Var2.b.requestLayout();
                            f0Var2.b.w0.requestLayout();
                            f0Var2.b.w0.invalidate();
                            f0Var2.b.w0.post(new org.telegram.ui.web.s0(f0Var2, 11));
                        }
                        ((m9) f0Var2).C.l0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        eg.t2 t2Var = this.b;
        if (t2Var == null) {
            return 1;
        }
        return (t2Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        eg.t2 t2Var = this.b;
        if (t2Var == null) {
            return 1;
        }
        return (t2Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        float dp = AndroidUtilities.dp(52.0f);
        a0 a0Var = this.h;
        a0Var.setTopPadding(dp);
        a0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void set(eg.t2 t2Var) {
        if (t2Var == null) {
            return;
        }
        this.b = t2Var;
        setVisibility(0);
        this.B = false;
        a0 a0Var = this.h;
        a0Var.G = true;
        getLocationOnScreen(this.v);
        this.a.getLocationOnScreen(this.w);
        t2Var.getLocationOnScreen(this.x);
        MediaController.CropState cropState = t2Var.D0;
        if (cropState == null) {
            cropState = null;
        }
        a0Var.p(t2Var.getOrientation(), this.y, cropState);
        float rotation = a0Var.getRotation();
        zf.e eVar = this.n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.z5 z5Var = this.c;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            eVar.setRotated(cropState.transformRotation != 0);
            eVar.setMirrored(cropState.mirrored);
            z5Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            z5Var.getClass();
            z5Var.d(0.0f, false);
        }
        a0Var.r(false);
        e0 e0Var = this.e;
        e0Var.setVisibility(0);
        e0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.s - f10) < 0.001f) {
            return;
        }
        this.s = f10;
        this.e.invalidate();
        a0 a0Var = this.h;
        CropAreaView cropAreaView = a0Var.a;
        CropAreaView cropAreaView2 = a0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
