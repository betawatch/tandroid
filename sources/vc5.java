// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vc5 extends c79 {
    public final Context c;
    public int d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ xc5 f;

    public vc5(xc5 xc5Var, Context context) {
        this.f = xc5Var;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        if (f89Var.f == 2) {
            ((bd5) f89Var.a).a.getImageReceiver().c();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i == 3 || i == 4) {
            return true;
        }
        return i == 6 && this.f.R;
    }

    @Override // j79
    public final int b() {
        return this.e.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((uc5) this.e.get(i)).a;
    }

    @Override // j79
    public final void f() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.add(new uc5(0, true));
        xc5 xc5Var = this.f;
        if (xc5Var.Q == 5) {
            arrayList.add(new uc5(6, true));
            arrayList.add(new uc5(ob6.M0(2131750548, null)));
        } else {
            arrayList.add(new uc5(4, true));
            arrayList.add(new uc5(ob6.M0(2131749209, null)));
        }
        if (xc5Var.U != null) {
            arrayList.add(new uc5(1, true));
            arrayList.add(new uc5(3, true));
            arrayList.add(new uc5(0, true));
        }
        if (xc5Var.L.size() > 0) {
            arrayList.add(new uc5(1, true));
            this.d = arrayList.size();
            for (int i = 0; i < xc5Var.L.size(); i++) {
                arrayList.add(new uc5(2, true));
            }
            arrayList.add(new uc5(7, true));
        }
        super.f();
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        boolean z;
        int i2 = f89Var.f;
        View view = f89Var.a;
        ArrayList arrayList = this.e;
        xc5 xc5Var = this.f;
        switch (i2) {
            case 1:
                mf5 mf5Var = (mf5) view;
                if (xc5Var.U != null && i == 1) {
                    mf5Var.setText(ob6.M0(2131753954, null));
                    break;
                } else {
                    mf5Var.setText(ob6.G(xc5Var.L.size(), "Members", new Object[0]));
                    break;
                }
            case 2:
                bd5 bd5Var = (bd5) view;
                bd5Var.d(xc5Var.getMessagesController().X1((Long) xc5Var.L.get(i - this.d)), null, null);
                bd5Var.setDrawDivider(i != arrayList.size() - 1);
                break;
            case 3:
                ((qmb) view).b(xc5Var.U, false);
                break;
            case 4:
                skb skbVar = (skb) view;
                int i3 = xc5Var.X;
                String M0 = i3 == 0 ? ob6.M0(2131747166, null) : ob6.c0(i3);
                String M02 = ob6.M0(2131753843, null);
                z = ((e) xc5Var).fragmentBeginToShow;
                skbVar.u(M02, M0, z, R.drawable.msg_autodelete, false);
                break;
            case 5:
                ((ilb) view).setText(((uc5) arrayList.get(i)).c);
                break;
            case 6:
                skb skbVar2 = (skb) view;
                skbVar2.n(R.drawable.msg_topics, ob6.M0(2131752247, null), true);
                skbVar2.getCheckBox().setAlpha(0.75f);
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i == 0) {
            view = new rca(context, (uh9) null);
        } else if (i == 1) {
            mf5 mf5Var = new mf5(context);
            mf5Var.setHeight(46);
            view = mf5Var;
        } else if (i == 2) {
            view = new bd5(context, 0, 3, false);
        } else if (i == 4) {
            view = new skb(context);
        } else if (i == 5) {
            view = new ilb(context);
        } else if (i == 6) {
            view = new skb(23, this.f.getResourceProvider(), context, false, true);
        } else if (i != 7) {
            view = new qmb(context);
        } else {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        }
        return new n69(view);
    }
}
