package vh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.tk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n6 extends hg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.p6 e;
    public final k6 f;
    public tk0 h;
    public final /* synthetic */ r6 n;

    public n6(r6 r6Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, k6 k6Var, th.r2 r2Var) {
        this.n = r6Var;
        this.d = context;
        this.e = p6Var;
        this.f = k6Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 3 && this.n.W.w1) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.n.L;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        r6 r6Var = this.n;
        ArrayList arrayList = r6Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((g6) r6Var.L.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        r6 r6Var = this.n;
        w6 w6Var = r6Var.W;
        ArrayList arrayList = r6Var.L;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        g6 g6Var = (g6) arrayList.get(i10);
        int i13 = c1Var.f;
        View view = c1Var.a;
        boolean z10 = true;
        int i14 = i10 + 1;
        g6 g6Var2 = i14 < arrayList.size() ? (g6) arrayList.get(i14) : null;
        int i15 = 0;
        boolean z11 = g6Var2 != null && ((i12 = g6Var2.a) == i13 || (i12 == 9 && g6Var2.q == 1));
        if (i13 == 3) {
            v6 v6Var = (v6) view;
            boolean z12 = g6Var.n;
            v6Var.d(z12, !z12);
            int i16 = g6Var.i;
            float f7 = 1.0f;
            if (i16 > 0) {
                v6Var.e(i16, g6Var.j, g6Var.g);
                v6Var.b(false, 1.0f);
            } else {
                TLRPC.User user = g6Var.g;
                if (user != null) {
                    v6Var.setUser(user);
                    if (g6Var.l && !g6Var.k) {
                        f7 = 0.5f;
                    }
                    v6Var.b(false, f7);
                } else {
                    TLRPC.Chat chat = g6Var.h;
                    if (chat != null) {
                        v6Var.a(w6.K0(w6Var, chat), chat);
                    }
                }
            }
            if (!g6Var.k && !g6Var.l) {
                z10 = false;
            }
            v6Var.c(z10, false);
            v6Var.setDivider(z11);
            v6Var.setRedCheckbox(g6Var.m);
            v6Var.w = w6Var.w1;
            return;
        }
        if (i13 == 2) {
            return;
        }
        if (i13 == 0) {
            view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
            return;
        }
        if (i13 == -1) {
            if (g6Var.o > 0) {
                tk0 tk0Var = this.h;
                i11 = Math.max(((tk0Var == null || tk0Var.getMeasuredHeight() <= 0) ? org.telegram.messenger.i0.q.y : this.h.getMeasuredHeight() + r6Var.T) - g6Var.o, org.telegram.messenger.i0.L(120.0f));
                view.setTag(33);
            } else {
                i11 = g6Var.p;
                if (i11 >= 0) {
                    view.setTag(null);
                } else {
                    i11 = (int) (org.telegram.messenger.i0.q.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new s4.o0(-1, i11));
            return;
        }
        if (i13 == 1) {
            view.setLayoutParams(new s4.o0(-1, Math.min(org.telegram.messenger.i0.L(150.0f), this.f.K)));
            return;
        }
        if (i13 == 4) {
            f6 f6Var = (f6) view;
            CharSequence charSequence = g6Var.e;
            CharSequence charSequence2 = g6Var.f;
            f6Var.a.setText(charSequence);
            f6Var.b.setText(charSequence2);
            return;
        }
        if (i13 == 11) {
            f6 f6Var2 = (f6) view;
            f6Var2.a.setText(g6Var.e);
            f6Var2.b.setText((CharSequence) null);
            return;
        }
        if (i13 == 5) {
            try {
                ((dw0) view).b.getImageReceiver().P0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i13 == 6) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (g6Var.e == null) {
                b9Var.setFixedSize(12);
                b9Var.setText(null);
                return;
            } else {
                b9Var.setFixedSize(0);
                b9Var.setText(g6Var.e);
                return;
            }
        }
        if (i13 == 7) {
            int i17 = g6Var.c;
            if (i17 == 0) {
                ((org.telegram.ui.Cells.p8) view).l(g6Var.e, w6Var.t1, z11);
                return;
            } else if (i17 == 1) {
                ((org.telegram.ui.Cells.p8) view).l(g6Var.e, w6Var.u1, z11);
                return;
            } else {
                if (i17 == 2) {
                    ((org.telegram.ui.Cells.p8) view).l(g6Var.e, w6Var.s1, z11);
                    return;
                }
                return;
            }
        }
        if (i13 == 9) {
            Drawable drawable = g6Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.p8) view).v(g6Var.e, drawable, z11);
                return;
            } else {
                ((org.telegram.ui.Cells.p8) view).q(g6Var.e, g6Var.f, false, z11);
                return;
            }
        }
        if (i13 == 8) {
            ((org.telegram.ui.Cells.p4) view).setText(g6Var.e);
            return;
        }
        if (i13 == 10) {
            int i18 = w6.U1;
            int i19 = (int) vp.r1(w6Var.a).J6;
            int[] a2 = org.telegram.ui.Cells.x7.a(new int[]{0, 1, 10, 50, 100, zs.e3, zs.Z3, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000}, i19);
            int j10 = Utilities.j(w6Var.y1, i19, 0);
            th.m1 m1Var = new th.m1(14);
            org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
            w7Var.c = a2;
            w7Var.d = 20;
            w7Var.e = m1Var;
            ((org.telegram.ui.Cells.x7) view).d(j10, w7Var, new m6(this, i15));
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View x7Var;
        org.telegram.ui.Cells.p8 p8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            x7Var = new q6(context);
        } else if (i10 == 0) {
            x7Var = new View(context);
            x7Var.setTag(35);
        } else if (i10 == 1) {
            x7Var = new View(context);
            x7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.e;
            if (i10 == 3) {
                x7Var = new v6(context, p6Var);
            } else {
                if (i10 == 4) {
                    view = new f6(context, p6Var, true);
                } else if (i10 == 11) {
                    x7Var = new f6(context, p6Var, false);
                } else if (i10 == 8) {
                    x7Var = new org.telegram.ui.Cells.p4(context, p6Var);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, x7Var, p6Var);
                } else if (i10 == 5) {
                    dw0 dw0Var = new dw0(context, null, 1, p6Var);
                    dw0Var.d.setText(cd.L0(2131748183, null));
                    dw0Var.e.setText(cd.L0(2131745824, null));
                    dw0Var.a.setTranslationY(org.telegram.messenger.i0.L(24.0f));
                    view = dw0Var;
                } else if (i10 == 6) {
                    x7Var = new org.telegram.ui.Cells.b9(context, p6Var);
                    x7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        p8Var = new org.telegram.ui.Cells.p8(23, this.d, this.e, true, false);
                    } else {
                        x7Var = i10 == 10 ? new org.telegram.ui.Cells.x7(context, p6Var) : new bn(context, 26);
                    }
                    x7Var = p8Var;
                }
                x7Var = view;
            }
        }
        return new ck0(x7Var);
    }
}
