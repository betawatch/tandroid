package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class v60 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ x60 f;

    public v60(x60 x60Var, Context context) {
        this.f = x60Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        if (e1Var.f == 2) {
            ((org.telegram.ui.Cells.k4) e1Var.a).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.lm0
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
        return ((u60) this.e.get(i10)).a;
    }

    @Override // s4.h0
    public final void l() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new u60(0, true));
        x60 x60Var = this.f;
        if (x60Var.P == 5) {
            arrayList.add(new u60(6, true));
            arrayList.add(new u60(LocaleController.getString(R.string.ForumToggleDescription)));
        } else {
            arrayList.add(new u60(4, true));
            arrayList.add(new u60(LocaleController.getString(R.string.GroupCreateAutodeleteDescription)));
        }
        if (x60Var.T != null) {
            arrayList.add(new u60(1, true));
            arrayList.add(new u60(3, true));
            arrayList.add(new u60(0, true));
        }
        if (x60Var.K.size() > 0) {
            arrayList.add(new u60(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < x60Var.K.size(); i10++) {
                arrayList.add(new u60(2, true));
            }
            arrayList.add(new u60(7, true));
        }
        super.l();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        int i11 = e1Var.f;
        View view = e1Var.a;
        ArrayList arrayList = this.e;
        x60 x60Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                if (x60Var.T != null && i10 == 1) {
                    q4Var.setText(LocaleController.getString(R.string.AttachLocation));
                    break;
                } else {
                    q4Var.setText(LocaleController.formatPluralString("Members", x60Var.K.size(), new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                k4Var.d(x60Var.getMessagesController().getUser((Long) x60Var.K.get(i10 - this.d)), null, null);
                k4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.ga) view).b(x60Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                int i12 = x60Var.W;
                String string = i12 == 0 ? LocaleController.getString(R.string.PasswordOff) : LocaleController.formatTTLString(i12);
                String string2 = LocaleController.getString(R.string.AutoDeleteMessages);
                z10 = ((org.telegram.ui.ActionBar.r2) x60Var).fragmentBeginToShow;
                v8Var.u(string2, string, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.i9) view).setText(((u60) arrayList.get(i10)).c);
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
        return new org.telegram.ui.Components.vl0(view);
    }
}
