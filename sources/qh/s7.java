package qh;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cl0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class s7 extends cg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final q7 f;
    public sl0 h;
    public final /* synthetic */ w7 n;

    public s7(w7 w7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, q7 q7Var, oh.v3 v3Var) {
        this.n = w7Var;
        this.d = context;
        this.e = g6Var;
        this.f = q7Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return (i10 == 3 && this.n.T.C) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override // f2.p0
    public final int h() {
        ArrayList arrayList = this.n.I;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        w7 w7Var = this.n;
        ArrayList arrayList = w7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((m7) w7Var.I.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13;
        w7 w7Var = this.n;
        c8 c8Var = w7Var.T;
        ArrayList arrayList = w7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        m7 m7Var = (m7) arrayList.get(i10);
        int i14 = m1Var.f;
        View view = m1Var.a;
        boolean z4 = true;
        int i15 = i10 + 1;
        m7 m7Var2 = i15 < arrayList.size() ? (m7) arrayList.get(i15) : null;
        boolean z10 = m7Var2 != null && ((i13 = m7Var2.a) == i14 || (i13 == 9 && m7Var2.q == 1));
        if (i14 == 3) {
            b8 b8Var = (b8) view;
            boolean z11 = m7Var.n;
            b8Var.d(z11, !z11);
            int i16 = m7Var.i;
            float f10 = 1.0f;
            if (i16 > 0) {
                b8Var.e(i16, m7Var.g, m7Var.j);
                b8Var.b(1.0f, false);
            } else {
                TLRPC.User user = m7Var.g;
                if (user != null) {
                    b8Var.setUser(user);
                    if (m7Var.l && !m7Var.k) {
                        f10 = 0.5f;
                    }
                    b8Var.b(f10, false);
                } else {
                    TLRPC.Chat chat = m7Var.h;
                    if (chat != null) {
                        b8Var.a(c8.d1(c8Var, chat), chat);
                    }
                }
            }
            if (!m7Var.k && !m7Var.l) {
                z4 = false;
            }
            b8Var.c(z4, false);
            b8Var.setDivider(z10);
            b8Var.setRedCheckbox(m7Var.m);
            b8Var.v = c8Var.C;
            return;
        }
        if (i14 == 2) {
            return;
        }
        if (i14 == 0) {
            view.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i14 == -1) {
            if (m7Var.o > 0) {
                sl0 sl0Var = this.h;
                i12 = Math.max(((sl0Var == null || sl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + w7Var.Q) - m7Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = m7Var.p;
                if (i12 >= 0) {
                    view.setTag(null);
                } else {
                    i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new f2.x0(-1, i12));
            return;
        }
        if (i14 == 1) {
            view.setLayoutParams(new f2.x0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.G)));
            return;
        }
        if (i14 == 4) {
            l7 l7Var = (l7) view;
            CharSequence charSequence = m7Var.e;
            CharSequence charSequence2 = m7Var.f;
            l7Var.a.setText(charSequence);
            l7Var.b.setText(charSequence2);
            return;
        }
        int i17 = 11;
        if (i14 == 11) {
            l7 l7Var2 = (l7) view;
            l7Var2.a.setText(m7Var.e);
            l7Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((zw0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (m7Var.e == null) {
                a9Var.setFixedSize(12);
                a9Var.setText(null);
                return;
            } else {
                a9Var.setFixedSize(0);
                a9Var.setText(m7Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i18 = m7Var.c;
            if (i18 == 0) {
                ((org.telegram.ui.Cells.o8) view).j(m7Var.e, c8Var.x, z10);
                return;
            } else if (i18 == 1) {
                ((org.telegram.ui.Cells.o8) view).j(m7Var.e, c8Var.y, z10);
                return;
            } else {
                if (i18 == 2) {
                    ((org.telegram.ui.Cells.o8) view).j(m7Var.e, c8Var.w, z10);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = m7Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.o8) view).t(m7Var.e, drawable, z10);
                return;
            } else {
                ((org.telegram.ui.Cells.o8) view).o(m7Var.e, m7Var.f, false, z10);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(m7Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.h3) c8Var).currentAccount;
            int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.x7.a(i19, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(c8Var.E, i19, 0);
            cl0 cl0Var = new cl0(18);
            org.telegram.ui.Cells.w7 w7Var2 = new org.telegram.ui.Cells.w7();
            w7Var2.c = a2;
            w7Var2.d = 20;
            w7Var2.e = cl0Var;
            ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var2, new org.telegram.ui.web.d1(this, i17));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View x7Var;
        org.telegram.ui.Cells.o8 o8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            x7Var = new v7(context);
        } else if (i10 == 0) {
            x7Var = new View(context);
            x7Var.setTag(35);
        } else if (i10 == 1) {
            x7Var = new View(context);
            x7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.e;
            if (i10 == 3) {
                x7Var = new b8(context, g6Var);
            } else {
                if (i10 == 4) {
                    view = new l7(context, g6Var, true);
                } else if (i10 == 11) {
                    x7Var = new l7(context, g6Var, false);
                } else if (i10 == 8) {
                    x7Var = new org.telegram.ui.Cells.m4(context, g6Var);
                    x7Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
                } else if (i10 == 5) {
                    zw0 zw0Var = new zw0(context, null, 1, g6Var);
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = zw0Var;
                } else if (i10 == 6) {
                    x7Var = new org.telegram.ui.Cells.a9(context, g6Var);
                    x7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, false);
                    } else {
                        x7Var = i10 == 10 ? new org.telegram.ui.Cells.x7(context, g6Var) : new in(context, 26);
                    }
                    x7Var = o8Var;
                }
                x7Var = view;
            }
        }
        return new el0(x7Var);
    }
}
