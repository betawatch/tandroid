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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qz implements TextWatcher {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qz(Object obj, Object obj2, byte b) {
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
                    boolean z = ((long) Integer.parseInt(editable.toString())) >= ((tz) obj).g2.e();
                    viewArr[0].animate().alpha(z ? 1.0f : 0.6f).setDuration(180L).start();
                    viewArr[0].setEnabled(z);
                    viewArr[0].setClickable(z);
                    break;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 1:
                v72 v72Var = (v72) ((s30) obj).e;
                s72 s72Var = (s72) this.b;
                if (s72Var.getTag() == null) {
                    u69 K = v72Var.s.K(v72Var.q0);
                    if (K != null && v72Var.y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        gw3.l(editable, s72Var.getEditField().getPaint().getFontMetricsInt(), false);
                        v72Var.y.setDirection(1);
                        v72Var.y.setDelegate(s72Var);
                        v72Var.y.setTranslationY(K.a.getY());
                        v72Var.y.d();
                    }
                    v72Var.Q = editable;
                    if (K != null) {
                        v72Var.i0(v72Var.q0, K.a);
                    }
                    v72Var.S();
                    break;
                }
                break;
            case 2:
                v72 v72Var2 = (v72) ((s30) obj).e;
                smb smbVar = v72Var2.s;
                t72 t72Var = (t72) this.b;
                View F = smbVar.F(t72Var);
                u69 T = F != null ? smbVar.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b2 = T.b();
                    int i = b2 - v72Var2.u0;
                    if (i >= 0 && i < v72Var2.L.length) {
                        if (v72Var2.y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            gw3.l(editable, t72Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y = (view.getY() - gm.L(166.0f)) + view.getMeasuredHeight();
                            if (y > 0.0f) {
                                v72Var2.y.setDirection(0);
                                v72Var2.y.setTranslationY(y);
                            } else {
                                v72Var2.y.setDirection(1);
                                v72Var2.y.setTranslationY(view.getY());
                            }
                            v72Var2.y.setDelegate(t72Var);
                            v72Var2.y.d();
                        }
                        v72Var2.L[i] = editable;
                        v72Var2.i0(b2, t72Var);
                        v72Var2.S();
                        break;
                    }
                }
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((lo0) obj).run();
                break;
            case 4:
                jn2 jn2Var = (jn2) obj;
                ln2 ln2Var = jn2Var.f;
                if (!jn2Var.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b3 = pqe.b(Integer.parseInt(editable.toString()), 0, nm7.d4);
                    byte b4 = jn2Var.d;
                    int argb = b4 != 1 ? b4 != 2 ? Color.argb(Color.alpha(ln2Var.p1), b3, Color.green(ln2Var.p1), Color.blue(ln2Var.p1)) : Color.argb(Color.alpha(ln2Var.p1), Color.red(ln2Var.p1), Color.green(ln2Var.p1), b3) : Color.argb(Color.alpha(ln2Var.p1), Color.red(ln2Var.p1), b3, Color.blue(ln2Var.p1));
                    int i2 = ln2.t1;
                    ln2Var.D0(argb, 5);
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
                        gm.T3(passcodeActivity.s, false, 0.1f, true, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        gm.T3(passcodeActivity.s, true, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 7:
                kg8 kg8Var = ((ig8) obj).d;
                fg8 fg8Var = (fg8) this.b;
                if (fg8Var.getTag() == null) {
                    u69 K2 = kg8Var.c.K(kg8Var.j0);
                    if (K2 != null && kg8Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        gw3.l(editable, fg8Var.getEditField().getPaint().getFontMetricsInt(), false);
                        kg8Var.R.setDirection(1);
                        kg8Var.R.setDelegate(fg8Var);
                        kg8Var.R.setTranslationY(K2.a.getY());
                        kg8Var.R.d();
                    }
                    kg8Var.F = editable;
                    if (K2 != null) {
                        kg8Var.t0(kg8Var.j0, K2.a);
                    }
                    kg8Var.k0();
                    break;
                }
                break;
            case 8:
                kg8 kg8Var2 = ((ig8) obj).d;
                gg8 gg8Var = (gg8) this.b;
                if (gg8Var.getTag() == null) {
                    u69 K3 = kg8Var2.c.K(kg8Var2.j0);
                    if (K3 != null && kg8Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        gw3.l(editable, gg8Var.getEditField().getPaint().getFontMetricsInt(), false);
                        kg8Var2.R.setDirection(1);
                        kg8Var2.R.setDelegate(gg8Var);
                        kg8Var2.R.setTranslationY(K3.a.getY());
                        kg8Var2.R.d();
                    }
                    kg8Var2.G = editable;
                    if (K3 != null) {
                        kg8Var2.t0(kg8Var2.k0, K3.a);
                    }
                    kg8Var2.k0();
                    break;
                }
                break;
            case 9:
                kg8 kg8Var3 = ((ig8) obj).d;
                smb smbVar2 = kg8Var3.c;
                hg8 hg8Var = (hg8) this.b;
                View F2 = smbVar2.F(hg8Var);
                u69 T2 = F2 != null ? smbVar2.T(F2) : null;
                if (T2 != null) {
                    View view2 = T2.a;
                    int b5 = T2.b() - kg8Var3.o0;
                    if (b5 >= 0 && b5 < kg8Var3.w.length) {
                        if (kg8Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            gw3.l(editable, hg8Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y2 = (view2.getY() - gm.L(166.0f)) + view2.getMeasuredHeight();
                            if (y2 > 0.0f) {
                                kg8Var3.R.setDirection(0);
                                kg8Var3.R.setTranslationY(y2);
                            } else {
                                kg8Var3.R.setDirection(1);
                                kg8Var3.R.setTranslationY(view2.getY());
                            }
                            kg8Var3.R.setDelegate(hg8Var);
                            kg8Var3.R.d();
                        }
                        kg8Var3.w[b5] = editable;
                        kg8Var3.t0(b5, hg8Var);
                        kg8Var3.k0();
                        break;
                    }
                }
                break;
            case 10:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.b).getAlpha() > 0.0f) {
                    gm.r(runnableArr[0]);
                    gm.c3(runnableArr[0]);
                    break;
                }
                break;
            case 11:
                ((String[]) this.b)[0] = editable.toString();
                ((t34) obj).g3.O(true);
                break;
            case 12:
                ((String[]) this.b)[0] = editable.toString();
                ((t34) obj).g3.O(true);
                break;
            case 13:
                ((String[]) this.b)[0] = editable.toString();
                ((t34) obj).g3.O(true);
                break;
            case 14:
                ((String[]) this.b)[0] = editable.toString();
                ((t34) obj).g3.O(true);
                break;
            case 15:
                ((String[]) this.b)[0] = editable.toString();
                ((t34) obj).g3.O(true);
                break;
            case 16:
                ((String[]) this.b)[0] = editable.toString();
                ((t34) obj).g3.O(true);
                break;
            default:
                ((uva) this.b).run();
                u6b u6bVar = (u6b) obj;
                su3 su3Var = u6bVar.T1;
                if (!u6bVar.X1) {
                    if (!u6bVar.Y1 || editable == null) {
                        u6bVar.Y0(editable != null ? editable.toString() : null);
                        break;
                    } else {
                        String substring = editable.toString().substring(8);
                        u6bVar.X1 = true;
                        su3Var.d.setText(substring);
                        ru3 ru3Var = su3Var.d;
                        ru3Var.setSelection(0, ru3Var.getText().length());
                        u6bVar.X1 = false;
                        u6bVar.Y1 = false;
                        u6bVar.Y0(substring);
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
                editText.post(new dt5(this, editText, (AtomicReference) this.c, (byte) 20));
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
                break;
            default:
                u6b u6bVar = (u6b) this.c;
                if (!u6bVar.X1) {
                    boolean z = false;
                    if (charSequence != null && i == 8 && charSequence.subSequence(0, i).toString().equals("https://") && charSequence.length() >= (i4 = i3 + i) && charSequence.subSequence(i, i4).toString().startsWith("https://")) {
                        z = true;
                    }
                    u6bVar.Y1 = z;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ qz(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public qz(jn2 jn2Var) {
        this.a = (byte) 4;
        this.c = jn2Var;
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
