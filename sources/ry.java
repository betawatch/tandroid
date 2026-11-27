// default package

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ry implements TextWatcher {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ry(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                View[] viewArr = (View[]) this.b;
                try {
                    boolean z = ((long) Integer.parseInt(editable.toString())) >= ((uy) obj).g2.e();
                    viewArr[0].animate().alpha(z ? 1.0f : 0.6f).setDuration(180L).start();
                    viewArr[0].setEnabled(z);
                    viewArr[0].setClickable(z);
                    break;
                } catch (Throwable th) {
                    cc4.g(th, true);
                    return;
                }
            case 1:
                a72 a72Var = (a72) ((t20) obj).e;
                x62 x62Var = (x62) this.b;
                if (x62Var.getTag() == null) {
                    f89 L = a72Var.s.L(a72Var.q0);
                    if (L != null && a72Var.y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        pv3.l(editable, x62Var.getEditField().getPaint().getFontMetricsInt(), false);
                        a72Var.y.setDirection(1);
                        a72Var.y.setDelegate(x62Var);
                        a72Var.y.setTranslationY(L.a.getY());
                        a72Var.y.d();
                    }
                    a72Var.Q = editable;
                    if (L != null) {
                        a72Var.h0(a72Var.q0, L.a);
                    }
                    a72Var.S();
                    break;
                }
                break;
            case 2:
                a72 a72Var2 = (a72) ((t20) obj).e;
                qob qobVar = a72Var2.s;
                y62 y62Var = (y62) this.b;
                View G = qobVar.G(y62Var);
                f89 U = G != null ? qobVar.U(G) : null;
                if (U != null) {
                    View view = U.a;
                    int b2 = U.b();
                    int i = b2 - a72Var2.u0;
                    if (i >= 0 && i < a72Var2.L.length) {
                        if (a72Var2.y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            pv3.l(editable, y62Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y = (view.getY() - hl.L(166.0f)) + view.getMeasuredHeight();
                            if (y > 0.0f) {
                                a72Var2.y.setDirection(0);
                                a72Var2.y.setTranslationY(y);
                            } else {
                                a72Var2.y.setDirection(1);
                                a72Var2.y.setTranslationY(view.getY());
                            }
                            a72Var2.y.setDelegate(y62Var);
                            a72Var2.y.d();
                        }
                        a72Var2.L[i] = editable;
                        a72Var2.h0(b2, y62Var);
                        a72Var2.S();
                        break;
                    }
                }
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((nn0) obj).run();
                break;
            case 4:
                qm2 qm2Var = (qm2) obj;
                sm2 sm2Var = qm2Var.f;
                if (!qm2Var.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b3 = ete.b(Integer.parseInt(editable.toString()), 0, jn7.d4);
                    byte b4 = qm2Var.d;
                    int argb = b4 != 1 ? b4 != 2 ? Color.argb(Color.alpha(sm2Var.p1), b3, Color.green(sm2Var.p1), Color.blue(sm2Var.p1)) : Color.argb(Color.alpha(sm2Var.p1), Color.red(sm2Var.p1), Color.green(sm2Var.p1), b3) : Color.argb(Color.alpha(sm2Var.p1), Color.red(sm2Var.p1), b3, Color.blue(sm2Var.p1));
                    int i2 = sm2.t1;
                    sm2Var.E0(argb, 5);
                    break;
                }
                break;
            case 5:
                break;
            case 6:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.y == 1 && !passcodeActivity.F) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.b).get()) {
                            passcodeActivity.s.callOnClick();
                        }
                        hl.T3(passcodeActivity.s, false, 0.1f, true, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        hl.T3(passcodeActivity.s, true, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 7:
                wh8 wh8Var = ((uh8) obj).d;
                rh8 rh8Var = (rh8) this.b;
                if (rh8Var.getTag() == null) {
                    f89 L2 = wh8Var.c.L(wh8Var.j0);
                    if (L2 != null && wh8Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        pv3.l(editable, rh8Var.getEditField().getPaint().getFontMetricsInt(), false);
                        wh8Var.R.setDirection(1);
                        wh8Var.R.setDelegate(rh8Var);
                        wh8Var.R.setTranslationY(L2.a.getY());
                        wh8Var.R.d();
                    }
                    wh8Var.F = editable;
                    if (L2 != null) {
                        wh8Var.s0(wh8Var.j0, L2.a);
                    }
                    wh8Var.j0();
                    break;
                }
                break;
            case 8:
                wh8 wh8Var2 = ((uh8) obj).d;
                sh8 sh8Var = (sh8) this.b;
                if (sh8Var.getTag() == null) {
                    f89 L3 = wh8Var2.c.L(wh8Var2.j0);
                    if (L3 != null && wh8Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        pv3.l(editable, sh8Var.getEditField().getPaint().getFontMetricsInt(), false);
                        wh8Var2.R.setDirection(1);
                        wh8Var2.R.setDelegate(sh8Var);
                        wh8Var2.R.setTranslationY(L3.a.getY());
                        wh8Var2.R.d();
                    }
                    wh8Var2.G = editable;
                    if (L3 != null) {
                        wh8Var2.s0(wh8Var2.k0, L3.a);
                    }
                    wh8Var2.j0();
                    break;
                }
                break;
            case 9:
                wh8 wh8Var3 = ((uh8) obj).d;
                qob qobVar2 = wh8Var3.c;
                th8 th8Var = (th8) this.b;
                View G2 = qobVar2.G(th8Var);
                f89 U2 = G2 != null ? qobVar2.U(G2) : null;
                if (U2 != null) {
                    View view2 = U2.a;
                    int b5 = U2.b() - wh8Var3.o0;
                    if (b5 >= 0 && b5 < wh8Var3.w.length) {
                        if (wh8Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            pv3.l(editable, th8Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y2 = (view2.getY() - hl.L(166.0f)) + view2.getMeasuredHeight();
                            if (y2 > 0.0f) {
                                wh8Var3.R.setDirection(0);
                                wh8Var3.R.setTranslationY(y2);
                            } else {
                                wh8Var3.R.setDirection(1);
                                wh8Var3.R.setTranslationY(view2.getY());
                            }
                            wh8Var3.R.setDelegate(th8Var);
                            wh8Var3.R.d();
                        }
                        wh8Var3.w[b5] = editable;
                        wh8Var3.s0(b5, th8Var);
                        wh8Var3.j0();
                        break;
                    }
                }
                break;
            case 10:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.b).getAlpha() > 0.0f) {
                    hl.r(runnableArr[0]);
                    hl.c3(runnableArr[0]);
                    break;
                }
                break;
            case 11:
                ((String[]) this.b)[0] = editable.toString();
                ((d34) obj).g3.O(true);
                break;
            case 12:
                ((String[]) this.b)[0] = editable.toString();
                ((d34) obj).g3.O(true);
                break;
            case 13:
                ((String[]) this.b)[0] = editable.toString();
                ((d34) obj).g3.O(true);
                break;
            case 14:
                ((String[]) this.b)[0] = editable.toString();
                ((d34) obj).g3.O(true);
                break;
            case 15:
                ((String[]) this.b)[0] = editable.toString();
                ((d34) obj).g3.O(true);
                break;
            case 16:
                ((String[]) this.b)[0] = editable.toString();
                ((d34) obj).g3.O(true);
                break;
            case 17:
                ((String[]) this.b)[0] = editable.toString();
                ((d34) obj).g3.O(true);
                break;
            default:
                ((z3b) this.b).run();
                r8b r8bVar = (r8b) obj;
                zt3 zt3Var = r8bVar.T1;
                if (!r8bVar.X1) {
                    if (!r8bVar.Y1 || editable == null) {
                        r8bVar.Z0(editable != null ? editable.toString() : null);
                        break;
                    } else {
                        String substring = editable.toString().substring(8);
                        r8bVar.X1 = true;
                        zt3Var.d.setText(substring);
                        yt3 yt3Var = zt3Var.d;
                        yt3Var.setSelection(0, yt3Var.getText().length());
                        r8bVar.X1 = false;
                        r8bVar.Y1 = false;
                        r8bVar.Z0(substring);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 4:
                this.b = charSequence.toString();
                break;
            case 5:
                EditText editText = (EditText) this.b;
                editText.post(new ls5(this, editText, (AtomicReference) this.c, (byte) 23));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                break;
            default:
                r8b r8bVar = (r8b) this.c;
                if (!r8bVar.X1) {
                    boolean z = false;
                    if (charSequence != null && i == 8 && charSequence.subSequence(0, i).toString().equals("https://") && charSequence.length() >= (i4 = i3 + i) && charSequence.subSequence(i, i4).toString().startsWith("https://")) {
                        z = true;
                    }
                    r8bVar.Y1 = z;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ry(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ry(qm2 qm2Var) {
        this.a = (byte) 4;
        this.c = qm2Var;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void H(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void I(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void J(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }
}
