// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sc5 extends q59 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ uc5 f;

    public sc5(uc5 uc5Var, Context context) {
        this.f = uc5Var;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        if (u69Var.f == 2) {
            ((xc5) u69Var.a).a.getImageReceiver().c();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i == 3 || i == 4) {
            return true;
        }
        return i == 6 && this.f.R;
    }

    @Override // y59
    public final int b() {
        return this.e.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((rc5) this.e.get(i)).a;
    }

    @Override // y59
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new rc5(0, true));
        uc5 uc5Var = this.f;
        if (uc5Var.Q == 5) {
            arrayList.add(new rc5(6, true));
            arrayList.add(new rc5(jb6.M0(2131750520, null)));
        } else {
            arrayList.add(new rc5(4, true));
            arrayList.add(new rc5(jb6.M0(2131749212, null)));
        }
        if (uc5Var.U != null) {
            arrayList.add(new rc5(1, true));
            arrayList.add(new rc5(3, true));
            arrayList.add(new rc5(0, true));
        }
        if (uc5Var.L.size() > 0) {
            arrayList.add(new rc5(1, true));
            this.d = arrayList.size();
            for (int i = 0; i < uc5Var.L.size(); i++) {
                arrayList.add(new rc5(2, true));
            }
            arrayList.add(new rc5(7, true));
        }
        super.f();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        boolean z;
        int i2 = u69Var.f;
        View view = u69Var.a;
        ArrayList arrayList = this.e;
        uc5 uc5Var = this.f;
        switch (i2) {
            case 1:
                jf5 jf5Var = (jf5) view;
                if (uc5Var.U != null && i == 1) {
                    jf5Var.setText(jb6.M0(2131753926, null));
                    break;
                } else {
                    jf5Var.setText(jb6.G(uc5Var.L.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                xc5 xc5Var = (xc5) view;
                xc5Var.d(uc5Var.getMessagesController().W1((Long) uc5Var.L.get(i - this.d)), null, null);
                xc5Var.setDrawDivider(i != arrayList.size() - 1);
                break;
            case 3:
                ((vkb) view).b(uc5Var.U, false);
                break;
            case 4:
                xib xibVar = (xib) view;
                int i3 = uc5Var.X;
                String M0 = i3 == 0 ? jb6.M0(2131747172, null) : jb6.c0(i3);
                String M02 = jb6.M0(2131753815, null);
                z = ((d) uc5Var).fragmentBeginToShow;
                xibVar.u(M02, M0, z, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((njb) view).setText(((rc5) arrayList.get(i)).c);
                break;
            case 6:
                xib xibVar2 = (xib) view;
                xibVar2.n(R.drawable.msg_topics, jb6.M0(2131752219, null), true);
                xibVar2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i == 0) {
            view = new bba(context, (hg9) null);
        } else if (i == 1) {
            jf5 jf5Var = new jf5(context);
            jf5Var.setHeight(46);
            view = jf5Var;
        } else if (i == 2) {
            view = new xc5(context, 0, 3, false);
        } else if (i == 4) {
            view = new xib(context);
        } else if (i == 5) {
            view = new njb(context);
        } else if (i == 6) {
            view = new xib(23, this.f.getResourceProvider(), context, false, true);
        } else if (i != 7) {
            view = new vkb(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new b59(view);
    }
}
