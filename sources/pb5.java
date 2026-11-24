// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pb5 extends q59 {
    public qd2 c;
    public final int d;
    public ArrayList f;
    public c75 h;
    public final g95 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public pb5(qd2 qd2Var, int i, g95 g95Var) {
        this.c = qd2Var;
        this.d = i;
        this.n = g95Var;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    public final void E(n95 n95Var, boolean z) {
        if (z) {
            if (n95Var.getRenderer() == null) {
                n95Var.setRenderer(ha5.c(this.f, this.h, null, null, n95Var, n95Var.getParticipant(), this.c, this.n));
            }
        } else if (n95Var.getRenderer() != null) {
            n95Var.getRenderer().setTabletGridView(null);
            n95Var.setRenderer(null);
        }
    }

    public final int F() {
        r59 r59Var = this.n.f4;
        int size = this.e.size();
        return size <= 1 ? r59Var.getMeasuredHeight() : size <= 4 ? r59Var.getMeasuredHeight() / 2 : (int) (r59Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, c75 c75Var) {
        this.f = arrayList;
        this.h = c75Var;
    }

    public final void H(r59 r59Var, boolean z, boolean z2) {
        this.r = z;
        if (z2) {
            for (int i = 0; i < r59Var.getChildCount(); i++) {
                View childAt = r59Var.getChildAt(i);
                if (childAt instanceof n95) {
                    n95 n95Var = (n95) childAt;
                    if (n95Var.getParticipant() != null) {
                        E(n95Var, z);
                    }
                }
            }
        }
    }

    public final void I(r59 r59Var, boolean z) {
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
            ww7.a(new tk3(this, arrayList2, (byte) 2), true).c(this);
            gm.V3(r59Var);
        }
    }

    @Override // y59
    public final int b() {
        return this.e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r7 != 1) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        int i2;
        n95 n95Var = (n95) u69Var.a;
        rd2 participant = n95Var.getParticipant();
        ArrayList arrayList = this.e;
        rd2 rd2Var = (rd2) arrayList.get(i);
        TLRPC.GroupCallParticipant groupCallParticipant = ((rd2) arrayList.get(i)).a;
        int size = arrayList.size();
        if (size > 1 && size != 2) {
            i2 = 3;
            if (size == 3) {
                if (i != 0) {
                }
            }
            n95Var.a = i2;
            n95Var.b = this;
            if (n95Var.getMeasuredHeight() != F()) {
                n95Var.requestLayout();
            }
            j5.a(this.d);
            TLRPC.Peer peer = this.c.J;
            n95Var.d = rd2Var;
            if (participant == null && !participant.equals(rd2Var) && n95Var.e && n95Var.getRenderer() != null) {
                E(n95Var, false);
                E(n95Var, true);
                return;
            } else {
                if (n95Var.getRenderer() == null) {
                    n95Var.getRenderer().j(true);
                    return;
                }
                return;
            }
        }
        i2 = 6;
        n95Var.a = i2;
        n95Var.b = this;
        if (n95Var.getMeasuredHeight() != F()) {
        }
        j5.a(this.d);
        TLRPC.Peer peer2 = this.c.J;
        n95Var.d = rd2Var;
        if (participant == null) {
        }
        if (n95Var.getRenderer() == null) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(new a95(this, viewGroup.getContext()));
    }
}
