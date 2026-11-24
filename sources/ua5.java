// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ua5 extends n39 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ wa5 f;

    public ua5(wa5 wa5Var, Context context) {
        this.f = wa5Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        if (s49Var.f == 2) {
            ((za5) s49Var.a).a.getImageReceiver().c();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i == 3 || i == 4) {
            return true;
        }
        return i == 6 && this.f.R;
    }

    @Override // w39
    public final int b() {
        return this.e.size();
    }

    @Override // w39
    public final int d(int i) {
        return ((ta5) this.e.get(i)).a;
    }

    @Override // w39
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new ta5(0, true));
        wa5 wa5Var = this.f;
        if (wa5Var.Q == 5) {
            arrayList.add(new ta5(6, true));
            arrayList.add(new ta5(k96.M0(2131750571, null)));
        } else {
            arrayList.add(new ta5(4, true));
            arrayList.add(new ta5(k96.M0(2131749263, null)));
        }
        if (wa5Var.U != null) {
            arrayList.add(new ta5(1, true));
            arrayList.add(new ta5(3, true));
            arrayList.add(new ta5(0, true));
        }
        if (wa5Var.L.size() > 0) {
            arrayList.add(new ta5(1, true));
            this.d = arrayList.size();
            for (int i = 0; i < wa5Var.L.size(); i++) {
                arrayList.add(new ta5(2, true));
            }
            arrayList.add(new ta5(7, true));
        }
        super.f();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        boolean z;
        int i2 = s49Var.f;
        View view = s49Var.a;
        ArrayList arrayList = this.e;
        wa5 wa5Var = this.f;
        switch (i2) {
            case 1:
                ld5 ld5Var = (ld5) view;
                if (wa5Var.U != null && i == 1) {
                    ld5Var.setText(k96.M0(2131753958, null));
                    break;
                } else {
                    ld5Var.setText(k96.G(wa5Var.L.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                za5 za5Var = (za5) view;
                za5Var.d(wa5Var.getMessagesController().V1((Long) wa5Var.L.get(i - this.d)), null, null);
                za5Var.setDrawDivider(i != arrayList.size() - 1);
                break;
            case 3:
                ((uib) view).b(wa5Var.U, false);
                break;
            case 4:
                wgb wgbVar = (wgb) view;
                int i3 = wa5Var.X;
                String M0 = i3 == 0 ? k96.M0(2131747246, null) : k96.c0(i3);
                String M02 = k96.M0(2131753847, null);
                z = ((d) wa5Var).fragmentBeginToShow;
                wgbVar.u(M02, M0, z, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((mhb) view).setText(((ta5) arrayList.get(i)).c);
                break;
            case 6:
                wgb wgbVar2 = (wgb) view;
                wgbVar2.n(R.drawable.msg_topics, k96.M0(2131752269, null), true);
                wgbVar2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i == 0) {
            view = new b9a(context, (de9) null);
        } else if (i == 1) {
            ld5 ld5Var = new ld5(context);
            ld5Var.setHeight(46);
            view = ld5Var;
        } else if (i == 2) {
            view = new za5(context, 0, 3, false);
        } else if (i == 4) {
            view = new wgb(context);
        } else if (i == 5) {
            view = new mhb(context);
        } else if (i == 6) {
            view = new wgb(23, this.f.getResourceProvider(), context, false, true);
        } else if (i != 7) {
            view = new uib(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new y29(view);
    }
}
