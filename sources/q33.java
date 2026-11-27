// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class q33 extends FrameLayout {
    public final u33 E;
    public boolean F;
    public final gbb a;
    public v98 b;
    public final mm c;
    public final mm d;
    public final p33 e;
    public final FrameLayout f;
    public final i33 h;
    public final t33 n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public q33(Context context, gbb gbbVar) {
        super(context);
        this.s = 0.0f;
        final byte b = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new u33();
        this.a = gbbVar;
        p33 p33Var = new p33(this, context);
        this.e = p33Var;
        k43 k43Var = k43.h;
        this.c = new mm(p33Var, 0L, 320L, k43Var);
        this.d = new mm(p33Var, 0L, 320L, k43Var);
        final byte b2 = 1;
        i33 i33Var = new i33(this, context, b2);
        this.h = i33Var;
        i33Var.setListener(new zm9((Object) this, (byte) 24));
        addView(i33Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, tre.e(-1, -1, jn7.D1));
        t33 t33Var = new t33(context);
        this.n = t33Var;
        t33Var.setListener(new j33(this, b2));
        frameLayout.addView(t33Var, tre.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, tre.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        bs2.t(textView, 1, 14.0f);
        final byte b3 = 0;
        textView.setBackground(aob.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(ob6.M0(2131752570, null));
        textView.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        frameLayout2.addView(textView, tre.e(-2, -1, jn7.z1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: o33
            public final /* synthetic */ q33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                q33 q33Var = this.b;
                switch (b4) {
                    case 0:
                        ((dbb) q33Var).G.k0(-1, false, true);
                        break;
                    case 1:
                        q33Var.h.l(true);
                        t33 t33Var2 = q33Var.n;
                        t33Var2.setRotated(false);
                        t33Var2.setMirrored(false);
                        t33Var2.b(0.0f);
                        break;
                    default:
                        v98 v98Var = q33Var.b;
                        if (v98Var != null) {
                            v98Var.I0 = new fo6();
                            q33Var.h.a(q33Var.b.I0);
                            v98 v98Var2 = q33Var.b;
                            v98Var2.I0.z = v98Var2.getOrientation();
                            q33Var.b.k();
                            q33Var.b.requestLayout();
                            q33Var.b.B0.requestLayout();
                            q33Var.b.B0.invalidate();
                            q33Var.b.B0.post(new vd2(q33Var, (byte) 21));
                        }
                        ((dbb) q33Var).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setBackground(aob.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(ob6.M0(2131751661, null));
        textView2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        frameLayout2.addView(textView2, tre.e(-2, -1, jn7.x1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: o33
            public final /* synthetic */ q33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                q33 q33Var = this.b;
                switch (b4) {
                    case 0:
                        ((dbb) q33Var).G.k0(-1, false, true);
                        break;
                    case 1:
                        q33Var.h.l(true);
                        t33 t33Var2 = q33Var.n;
                        t33Var2.setRotated(false);
                        t33Var2.setMirrored(false);
                        t33Var2.b(0.0f);
                        break;
                    default:
                        v98 v98Var = q33Var.b;
                        if (v98Var != null) {
                            v98Var.I0 = new fo6();
                            q33Var.h.a(q33Var.b.I0);
                            v98 v98Var2 = q33Var.b;
                            v98Var2.I0.z = v98Var2.getOrientation();
                            q33Var.b.k();
                            q33Var.b.requestLayout();
                            q33Var.b.B0.requestLayout();
                            q33Var.b.B0.invalidate();
                            q33Var.b.B0.post(new vd2(q33Var, (byte) 21));
                        }
                        ((dbb) q33Var).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(hl.o());
        textView3.setBackground(aob.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(ob6.M0(2131744342, null));
        textView3.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        frameLayout2.addView(textView3, tre.e(-2, -1, jn7.B1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: o33
            public final /* synthetic */ q33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                q33 q33Var = this.b;
                switch (b4) {
                    case 0:
                        ((dbb) q33Var).G.k0(-1, false, true);
                        break;
                    case 1:
                        q33Var.h.l(true);
                        t33 t33Var2 = q33Var.n;
                        t33Var2.setRotated(false);
                        t33Var2.setMirrored(false);
                        t33Var2.b(0.0f);
                        break;
                    default:
                        v98 v98Var = q33Var.b;
                        if (v98Var != null) {
                            v98Var.I0 = new fo6();
                            q33Var.h.a(q33Var.b.I0);
                            v98 v98Var2 = q33Var.b;
                            v98Var2.I0.z = v98Var2.getOrientation();
                            q33Var.b.k();
                            q33Var.b.requestLayout();
                            q33Var.b.B0.requestLayout();
                            q33Var.b.B0.invalidate();
                            q33Var.b.B0.post(new vd2(q33Var, (byte) 21));
                        }
                        ((dbb) q33Var).G.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        v98 v98Var = this.b;
        if (v98Var == null) {
            return 1;
        }
        return (v98Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        v98 v98Var = this.b;
        if (v98Var == null) {
            return 1;
        }
        return (v98Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float L = hl.L(52.0f);
        i33 i33Var = this.h;
        i33Var.setTopPadding(L);
        i33Var.setBottomPadding(hl.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void set(v98 v98Var) {
        if (v98Var == null) {
            return;
        }
        this.b = v98Var;
        setVisibility(0);
        this.F = false;
        i33 i33Var = this.h;
        i33Var.K = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        v98Var.getLocationOnScreen(this.y);
        fo6 fo6Var = v98Var.I0;
        if (fo6Var == null) {
            fo6Var = null;
        }
        i33Var.p(v98Var.getOrientation(), this.E, fo6Var);
        float rotation = i33Var.getRotation();
        t33 t33Var = this.n;
        t33Var.setRotation(rotation);
        mm mmVar = this.c;
        if (fo6Var != null) {
            t33Var.b(fo6Var.d);
            t33Var.setRotated(fo6Var.k != 0);
            t33Var.setMirrored(fo6Var.l);
            mmVar.f(fo6Var.l, false);
        } else {
            t33Var.b(0.0f);
            t33Var.setRotated(false);
            t33Var.setMirrored(false);
            mmVar.getClass();
            mmVar.e(false, 0.0f);
        }
        i33Var.r(false);
        p33 p33Var = this.e;
        p33Var.setVisibility(0);
        p33Var.invalidate();
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.s - f) < 0.001f) {
            return;
        }
        this.s = f;
        this.e.invalidate();
        i33 i33Var = this.h;
        CropAreaView cropAreaView = i33Var.a;
        CropAreaView cropAreaView2 = i33Var.a;
        cropAreaView.setDimAlpha(0.5f * f);
        cropAreaView2.setFrameAlpha(f);
        cropAreaView2.invalidate();
    }
}
