package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w40 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ y40 f;

    public w40(y40 y40Var, Context context) {
        this.f = y40Var;
        this.c = context;
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        if (d1Var.f == 2) {
            ((org.telegram.ui.Cells.h4) d1Var.a).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        if (i3 == 3 || i3 == 4) {
            return true;
        }
        return i3 == 6 && this.f.R;
    }

    @Override // u4.h0
    public final int b() {
        return this.e.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((v40) this.e.get(i3)).a;
    }

    @Override // u4.h0
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new v40(0, true));
        y40 y40Var = this.f;
        if (y40Var.Q == 5) {
            arrayList.add(new v40(6, true));
            arrayList.add(new v40(org.telegram.messenger.bd.M0(2131750589, null)));
        } else {
            arrayList.add(new v40(4, true));
            arrayList.add(new v40(org.telegram.messenger.bd.M0(2131749463, null)));
        }
        if (y40Var.U != null) {
            arrayList.add(new v40(1, true));
            arrayList.add(new v40(3, true));
            arrayList.add(new v40(0, true));
        }
        if (y40Var.L.size() > 0) {
            arrayList.add(new v40(1, true));
            this.d = arrayList.size();
            for (int i3 = 0; i3 < y40Var.L.size(); i3++) {
                arrayList.add(new v40(2, true));
            }
            arrayList.add(new v40(7, true));
        }
        super.f();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        int i10 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.e;
        y40 y40Var = this.f;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (y40Var.U != null && i3 == 1) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131753961, null));
                    break;
                } else {
                    n4Var.setText(org.telegram.messenger.bd.G(y40Var.L.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
                h4Var.d(y40Var.getMessagesController().a2((Long) y40Var.L.get(i3 - this.d)), null, null);
                h4Var.setDrawDivider(i3 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.v9) view).b(y40Var.U, false);
                break;
            case 4:
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                int i11 = y40Var.X;
                String M0 = i11 == 0 ? org.telegram.messenger.bd.M0(2131747447, null) : org.telegram.messenger.bd.c0(i11);
                String M02 = org.telegram.messenger.bd.M0(2131753850, null);
                z10 = ((org.telegram.ui.ActionBar.d2) y40Var).fragmentBeginToShow;
                l8Var.u(M02, M0, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.y8) view).setText(((v40) arrayList.get(i3)).c);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var2 = (org.telegram.ui.Cells.l8) view;
                l8Var2.n(R.drawable.msg_topics, org.telegram.messenger.bd.M0(2131752281, null), true);
                l8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = this.c;
        if (i3 == 0) {
            view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
        } else if (i3 == 1) {
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context);
            n4Var.setHeight(46);
            view = n4Var;
        } else if (i3 == 2) {
            view = new org.telegram.ui.Cells.h4(context, 0, 3, false);
        } else if (i3 == 4) {
            view = new org.telegram.ui.Cells.l8(context);
        } else if (i3 == 5) {
            view = new org.telegram.ui.Cells.y8(context);
        } else if (i3 == 6) {
            view = new org.telegram.ui.Cells.l8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i3 != 7) {
            view = new org.telegram.ui.Cells.v9(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.bj0(view);
    }
}
