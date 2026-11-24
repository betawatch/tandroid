// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r95 extends n39 {
    public fc2 c;
    public final int d;
    public ArrayList f;
    public e55 h;
    public final h75 n;
    public final ArrayList e = new ArrayList();
    public boolean r = false;

    public r95(fc2 fc2Var, int i, h75 h75Var) {
        this.c = fc2Var;
        this.d = i;
        this.n = h75Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void E(o75 o75Var, boolean z) {
        if (z) {
            if (o75Var.getRenderer() == null) {
                o75Var.setRenderer(h85.c(this.f, this.h, null, null, o75Var, o75Var.getParticipant(), this.c, this.n));
            }
        } else if (o75Var.getRenderer() != null) {
            o75Var.getRenderer().setTabletGridView(null);
            o75Var.setRenderer(null);
        }
    }

    public final int F() {
        o39 o39Var = this.n.f4;
        int size = this.e.size();
        return size <= 1 ? o39Var.getMeasuredHeight() : size <= 4 ? o39Var.getMeasuredHeight() / 2 : (int) (o39Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, e55 e55Var) {
        this.f = arrayList;
        this.h = e55Var;
    }

    public final void H(o39 o39Var, boolean z, boolean z2) {
        this.r = z;
        if (z2) {
            for (int i = 0; i < o39Var.getChildCount(); i++) {
                View childAt = o39Var.getChildAt(i);
                if (childAt instanceof o75) {
                    o75 o75Var = (o75) childAt;
                    if (o75Var.getParticipant() != null) {
                        E(o75Var, z);
                    }
                }
            }
        }
    }

    public final void I(o39 o39Var, boolean z) {
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
            vu7.a(new ij3(this, arrayList2, (byte) 2), true).c(this);
            gl.V3(o39Var);
        }
    }

    @Override // w39
    public final int b() {
        return this.e.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r7 != 1) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        int i2;
        o75 o75Var = (o75) s49Var.a;
        gc2 participant = o75Var.getParticipant();
        ArrayList arrayList = this.e;
        gc2 gc2Var = (gc2) arrayList.get(i);
        TLRPC.GroupCallParticipant groupCallParticipant = ((gc2) arrayList.get(i)).a;
        int size = arrayList.size();
        if (size > 1 && size != 2) {
            i2 = 3;
            if (size == 3) {
                if (i != 0) {
                }
            }
            o75Var.a = i2;
            o75Var.b = this;
            if (o75Var.getMeasuredHeight() != F()) {
                o75Var.requestLayout();
            }
            j5.a(this.d);
            TLRPC.Peer peer = this.c.J;
            o75Var.d = gc2Var;
            if (participant == null && !participant.equals(gc2Var) && o75Var.e && o75Var.getRenderer() != null) {
                E(o75Var, false);
                E(o75Var, true);
                return;
            } else {
                if (o75Var.getRenderer() == null) {
                    o75Var.getRenderer().j(true);
                    return;
                }
                return;
            }
        }
        i2 = 6;
        o75Var.a = i2;
        o75Var.b = this;
        if (o75Var.getMeasuredHeight() != F()) {
        }
        j5.a(this.d);
        TLRPC.Peer peer2 = this.c.J;
        o75Var.d = gc2Var;
        if (participant == null) {
        }
        if (o75Var.getRenderer() == null) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return new y29(new b75(this, viewGroup.getContext()));
    }
}
