package vh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.rg;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class i3 extends k7.x5 {
    public final /* synthetic */ q3 a;
    public final /* synthetic */ s3 b;

    public i3(s3 s3Var, q3 q3Var) {
        this.b = s3Var;
        this.a = q3Var;
    }

    @Override // k7.x5
    public final void a(boolean z4) {
        this.a.o();
        s3 s3Var = this.b;
        if (z4) {
            g3 g3Var = s3Var.k3;
            s3Var.m3 = g3Var.G0;
            s3Var.n3 = g3Var.H0;
            s3Var.o3 = g3Var.I0;
            s3Var.setEditTextsLocked(true);
            s3Var.m3();
            s3Var.U2();
            return;
        }
        final int i10 = s3Var.m3;
        final int i11 = s3Var.n3;
        final int i12 = s3Var.o3;
        s3Var.m3 = -1;
        s3Var.n3 = -1;
        s3Var.o3 = 0;
        boolean z10 = s3Var.p3;
        final float f10 = s3Var.q3;
        final float f11 = s3Var.r3;
        s3Var.p3 = false;
        s3Var.setEditTextsLocked(false);
        s3Var.U2();
        if (z10) {
            s3Var.post(new Runnable() { // from class: vh.h3
                @Override // java.lang.Runnable
                public final void run() {
                    s3 s3Var2 = i3.this.b;
                    for (int i13 = 0; i13 < s3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = s3Var2.getChildAt(i13);
                        boolean z11 = childAt instanceof w5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z11) {
                            w5 w5Var = (w5) childAt;
                            if (s3.g4(w5Var.getEditText(), f12, f13)) {
                                return;
                            }
                            if (w5Var.n() && s3.g4(w5Var.getAuthorEditText(), f12, f13)) {
                                return;
                            }
                        } else if (childAt instanceof j0) {
                            if (s3.g4(((j0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof r0) && s3.g4(((r0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        s3.J1(s3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            s3Var.post(new rg(this, i10, i12, i11, 3));
            return;
        }
        View findFocus = s3Var.findFocus();
        if (findFocus instanceof e1) {
            s3Var.post(new z0((e1) findFocus, 2));
        }
    }
}
