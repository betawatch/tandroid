package yh;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jg.o2;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.wb;
import org.telegram.ui.cv0;
import org.telegram.ui.do0;
import org.telegram.ui.hk;
import org.telegram.ui.un;
import org.telegram.ui.z00;
import r0.h0;
import rh.e3;
import th.n5;
import vh.d6;
import w7.b6;
import w7.n7;
import x7.g8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 extends z2 implements us, fe.e, r2 {
    public static final /* synthetic */ int M1 = 0;
    public final rf.w A1;
    public final rf.w B1;
    public final View C1;
    public final e0 D1;
    public final boolean E1;
    public final q20 F1;
    public final Paint G1;
    public ArrayList H1;
    public String I1;
    public String J1;
    public i0.c K1;
    public i0.c L1;
    public final fe.b i1;
    public final fe.b j1;
    public final hk k1;
    public final long l1;
    public TLRPC.Chat m1;
    public boolean n1;
    public vh.d o1;
    public vh.d p1;
    public final k2 q1;
    public final w r1;
    public final v s1;
    public final v t1;
    public final h10 u1;
    public final h10 v1;
    public final z00 w1;
    public final u51 x1;
    public final do0 y1;
    public final do0 z1;

    public a0(k2 k2Var, long j10) {
        this(k2Var, j10, null, null);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        if (this.i1.f || this.j1.f) {
            return false;
        }
        View currentView = this.k1.getCurrentView();
        if (currentView instanceof y) {
            return ((y) currentView).e;
        }
        return true;
    }

    public final boolean I0(a51 a51Var) {
        Object obj = a51Var.G;
        if (!(obj instanceof zh.f)) {
            return false;
        }
        zh.f fVar = (zh.f) obj;
        long j10 = fVar.a;
        TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-j10));
        TLRPC.User Z1 = vp.r1(this.a).Z1(Long.valueOf(j10));
        k2 k2Var = this.q1;
        if (Z1 != null) {
            k2Var.presentFragment(un.ha(Z1.id));
            return true;
        }
        if (w3.t0(L0) || w3.j0(L0)) {
            k2Var.presentFragment(un.ha(-L0.id));
            return true;
        }
        new ai.c(getContext(), L0, new o(1, this, fVar)).show();
        return true;
    }

    public final void J0(ArrayList arrayList, boolean z10) {
        String str;
        int i10 = 0;
        if (!z10) {
            arrayList.add(a51.E(99, (int) (i0.q.y * 0.35f)));
            arrayList.add(a51.E(0, i0.L(56.0f)));
        }
        if (this.H1 != null) {
            String lowerCase = (!z10 || (str = this.J1) == null) ? null : str.toLowerCase();
            ArrayList arrayList2 = this.H1;
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!z10 || TextUtils.isEmpty(lowerCase)) {
                    arrayList.add(a51.w(chat));
                } else {
                    String str2 = chat.title;
                    if (str2 != null && str2.toLowerCase().contains(lowerCase)) {
                        arrayList.add(a51.w(chat));
                    }
                }
            }
        }
    }

    public final void K0(TLRPC.Chat chat, long j10, boolean z10) {
        long j11 = -chat.id;
        boolean V = w3.V(chat);
        if (w3.T(chat)) {
            vp.r1(this.a).O2(j11, j10, false, z10, new cv0(3, this, V));
            return;
        }
        x1 x1Var = new x1(3, getContext(), null);
        x1Var.r(250L);
        vp.r1(this.a).T(getContext(), -j11, null, new c(this, x1Var, j10, z10, 1), null);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        zs.f(this.a).n(this, zs.T);
        zs.f(this.a).n(this, zs.r);
        super.L();
    }

    public final void L0(a51 a51Var) {
        Object obj = a51Var.G;
        if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (!this.E1) {
                new ai.a(getContext(), this.m1, -chat.id, new e3(17, this, chat)).show();
            } else {
                this.F1.a(chat);
                dismiss();
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.T;
        long j10 = this.l1;
        w wVar = this.r1;
        if (i10 == i12) {
            if (((TLRPC.ChatFull) objArr[0]).id == j10) {
                wVar.d.f3.O(true);
            }
        } else if (i10 == zs.r) {
            Integer num = (Integer) objArr[0];
            int intValue = num.intValue();
            int i13 = vp.D8;
            if ((intValue & TLObject.FLAG_13) == 0 && (num.intValue() & 2) == 0 && (num.intValue() & 8) == 0 && (num.intValue() & 16) == 0) {
                return;
            }
            TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(j10));
            this.m1 = L0;
            wVar.a.setTitle(o5.m(L0));
            wVar.h.e(this.m1, wVar.n);
        }
    }

    @Override // org.telegram.ui.Cells.r2
    public final boolean m() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        if (this.k1.getCurrentPosition() <= 0) {
            super.onBackPressed();
            return;
        }
        if (this.k1.getCurrentPosition() == 2) {
            fe.b bVar = this.j1;
            if (bVar.f) {
                this.t1.d.e3.h1(1, this.L1.b);
                bVar.a(false, true);
                this.q0 = true;
                h10 h10Var = this.v1;
                i0.v1(h10Var.r);
                h10Var.r.clearFocus();
                return;
            }
        }
        this.k1.E(0);
    }

    @Override // org.telegram.ui.Cells.r2
    public final void r(v2 v2Var) {
        TLRPC.TL_forumTopic f7;
        if (v2Var.getMessage() == null || (f7 = vp.r1(this.a).r7.f(-v2Var.getDialogId(), jj.c2(this.a, v2Var.getMessage().k, true, false))) == null) {
            return;
        }
        gg.e.m(this.q1, -v2Var.getDialogId(), f7, 0);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        Paint paint = this.G1;
        try {
            super.s0();
            int w02 = t6.w0(t6.a7, this.I0);
            if (paint.getColor() != w02) {
                v0(w02);
                paint.setColor(w02);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.Cells.r2
    public final void u(v2 v2Var) {
        if (vp.r1(this.a).O1().K(v2Var.getDialogId())) {
            k2 k2Var = this.q1;
            k2Var.getOrCreateStoryViewer().getClass();
            k2Var.getOrCreateStoryViewer().R(k2Var.getContext(), v2Var.getDialogId(), n5.a((tk0) v2Var.getParent()));
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 1) {
            float a2 = n7.a(f7);
            float T1 = i0.T1(0.9f, 1.0f, a2);
            w wVar = this.r1;
            wVar.a.setAlpha(a2);
            wVar.a.setScaleX(T1);
            wVar.a.setScaleY(T1);
            wVar.a.setVisibility(a2 > 0.0f ? 0 : 8);
            float T12 = i0.T1(0.9f, 1.0f, f7);
            h10 h10Var = this.u1;
            h10Var.setAlpha(f7);
            h10Var.setScaleX(T12);
            h10Var.setScaleY(T12);
            h10Var.setVisibility(f7 > 0.0f ? 0 : 8);
            wVar.d.setAlpha(a2);
            wVar.d.setVisibility(a2 > 0.0f ? 0 : 8);
            this.o1.setAlpha(a2);
            this.o1.setScaleX(i0.T1(0.95f, 1.0f, a2));
            this.o1.setScaleY(i0.T1(0.95f, 1.0f, a2));
            this.o1.setVisibility(a2 > 0.0f ? 0 : 8);
            z00 z00Var = this.w1;
            z00Var.setAlpha(f7);
            z00Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.y1.invalidate();
        }
        if (i10 == 2) {
            float a10 = n7.a(f7);
            float T13 = i0.T1(0.9f, 1.0f, a10);
            v vVar = this.t1;
            vVar.a.setAlpha(a10);
            vVar.a.setScaleX(T13);
            vVar.a.setScaleY(T13);
            vVar.a.setVisibility(a10 > 0.0f ? 0 : 8);
            float T14 = i0.T1(0.9f, 1.0f, f7);
            h10 h10Var2 = this.v1;
            h10Var2.setAlpha(f7);
            h10Var2.setScaleX(T14);
            h10Var2.setScaleY(T14);
            h10Var2.setVisibility(f7 > 0.0f ? 0 : 8);
            vVar.d.setAlpha(a10);
            vVar.d.setVisibility(a10 > 0.0f ? 0 : 8);
            if (!this.E1) {
                this.p1.setAlpha(a10);
                this.p1.setScaleX(i0.T1(0.95f, 1.0f, a10));
                this.p1.setScaleY(i0.T1(0.95f, 1.0f, a10));
                this.p1.setVisibility(a10 > 0.0f ? 0 : 8);
            }
            u51 u51Var = this.x1;
            u51Var.setAlpha(f7);
            u51Var.setVisibility(f7 > 0.0f ? 0 : 8);
            this.b.invalidate();
            this.z1.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(k2 k2Var, long j10, ArrayList arrayList, o2 o2Var) {
        super(k2Var.getContext(), k2Var.getResourceProvider(), true, true);
        int i10 = 1;
        gr grVar = gr.h;
        this.i1 = new fe.b(1, this, grVar, 350L, false);
        this.j1 = new fe.b(2, this, grVar, 350L, false);
        this.A1 = new rf.w(2);
        this.B1 = new rf.w(8);
        Paint paint = new Paint(1);
        this.G1 = paint;
        i0.c cVar = i0.c.e;
        this.K1 = cVar;
        this.L1 = cVar;
        i0.S(getWindow());
        this.q1 = k2Var;
        int i11 = 0;
        this.E1 = arrayList != null;
        this.H1 = arrayList;
        this.F1 = o2Var;
        Context context = k2Var.getContext();
        zs.f(this.a).c(this, zs.T);
        zs.f(this.a).c(this, zs.r);
        int i12 = t6.a7;
        paint.setColor(t6.w0(i12, this.I0));
        Q(i12);
        this.b = new d6(this, context);
        hk hkVar = new hk(this, context, 9);
        this.k1 = hkVar;
        int i13 = this.t0;
        hkVar.setPadding(i13, 0, i13, 0);
        this.b.addView(this.k1, b6.e(-1, -1, zs.E1));
        int i14 = 14;
        this.y1 = new do0(this, context, i14);
        this.z1 = new do0(this, context, i14);
        h10 h10Var = new h10(context, this.I0);
        this.u1 = h10Var;
        h10Var.setCloseButtonVisible(true);
        h10Var.y = true;
        h10Var.updateColors();
        String L0 = cd.L0(2131745853, null);
        n0 n0Var = h10Var.r;
        n0Var.setHint(L0);
        n0Var.addTextChangedListener(new u(this, i11));
        h10Var.setVisibility(8);
        h10 h10Var2 = new h10(context, this.I0);
        this.v1 = h10Var2;
        h10Var2.setCloseButtonVisible(true);
        h10Var2.y = true;
        h10Var2.updateColors();
        String L02 = cd.L0(2131745853, null);
        n0 n0Var2 = h10Var2.r;
        n0Var2.setHint(L02);
        n0Var2.addTextChangedListener(new u(this, i10));
        h10Var2.setVisibility(8);
        u51 u51Var = new u51(context, this.a, 0, false, new r(this, i11), new s(this, i11), null, this.I0);
        this.x1 = u51Var;
        u51Var.j(new p(this, i10));
        u51Var.setClipToPadding(false);
        u51Var.setVisibility(8);
        u51Var.r1();
        u51Var.f3.r = false;
        u51Var.setPadding(0, i0.L(52.0f) + i0.m, 0, i0.n);
        z00 z00Var = new z00(k2Var);
        this.w1 = z00Var;
        z00Var.setVisibility(8);
        z00Var.setBackground(null);
        z00Var.setChatPreviewDelegate(new hb.a(28));
        z00Var.setUiCallback(new vh.e0(this));
        z00Var.b.setClipToPadding(false);
        this.C1 = new View(getContext());
        Context context2 = getContext();
        p6 p6Var = this.I0;
        e0 e0Var = new e0(context2, p6Var, new cc((FrameLayout) this.b, p6Var), this.a, j10);
        this.D1 = e0Var;
        int i15 = 4;
        e0Var.h = new g8(4, this, k2Var);
        this.l1 = j10;
        this.m1 = vp.r1(this.a).L0(Long.valueOf(j10));
        vp.r1(this.a).M0(j10);
        TLRPC.Chat chat = this.m1;
        this.n1 = chat != null && chat.collapsed_in_dialogs;
        zf.e0 e0Var2 = new zf.e0(R.drawable.search_users_filled, 4, o5.u(chat));
        e0Var2.f = this.m1;
        e0Var2.h = false;
        ArrayList arrayList2 = h10Var.F;
        arrayList2.add(e0Var2);
        h10Var.I = arrayList2.size() - 1;
        h10Var.e();
        v0(t6.w0(i12, this.I0));
        this.s1 = new v(this, context, 1);
        this.r1 = new w(this, context);
        this.t1 = new v(this, context, 0);
        this.k1.setAdapter(new ig.n(this, i15));
        h10Var.setCloseButtonOnClickListener(new t(this, i11));
        h10Var2.setCloseButtonOnClickListener(new t(this, i10));
        e0Var.d();
        vp.r1(this.a).T2(0, j10, true);
        wb.a((FrameLayout) this.b, new mg.u(16));
        ViewGroup viewGroup = this.b;
        s sVar = new s(this, i10);
        WeakHashMap weakHashMap = h0.a;
        r0.z.i(viewGroup, sVar);
    }

    @Override // org.telegram.ui.Cells.r2
    public final void q() {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void l(v2 v2Var) {
    }

    @Override // org.telegram.ui.Cells.r2
    public final void x(v2 v2Var) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
