package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.ye;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.yd0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class g0 extends FrameLayout {
    public final eg.g D;
    public boolean E;
    public final k4 a;
    public jg.e2 b;
    public final org.telegram.ui.Components.t5 c;
    public final org.telegram.ui.Components.t5 d;
    public final f0 e;
    public final FrameLayout f;
    public final z h;
    public final eg.f n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public g0(Context context, k4 k4Var) {
        super(context);
        this.s = 0.0f;
        final int i10 = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.D = new eg.g();
        this.a = k4Var;
        f0 f0Var = new f0(this, context);
        this.e = f0Var;
        gr grVar = gr.h;
        this.c = new org.telegram.ui.Components.t5(f0Var, 0L, 320L, grVar);
        this.d = new org.telegram.ui.Components.t5(f0Var, 0L, 320L, grVar);
        final int i11 = 1;
        z zVar = new z(this, context, i11);
        this.h = zVar;
        zVar.setListener(new e0(this));
        addView(zVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, w7.b6.e(-1, -1, zs.E1));
        eg.f fVar = new eg.f(context);
        this.n = fVar;
        fVar.setListener(new yd0(i10, this));
        frameLayout.addView(fVar, w7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        sc.e.t(textView, 1, 14.0f);
        final int i12 = 0;
        textView.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131752589, null));
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView, w7.b6.e(-2, -1, zs.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: vh.c0
            public final /* synthetic */ g0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((a8) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        g0 g0Var = this.b;
                        g0Var.h.l(true);
                        eg.f fVar2 = g0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        g0 g0Var2 = this.b;
                        jg.e2 e2Var = g0Var2.b;
                        if (e2Var != null) {
                            e2Var.G0 = new ye();
                            g0Var2.h.b(g0Var2.b.G0);
                            jg.e2 e2Var2 = g0Var2.b;
                            e2Var2.G0.z = e2Var2.getOrientation();
                            g0Var2.b.k();
                            g0Var2.b.requestLayout();
                            g0Var2.b.z0.requestLayout();
                            g0Var2.b.z0.invalidate();
                            g0Var2.b.z0.post(new d0(g0Var2, 0));
                        }
                        ((a8) g0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(cd.L0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView2, w7.b6.e(-2, -1, zs.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: vh.c0
            public final /* synthetic */ g0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((a8) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        g0 g0Var = this.b;
                        g0Var.h.l(true);
                        eg.f fVar2 = g0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        g0 g0Var2 = this.b;
                        jg.e2 e2Var = g0Var2.b;
                        if (e2Var != null) {
                            e2Var.G0 = new ye();
                            g0Var2.h.b(g0Var2.b.G0);
                            jg.e2 e2Var2 = g0Var2.b;
                            e2Var2.G0.z = e2Var2.getOrientation();
                            g0Var2.b.k();
                            g0Var2.b.requestLayout();
                            g0Var2.b.z0.requestLayout();
                            g0Var2.b.z0.invalidate();
                            g0Var2.b.z0.post(new d0(g0Var2, 0));
                        }
                        ((a8) g0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(cd.L0(2131744706, null));
        textView3.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView3, w7.b6.e(-2, -1, zs.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: vh.c0
            public final /* synthetic */ g0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((a8) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        g0 g0Var = this.b;
                        g0Var.h.l(true);
                        eg.f fVar2 = g0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        g0 g0Var2 = this.b;
                        jg.e2 e2Var = g0Var2.b;
                        if (e2Var != null) {
                            e2Var.G0 = new ye();
                            g0Var2.h.b(g0Var2.b.G0);
                            jg.e2 e2Var2 = g0Var2.b;
                            e2Var2.G0.z = e2Var2.getOrientation();
                            g0Var2.b.k();
                            g0Var2.b.requestLayout();
                            g0Var2.b.z0.requestLayout();
                            g0Var2.b.z0.invalidate();
                            g0Var2.b.z0.post(new d0(g0Var2, 0));
                        }
                        ((a8) g0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        jg.e2 e2Var = this.b;
        if (e2Var == null) {
            return 1;
        }
        return (e2Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        jg.e2 e2Var = this.b;
        if (e2Var == null) {
            return 1;
        }
        return (e2Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float L = org.telegram.messenger.i0.L(52.0f);
        z zVar = this.h;
        zVar.setTopPadding(L);
        zVar.setBottomPadding(org.telegram.messenger.i0.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(jg.e2 e2Var) {
        if (e2Var == null) {
            return;
        }
        this.b = e2Var;
        setVisibility(0);
        this.E = false;
        z zVar = this.h;
        zVar.J = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        e2Var.getLocationOnScreen(this.y);
        ye yeVar = e2Var.G0;
        if (yeVar == null) {
            yeVar = null;
        }
        zVar.p(e2Var.getOrientation(), this.D, yeVar);
        float rotation = zVar.getRotation();
        eg.f fVar = this.n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.t5 t5Var = this.c;
        if (yeVar != null) {
            fVar.b(yeVar.d);
            fVar.setRotated(yeVar.k != 0);
            fVar.setMirrored(yeVar.l);
            t5Var.f(yeVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            t5Var.getClass();
            t5Var.e(false, 0.0f);
        }
        zVar.r(false);
        f0 f0Var = this.e;
        f0Var.setVisibility(0);
        f0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.s - f7) < 0.001f) {
            return;
        }
        this.s = f7;
        this.e.invalidate();
        z zVar = this.h;
        CropAreaView cropAreaView = zVar.a;
        CropAreaView cropAreaView2 = zVar.a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
