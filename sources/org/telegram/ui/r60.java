package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r60 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ t60 f;

    public r60(t60 t60Var, Context context) {
        this.f = t60Var;
        this.c = context;
    }

    @Override // f2.p0
    public final void A(f2.n1 n1Var) {
        if (n1Var.f == 2) {
            ((org.telegram.ui.Cells.e4) n1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.M;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((q60) this.e.get(i10)).a;
    }

    @Override // f2.p0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new q60(0, true));
        t60 t60Var = this.f;
        if (t60Var.L == 5) {
            arrayList.add(new q60(6, true));
            arrayList.add(new q60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new q60(4, true));
            arrayList.add(new q60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (t60Var.P != null) {
            arrayList.add(new q60(1, true));
            arrayList.add(new q60(3, true));
            arrayList.add(new q60(0, true));
        }
        if (t60Var.G.size() > 0) {
            arrayList.add(new q60(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < t60Var.G.size(); i10++) {
                arrayList.add(new q60(2, true));
            }
            arrayList.add(new q60(7, true));
        }
        super.l();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        int i11 = n1Var.f;
        View view = n1Var.a;
        ArrayList arrayList = this.e;
        t60 t60Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (t60Var.P != null && i10 == 1) {
                    k4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    k4Var.setText(LocaleController.formatPluralString("Members", t60Var.G.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
                e4Var.d(t60Var.getMessagesController().getUser((Long) t60Var.G.get(i10 - this.d)), null, null);
                e4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.y9) view).b(t60Var.P, false);
                break;
            case 4:
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                int i12 = t60Var.S;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.o2) t60Var).fragmentBeginToShow;
                m8Var.s(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.y8) view).setText(((q60) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.m8 m8Var2 = (org.telegram.ui.Cells.m8) view;
                m8Var2.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), true);
                m8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.x6(context, (b) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context);
            k4Var.setHeight(46);
            view = k4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.e4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.m8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.y8(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.m8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.y9(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.vk0(view);
    }
}
