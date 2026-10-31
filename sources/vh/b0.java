package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.ye;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.yd0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class b0 extends FrameLayout {
    public boolean D;
    public final k4 a;
    public final org.telegram.ui.Components.t5 b;
    public final org.telegram.ui.Components.t5 c;
    public final a0 d;
    public final FrameLayout e;
    public final z f;
    public final eg.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final eg.g x;
    public n5 y;

    public b0(Context context, k4 k4Var) {
        super(context);
        this.r = 0.0f;
        final int i10 = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new eg.g();
        this.a = k4Var;
        a0 a0Var = new a0(this, context);
        this.d = a0Var;
        gr grVar = gr.h;
        this.b = new org.telegram.ui.Components.t5(a0Var, 0L, 320L, grVar);
        this.c = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        final int i11 = 0;
        z zVar = new z(this, context, i11);
        this.f = zVar;
        zVar.setListener(new s9.g(this));
        addView(zVar);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.b6.e(-1, -1, zs.E1));
        eg.f fVar = new eg.f(context);
        this.h = fVar;
        final int i12 = 1;
        fVar.setListener(new yd0(i12, this));
        frameLayout.addView(fVar, w7.b6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        sc.e.t(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131752589, null));
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        frameLayout2.addView(textView, w7.b6.e(-2, -1, zs.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: vh.y
            public final /* synthetic */ b0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((z7) this.b).E.k0(-1, false, true);
                        break;
                    case 1:
                        b0 b0Var = this.b;
                        b0Var.f.l(true);
                        eg.f fVar2 = b0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        b0Var.d.invalidate();
                        break;
                    default:
                        b0 b0Var2 = this.b;
                        n5 n5Var = b0Var2.y;
                        if (n5Var != null) {
                            n5Var.m0 = new ye();
                            b0Var2.f.b(b0Var2.y.m0);
                            n5 n5Var2 = b0Var2.y;
                            n5Var2.m0.z = n5Var2.Q;
                        }
                        ((z7) b0Var2).E.k0(-1, false, true);
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
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: vh.y
            public final /* synthetic */ b0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((z7) this.b).E.k0(-1, false, true);
                        break;
                    case 1:
                        b0 b0Var = this.b;
                        b0Var.f.l(true);
                        eg.f fVar2 = b0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        b0Var.d.invalidate();
                        break;
                    default:
                        b0 b0Var2 = this.b;
                        n5 n5Var = b0Var2.y;
                        if (n5Var != null) {
                            n5Var.m0 = new ye();
                            b0Var2.f.b(b0Var2.y.m0);
                            n5 n5Var2 = b0Var2.y;
                            n5Var2.m0.z = n5Var2.Q;
                        }
                        ((z7) b0Var2).E.k0(-1, false, true);
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
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: vh.y
            public final /* synthetic */ b0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((z7) this.b).E.k0(-1, false, true);
                        break;
                    case 1:
                        b0 b0Var = this.b;
                        b0Var.f.l(true);
                        eg.f fVar2 = b0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        b0Var.d.invalidate();
                        break;
                    default:
                        b0 b0Var2 = this.b;
                        n5 n5Var = b0Var2.y;
                        if (n5Var != null) {
                            n5Var.m0 = new ye();
                            b0Var2.f.b(b0Var2.y.m0);
                            n5 n5Var2 = b0Var2.y;
                            n5Var2.m0.z = n5Var2.Q;
                        }
                        ((z7) b0Var2).E.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        n5 n5Var = this.y;
        if (n5Var == null) {
            return 1;
        }
        int i10 = n5Var.Q;
        k4 k4Var = this.a;
        return (i10 == 90 || i10 == 270) ? k4Var.getContentWidth() : k4Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        n5 n5Var = this.y;
        if (n5Var == null) {
            return 1;
        }
        int i10 = n5Var.Q;
        k4 k4Var = this.a;
        return (i10 == 90 || i10 == 270) ? k4Var.getContentHeight() : k4Var.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f.setBottomPadding(org.telegram.messenger.i0.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.r - f7) < 0.001f) {
            return;
        }
        this.r = f7;
        a0 a0Var = this.d;
        a0Var.setAlpha(f7);
        a0Var.invalidate();
        z zVar = this.f;
        CropAreaView cropAreaView = zVar.a;
        CropAreaView cropAreaView2 = zVar.a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(n5 n5Var) {
        if (n5Var == null) {
            return;
        }
        this.y = n5Var;
        this.D = false;
        z zVar = this.f;
        zVar.J = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        k4 k4Var = this.a;
        k4Var.getLocationOnScreen(iArr);
        ye yeVar = n5Var.m0;
        if (yeVar == null) {
            yeVar = null;
        }
        zVar.p(n5Var.Q, this.x, yeVar);
        float rotation = zVar.getRotation();
        eg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.t5 t5Var = this.b;
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
        this.c.e(true, r5.i);
        a0 a0Var = this.d;
        a0Var.setVisibility(0);
        a0Var.invalidate();
        k4Var.setCropEditorDrawing(this);
    }
}
