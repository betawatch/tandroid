// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tr1 implements s09 {
    public final /* synthetic */ mu1 a;

    public tr1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override // s09
    public final boolean C() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        if (r4 == null) goto L24;
     */
    @Override // s09
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        TLRPC.Document e;
        HashSet hashSet;
        int i;
        int i2;
        k27 k27Var;
        TLRPC.Message message;
        mu1 mu1Var = this.a;
        sr1 sr1Var = mu1Var.Bb;
        SparseArray[] sparseArrayArr = mu1Var.o6;
        if (sr1Var != null) {
            if (mu1Var.a() == mu1Var.getUserConfig().e() && !mu1Var.getUserConfig().p()) {
                new jh8((d) mu1Var, 24, true).show();
                mu1Var.F5(false);
                return;
            }
            boolean contains = mu1Var.Bb.getSelectedReactions().contains(h19Var);
            HashSet hashSet2 = new HashSet();
            int i3 = 0;
            boolean z3 = false;
            boolean z4 = false;
            int i4 = 0;
            while (i3 < sparseArrayArr.length) {
                boolean z5 = z3;
                boolean z6 = z4;
                int i5 = i4;
                int i6 = 0;
                while (i6 < sparseArrayArr[i3].size()) {
                    k27 k27Var2 = (k27) sparseArrayArr[i3].valueAt(i6);
                    if (k27Var2.z2()) {
                        f27 n7 = mu1Var.n7(k27Var2);
                        if (n7 != null && !hashSet2.contains(Long.valueOf(n7.a))) {
                            hashSet2.add(Long.valueOf(n7.a));
                            k27Var2 = n7.c();
                        }
                        hashSet = hashSet2;
                        i = i3;
                        i2 = i6;
                        i6 = i2 + 1;
                        i3 = i;
                        hashSet2 = hashSet;
                    }
                    if (k27Var2.v2(h19Var) == contains) {
                        int i7 = i3;
                        k27Var = k27Var2;
                        i2 = i6;
                        i = i7;
                        hashSet = hashSet2;
                        mu1Var.lb(mu1Var.E6(k27Var2.e1(), false), k27Var, null, null, 0.0f, 0.0f, h19Var, false, false, false, true);
                        if (!contains) {
                            i5++;
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        i2 = i6;
                        k27Var = k27Var2;
                    }
                    if (k27Var.k != null) {
                        boolean z7 = mu1Var.D0.O;
                        if (z7) {
                            k27 k27Var3 = (k27) mu1Var.G6[0].get(k27Var.e1());
                            if (k27Var3 != null && (message = k27Var3.k) != null) {
                                message.reactions = k27Var.k.reactions;
                            }
                        } else if (!z7 && mu1Var.F3 != null) {
                            z5 = true;
                        }
                    }
                    if (mu1Var.D0.O && !k27Var.v2(mu1Var.F3)) {
                        f27 n72 = mu1Var.n7(k27Var);
                        if (n72 != null) {
                            ArrayList arrayList = n72.d;
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                mu1Var.getMediaDataController().P1(((k27) arrayList.get(i8)).e1());
                            }
                        } else {
                            mu1Var.getMediaDataController().P1(k27Var.e1());
                        }
                        ra7 ra7Var = mu1Var.b4;
                        if (ra7Var != null) {
                            ra7Var.f();
                        }
                        z5 = true;
                        z6 = true;
                    }
                    i6 = i2 + 1;
                    i3 = i;
                    hashSet2 = hashSet;
                }
                i3++;
                z3 = z5;
                z4 = z6;
                i4 = i5;
            }
            if (z3) {
                mu1Var.Gc(z4);
            }
            mu1Var.F5(true);
            if (i4 > 0) {
                long j = h19Var.g;
                int i9 = y6c.t0;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(i9).r.get(h19Var.f);
                    if (tL_availableReaction == null) {
                        return;
                    } else {
                        e = tL_availableReaction.activate_animation;
                    }
                } else {
                    e = vl.e(i9, j);
                }
                if (e != null) {
                    u21.b0(mu1Var).y(i4, e, null).k(true);
                }
            }
        }
    }

    @Override // s09
    public final boolean r() {
        return true;
    }

    @Override // s09
    public final boolean u() {
        return false;
    }

    @Override // s09
    public final void A() {
    }

    @Override // s09
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
