package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class z50 extends org.telegram.ui.Components.tk0 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ b60 f;

    public z50(b60 b60Var, Context context) {
        this.f = b60Var;
        this.c = context;
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        if (c1Var.f == 2) {
            ((org.telegram.ui.Cells.j4) c1Var.a).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        if (i10 == 3 || i10 == 4) {
            return true;
        }
        return i10 == 6 && this.f.Q;
    }

    @Override // s4.g0
    public final int b() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((y50) this.e.get(i10)).a;
    }

    @Override // s4.g0
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new y50(0, true));
        b60 b60Var = this.f;
        if (b60Var.P == 5) {
            arrayList.add(new y50(6, true));
            arrayList.add(new y50(org.telegram.messenger.dd.L0(2131750589, null)));
        } else {
            arrayList.add(new y50(4, true));
            arrayList.add(new y50(org.telegram.messenger.dd.L0(2131749464, null)));
        }
        if (b60Var.T != null) {
            arrayList.add(new y50(1, true));
            arrayList.add(new y50(3, true));
            arrayList.add(new y50(0, true));
        }
        if (b60Var.K.size() > 0) {
            arrayList.add(new y50(1, true));
            this.d = arrayList.size();
            for (int i10 = 0; i10 < b60Var.K.size(); i10++) {
                arrayList.add(new y50(2, true));
            }
            arrayList.add(new y50(7, true));
        }
        super.f();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.e;
        b60 b60Var = this.f;
        switch (i11) {
            case 1:
                org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
                if (b60Var.T != null && i10 == 1) {
                    p4Var.setText(org.telegram.messenger.dd.L0(2131753961, null));
                    break;
                } else {
                    p4Var.setText(org.telegram.messenger.dd.G(b60Var.K.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.d(b60Var.getMessagesController().Z1((Long) b60Var.K.get(i10 - this.d)), null, null);
                j4Var.setDrawDivider(i10 != arrayList.size() - 1);
                break;
            case 3:
                ((org.telegram.ui.Cells.x9) view).b(b60Var.T, false);
                break;
            case 4:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                int i12 = b60Var.W;
                String L0 = i12 == 0 ? org.telegram.messenger.dd.L0(2131747455, null) : org.telegram.messenger.dd.c0(i12);
                String L02 = org.telegram.messenger.dd.L0(2131753850, null);
                z10 = ((org.telegram.ui.ActionBar.k2) b60Var).fragmentBeginToShow;
                p8Var.u(L02, L0, z10, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((org.telegram.ui.Cells.b9) view).setText(((y50) arrayList.get(i10)).c);
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
                p8Var2.n(R.drawable.msg_topics, org.telegram.messenger.dd.L0(2131752281, null), true);
                p8Var2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            view = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null);
        } else if (i10 == 1) {
            org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context);
            p4Var.setHeight(46);
            view = p4Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.j4(context, 0, 3, false);
        } else if (i10 == 4) {
            view = new org.telegram.ui.Cells.p8(context);
        } else if (i10 == 5) {
            view = new org.telegram.ui.Cells.b9(context);
        } else if (i10 == 6) {
            view = new org.telegram.ui.Cells.p8(23, this.c, this.f.getResourceProvider(), false, true);
        } else if (i10 != 7) {
            view = new org.telegram.ui.Cells.x9(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new org.telegram.ui.Components.dk0(view);
    }
}
