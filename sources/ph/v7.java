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
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.al0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class v7 extends bg.c {
    public final Context d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final t7 f;
    public sl0 h;
    public final /* synthetic */ z7 n;

    public v7(z7 z7Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, t7 t7Var, nh.t3 t3Var) {
        this.n = z7Var;
        this.d = context;
        this.e = f6Var;
        this.f = t7Var;
    }

    @Override // org.telegram.ui.Components.rl0
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
        z7 z7Var = this.n;
        ArrayList arrayList = z7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return -1;
        }
        return ((p7) z7Var.I.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        z7 z7Var = this.n;
        f8 f8Var = z7Var.T;
        ArrayList arrayList = z7Var.I;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        p7 p7Var = (p7) arrayList.get(i10);
        int i14 = l1Var.f;
        View view = l1Var.a;
        boolean z4 = true;
        int i15 = i10 + 1;
        p7 p7Var2 = i15 < arrayList.size() ? (p7) arrayList.get(i15) : null;
        boolean z10 = p7Var2 != null && ((i13 = p7Var2.a) == i14 || (i13 == 9 && p7Var2.q == 1));
        if (i14 == 3) {
            e8 e8Var = (e8) view;
            boolean z11 = p7Var.n;
            e8Var.d(z11, !z11);
            int i16 = p7Var.i;
            float f10 = 1.0f;
            if (i16 > 0) {
                e8Var.e(i16, p7Var.g, p7Var.j);
                e8Var.b(1.0f, false);
            } else {
                TLRPC.User user = p7Var.g;
                if (user != null) {
                    e8Var.setUser(user);
                    if (p7Var.l && !p7Var.k) {
                        f10 = 0.5f;
                    }
                    e8Var.b(f10, false);
                } else {
                    TLRPC.Chat chat = p7Var.h;
                    if (chat != null) {
                        e8Var.a(f8.d1(f8Var, chat), chat);
                    }
                }
            }
            if (!p7Var.k && !p7Var.l) {
                z4 = false;
            }
            e8Var.c(z4, false);
            e8Var.setDivider(z10);
            e8Var.setRedCheckbox(p7Var.m);
            e8Var.v = f8Var.C;
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
            if (p7Var.o > 0) {
                sl0 sl0Var = this.h;
                i12 = Math.max(((sl0Var == null || sl0Var.getMeasuredHeight() <= 0) ? AndroidUtilities.displaySize.y : this.h.getMeasuredHeight() + z7Var.Q) - p7Var.o, AndroidUtilities.dp(120.0f));
                view.setTag(33);
            } else {
                i12 = p7Var.p;
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
            o7 o7Var = (o7) view;
            CharSequence charSequence = p7Var.e;
            CharSequence charSequence2 = p7Var.f;
            o7Var.a.setText(charSequence);
            o7Var.b.setText(charSequence2);
            return;
        }
        int i17 = 11;
        if (i14 == 11) {
            o7 o7Var2 = (o7) view;
            o7Var2.a.setText(p7Var.e);
            o7Var2.b.setText((CharSequence) null);
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
            if (p7Var.e == null) {
                a9Var.setFixedSize(12);
                a9Var.setText(null);
                return;
            } else {
                a9Var.setFixedSize(0);
                a9Var.setText(p7Var.e);
                return;
            }
        }
        if (i14 == 7) {
            int i18 = p7Var.c;
            if (i18 == 0) {
                ((org.telegram.ui.Cells.o8) view).j(p7Var.e, f8Var.x, z10);
                return;
            } else if (i18 == 1) {
                ((org.telegram.ui.Cells.o8) view).j(p7Var.e, f8Var.y, z10);
                return;
            } else {
                if (i18 == 2) {
                    ((org.telegram.ui.Cells.o8) view).j(p7Var.e, f8Var.w, z10);
                    return;
                }
                return;
            }
        }
        if (i14 == 9) {
            Drawable drawable = p7Var.d;
            if (drawable != null) {
                ((org.telegram.ui.Cells.o8) view).t(p7Var.e, drawable, z10);
                return;
            } else {
                ((org.telegram.ui.Cells.o8) view).o(p7Var.e, p7Var.f, false, z10);
                return;
            }
        }
        if (i14 == 8) {
            ((org.telegram.ui.Cells.m4) view).setText(p7Var.e);
            return;
        }
        if (i14 == 10) {
            i11 = ((org.telegram.ui.ActionBar.g3) f8Var).currentAccount;
            int i19 = (int) MessagesController.getInstance(i11).starsPaidMessageAmountMax;
            int[] a2 = org.telegram.ui.Cells.x7.a(i19, new int[]{0, 1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
            int clamp = Utilities.clamp(f8Var.E, i19, 0);
            al0 al0Var = new al0(17);
            org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
            w7Var.c = a2;
            w7Var.d = 20;
            w7Var.e = al0Var;
            ((org.telegram.ui.Cells.x7) view).d(clamp, w7Var, new org.telegram.ui.web.y0(this, i17));
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View x7Var;
        org.telegram.ui.Cells.o8 o8Var;
        View view;
        Context context = this.d;
        if (i10 == -1) {
            x7Var = new y7(context);
        } else if (i10 == 0) {
            x7Var = new View(context);
            x7Var.setTag(35);
        } else if (i10 == 1) {
            x7Var = new View(context);
            x7Var.setTag(34);
        } else {
            org.telegram.ui.ActionBar.f6 f6Var = this.e;
            if (i10 == 3) {
                x7Var = new e8(context, f6Var);
            } else {
                if (i10 == 4) {
                    view = new o7(context, f6Var, true);
                } else if (i10 == 11) {
                    x7Var = new o7(context, f6Var, false);
                } else if (i10 == 8) {
                    x7Var = new org.telegram.ui.Cells.m4(context, f6Var);
                    x7Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
                } else if (i10 == 5) {
                    zw0 zw0Var = new zw0(context, null, 1, f6Var);
                    zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                    zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    zw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                    view = zw0Var;
                } else if (i10 == 6) {
                    x7Var = new org.telegram.ui.Cells.a9(context, f6Var);
                    x7Var.setBackgroundColor(-15921907);
                } else {
                    if (i10 == 7) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, true);
                    } else if (i10 == 9) {
                        o8Var = new org.telegram.ui.Cells.o8(23, this.d, this.e, true, false);
                    } else {
                        x7Var = i10 == 10 ? new org.telegram.ui.Cells.x7(context, f6Var) : new hn(context, 26);
                    }
                    x7Var = o8Var;
                }
                x7Var = view;
            }
        }
        return new el0(x7Var);
    }
}
