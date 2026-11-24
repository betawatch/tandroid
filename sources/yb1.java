// default package

import android.content.Context;
import android.os.SystemClock;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.io.File;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yb1 {
    public final xb1 a;
    public final u3b b;
    public jb4 c;
    public Runnable d;
    public tb1 e;
    public cc1 f;
    public float i;
    public final float[] g = new float[2];
    public final float[] h = new float[3];
    public final o1 j = new o1(this, 13);

    public yb1(File file, xb1 xb1Var) {
        this.a = xb1Var;
        this.b = new u3b(new wk4(file.getAbsolutePath(), file, (byte) 29), xb1Var.I(), xb1Var.F(), new nv0(this, (byte) 17));
    }

    public static void e(View view, float[] fArr) {
        while (view != null) {
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            if (!(view.getParent() instanceof View)) {
                return;
            }
            view = (View) view.getParent();
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
        }
    }

    public static void g(cc1 cc1Var, float[] fArr) {
        Layout layout = cc1Var.getEditText().getLayout();
        float extendedPaddingTop = (layout == null || layout.getLineCount() <= 0) ? r0.getExtendedPaddingTop() : r0.getBaseline() - layout.getLineBaseline(0);
        fArr[0] = ((r0.getCompoundPaddingLeft() + r0.getLeft()) - r0.getScrollX()) - (cc1Var.getWidth() / 2.0f);
        fArr[1] = (r0.getTop() + extendedPaddingTop) - (cc1Var.getHeight() / 2.0f);
        fArr[2] = (r0.getWidth() - r0.getCompoundPaddingLeft()) - r0.getCompoundPaddingRight();
    }

    public final void a() {
        if (c()) {
            xb1 xb1Var = this.a;
            cc1 p = xb1Var.p();
            p.setLoading(true);
            u3b u3bVar = this.b;
            Objects.requireNonNull(u3bVar);
            p.setPendingProvider(new sg0(u3bVar, (byte) 27));
            xb1Var.J(p);
            u3bVar.i();
            u3bVar.n = new vb1(xb1Var, (byte) 0);
            wb1 wb1Var = new wb1(new TextPaint(p.getEditText().getPaint()), (byte) 0);
            float lineWidth = p.getLineWidth() * 0.96f;
            u3bVar.u = wb1Var;
            u3bVar.v = lineWidth;
            jb4 jb4Var = this.c;
            if (jb4Var != null) {
                jb4Var.f = null;
                m21 m21Var = (m21) jb4Var.g;
                if (m21Var != null) {
                    m21Var.b();
                    jb4Var.g = null;
                }
                this.c = null;
            }
            Context context = p.getContext();
            FrameLayout m = xb1Var.m();
            wjb o = xb1Var.o();
            xl3 xl3Var = u3bVar.f;
            jb4 jb4Var2 = new jb4(context, m, o, xl3Var == null ? "" : jm3.r(xl3Var.u()), new q21(this, p, (byte) 15));
            this.c = jb4Var2;
            this.b.h(xb1Var.I(), xb1Var.F(), new mv6(this, jb4Var2, p, (byte) 14));
        }
    }

    public final void b(cc1 cc1Var) {
        xb1 xb1Var = this.a;
        cc1Var.setPositionProvider(new vb1(xb1Var, (byte) 1));
        cc1Var.setOnEditing(new x0(this, cc1Var, (byte) 12));
        cc1Var.setOnSeek(new be2(xb1Var, (byte) 13));
        cc1Var.setRangeProvider(new i4d(this));
    }

    public final boolean c() {
        return this.b.f != null && this.a.t() == null;
    }

    public final float d(cc1 cc1Var, float f, float f2) {
        float[] fArr = this.g;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        e(this.e, fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        fArr[0] = f;
        fArr[1] = f2;
        e(cc1Var, fArr);
        fArr[1] = fArr[1] - f4;
        float f5 = fArr[0] - f3;
        fArr[0] = f5;
        return f5;
    }

    public final void f(cc1 cc1Var) {
        tb1 tb1Var = this.e;
        o1 o1Var = this.j;
        if (tb1Var != null) {
            tb1Var.b();
            this.e.removeCallbacks(o1Var);
        }
        this.f = cc1Var;
        tb1 tb1Var2 = this.e;
        if (cc1Var == null) {
            if (tb1Var2 != null) {
                tb1Var2.e(null, null);
                this.e.setVisibility(8);
                return;
            }
            return;
        }
        final byte b = 0;
        if (tb1Var2 == null) {
            tb1 tb1Var3 = new tb1(cc1Var.getContext());
            this.e = tb1Var3;
            tb1Var3.setOnClick(new p8c(this) { // from class: ub1
                public final /* synthetic */ yb1 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b2 = b;
                    yb1 yb1Var = this.b;
                    switch (b2) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            cc1 cc1Var2 = yb1Var.f;
                            if (cc1Var2 != null && yb1Var.e != null && cc1Var2.x(intValue) != null) {
                                yb1Var.e.b();
                                String charSequence = cc1Var2.getText().toString();
                                yb1Var.i = cc1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                yb1.g(cc1Var2, fArr);
                                r3b w = cc1Var2.G0 ? cc1Var2.w(intValue) : null;
                                if (w != null) {
                                    cc1Var2.E0 = w;
                                    cc1Var2.H0 = true;
                                    CharSequence charSequence2 = w.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    cc1Var2.setText(charSequence2);
                                    cc1Var2.H0 = false;
                                    cc1Var2.getEditText().setSelection(cc1Var2.getEditText().length());
                                    p8c p8cVar = cc1Var2.M0;
                                    if (p8cVar != null) {
                                        bc1 bc1Var = cc1Var2.O0;
                                        long j = w.a;
                                        if (bc1Var != null) {
                                            j = Math.max(j, ((yb1) ((i4d) bc1Var).a).a.I());
                                        }
                                        p8cVar.a(Long.valueOf(j));
                                    }
                                    tb1 tb1Var4 = yb1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = cc1Var2.x(-1);
                                    CharSequence x2 = cc1Var2.x(1);
                                    tb1Var4.b();
                                    tb1Var4.K = f;
                                    tb1Var4.L = f2;
                                    tb1Var4.M = f3;
                                    sb1[] sb1VarArr = tb1Var4.a;
                                    sb1 sb1Var = sb1VarArr[intValue < 0 ? (char) 0 : (char) 1];
                                    for (sb1 sb1Var2 : sb1VarArr) {
                                        tgb tgbVar = sb1Var2.h;
                                        sb1Var2.i = tgbVar;
                                        sb1Var2.k = tgbVar != null;
                                        sb1Var2.j = sb1Var2.e.c;
                                    }
                                    tb1Var4.S = sb1Var.g;
                                    tb1Var4.T = charSequence != null ? charSequence.toString() : "";
                                    sb1VarArr[0].b(x == null ? null : x.toString());
                                    sb1VarArr[1].b(x2 != null ? x2.toString() : null);
                                    tb1Var4.R = sb1Var;
                                    tb1Var4.Q = SystemClock.elapsedRealtime();
                                    tb1Var4.invalidate();
                                    cc1Var2.getEditText().setAlpha(0.0f);
                                    cc1Var2.setSelectionWidth(yb1Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f4 = (Float) obj;
                            cc1 cc1Var3 = yb1Var.f;
                            if (cc1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    cc1Var3.getEditText().setAlpha(1.0f);
                                    cc1Var3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    cc1Var3.setSelectionWidth(gl.R1(yb1Var.i, cc1Var3.getMeasuredWidth(), f4.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            final byte b2 = 1;
            this.e.setOnSwitchProgress(new p8c(this) { // from class: ub1
                public final /* synthetic */ yb1 b;

                {
                    this.b = this;
                }

                @Override // p8c
                public final void a(Object obj) {
                    byte b22 = b2;
                    yb1 yb1Var = this.b;
                    switch (b22) {
                        case 0:
                            int intValue = ((Integer) obj).intValue();
                            cc1 cc1Var2 = yb1Var.f;
                            if (cc1Var2 != null && yb1Var.e != null && cc1Var2.x(intValue) != null) {
                                yb1Var.e.b();
                                String charSequence = cc1Var2.getText().toString();
                                yb1Var.i = cc1Var2.getMeasuredWidth();
                                float[] fArr = new float[3];
                                yb1.g(cc1Var2, fArr);
                                r3b w = cc1Var2.G0 ? cc1Var2.w(intValue) : null;
                                if (w != null) {
                                    cc1Var2.E0 = w;
                                    cc1Var2.H0 = true;
                                    CharSequence charSequence2 = w.c;
                                    if (charSequence2 == null) {
                                        charSequence2 = "";
                                    }
                                    cc1Var2.setText(charSequence2);
                                    cc1Var2.H0 = false;
                                    cc1Var2.getEditText().setSelection(cc1Var2.getEditText().length());
                                    p8c p8cVar = cc1Var2.M0;
                                    if (p8cVar != null) {
                                        bc1 bc1Var = cc1Var2.O0;
                                        long j = w.a;
                                        if (bc1Var != null) {
                                            j = Math.max(j, ((yb1) ((i4d) bc1Var).a).a.I());
                                        }
                                        p8cVar.a(Long.valueOf(j));
                                    }
                                    tb1 tb1Var4 = yb1Var.e;
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    CharSequence x = cc1Var2.x(-1);
                                    CharSequence x2 = cc1Var2.x(1);
                                    tb1Var4.b();
                                    tb1Var4.K = f;
                                    tb1Var4.L = f2;
                                    tb1Var4.M = f3;
                                    sb1[] sb1VarArr = tb1Var4.a;
                                    sb1 sb1Var = sb1VarArr[intValue < 0 ? (char) 0 : (char) 1];
                                    for (sb1 sb1Var2 : sb1VarArr) {
                                        tgb tgbVar = sb1Var2.h;
                                        sb1Var2.i = tgbVar;
                                        sb1Var2.k = tgbVar != null;
                                        sb1Var2.j = sb1Var2.e.c;
                                    }
                                    tb1Var4.S = sb1Var.g;
                                    tb1Var4.T = charSequence != null ? charSequence.toString() : "";
                                    sb1VarArr[0].b(x == null ? null : x.toString());
                                    sb1VarArr[1].b(x2 != null ? x2.toString() : null);
                                    tb1Var4.R = sb1Var;
                                    tb1Var4.Q = SystemClock.elapsedRealtime();
                                    tb1Var4.invalidate();
                                    cc1Var2.getEditText().setAlpha(0.0f);
                                    cc1Var2.setSelectionWidth(yb1Var.i);
                                    break;
                                }
                            }
                            break;
                        default:
                            Float f4 = (Float) obj;
                            cc1 cc1Var3 = yb1Var.f;
                            if (cc1Var3 != null) {
                                if (f4.floatValue() >= 1.0f) {
                                    cc1Var3.getEditText().setAlpha(1.0f);
                                    cc1Var3.setSelectionWidth(-1.0f);
                                    break;
                                } else {
                                    cc1Var3.setSelectionWidth(gl.R1(yb1Var.i, cc1Var3.getMeasuredWidth(), f4.floatValue()));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            this.a.D().addView(this.e, nme.c(-1.0f, -1));
        }
        this.e.setVisibility(0);
        o1Var.run();
    }
}
