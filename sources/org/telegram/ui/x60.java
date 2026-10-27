package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class x60 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ z60 f;

    public x60(z60 z60Var, Context context) {
        this.f = z60Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        if (e1Var.f == 2) {
            ((org.telegram.ui.Cells.k4) e1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.Q;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((w60) this.e.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new w60(0, true));
        z60 z60Var = this.f;
        if (z60Var.P == 5) {
            arrayList.add(new w60(6, true));
            arrayList.add(new w60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new w60(4, true));
            arrayList.add(new w60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (z60Var.T != null) {
            arrayList.add(new w60(1, true));
            arrayList.add(new w60(3, true));
            arrayList.add(new w60(0, true));
        }
        if (z60Var.K.size() > 0) {
            arrayList.add(new w60(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < z60Var.K.size(); i10++) {
                arrayList.add(new w60(2, true));
            }
            arrayList.add(new w60(7, true));
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList = this.e;
        z60 z60Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (z60Var.T != null && i10 == 1) {
                    q4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    q4Var.setText(LocaleController.formatPluralString("Members", z60Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                k4Var.d(z60Var.getMessagesController().getUser((Long) z60Var.K.get(i10 - this.d)), null, null);
                k4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ga) view).b(z60Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                int i12 = z60Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.r2) z60Var).fragmentBeginToShow;
                v8Var.u(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.i9) view).setText(((w60) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.v8 v8Var2 = (org.telegram.ui.Cells.v8) view;
                v8Var2.n(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                v8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.f7(context, (d3) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context);
            q4Var.setHeight(46);
            view = q4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.k4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.v8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.i9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.v8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.ga(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
