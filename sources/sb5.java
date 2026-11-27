// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sb5 extends c79 {
    public vc2 c;
    public final int d;
    public ArrayList f;
    public g75 h;
    public final j95 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public sb5(vc2 vc2Var, int i, j95 j95Var) {
        this.c = vc2Var;
        this.d = i;
        this.n = j95Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void E(q95 q95Var, boolean z) {
        if (z) {
            if (q95Var.getRenderer() == null) {
                q95Var.setRenderer(ka5.c(this.f, this.h, null, null, q95Var, q95Var.getParticipant(), this.c, this.n));
            }
        } else if (q95Var.getRenderer() != null) {
            q95Var.getRenderer().setTabletGridView(null);
            q95Var.setRenderer(null);
        }
    }

    public final int F() {
        d79 d79Var = this.n.f4;
        int size = this.e.size();
        return size <= 1 ? d79Var.getMeasuredHeight() : size <= 4 ? d79Var.getMeasuredHeight() / 2 : (int) (d79Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, g75 g75Var) {
        this.f = arrayList;
        this.h = g75Var;
    }

    public final void H(d79 d79Var, boolean z, boolean z2) {
        this.r = z;
        if (z2) {
            for (int i = 0; i < d79Var.getChildCount(); i++) {
                View childAt = d79Var.getChildAt(i);
                if (childAt instanceof q95) {
                    q95 q95Var = (q95) childAt;
                    if (q95Var.getParticipant() != null) {
                        E(q95Var, z);
                    }
                }
            }
        }
    }

    public final void I(d79 d79Var, boolean z) {
        if (this.c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (!z) {
            arrayList.clear();
            arrayList.addAll(this.c.f);
            f();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.c.f);
            cy7.a(new ak3(this, arrayList2, (byte) 2), true).c(this);
            hl.V3(d79Var);
        }
    }

    @Override // j79
    public final int b() {
        return this.e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r7 != 1) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        int i2;
        q95 q95Var = (q95) f89Var.a;
        wc2 participant = q95Var.getParticipant();
        ArrayList arrayList = this.e;
        wc2 wc2Var = (wc2) arrayList.get(i);
        TLRPC.GroupCallParticipant groupCallParticipant = ((wc2) arrayList.get(i)).a;
        int size = arrayList.size();
        if (size > 1 && size != 2) {
            i2 = 3;
            if (size == 3) {
                if (i != 0) {
                }
            }
            q95Var.a = i2;
            q95Var.b = this;
            if (q95Var.getMeasuredHeight() != F()) {
                q95Var.requestLayout();
            }
            k5.a(this.d);
            TLRPC.Peer peer = this.c.J;
            q95Var.d = wc2Var;
            if (participant == null && !participant.equals(wc2Var) && q95Var.e && q95Var.getRenderer() != null) {
                E(q95Var, false);
                E(q95Var, true);
                return;
            } else {
                if (q95Var.getRenderer() == null) {
                    q95Var.getRenderer().j(true);
                    return;
                }
                return;
            }
        }
        i2 = 6;
        q95Var.a = i2;
        q95Var.b = this;
        if (q95Var.getMeasuredHeight() != F()) {
        }
        k5.a(this.d);
        TLRPC.Peer peer2 = this.c.J;
        q95Var.d = wc2Var;
        if (participant == null) {
        }
        if (q95Var.getRenderer() == null) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        return new n69(new d95(this, viewGroup.getContext()));
    }
}
