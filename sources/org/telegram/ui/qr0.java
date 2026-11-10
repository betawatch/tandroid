package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qr0 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ sr0 d;

    public qr0(sr0 sr0Var, Context context) {
        this.d = sr0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int b10 = d1Var.b();
        sr0 sr0Var = this.d;
        if (b10 == sr0Var.i0 || b10 == sr0Var.u0 || b10 == sr0Var.v0) {
            return !sr0Var.I;
        }
        if (!sr0Var.I || b10 < (i7 = sr0Var.n0) || b10 >= sr0Var.D + i7) {
            if (b10 != sr0Var.o0 && b10 != sr0Var.r0 && b10 != sr0Var.s0 && (sr0Var.N != 0 || b10 != sr0Var.t0)) {
                return false;
            }
        } else if (b10 - i7 < sr0Var.y) {
            return false;
        }
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.x0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        sr0 sr0Var = this.d;
        if (i7 == sr0Var.h0 || i7 == sr0Var.m0 || i7 == sr0Var.q0) {
            return 0;
        }
        if (i7 == sr0Var.l0) {
            return 1;
        }
        if (i7 == sr0Var.p0 || i7 == sr0Var.w0 || i7 == sr0Var.k0) {
            return 2;
        }
        if (i7 == sr0Var.o0) {
            return 3;
        }
        if (i7 == sr0Var.i0) {
            return 4;
        }
        if (i7 == sr0Var.j0) {
            return 7;
        }
        return (i7 == sr0Var.r0 || i7 == sr0Var.s0 || i7 == sr0Var.t0 || i7 == sr0Var.u0 || i7 == sr0Var.v0) ? 6 : 5;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        sr0 sr0Var = this.d;
        int i10 = sr0Var.N;
        boolean z9 = sr0Var.d0;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == sr0Var.h0) {
                n4Var.setText(org.telegram.messenger.id.M0(z9 ? sr0Var.z0 != null ? 2131744074 : 2131744054 : 2131747165, null));
                return;
            }
            if (i7 != sr0Var.m0) {
                if (i7 == sr0Var.q0) {
                    n4Var.setText(org.telegram.messenger.id.M0(2131745495, null));
                    return;
                }
                return;
            } else if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746447, null));
                return;
            } else {
                n4Var.setText(org.telegram.messenger.id.M0(z9 ? 2131744072 : 2131754246, null));
                return;
            }
        }
        if (i11 == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!sr0Var.I);
            r8Var.getCheckBox().setAlpha(!sr0Var.I ? 1.0f : 0.6f);
            if (i7 == sr0Var.u0) {
                r8Var.f(org.telegram.messenger.id.M0(2131744093, null), sr0Var.H, true);
                r8Var.e(null, true);
                return;
            }
            if (i7 == sr0Var.v0) {
                r8Var.f(org.telegram.messenger.id.M0(2131744092, null), sr0Var.J, false);
                r8Var.e(null, true);
                return;
            }
            if (i7 == sr0Var.r0) {
                r8Var.f(org.telegram.messenger.id.M0(2131747178, null), sr0Var.G, (sr0Var.s0 == -1 && sr0Var.t0 == -1) ? false : true);
                r8Var.e(null, true);
                return;
            } else if (i7 == sr0Var.s0) {
                r8Var.f(org.telegram.messenger.id.M0(2131747166, null), sr0Var.K, sr0Var.t0 != -1);
                r8Var.e(null, true);
                return;
            } else {
                if (i7 == sr0Var.t0) {
                    r8Var.f(org.telegram.messenger.id.M0(2131747164, null), sr0Var.L, false);
                    r8Var.e(null, i10 == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.g(-1, org.telegram.ui.ActionBar.m6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.m6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.t6.x(m8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.t6.x(m8Var, drawable2, org.telegram.ui.ActionBar.m6.k7, null, mode);
            m8Var.p(org.telegram.messenger.id.M0(z9 ? 2131744068 : 2131754471, null), new org.telegram.ui.Components.xp(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.setFixedSize(0);
        org.telegram.ui.ActionBar.t6.Z(z8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.m6.b7);
        if (i7 == sr0Var.k0) {
            z8Var.setText(org.telegram.messenger.id.M0(2131754472, null));
            return;
        }
        if (i7 == sr0Var.w0) {
            z8Var.setFixedSize(12);
            z8Var.setText(null);
            return;
        }
        int i13 = sr0Var.n - sr0Var.D;
        if (i13 <= 0) {
            z8Var.setText(org.telegram.messenger.id.M0(z9 ? 2131744108 : 2131754469, null));
        } else if (z9) {
            z8Var.setText(org.telegram.messenger.id.H(',', "TodoNewTaskInfo", i13));
        } else {
            z8Var.setText(org.telegram.messenger.id.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.id.G(i13, "Option", new Object[0])));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        sr0 sr0Var = this.d;
        boolean z9 = sr0Var.c0;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            } else if (i7 == 2) {
                view = new org.telegram.ui.Cells.z8(context);
            } else if (i7 == 3) {
                View m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, m8Var, null);
                view = m8Var;
            } else if (i7 == 4) {
                nr0 nr0Var = new nr0(this, context, z9 ? 1 : 0);
                nr0Var.c();
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, nr0Var, null);
                nr0Var.b(new fi.h7(7, this, nr0Var));
                view = nr0Var;
            } else if (i7 == 6) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, r8Var, null);
                view = r8Var;
            } else if (i7 != 7) {
                pr0 pr0Var = new pr0(this, context, z9 ? 1 : 0, new j40(sr0Var, 22));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, pr0Var, null);
                pr0Var.b(new fi.h7(9, this, pr0Var));
                pr0Var.setShowNextButton(true);
                EditTextBoldCursor textView = pr0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new nd(3, this, pr0Var));
                textView.setOnKeyListener(new wf(pr0Var, 2));
                view = pr0Var;
            } else {
                or0 or0Var = new or0(this, context, z9 ? 1 : 0);
                or0Var.c();
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, or0Var, null);
                or0Var.b(new fi.h7(8, this, or0Var));
                view = or0Var;
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.m6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, n4Var, null);
            view = n4Var;
        }
        return jg.g.r(view, view, -1, -2);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        sr0 sr0Var = this.d;
        boolean z9 = sr0Var.d0;
        int i7 = d1Var.f;
        View view = d1Var.a;
        if (i7 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            org.telegram.ui.Cells.z5 z5Var = a6Var.d;
            CharSequence charSequence = sr0Var.E;
            a6Var.n(charSequence != null ? charSequence : "", org.telegram.messenger.id.M0(z9 ? 2131744053 : 2131746448, null), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!sr0Var.I);
            z5Var.setEnabled(true ^ sr0Var.I);
            org.telegram.ui.ActionBar.t6.V(z5Var, org.telegram.ui.ActionBar.t6.K(sr0Var.I ? 0.6f : 1.0f, org.telegram.ui.ActionBar.m6.G6), sr0Var.getResourceProvider());
            sr0.h0(sr0Var, view, d1Var.b());
            return;
        }
        if (i7 != 5) {
            if (i7 == 7) {
                org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
                a6Var2.setTag(1);
                CharSequence charSequence2 = sr0Var.F;
                a6Var2.n(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.id.M0(2131754474, null), false);
                a6Var2.setTag(null);
                sr0.h0(sr0Var, view, d1Var.b());
                return;
            }
            return;
        }
        int b10 = d1Var.b();
        org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
        a6Var3.setTag(1);
        org.telegram.ui.Cells.z5 z5Var2 = a6Var3.d;
        int i10 = b10 - sr0Var.n0;
        boolean z10 = !sr0Var.I || i10 >= sr0Var.y;
        z5Var2.setEnabled(z10);
        org.telegram.ui.ActionBar.t6.V(z5Var2, org.telegram.ui.ActionBar.t6.K(z10 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.m6.G6), sr0Var.getResourceProvider());
        a6Var3.n(sr0Var.w[i10], org.telegram.messenger.id.M0(z9 ? 2131744055 : 2131747774, null), true);
        a6Var3.setTag(null);
        ImageView imageView = a6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
        ImageView imageView2 = a6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z10 ? 1.0f : 0.45f);
        }
        if (!sr0Var.f0 && sr0Var.g0 == b10) {
            EditTextBoldCursor textView = a6Var3.getTextView();
            textView.requestFocus();
            org.telegram.messenger.g0.K3(textView);
            sr0Var.f0 = false;
            sr0Var.g0 = -1;
        }
        sr0.h0(sr0Var, view, b10);
    }

    @Override // v4.g0
    public final void z(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.a).getTextView();
            if (textView.isFocused()) {
                sr0 sr0Var = this.d;
                if (sr0Var.c0) {
                    org.telegram.ui.Components.ow0 ow0Var = sr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    sr0Var.p0(true);
                }
                sr0Var.b0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}
