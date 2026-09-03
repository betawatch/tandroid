package ph;

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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cl0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class u7 extends bg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final s7 f;
    public rl0 h;
    public final /* synthetic */ y7 n;

    public u7(y7 y7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, s7 s7Var, nh.t3 t3Var) {
        this.n = y7Var;
        this.d = context;
        this.e = f6Var;
        this.f = s7Var;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return (i10 == 3 && this.n.T.C) || i10 == 7 || i10 == 9 || i10 == 10;
    }

    @Override // f2.o0
    public final int h() {
        ArrayList arrayList = this.n.I;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        y7 y7Var = this.n;
        ArrayList arrayList = y7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((o7) y7Var.I.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        y7 y7Var = this.n;
        e8 e8Var = y7Var.T;
        ArrayList arrayList = y7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        o7 o7Var = (o7) arrayList.get(i10);
        int i14 = l1Var.f;
        View view = l1Var.a;
        boolean z4 = true;
        int i15 = i10 + 1;
        o7 o7Var2 = i15 < arrayList.size() ? (o7) arrayList.get(i15) : null;
        boolean z10 = o7Var2 != null && ((i13 = o7Var2.a) == i14 || (i13 == 9 && o7Var2.q == 1));
        if (i14 == 3) {
            d8 d8Var = (d8) view;
            boolean z11 = o7Var.n;
            d8Var.d(z11, !z11);
            int i16 = o7Var.i;
            float f10 = 1.0f;
            if (i16 > 0) {
                d8Var.e(i16, o7Var.g, o7Var.j);
                d8Var.b(1.0f, false);
            } else {
                TLRPC.User user = o7Var.g;
                if (user != null) {
                    d8Var.setUser(user);
                    if (o7Var.l && !o7Var.k) {
                        f10 = 0.5f;
                    }
                    d8Var.b(f10, false);
                } else {
                    TLRPC.Chat chat = o7Var.h;
                    if (chat != null) {
                        d8Var.a(e8.d1(e8Var, chat), chat);
                    }
                }
            }
            if (!o7Var.k && !o7Var.l) {
                z4 = false;
            }
            d8Var.c(z4, false);
            d8Var.setDivider(z10);
            d8Var.setRedCheckbox(o7Var.m);
            d8Var.v = e8Var.C;
            return;
        }
        if (i14 == 2) {
            return;
        }
        if (i14 == 0) {
            view.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
            return;
        }
        if (i14 == -1) {
            if (o7Var.o > 0) {
                rl0 rl0Var = this.h;
                i12 = Math.max(((rl0Var == null || rl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + y7Var.Q) - o7Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = o7Var.p;
                if (i12 >= 0) {
                    view.setTag(null);
                } else {
                    i12 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                    view.setTag(33);
                }
            }
            view.setLayoutParams(new f2.w0(-1, i12));
            return;
        }
        if (i14 == 1) {
            view.setLayoutParams(new f2.w0(-1, Math.min(AndroidUtilities.dp(150.0f), this.f.G)));
            return;
        }
        if (i14 == 4) {
            n7 n7Var = (n7) view;
            CharSequence charSequence = o7Var.e;
            CharSequence charSequence2 = o7Var.f;
            n7Var.a.setText(charSequence);
            n7Var.b.setText(charSequence2);
            return;
        }
        int i17 = 11;
        if (i14 == 11) {
            n7 n7Var2 = (n7) view;
            n7Var2.a.setText(o7Var.e);
            n7Var2.b.setText((CharSequence) null);
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
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (o7Var.e == null) {
                z8Var.setFixedSize(12);
                z8Var.setText(null);
                return;
            } else {
                z8Var.setFixedSize(0);
                z8Var.setText(o7Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i18 = o7Var.c;
            if (i18 == 0) {
                ((org.telegram.ui.Cells.n8) view).j(o7Var.e, e8Var.x, z10);
                return;
            } else if (i18 == 1) {
                ((org.telegram.ui.Cells.n8) view).j(o7Var.e, e8Var.y, z10);
                return;
            } else {
                if (i18 == 2) {
                    ((org.telegram.ui.Cells.n8) view).j(o7Var.e, e8Var.w, z10);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = o7Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.n8) view).t(o7Var.e, drawable, z10);
                return;
            } else {
                ((org.telegram.ui.Cells.n8) view).o(o7Var.e, o7Var.f, false, z10);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.l4) view).setText(o7Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.g3) e8Var).currentAccount;
            int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.w7.a(i19, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(e8Var.E, i19, 0);
            cl0 cl0Var = new cl0(17);
            org.telegram.ui.Cells.v7 v7Var = new org.telegram.ui.Cells.v7();
            v7Var.c = a2;
            v7Var.d = 20;
            v7Var.e = cl0Var;
            ((org.telegram.ui.Cells.w7) view).d(clamp, v7Var, new org.telegram.ui.web.a1(this, i17));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View w7Var;
        org.telegram.ui.Cells.n8 n8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            w7Var = new x7(context);
        } else if (i10 == 0) {
            w7Var = new View(context);
            w7Var.setTag(35);
        } else if (i10 == 1) {
            w7Var = new View(context);
            w7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i10 == 3) {
                w7Var = new d8(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new n7(context, f6Var, true);
                } else if (i10 == 11) {
                    w7Var = new n7(context, f6Var, false);
                } else if (i10 == 8) {
                    w7Var = new org.telegram.ui.Cells.l4(context, f6Var);
                    w7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
                } else if (i10 == 5) {
                    zw0 zw0Var = new zw0(context, null, 1, f6Var);
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = zw0Var;
                } else if (i10 == 6) {
                    w7Var = new org.telegram.ui.Cells.z8(context, f6Var);
                    w7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        n8Var = new org.telegram.ui.Cells.n8(23, this.d, this.e, true, false);
                    } else {
                        w7Var = i10 == 10 ? new org.telegram.ui.Cells.w7(context, f6Var) : new gn(context, 26);
                    }
                    w7Var = n8Var;
                }
                w7Var = view;
            }
        }
        return new dl0(w7Var);
    }
}
