package uh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import m.p3;
import org.telegram.messenger.cd;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uq0;
import s4.c1;
import th.d5;
import th.q4;
import th.x4;
import vh.n5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class h extends ak0 {
    public final Context c;
    public x4 e;
    public h f;
    public p3 h;
    public boolean r;
    public final /* synthetic */ i s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public h(i iVar, Context context) {
        this.s = iVar;
        this.c = context;
        M();
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(c1 c1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        jj jjVar;
        TL_stories.StoryItem storyItem;
        x4 x4Var = this.e;
        if (x4Var == null || i10 < 0 || i10 >= x4Var.i.size() || (jjVar = (jj) this.e.i.get(i10)) == null || (storyItem = jjVar.l) == null) {
            return null;
        }
        return cd.e0(storyItem.date, true);
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(tk0 tk0Var, float f7, int[] iArr) {
        int measuredHeight = tk0Var.getChildAt(0).getMeasuredHeight();
        h hVar = this.f;
        i iVar = this.s;
        int i10 = this == hVar ? iVar.e : iVar.d;
        int ceil = (int) (Math.ceil(b() / i10) * measuredHeight);
        int measuredHeight2 = tk0Var.getMeasuredHeight() - tk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
        } else {
            float f10 = f7 * (ceil - measuredHeight2);
            iArr[0] = ((int) (f10 / measuredHeight)) * i10;
            iArr[1] = ((int) f10) % measuredHeight;
        }
    }

    public final boolean L(int i10) {
        uq0 uq0Var = this.s.W;
        x4 x4Var = this.e;
        if (x4Var == null) {
            return false;
        }
        if (x4Var instanceof q4) {
            TLRPC.User Z1 = vp.r1(uq0Var.b).Z1(Long.valueOf(uq0Var.d));
            return Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit;
        }
        if (i10 < 0 || i10 >= x4Var.i.size()) {
            return false;
        }
        return this.e.m(((jj) this.e.i.get(i10)).f1());
    }

    public final void M() {
        if (this.e == null) {
            return;
        }
        i iVar = this.s;
        if ((!iVar.I || (iVar.H && b() > 1)) && b() > 0) {
            if (b() < 5) {
                int max = Math.max(1, b());
                iVar.d = max;
                iVar.H = max == 1;
            } else if (iVar.H || iVar.d == 1) {
                iVar.H = false;
                iVar.d = Math.max(2, tz.u1);
            }
            iVar.h.y1(iVar.d);
            iVar.I = true;
        }
    }

    @Override // s4.g0
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return 19;
    }

    @Override // s4.g0
    public final int e() {
        return b();
    }

    @Override // s4.g0
    public void f() {
        x4 x4Var = this.e;
        boolean z10 = x4Var instanceof q4;
        i iVar = this.s;
        if (z10) {
            q4 q4Var = (q4) x4Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = vp.r1(this.e.c).O1().F(iVar.W.d);
            if (F != null) {
                for (int i10 = 0; i10 < F.size(); i10++) {
                    d5 d5Var = (d5) F.get(i10);
                    n5 n5Var = d5Var.c;
                    if (n5Var != null && !n5Var.g && TextUtils.equals(n5Var.K0, q4Var.E)) {
                        arrayList.add(d5Var);
                    }
                }
            }
        }
        super.f();
        h hVar = this.f;
        if (hVar != null) {
            hVar.f();
        }
        if (this != iVar.x) {
            M();
            iVar.c();
        }
    }

    @Override // s4.g0
    public final void t(c1 c1Var, int i10) {
        if (this.e == null) {
            return;
        }
        View view = c1Var.a;
        if (view instanceof s7) {
            s7 s7Var = (s7) view;
            s7Var.d0 = true;
            i iVar = this.s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                d5 d5Var = (d5) arrayList.get(i10);
                s7Var.f0 = false;
                if (d5Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = d5Var.a;
                    int i11 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i11;
                    tL_storyItem.id = i11;
                    tL_storyItem.attachPath = d5Var.f;
                    g gVar = new g(this.e.c, tL_storyItem);
                    d5Var.K = gVar;
                    gVar.m = d5Var;
                }
                s7Var.k(d5Var.K, this == this.f ? iVar.e : iVar.d, false);
                s7Var.d0 = true;
                s7Var.setReorder(false);
                s7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size < 0 || size >= this.e.i.size()) {
                s7Var.f0 = false;
                s7Var.k(null, this == this.f ? iVar.e : iVar.d, false);
                s7Var.d0 = true;
                return;
            }
            jj jjVar = (jj) this.e.i.get(size);
            s7Var.f0 = jjVar != null && this.e.m(jjVar.f1());
            s7Var.setReorder(true);
            s7Var.k(jjVar, this == this.f ? iVar.e : iVar.d, false);
            uq0 uq0Var = iVar.W;
            if (!uq0Var.G.E1 || jjVar == null) {
                s7Var.i(false, false);
            } else {
                s7Var.i(uq0Var.c(jjVar), true);
            }
        }
    }

    @Override // s4.g0
    public final c1 w(ViewGroup viewGroup, int i10) {
        uq0 uq0Var = this.s.W;
        if (this.h == null) {
            this.h = new p3(viewGroup.getContext(), uq0Var.c);
        }
        s7 s7Var = new s7(this.c, this.h, uq0Var.b);
        s7Var.w0 = true;
        s7Var.setGradientView(null);
        s7Var.d0 = true;
        return new ck0(s7Var);
    }

    @Override // org.telegram.ui.Components.ak0
    public final void I() {
    }
}
