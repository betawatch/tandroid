// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uh8 extends c79 {
    public final Context c;
    public final /* synthetic */ wh8 d;

    public uh8(wh8 wh8Var, Context context) {
        this.d = wh8Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i;
        int b = f89Var.b();
        wh8 wh8Var = this.d;
        if (b == wh8Var.j0 || b == wh8Var.v0 || b == wh8Var.w0) {
            return !wh8Var.J;
        }
        if (!wh8Var.J || b < (i = wh8Var.o0) || b >= wh8Var.E + i) {
            if (b != wh8Var.p0 && b != wh8Var.s0 && b != wh8Var.t0 && (wh8Var.O != 0 || b != wh8Var.u0)) {
                return false;
            }
        } else if (b - i < wh8Var.y) {
            return false;
        }
        return true;
    }

    @Override // j79
    public final int b() {
        return this.d.y0;
    }

    @Override // j79
    public final int d(int i) {
        wh8 wh8Var = this.d;
        if (i == wh8Var.i0 || i == wh8Var.n0 || i == wh8Var.r0) {
            return 0;
        }
        if (i == wh8Var.m0) {
            return 1;
        }
        if (i == wh8Var.q0 || i == wh8Var.x0 || i == wh8Var.l0) {
            return 2;
        }
        if (i == wh8Var.p0) {
            return 3;
        }
        if (i == wh8Var.j0) {
            return 4;
        }
        if (i == wh8Var.k0) {
            return 7;
        }
        return (i == wh8Var.s0 || i == wh8Var.t0 || i == wh8Var.u0 || i == wh8Var.v0 || i == wh8Var.w0) ? 6 : 5;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        wh8 wh8Var = this.d;
        byte b = wh8Var.O;
        boolean z = wh8Var.e0;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            mf5 mf5Var = (mf5) view;
            if (i == wh8Var.i0) {
                mf5Var.setText(ob6.M0(z ? wh8Var.A0 != null ? 2131743727 : 2131743707 : 2131746892, null));
                return;
            }
            if (i != wh8Var.n0) {
                if (i == wh8Var.r0) {
                    mf5Var.setText(ob6.M0(2131745223, null));
                    return;
                }
                return;
            } else if (b == 1) {
                mf5Var.setText(ob6.M0(2131746174, null));
                return;
            } else {
                mf5Var.setText(ob6.M0(z ? 2131743725 : 2131754239, null));
                return;
            }
        }
        if (i2 == 6) {
            wkb wkbVar = (wkb) view;
            wkbVar.setEnabled(!wh8Var.J);
            wkbVar.getCheckBox().setAlpha(!wh8Var.J ? 1.0f : 0.6f);
            if (i == wh8Var.v0) {
                wkbVar.f(ob6.M0(2131743746, null), wh8Var.I, true);
                wkbVar.e(null, true);
                return;
            }
            if (i == wh8Var.w0) {
                wkbVar.f(ob6.M0(2131743745, null), wh8Var.K, false);
                wkbVar.e(null, true);
                return;
            }
            if (i == wh8Var.s0) {
                wkbVar.f(ob6.M0(2131746905, null), wh8Var.H, (wh8Var.t0 == -1 && wh8Var.u0 == -1) ? false : true);
                wkbVar.e(null, true);
                return;
            } else if (i == wh8Var.t0) {
                wkbVar.f(ob6.M0(2131746893, null), wh8Var.L, wh8Var.u0 != -1);
                wkbVar.e(null, true);
                return;
            } else {
                if (i == wh8Var.u0) {
                    wkbVar.f(ob6.M0(2131746891, null), wh8Var.M, false);
                    wkbVar.e(null, b == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i2 != 2) {
            if (i2 == 3) {
                skb skbVar = (skb) view;
                skbVar.g(-1, aob.q6);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int i3 = aob.N6;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                yob.x(skbVar, drawable, i3, null, mode);
                yob.x(skbVar, drawable2, aob.k7, null, mode);
                skbVar.p(ob6.M0(z ? 2131743721 : 2131754464, null), new zm2(drawable, drawable2), false);
                return;
            }
            return;
        }
        ilb ilbVar = (ilb) view;
        ilbVar.setFixedSize(0);
        yob.Z(ilbVar, context, R.drawable.greydivider_bottom, aob.b7);
        if (i == wh8Var.l0) {
            ilbVar.setText(ob6.M0(2131754465, null));
            return;
        }
        if (i == wh8Var.x0) {
            ilbVar.setFixedSize(12);
            ilbVar.setText(null);
            return;
        }
        int i4 = wh8Var.n - wh8Var.E;
        if (i4 <= 0) {
            ilbVar.setText(ob6.M0(z ? 2131743761 : 2131754462, null));
        } else if (z) {
            ilbVar.setText(ob6.H(',', "TodoNewTaskInfo", i4));
        } else {
            ilbVar.setText(ob6.a0("AddAnOptionInfo", null, 2131754463, ob6.G(i4, "Option", new Object[0])));
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        wh8 wh8Var = this.d;
        boolean z = wh8Var.d0;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                view = new sca(context, (uh9) null);
            } else if (i != 2) {
                byte b = 3;
                if (i != 3) {
                    byte b2 = 7;
                    if (i == 4) {
                        rh8 rh8Var = new rh8(this, context, z ? 1 : 0);
                        rh8Var.e();
                        yob.h(aob.d6, null, rh8Var);
                        rh8Var.c(new ry(this, rh8Var, b2));
                        view = rh8Var;
                    } else if (i == 6) {
                        View wkbVar = new wkb(context);
                        yob.h(aob.d6, null, wkbVar);
                        view = wkbVar;
                    } else if (i != 7) {
                        th8 th8Var = new th8(this, context, z ? 1 : 0, new am7(wh8Var, (byte) 21));
                        yob.h(aob.d6, null, th8Var);
                        th8Var.c(new ry(this, th8Var, (byte) 9));
                        th8Var.setShowNextButton(true);
                        EditTextBoldCursor textView = th8Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new hf(this, th8Var, b));
                        textView.setOnKeyListener(new x6(th8Var, (byte) 5));
                        view = th8Var;
                    } else {
                        sh8 sh8Var = new sh8(this, context, z ? 1 : 0);
                        sh8Var.e();
                        yob.h(aob.d6, null, sh8Var);
                        sh8Var.c(new ry(this, sh8Var, (byte) 8));
                        view = sh8Var;
                    }
                } else {
                    View skbVar = new skb(context);
                    yob.h(aob.d6, null, skbVar);
                    view = skbVar;
                }
            } else {
                view = new ilb(context);
            }
        } else {
            View mf5Var = new mf5(this.c, aob.L6, 21, 15, false, null);
            yob.h(aob.d6, null, mf5Var);
            view = mf5Var;
        }
        return qu6.h(view, view, -1, -2);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        wh8 wh8Var = this.d;
        boolean z = wh8Var.e0;
        int i = f89Var.f;
        View view = f89Var.a;
        if (i == 4) {
            zh8 zh8Var = (zh8) view;
            zh8Var.setTag(1);
            qy qyVar = zh8Var.d;
            CharSequence charSequence = wh8Var.F;
            zh8Var.o(charSequence != null ? charSequence : "", ob6.M0(z ? 2131743706 : 2131746175, null), false);
            zh8Var.setTag(null);
            zh8Var.setEnabled(!wh8Var.J);
            qyVar.setEnabled(!wh8Var.J);
            yob.Y(qyVar, yob.K(wh8Var.J ? 0.6f : 1.0f, aob.G6), wh8Var.getResourceProvider());
            wh8Var.s0(f89Var.b(), view);
            return;
        }
        if (i != 5) {
            if (i == 7) {
                zh8 zh8Var2 = (zh8) view;
                zh8Var2.setTag(1);
                CharSequence charSequence2 = wh8Var.G;
                zh8Var2.o(charSequence2 != null ? charSequence2 : "", ob6.M0(2131754467, null), false);
                zh8Var2.setTag(null);
                wh8Var.s0(f89Var.b(), view);
                return;
            }
            return;
        }
        int b = f89Var.b();
        zh8 zh8Var3 = (zh8) view;
        zh8Var3.setTag(1);
        qy qyVar2 = zh8Var3.d;
        int i2 = b - wh8Var.o0;
        boolean z2 = !wh8Var.J || i2 >= wh8Var.y;
        qyVar2.setEnabled(z2);
        yob.Y(qyVar2, yob.K(z2 ? 1.0f : 0.6f, aob.G6), wh8Var.getResourceProvider());
        zh8Var3.o(wh8Var.w[i2], ob6.M0(z ? 2131743708 : 2131747501, null), true);
        zh8Var3.setTag(null);
        ImageView imageView = zh8Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
        ImageView imageView2 = zh8Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z2 ? 1.0f : 0.45f);
        }
        if (!wh8Var.g0 && wh8Var.h0 == b) {
            EditTextBoldCursor textView = zh8Var3.getTextView();
            textView.requestFocus();
            hl.E3(textView);
            wh8Var.g0 = false;
            wh8Var.h0 = -1;
        }
        wh8Var.s0(b, view);
    }

    @Override // j79
    public final void z(f89 f89Var) {
        int i = f89Var.f;
        if (i == 4 || i == 5) {
            EditTextBoldCursor textView = ((zh8) f89Var.a).getTextView();
            if (textView.isFocused()) {
                wh8 wh8Var = this.d;
                if (wh8Var.d0) {
                    zeb zebVar = wh8Var.R;
                    if (zebVar != null) {
                        zebVar.e();
                    }
                    wh8Var.l0(true);
                }
                wh8Var.c0 = null;
                textView.clearFocus();
                hl.t1(textView);
            }
        }
    }
}
