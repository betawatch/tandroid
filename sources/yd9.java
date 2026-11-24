// default package

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yd9 implements me9 {
    public final /* synthetic */ be9 a;

    public yd9(be9 be9Var) {
        this.a = be9Var;
    }

    @Override // me9
    public final boolean G(ne9 ne9Var) {
        be9 be9Var = this.a;
        if (be9Var.h == null || be9Var.f == null || ne9Var.length() != 0) {
            return false;
        }
        be9Var.h.a(be9Var.f);
        return true;
    }

    @Override // me9
    public final void H() {
        ll0 ll0Var;
        be9 be9Var = this.a;
        lg9 lg9Var = be9Var.h;
        if (lg9Var == null || (ll0Var = be9Var.f) == null) {
            return;
        }
        lg9Var.a(ll0Var);
    }

    @Override // me9
    public final void M(CharSequence charSequence) {
        lg9 lg9Var = this.a.h;
        if (lg9Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        lg9Var.a.u4(charSequence.toString());
    }

    @Override // me9
    public final void S(Editable editable) {
        be9 be9Var = this.a;
        ll0 ll0Var = be9Var.f;
        if (ll0Var != null) {
            ll0Var.s = true;
            ll0Var.r = be9Var.d.q2;
        }
        if (ll0Var != null) {
            TL_iv.PageBlock pageBlock = ll0Var.b;
            if (pageBlock instanceof TL_iv.pageBlockDetails) {
                ((TL_iv.pageBlockDetails) pageBlock).title = zk9.f(editable);
            }
        }
        lg9 lg9Var = be9Var.h;
        if (lg9Var == null || be9Var.f == null) {
            return;
        }
        ch9 ch9Var = lg9Var.a;
        of9 of9Var = ch9Var.R3;
        if (of9Var != null) {
            of9Var.g();
        }
        ch9Var.p3.onContentChanged();
    }

    @Override // me9
    public final void W(ne9 ne9Var) {
        ll0 ll0Var;
        ch9 ch9Var;
        ArrayList arrayList;
        int indexOf;
        be9 be9Var = this.a;
        lg9 lg9Var = be9Var.h;
        if (lg9Var == null || (ll0Var = be9Var.f) == null || (indexOf = (arrayList = (ch9Var = lg9Var.a).t3).indexOf(ll0Var)) < 0) {
            return;
        }
        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) ll0Var.b;
        if (!pageblockdetails.open) {
            pageblockdetails.open = true;
            ch9Var.g3.O(true);
        }
        int i = indexOf + 1;
        if (i >= arrayList.size() || ((ll0) arrayList.get(i)).i || ch9.t3((ll0) arrayList.get(i))) {
            return;
        }
        ch9Var.post(new vf9(ch9Var, (ll0) arrayList.get(i), (byte) 24));
    }

    @Override // me9
    public final boolean Z(boolean z) {
        return false;
    }

    @Override // me9
    public final void d(ne9 ne9Var) {
        lg9 lg9Var = this.a.h;
        if (lg9Var != null) {
            ch9 ch9Var = lg9Var.a;
            ch9Var.i4(ne9Var);
            ch9Var.p3.j(ne9Var, true);
        }
    }

    @Override // me9
    public final boolean i() {
        be9 be9Var = this.a;
        lg9 lg9Var = be9Var.h;
        if (lg9Var == null || be9Var.f == null) {
            return false;
        }
        return lg9Var.a.V4();
    }

    @Override // me9
    public final void r(ne9 ne9Var, int i, int i2) {
        lg9 lg9Var;
        gkb textSelectionHelper;
        be9 be9Var = this.a;
        if (be9Var.n || i == i2 || (lg9Var = be9Var.h) == null || (textSelectionHelper = lg9Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.w() && textSelectionHelper.W == be9Var) {
            return;
        }
        be9Var.post(new g01((Object) this, (Object) ne9Var, i2, (Object) textSelectionHelper, i, (byte) 3));
    }

    @Override // me9
    public final boolean v(ne9 ne9Var) {
        return false;
    }

    @Override // me9
    public final void k(int i, int i2) {
    }
}
