package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class u60 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ w60 f;

    public u60(w60 w60Var, Context context) {
        this.f = w60Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        if (b1Var.f == 2) {
            ((org.telegram.ui.Cells.f4) b1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.Q;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((t60) this.e.get(i10)).a;
    }

    @Override // s4.g0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new t60(0, true));
        w60 w60Var = this.f;
        if (w60Var.P == 5) {
            arrayList.add(new t60(6, true));
            arrayList.add(new t60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new t60(4, true));
            arrayList.add(new t60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (w60Var.T != null) {
            arrayList.add(new t60(1, true));
            arrayList.add(new t60(3, true));
            arrayList.add(new t60(0, true));
        }
        if (w60Var.K.size() > 0) {
            arrayList.add(new t60(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < w60Var.K.size(); i10++) {
                arrayList.add(new t60(2, true));
            }
            arrayList.add(new t60(7, true));
        }
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11 = b1Var.f;
        View view = b1Var.a;
        ArrayList arrayList = this.e;
        w60 w60Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (w60Var.T != null && i10 == 1) {
                    l4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    l4Var.setText(LocaleController.formatPluralString("Members", w60Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                f4Var.d(w60Var.getMessagesController().getUser((Long) w60Var.K.get(i10 - this.d)), null, null);
                f4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ca) view).b(w60Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                int i12 = w60Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.o2) w60Var).fragmentBeginToShow;
                r8Var.u(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.e9) view).setText(((t60) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                r8Var2.n(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                r8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setHeight(46);
            view = l4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.f4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.r8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.e9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.r8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.ca(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
