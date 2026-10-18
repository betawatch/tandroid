package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ u60 f;

    public s60(u60 u60Var, Context context) {
        this.f = u60Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.b1 b1Var) {
        if (b1Var.f == 2) {
            ((org.telegram.ui.Cells.f4) b1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.hm0
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
        return ((r60) this.e.get(i10)).a;
    }

    @Override // s4.g0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new r60(0, true));
        u60 u60Var = this.f;
        if (u60Var.P == 5) {
            arrayList.add(new r60(6, true));
            arrayList.add(new r60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new r60(4, true));
            arrayList.add(new r60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (u60Var.T != null) {
            arrayList.add(new r60(1, true));
            arrayList.add(new r60(3, true));
            arrayList.add(new r60(0, true));
        }
        if (u60Var.K.size() > 0) {
            arrayList.add(new r60(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < u60Var.K.size(); i10++) {
                arrayList.add(new r60(2, true));
            }
            arrayList.add(new r60(7, true));
        }
        super.l();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        int i11 = b1Var.f;
        View view = b1Var.a;
        ArrayList arrayList = this.e;
        u60 u60Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (u60Var.T != null && i10 == 1) {
                    l4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    l4Var.setText(LocaleController.formatPluralString("Members", u60Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
                f4Var.d(u60Var.getMessagesController().getUser((Long) u60Var.K.get(i10 - this.d)), null, null);
                f4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ba) view).b(u60Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                int i12 = u60Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.n2) u60Var).fragmentBeginToShow;
                q8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.d9) view).setText(((r60) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                q8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                q8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setHeight(46);
            view = l4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.f4(0, 3, context, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.q8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.d9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.q8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.ba(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.sl0(view);
    }
}
