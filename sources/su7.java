// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class su7 extends q59 {
    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override // y59
    public final int b() {
        return ru7.a().size();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        hu7 hu7Var = (hu7) u69Var.a;
        ru7 ru7Var = (ru7) ru7.a().get(i);
        hu7Var.getClass();
        hu7Var.setTypeface(ru7Var.b());
        String str = ru7Var.c;
        if (str == null) {
            str = jb6.N0(ru7Var.b);
        }
        hu7Var.setText(str);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        hu7 hu7Var = new hu7(viewGroup.getContext());
        hu7Var.setLayoutParams(new g69(-1, -2));
        return new b59(hu7Var);
    }
}
