// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tf1 extends j79 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final /* synthetic */ wf1 n;

    public tf1(wf1 wf1Var, Context context) {
        this.n = wf1Var;
        this.c = context;
        C(true);
    }

    public final void D(boolean z) {
        this.d = 0;
        wf1 wf1Var = this.n;
        ArrayList arrayList = wf1Var.p0;
        if (arrayList.isEmpty()) {
            this.e = -1;
            this.f = -1;
            this.h = -1;
            return;
        }
        if (wf1Var.r0) {
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

    @Override // j79
    public final int b() {
        return this.d;
    }

    @Override // j79
    public final long c(int i) {
        if (i < this.f || i >= this.h) {
            return i == this.e ? 2L : 5L;
        }
        ArrayList arrayList = this.n.p0;
        return ((r47) arrayList.get((arrayList.size() - (i - this.f)) - 1)).m1;
    }

    @Override // j79
    public final int d(int i) {
        if (i < this.f || i >= this.h) {
            return 4;
        }
        return ((r47) this.n.p0.get((r0.size() - (i - this.f)) - 1)).U;
    }

    @Override // j79
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // j79
    public final void g(int i) {
        D(false);
        try {
            super.g(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // j79
    public final void j(int i, int i2) {
        D(false);
        try {
            super.j(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // j79
    public final void l(int i, int i2) {
        D(false);
        try {
            super.l(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // j79
    public final void p(int i, int i2) {
        D(false);
        try {
            super.p(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // j79
    public final void q(int i, int i2) {
        D(false);
        try {
            super.q(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
    
        if (r13 != r7) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        wb2 wb2Var;
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
        View view = f89Var.a;
        wf1 wf1Var = this.n;
        ArrayList arrayList = wf1Var.p0;
        if (i == this.e) {
            ((cb2) view).setProgressVisible(true);
            return;
        }
        if (i < this.f || i >= this.h) {
            return;
        }
        r47 r47Var = (r47) arrayList.get((arrayList.size() - (i - this.f)) - 1);
        if (!(view instanceof wb2)) {
            if (view instanceof dl1) {
                dl1 dl1Var = (dl1) view;
                dl1Var.setMessageObject(r47Var);
                dl1Var.setAlpha(1.0f);
                return;
            }
            return;
        }
        wb2 wb2Var2 = (wb2) view;
        wb2Var2.f6 = true;
        int i6 = i + 1;
        int d = d(i6);
        int d2 = d(i - 1);
        if (!(r47Var.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && d == f89Var.f) {
            r47 r47Var2 = (r47) arrayList.get((arrayList.size() - (i6 - this.f)) - 1);
            z = r47Var2.O3() == r47Var.O3() && r47Var2.Z0() == r47Var.Z0() && Math.abs(r47Var2.k.date - r47Var.k.date) <= 300;
            if (z) {
                TLRPC.TL_forumTopic tL_forumTopic = r47Var.j1;
                if (tL_forumTopic == null) {
                    i5 = ((e) wf1Var).currentAccount;
                    j3 = r47.b2(i5, r47Var.k, true, false);
                } else {
                    j3 = tL_forumTopic.id;
                }
                TLRPC.TL_forumTopic tL_forumTopic2 = r47Var2.j1;
                if (tL_forumTopic2 == null) {
                    i4 = ((e) wf1Var).currentAccount;
                    wb2Var = wb2Var2;
                    j4 = r47.b2(i4, r47Var2.k, true, false);
                } else {
                    wb2Var = wb2Var2;
                    j4 = tL_forumTopic2.id;
                }
            } else {
                wb2Var = wb2Var2;
            }
            if (d2 != f89Var.f) {
                r47 r47Var3 = (r47) arrayList.get(arrayList.size() - (i - this.f));
                boolean z4 = !(r47Var3.k.reply_markup instanceof TLRPC.TL_replyInlineMarkup) && r47Var3.O3() == r47Var.O3() && r47Var3.Z0() == r47Var.Z0() && Math.abs(r47Var3.k.date - r47Var.k.date) <= 300;
                if (z4) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = r47Var.j1;
                    if (tL_forumTopic3 == null) {
                        i3 = ((e) wf1Var).currentAccount;
                        z3 = true;
                        j = r47.b2(i3, r47Var.k, true, false);
                    } else {
                        z3 = true;
                        j = tL_forumTopic3.id;
                    }
                    TLRPC.TL_forumTopic tL_forumTopic4 = r47Var3.j1;
                    if (tL_forumTopic4 == null) {
                        i2 = ((e) wf1Var).currentAccount;
                        j2 = r47.b2(i2, r47Var3.k, z3, false);
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
            wb2 wb2Var3 = wb2Var;
            wb2Var3.z3(r47Var, null, z, z2, false, false);
            wb2Var3.setHighlighted(false);
            wb2Var3.v3(wf1Var.w0);
        }
        wb2Var = wb2Var2;
        z = false;
        if (d2 != f89Var.f) {
        }
        wb2 wb2Var32 = wb2Var;
        wb2Var32.z3(r47Var, null, z, z2, false, false);
        wb2Var32.setHighlighted(false);
        wb2Var32.v3(wf1Var.w0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ec2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [dl1] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        ViewGroup viewGroup2;
        int i2;
        ViewGroup viewGroup3;
        wf1 wf1Var = this.n;
        ArrayList arrayList = wf1Var.h;
        Context context = this.c;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                i2 = ((e) wf1Var).currentAccount;
                viewGroup3 = new wb2(context, i2);
            } else {
                ?? r5 = (View) arrayList.get(0);
                arrayList.remove(0);
                viewGroup3 = r5;
            }
            wb2 wb2Var = (wb2) viewGroup3;
            wb2Var.setDelegate(new of1(this));
            wb2Var.setAllowAssistant(true);
            viewGroup2 = viewGroup3;
        } else if (i == 1) {
            ?? pf1Var = new pf1(context);
            pf1Var.setDelegate(new rf1(this));
            viewGroup2 = pf1Var;
        } else if (i == 2) {
            viewGroup2 = new bf2(context, null);
        } else if (i == 10) {
            vnbVar = ((e) wf1Var).resourceProvider;
            ?? ec2Var = new ec2(context, vnbVar);
            ec2Var.setDelegate(new z8d((Object) this, (byte) 17));
            viewGroup2 = ec2Var;
        } else {
            viewGroup2 = new cb2(context, null);
        }
        return qu6.h(viewGroup2, viewGroup2, -1, -2);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        if ((view instanceof wb2) || (view instanceof dl1)) {
            view.getViewTreeObserver().addOnPreDrawListener(new sf1(this, view, f89Var));
        }
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            wb2Var.getMessageObject();
            wb2Var.setBackgroundDrawable(null);
            wb2Var.n3(true, false);
            wb2Var.setHighlighted(false);
        }
    }
}
