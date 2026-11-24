// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sg1 extends y59 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ vg1 n;

    public sg1(vg1 vg1Var, Context context) {
        this.n = vg1Var;
        this.c = context;
        C(true);
    }

    public final void D(boolean z) {
        this.d = 0;
        vg1 vg1Var = this.n;
        ArrayList arrayList = vg1Var.p0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (vg1Var.r0) {
            this.e = -1;
        } else {
            int i = this.d;
            this.d = i + 1;
            this.e = i;
        }
        int i2 = this.d;
        this.f = i2;
        int size = arrayList.size() + i2;
        this.d = size;
        this.h = size;
    }

    @Override // y59
    public final int b() {
        return this.d;
    }

    @Override // y59
    public final long c(int i) {
        if (i < this.f || i >= this.h) {
            return i == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.p0;
        return ((k47) arrayList.get((arrayList.size() - (i - this.f)) - 1)).m1;
    }

    @Override // y59
    public final int d(int i) {
        if (i < this.f || i >= this.h) {
            return 4;
        }
        return ((k47) this.n.p0.get((r0.size() - (i - this.f)) - 1)).U;
    }

    @Override // y59
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // y59
    public final void g(int i) {
        D(false);
        try {
            super.g(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // y59
    public final void j(int i, int i2) {
        D(false);
        try {
            super.j(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // y59
    public final void l(int i, int i2) {
        D(false);
        try {
            super.l(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // y59
    public final void p(int i, int i2) {
        D(false);
        try {
            super.p(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // y59
    public final void q(int i, int i2) {
        D(false);
        try {
            super.q(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        rc2 rc2Var;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        int i2;
        int i3;
        long j3;
        long j4;
        int i4;
        int i5;
        View view = u69Var.a;
        vg1 vg1Var = this.n;
        ArrayList arrayList = vg1Var.p0;
        if (i == this.e) {
            ((xb2) view).setProgressVisible(true);
            return;
        }
        if (i < this.f || i >= this.h) {
            return;
        }
        k47 k47Var = (k47) arrayList.get((arrayList.size() - (i - this.f)) - 1);
        if (!(view instanceof rc2)) {
            if (view instanceof cm1) {
                cm1 cm1Var = (cm1) view;
                cm1Var.setMessageObject(k47Var);
                cm1Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        rc2 rc2Var2 = (rc2) view;
        rc2Var2.f6 = true;
        int i6 = i + 1;
        int d = d(i6);
        int d2 = d(i - 1);
        if (!(k47Var.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == u69Var.f) {
            k47 k47Var2 = (k47) arrayList.get((arrayList.size() - (i6 - this.f)) - 1);
            z = k47Var2.O3() == k47Var.O3() && k47Var2.Z0() == k47Var.Z0() && Math.abs(k47Var2.k.date - k47Var.k.date) <= 300;
            if (z) {
                TLRPC.TL_forumTopic tL_forumTopic = k47Var.j1;
                if (tL_forumTopic == null) {
                    i5 = ((d) vg1Var).currentAccount;
                    j3 = k47.b2(i5, k47Var.k, true, false);
                } else {
                    j3 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = k47Var2.j1;
                if (tL_forumTopic2 == null) {
                    i4 = ((d) vg1Var).currentAccount;
                    rc2Var = rc2Var2;
                    j4 = k47.b2(i4, k47Var2.k, true, false);
                } else {
                    rc2Var = rc2Var2;
                    j4 = tL_forumTopic2.id;
                }
            } else {
                rc2Var = rc2Var2;
            }
            if (d2 != u69Var.f) {
                k47 k47Var3 = (k47) arrayList.get(arrayList.size() - (i - this.f));
                boolean z4 = !(k47Var3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && k47Var3.O3() == k47Var.O3() && k47Var3.Z0() == k47Var.Z0() && Math.abs(k47Var3.k.date - k47Var.k.date) <= 300;
                if (z4) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = k47Var.j1;
                    if (tL_forumTopic3 == null) {
                        i3 = ((d) vg1Var).currentAccount;
                        z3 = true;
                        j = k47.b2(i3, k47Var.k, true, false);
                    } else {
                        z3 = true;
                        j = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = k47Var3.j1;
                    if (tL_forumTopic4 == null) {
                        i2 = ((d) vg1Var).currentAccount;
                        j2 = k47.b2(i2, k47Var3.k, z3, false);
                    } else {
                        j2 = tL_forumTopic4.id;
                    }
                    if (j != j2) {
                        z4 = false;
                    }
                }
                z2 = z4;
            } else {
                z2 = false;
            }
            rc2 rc2Var3 = rc2Var;
            rc2Var3.z3(k47Var, null, z, z2, false, false);
            rc2Var3.setHighlighted(false);
            rc2Var3.v3(vg1Var.w0);
        }
        rc2Var = rc2Var2;
        z = false;
        if (d2 != u69Var.f) {
        }
        rc2 rc2Var32 = rc2Var;
        rc2Var32.z3(k47Var, null, z, z2, false, false);
        rc2Var32.setHighlighted(false);
        rc2Var32.v3(vg1Var.w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [zc2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [cm1] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar;
        ViewGroup viewGroup2;
        int i2;
        ViewGroup viewGroup3;
        vg1 vg1Var = this.n;
        ArrayList arrayList = vg1Var.h;
        Context context = this.c;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                i2 = ((d) vg1Var).currentAccount;
                viewGroup3 = new rc2(context, i2);
            } else {
                ?? r5 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r5;
            }
            rc2 rc2Var = (rc2) viewGroup3;
            rc2Var.setDelegate(new ng1(this));
            rc2Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i == 1) {
            ?? og1Var = new og1(context);
            og1Var.setDelegate(new qg1(this));
            viewGroup2 = og1Var;
        } else if (i == 2) {
            viewGroup2 = new vf2(context, null);
        } else if (i == 10) {
            ylbVar = ((d) vg1Var).resourceProvider;
            ?? zc2Var = new zc2(context, ylbVar);
            zc2Var.setDelegate(new k6d((Object) this, (byte) 17));
            viewGroup2 = zc2Var;
        } else {
            viewGroup2 = new xb2(context, null);
        }
        return kt6.h(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        if ((view instanceof rc2) || (view instanceof cm1)) {
            view.getViewTreeObserver().addOnPreDrawListener(new rg1(this, view, u69Var));
        }
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            rc2Var.getMessageObject();
            rc2Var.setBackgroundDrawable(null);
            rc2Var.n3(true, false);
            rc2Var.setHighlighted(false);
        }
    }
}
