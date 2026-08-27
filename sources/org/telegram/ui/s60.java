package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ u60 f;

    public s60(u60 u60Var, Context context) {
        this.f = u60Var;
        this.c = context;
    }

    @Override // f2.q0
    public final void A(f2.o1 o1Var) {
        if (o1Var.f == 2) {
            ((org.telegram.ui.Cells.d4) o1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.M;
    }

    @Override // f2.q0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((r60) this.e.get(i10)).a;
    }

    @Override // f2.q0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new r60(0, true));
        u60 u60Var = this.f;
        if (u60Var.L == 5) {
            arrayList.add(new r60(6, true));
            arrayList.add(new r60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new r60(4, true));
            arrayList.add(new r60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (u60Var.P != null) {
            arrayList.add(new r60(1, true));
            arrayList.add(new r60(3, true));
            arrayList.add(new r60(0, true));
        }
        if (u60Var.G.size() > 0) {
            arrayList.add(new r60(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < u60Var.G.size(); i10++) {
                arrayList.add(new r60(2, true));
            }
            arrayList.add(new r60(7, true));
        }
        super.l();
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        boolean z10;
        int i11 = o1Var.f;
        View view = o1Var.a;
        ArrayList arrayList = this.e;
        u60 u60Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (u60Var.P != null && i10 == 1) {
                    j4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    j4Var.setText(LocaleController.formatPluralString("Members", u60Var.G.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
                d4Var.d(u60Var.getMessagesController().getUser((Long) u60Var.G.get(i10 - this.d)), null, null);
                d4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.x9) view).b(u60Var.P, false);
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i12 = u60Var.S;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.n2) u60Var).fragmentBeginToShow;
                l8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.x8) view).setText(((r60) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                l8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                l8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context);
            j4Var.setHeight(46);
            view = j4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.d4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.l8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.x8(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.l8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.x9(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
