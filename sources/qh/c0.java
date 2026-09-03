package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.xe0;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class c0 extends FrameLayout {
    public final i5 a;
    public final org.telegram.ui.Components.z5 b;
    public final org.telegram.ui.Components.z5 c;
    public final b0 d;
    public final FrameLayout e;
    public final a0 f;
    public final zf.e h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] v;
    public final zf.f w;
    public r6 x;
    public boolean y;

    public c0(Context context, i5 i5Var) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.v = new int[2];
        this.w = new zf.f();
        this.a = i5Var;
        b0 b0Var = new b0(this, context);
        this.d = b0Var;
        pr prVar = pr.h;
        this.b = new org.telegram.ui.Components.z5(b0Var, 0L, 320L, prVar);
        this.c = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        a0 a0Var = new a0(this, context, 0);
        this.f = a0Var;
        a0Var.setListener(new oh.h4(this, 11));
        addView(a0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        zf.e eVar = new zf.e(context);
        this.h = eVar;
        eVar.setListener(new xe0(1, this));
        frameLayout.addView(eVar, k7.c6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, k7.c6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        yh.p(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.k6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, k7.c6.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.z
            public final /* synthetic */ c0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((k9) this.b).B.l0(-1, false, true);
                        break;
                    case 1:
                        c0 c0Var = this.b;
                        c0Var.f.l(true);
                        zf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        break;
                    default:
                        c0 c0Var2 = this.b;
                        r6 r6Var = c0Var2.x;
                        if (r6Var != null) {
                            r6Var.m0 = new MediaController.CropState();
                            c0Var2.f.b(c0Var2.x.m0);
                            r6 r6Var2 = c0Var2.x;
                            r6Var2.m0.orientation = r6Var2.Q;
                        }
                        ((k9) c0Var2).B.l0(-1, false, true);
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
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: qh.z
            public final /* synthetic */ c0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((k9) this.b).B.l0(-1, false, true);
                        break;
                    case 1:
                        c0 c0Var = this.b;
                        c0Var.f.l(true);
                        zf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        break;
                    default:
                        c0 c0Var2 = this.b;
                        r6 r6Var = c0Var2.x;
                        if (r6Var != null) {
                            r6Var.m0 = new MediaController.CropState();
                            c0Var2.f.b(c0Var2.x.m0);
                            r6 r6Var2 = c0Var2.x;
                            r6Var2.m0.orientation = r6Var2.Q;
                        }
                        ((k9) c0Var2).B.l0(-1, false, true);
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
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: qh.z
            public final /* synthetic */ c0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((k9) this.b).B.l0(-1, false, true);
                        break;
                    case 1:
                        c0 c0Var = this.b;
                        c0Var.f.l(true);
                        zf.e eVar2 = c0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        c0Var.d.invalidate();
                        break;
                    default:
                        c0 c0Var2 = this.b;
                        r6 r6Var = c0Var2.x;
                        if (r6Var != null) {
                            r6Var.m0 = new MediaController.CropState();
                            c0Var2.f.b(c0Var2.x.m0);
                            r6 r6Var2 = c0Var2.x;
                            r6Var2.m0.orientation = r6Var2.Q;
                        }
                        ((k9) c0Var2).B.l0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        r6 r6Var = this.x;
        if (r6Var == null) {
            return 1;
        }
        int i10 = r6Var.Q;
        i5 i5Var = this.a;
        return (i10 == 90 || i10 == 270) ? i5Var.getContentWidth() : i5Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        r6 r6Var = this.x;
        if (r6Var == null) {
            return 1;
        }
        int i10 = r6Var.Q;
        i5 i5Var = this.a;
        return (i10 == 90 || i10 == 270) ? i5Var.getContentHeight() : i5Var.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        this.f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z4, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.r - f10) < 0.001f) {
            return;
        }
        this.r = f10;
        b0 b0Var = this.d;
        b0Var.setAlpha(f10);
        b0Var.invalidate();
        a0 a0Var = this.f;
        CropAreaView cropAreaView = a0Var.a;
        CropAreaView cropAreaView2 = a0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(r6 r6Var) {
        if (r6Var == null) {
            return;
        }
        this.x = r6Var;
        this.y = false;
        a0 a0Var = this.f;
        a0Var.G = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.v;
        i5 i5Var = this.a;
        i5Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = r6Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        a0Var.p(r6Var.Q, this.w, cropState);
        float rotation = a0Var.getRotation();
        zf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.z5 z5Var = this.b;
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
        this.c.d(r5.i, true);
        b0 b0Var = this.d;
        b0Var.setVisibility(0);
        b0Var.invalidate();
        i5Var.setCropEditorDrawing(this);
    }
}
