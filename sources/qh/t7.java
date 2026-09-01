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
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.cl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class t7 extends cg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.g6 e;
    public final r7 f;
    public tl0 h;
    public final /* synthetic */ x7 n;

    public t7(x7 x7Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, r7 r7Var, oh.v3 v3Var) {
        this.n = x7Var;
        this.d = context;
        this.e = g6Var;
        this.f = r7Var;
    }

    @Override // org.telegram.ui.Components.sl0
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
        x7 x7Var = this.n;
        ArrayList arrayList = x7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((n7) x7Var.I.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13;
        x7 x7Var = this.n;
        d8 d8Var = x7Var.T;
        ArrayList arrayList = x7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        n7 n7Var = (n7) arrayList.get(i10);
        int i14 = m1Var.f;
        View view = m1Var.a;
        boolean z4 = true;
        int i15 = i10 + 1;
        n7 n7Var2 = i15 < arrayList.size() ? (n7) arrayList.get(i15) : null;
        boolean z10 = n7Var2 != null && ((i13 = n7Var2.a) == i14 || (i13 == 9 && n7Var2.q == 1));
        if (i14 == 3) {
            c8 c8Var = (c8) view;
            boolean z11 = n7Var.n;
            c8Var.d(z11, !z11);
            int i16 = n7Var.i;
            float f10 = 1.0f;
            if (i16 > 0) {
                c8Var.e(i16, n7Var.g, n7Var.j);
                c8Var.b(1.0f, false);
            } else {
                TLRPC.User user = n7Var.g;
                if (user != null) {
                    c8Var.setUser(user);
                    if (n7Var.l && !n7Var.k) {
                        f10 = 0.5f;
                    }
                    c8Var.b(f10, false);
                } else {
                    TLRPC.Chat chat = n7Var.h;
                    if (chat != null) {
                        c8Var.a(d8.d1(d8Var, chat), chat);
                    }
                }
            }
            if (!n7Var.k && !n7Var.l) {
                z4 = false;
            }
            c8Var.c(z4, false);
            c8Var.setDivider(z10);
            c8Var.setRedCheckbox(n7Var.m);
            c8Var.v = d8Var.C;
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
            if (n7Var.o > 0) {
                tl0 tl0Var = this.h;
                i12 = Math.max(((tl0Var == null || tl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + x7Var.Q) - n7Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = n7Var.p;
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
            m7 m7Var = (m7) view;
            CharSequence charSequence = n7Var.e;
            CharSequence charSequence2 = n7Var.f;
            m7Var.a.setText(charSequence);
            m7Var.b.setText(charSequence2);
            return;
        }
        int i17 = 11;
        if (i14 == 11) {
            m7 m7Var2 = (m7) view;
            m7Var2.a.setText(n7Var.e);
            m7Var2.b.setText((CharSequence) null);
            return;
        }
        if (i14 == 5) {
            try {
                ((ax0) view).b.getImageReceiver().startAnimation();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i14 == 6) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (n7Var.e == null) {
                a9Var.setFixedSize(12);
                a9Var.setText(null);
                return;
            } else {
                a9Var.setFixedSize(0);
                a9Var.setText(n7Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i18 = n7Var.c;
            if (i18 == 0) {
                ((org.telegram.ui.Cells.o8) view).j(n7Var.e, d8Var.x, z10);
                return;
            } else if (i18 == 1) {
                ((org.telegram.ui.Cells.o8) view).j(n7Var.e, d8Var.y, z10);
                return;
            } else {
                if (i18 == 2) {
                    ((org.telegram.ui.Cells.o8) view).j(n7Var.e, d8Var.w, z10);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = n7Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.o8) view).t(n7Var.e, drawable, z10);
                return;
            } else {
                ((org.telegram.ui.Cells.o8) view).o(n7Var.e, n7Var.f, false, z10);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(n7Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.h3) d8Var).currentAccount;
            int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.x7.a(i19, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(d8Var.E, i19, 0);
            cl0 cl0Var = new cl0(18);
            org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
            w7Var.c = a2;
            w7Var.d = 20;
            w7Var.e = cl0Var;
            ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var, new org.telegram.ui.web.d1(this, i17));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View x7Var;
        org.telegram.ui.Cells.o8 o8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            x7Var = new w7(context);
        } else if (i10 == 0) {
            x7Var = new View(context);
            x7Var.setTag(35);
        } else if (i10 == 1) {
            x7Var = new View(context);
            x7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.e;
            if (i10 == 3) {
                x7Var = new c8(context, g6Var);
            } else {
                if (i10 == 4) {
                    view = new m7(context, g6Var, true);
                } else if (i10 == 11) {
                    x7Var = new m7(context, g6Var, false);
                } else if (i10 == 8) {
                    x7Var = new org.telegram.ui.Cells.m4(context, g6Var);
                    x7Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
                } else if (i10 == 5) {
                    ax0 ax0Var = new ax0(context, null, 1, g6Var);
                    ax0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    ax0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    ax0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = ax0Var;
                } else if (i10 == 6) {
                    x7Var = new org.telegram.ui.Cells.a9(context, g6Var);
                    x7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, false);
                    } else {
                        x7Var = i10 == 10 ? new org.telegram.ui.Cells.x7(context, g6Var) : new jn(context, 26);
                    }
                    x7Var = o8Var;
                }
                x7Var = view;
            }
        }
        return new fl0(x7Var);
    }
}
