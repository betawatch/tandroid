package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ys0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ at0 d;

    public ys0(at0 at0Var, Context context) {
        this.d = at0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        at0 at0Var = this.d;
        if (b10 == at0Var.i0 || b10 == at0Var.u0 || b10 == at0Var.v0) {
            return !at0Var.I;
        }
        if (!at0Var.I || b10 < (i10 = at0Var.n0) || b10 >= at0Var.D + i10) {
            if (b10 != at0Var.o0 && b10 != at0Var.r0 && b10 != at0Var.s0 && (at0Var.N != 0 || b10 != at0Var.t0)) {
                return false;
            }
        } else if (b10 - i10 < at0Var.y) {
            return false;
        }
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.x0;
    }

    @Override // s4.g0
    public final int d(int i10) {
        at0 at0Var = this.d;
        if (i10 == at0Var.h0 || i10 == at0Var.m0 || i10 == at0Var.q0) {
            return 0;
        }
        if (i10 == at0Var.l0) {
            return 1;
        }
        if (i10 == at0Var.p0 || i10 == at0Var.w0 || i10 == at0Var.k0) {
            return 2;
        }
        if (i10 == at0Var.o0) {
            return 3;
        }
        if (i10 == at0Var.i0) {
            return 4;
        }
        if (i10 == at0Var.j0) {
            return 7;
        }
        return (i10 == at0Var.r0 || i10 == at0Var.s0 || i10 == at0Var.t0 || i10 == at0Var.u0 || i10 == at0Var.v0) ? 6 : 5;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        at0 at0Var = this.d;
        int i11 = at0Var.N;
        boolean z10 = at0Var.d0;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (i10 == at0Var.h0) {
                p4Var.setText(org.telegram.messenger.cd.L0(z10 ? at0Var.z0 != null ? 2131744099 : 2131744079 : 2131747180, null));
                return;
            }
            if (i10 != at0Var.m0) {
                if (i10 == at0Var.q0) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131745512, null));
                    return;
                }
                return;
            } else if (i11 == 1) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746462, null));
                return;
            } else {
                p4Var.setText(org.telegram.messenger.cd.L0(z10 ? 2131744097 : 2131754246, null));
                return;
            }
        }
        if (i12 == 6) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setEnabled(!at0Var.I);
            t8Var.getCheckBox().setAlpha(!at0Var.I ? 1.0f : 0.6f);
            if (i10 == at0Var.u0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131744118, null), at0Var.H, true);
                t8Var.e(null, true);
                return;
            }
            if (i10 == at0Var.v0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131744117, null), at0Var.J, false);
                t8Var.e(null, true);
                return;
            }
            if (i10 == at0Var.r0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131747193, null), at0Var.G, (at0Var.s0 == -1 && at0Var.t0 == -1) ? false : true);
                t8Var.e(null, true);
                return;
            } else if (i10 == at0Var.s0) {
                t8Var.f(org.telegram.messenger.cd.L0(2131747181, null), at0Var.K, at0Var.t0 != -1);
                t8Var.e(null, true);
                return;
            } else {
                if (i10 == at0Var.t0) {
                    t8Var.f(org.telegram.messenger.cd.L0(2131747179, null), at0Var.L, false);
                    t8Var.e(null, i11 == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i12 != 2) {
            if (i12 != 3) {
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.g(-1, org.telegram.ui.ActionBar.t6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i13 = org.telegram.ui.ActionBar.t6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.y(p8Var, drawable, i13, null, mode);
            org.telegram.ui.ActionBar.a7.y(p8Var, drawable2, org.telegram.ui.ActionBar.t6.k7, null, mode);
            p8Var.p(org.telegram.messenger.cd.L0(z10 ? 2131744093 : 2131754471, null), new org.telegram.ui.Components.eq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        b9Var.setFixedSize(0);
        org.telegram.ui.ActionBar.a7.a0(b9Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.t6.b7);
        if (i10 == at0Var.k0) {
            b9Var.setText(org.telegram.messenger.cd.L0(2131754472, null));
            return;
        }
        if (i10 == at0Var.w0) {
            b9Var.setFixedSize(12);
            b9Var.setText(null);
            return;
        }
        int i14 = at0Var.n - at0Var.D;
        if (i14 <= 0) {
            b9Var.setText(org.telegram.messenger.cd.L0(z10 ? 2131744133 : 2131754469, null));
        } else if (z10) {
            b9Var.setText(org.telegram.messenger.cd.H(',', "TodoNewTaskInfo", i14));
        } else {
            b9Var.setText(org.telegram.messenger.cd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.cd.G(i14, "Option", new Object[0])));
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        at0 at0Var = this.d;
        boolean z10 = at0Var.c0;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
            } else if (i10 == 2) {
                view = new org.telegram.ui.Cells.b9(context);
            } else if (i10 == 3) {
                View p8Var = new org.telegram.ui.Cells.p8(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p8Var, null);
                view = p8Var;
            } else if (i10 == 4) {
                vs0 vs0Var = new vs0(this, context, z10 ? 1 : 0);
                vs0Var.c();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, vs0Var, null);
                vs0Var.b(new ag.u2(this, vs0Var, false, 7));
                view = vs0Var;
            } else if (i10 == 6) {
                View t8Var = new org.telegram.ui.Cells.t8(context);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, t8Var, null);
                view = t8Var;
            } else if (i10 != 7) {
                xs0 xs0Var = new xs0(this, context, z10 ? 1 : 0, new f50(at0Var, 22));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, xs0Var, null);
                xs0Var.b(new ag.u2(this, xs0Var, false, 9));
                xs0Var.setShowNextButton(true);
                EditTextBoldCursor textView = xs0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new xd(3, this, xs0Var));
                textView.setOnKeyListener(new mg(xs0Var, 2));
                view = xs0Var;
            } else {
                ws0 ws0Var = new ws0(this, context, z10 ? 1 : 0);
                ws0Var.c();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, ws0Var, null);
                ws0Var.b(new ag.u2(this, ws0Var, false, 8));
                view = ws0Var;
            }
        } else {
            View p4Var = new org.telegram.ui.Cells.p4(this.c, org.telegram.ui.ActionBar.t6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, p4Var, null);
            view = p4Var;
        }
        return sc.e.o(view, view, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.c1 c1Var) {
        at0 at0Var = this.d;
        boolean z10 = at0Var.d0;
        int i10 = c1Var.f;
        View view = c1Var.a;
        if (i10 == 4) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            e6Var.setTag(1);
            ih.b bVar = e6Var.d;
            CharSequence charSequence = at0Var.E;
            e6Var.n(charSequence != null ? charSequence : "", org.telegram.messenger.cd.L0(z10 ? 2131744078 : 2131746463, null), false);
            e6Var.setTag(null);
            e6Var.setEnabled(!at0Var.I);
            bVar.setEnabled(true ^ at0Var.I);
            org.telegram.ui.ActionBar.a7.W(bVar, org.telegram.ui.ActionBar.a7.L(at0Var.I ? 0.6f : 1.0f, org.telegram.ui.ActionBar.t6.G6), at0Var.getResourceProvider());
            at0.g0(at0Var, view, c1Var.b());
            return;
        }
        if (i10 != 5) {
            if (i10 == 7) {
                org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
                e6Var2.setTag(1);
                CharSequence charSequence2 = at0Var.F;
                e6Var2.n(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.cd.L0(2131754474, null), false);
                e6Var2.setTag(null);
                at0.g0(at0Var, view, c1Var.b());
                return;
            }
            return;
        }
        int b10 = c1Var.b();
        org.telegram.ui.Cells.e6 e6Var3 = (org.telegram.ui.Cells.e6) view;
        e6Var3.setTag(1);
        ih.b bVar2 = e6Var3.d;
        int i11 = b10 - at0Var.n0;
        boolean z11 = !at0Var.I || i11 >= at0Var.y;
        bVar2.setEnabled(z11);
        org.telegram.ui.ActionBar.a7.W(bVar2, org.telegram.ui.ActionBar.a7.L(z11 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.t6.G6), at0Var.getResourceProvider());
        e6Var3.n(at0Var.w[i11], org.telegram.messenger.cd.L0(z10 ? 2131744080 : 2131747790, null), true);
        e6Var3.setTag(null);
        ImageView imageView = e6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = e6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!at0Var.f0 && at0Var.g0 == b10) {
            EditTextBoldCursor textView = e6Var3.getTextView();
            textView.requestFocus();
            org.telegram.messenger.i0.J3(textView);
            at0Var.f0 = false;
            at0Var.g0 = -1;
        }
        at0.g0(at0Var, view, b10);
    }

    @Override // s4.g0
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.e6) c1Var.a).getTextView();
            if (textView.isFocused()) {
                at0 at0Var = this.d;
                if (at0Var.c0) {
                    org.telegram.ui.Components.sx0 sx0Var = at0Var.Q;
                    if (sx0Var != null) {
                        sx0Var.f();
                    }
                    at0Var.o0(true);
                }
                at0Var.b0 = null;
                textView.clearFocus();
                org.telegram.messenger.i0.v1(textView);
            }
        }
    }
}
