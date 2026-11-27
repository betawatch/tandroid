// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qn4 extends ny0 {
    public static final /* synthetic */ int A2 = 0;
    public String S1;
    public int T1;
    public TL_chatlists.chatlist_ChatlistInvite U1;
    public TL_chatlists.TL_chatlists_chatlistUpdates V1;
    public final boolean W1;
    public String X1;
    public ArrayList Y1;
    public boolean Z1;
    public CharSequence a2;
    public ArrayList b2;
    public ArrayList c2;
    public ArrayList d2;
    public ArrayList e2;
    public FrameLayout f2;
    public mn4 g2;
    public View h2;
    public pn4 i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public int p2;
    public int q2;
    public int r2;
    public int s2;
    public nn4 t2;
    public int u2;
    public boolean v2;
    public pcc w2;
    public int x2;
    public long y2;
    public long z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn4(e eVar, int i, ArrayList arrayList) {
        super(eVar, false);
        ac7 ac7Var;
        TLRPC.Chat M0;
        this.T1 = -1;
        this.X1 = "";
        this.Y1 = new ArrayList();
        this.a2 = "";
        this.c2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.d2 = arrayList2;
        this.u2 = -1;
        this.x2 = -5;
        this.T1 = i;
        this.W1 = true;
        this.b2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = eVar.getMessagesController().G0;
        if (arrayList3 != null) {
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                if (((ac7) arrayList3.get(i2)).a == i) {
                    ac7Var = (ac7) arrayList3.get(i2);
                    break;
                }
            }
        }
        ac7Var = null;
        if (ac7Var != null) {
            this.X1 = ac7Var.b;
            this.Y1 = ac7Var.c;
            this.Z1 = ac7Var.n;
            for (int i3 = 0; i3 < this.d2.size(); i3++) {
                TLRPC.Peer y1 = eVar.getMessagesController().y1(((Long) this.d2.get(i3)).longValue());
                if ((y1 instanceof TLRPC.TL_peerChat) || (y1 instanceof TLRPC.TL_peerChannel)) {
                    this.b2.add(y1);
                }
            }
            for (int i4 = 0; i4 < ac7Var.h.size(); i4++) {
                Long l = (Long) ac7Var.h.get(i4);
                long longValue = l.longValue();
                if (!this.d2.contains(l)) {
                    TLRPC.Peer y12 = eVar.getMessagesController().y1(longValue);
                    if (((y12 instanceof TLRPC.TL_peerChat) || (y12 instanceof TLRPC.TL_peerChannel)) && ((M0 = eVar.getMessagesController().M0(Long.valueOf(-longValue))) == null || !xc2.r0(M0))) {
                        this.b2.add(y12);
                    }
                }
            }
        }
        b1();
    }

    public static void c1(e eVar, int i, pcc pccVar) {
        ac7 ac7Var;
        ArrayList arrayList = eVar.getMessagesController().G0;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((ac7) arrayList.get(i2)).a == i) {
                    ac7Var = (ac7) arrayList.get(i2);
                    break;
                }
            }
        }
        ac7Var = null;
        ze7 ze7Var = new ze7(i, (Object) eVar, (Object) pccVar, (byte) 27);
        if (ac7Var == null || !ac7Var.e()) {
            ze7Var.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getContext());
        String M0 = ob6.M0(2131750755, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131750753, null);
        alertDialog$Builder.g(ob6.M0(2131752570, null), new f62(pccVar, (byte) 1));
        alertDialog$Builder.j(ob6.M0(2131751563, null), new lu3(ze7Var, (byte) 23));
        eVar.showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        return new jn4(this);
    }

    @Override // ny0
    public final CharSequence K0() {
        if (this.W1) {
            return ob6.M0(2131750593, null);
        }
        if (this.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return ob6.M0(2131750596, null);
        }
        ArrayList arrayList = this.b2;
        return (arrayList == null || arrayList.isEmpty()) ? ob6.M0(2131750594, null) : ob6.M0(2131750595, null);
    }

    @Override // ny0
    public final void Q0(wma wmaVar) {
        d79 d79Var = this.n1;
        byte b = 2;
        d79Var.setOverScrollMode(2);
        d79Var.setPadding(hl.L(6.0f), 0, hl.L(6.0f), hl.L(this.g2 != null ? 68.0f : 0.0f));
        d79Var.setOnItemClickListener(new zg4(this, b));
    }

    public final void Z0(boolean z) {
        String str;
        String G = ob6.G(this.d2.size(), "FilterInviteHeaderChats", new Object[0]);
        if (!z || this.t2 == null) {
            str = "";
        } else {
            str = ", " + ((Object) this.t2.b.getText());
        }
        hl.g2(G.concat(str));
    }

    public final void a1(nn4 nn4Var, boolean z) {
        ArrayList arrayList = this.b2;
        ArrayList arrayList2 = this.d2;
        arrayList2.clear();
        arrayList2.addAll(this.c2);
        int i = 0;
        if (!z) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                long n = wf3.n((TLRPC.Peer) arrayList.get(i2));
                if (!arrayList2.contains(Long.valueOf(n))) {
                    arrayList2.add(Long.valueOf(n));
                }
            }
        }
        d1(true);
        nn4Var.a(ob6.M0(z ? 2131745398 : 2131751422, null), new ds6((Object) this, (Object) nn4Var, z, (byte) 21));
        Z0(true);
        while (true) {
            d79 d79Var = this.n1;
            if (i >= d79Var.getChildCount()) {
                return;
            }
            View childAt = d79Var.getChildAt(i);
            if (childAt instanceof bd5) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((bd5) childAt).c(arrayList2.contains((Long) tag), true);
                }
            }
            i++;
        }
    }

    public final void b1() {
        boolean z;
        long j;
        boolean r0;
        ArrayList arrayList = this.e2;
        this.a2 = hl.G2(this.X1, "✱", "*");
        ArrayList arrayList2 = this.b2;
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j = peer.user_id;
                        z = false;
                    } else {
                        boolean z2 = peer instanceof TLRPC.TL_peerChat;
                        e eVar = this.r1;
                        if (z2) {
                            j = -peer.chat_id;
                            r0 = xc2.r0(eVar.getMessagesController().M0(Long.valueOf(-j)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j = -peer.channel_id;
                            r0 = xc2.r0(eVar.getMessagesController().M0(Long.valueOf(-j)));
                        } else {
                            z = false;
                            j = 0;
                        }
                        z = !r0;
                    }
                    if (j != 0 && !this.W1) {
                        if (z) {
                            this.c2.add(Long.valueOf(j));
                        }
                        this.d2.add(Long.valueOf(j));
                    }
                }
            }
        }
        this.j2 = 1;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.k2 = -1;
            this.l2 = -1;
            this.m2 = -1;
            this.n2 = -1;
        } else {
            int i2 = this.j2;
            int i3 = i2 + 1;
            this.k2 = i2;
            int i4 = i2 + 2;
            this.j2 = i4;
            this.l2 = i3;
            this.m2 = i4;
            int size = arrayList2.size() + i4;
            this.j2 = size;
            this.n2 = size;
        }
        int i5 = this.j2;
        this.j2 = i5 + 1;
        this.o2 = i5;
        if (arrayList == null || arrayList.isEmpty()) {
            this.p2 = -1;
            this.q2 = -1;
            this.r2 = -1;
            this.s2 = -1;
        } else {
            int i6 = this.j2;
            int i7 = i6 + 1;
            this.j2 = i7;
            this.p2 = i6;
            this.q2 = i7;
            int size2 = arrayList.size() + i7;
            this.r2 = size2;
            this.j2 = size2 + 1;
            this.s2 = size2;
        }
        Context context = getContext();
        mn4 mn4Var = new mn4(context);
        k43 k43Var = k43.h;
        mn4Var.e = new mm(350L, k43Var);
        mn4Var.n = 0.0f;
        mn4Var.w = 1.0f;
        mn4Var.E = 1.0f;
        mn4Var.F = true;
        mn4Var.J = aob.I.o();
        View view = new View(context);
        mn4Var.f = view;
        int i8 = aob.Fi;
        view.setBackground(rnb.d(0, rnb.b(aob.w0(null, i8, false)), 8.0f));
        mn4Var.addView(view, tre.c(-1.0f, -1));
        ShapeDrawable b0 = aob.b0(hl.L(8.0f), aob.w0(null, i8, false));
        mn4Var.h = b0;
        mn4Var.setBackground(b0);
        Paint paint = new Paint(1);
        mn4Var.a = paint;
        int i9 = aob.Ji;
        paint.setColor(aob.w0(null, i9, false));
        hn hnVar = new hn(true, true, false);
        mn4Var.b = hnVar;
        hnVar.n(0.3f, 250L, k43Var);
        hnVar.setCallback(mn4Var);
        hnVar.w(hl.L(14.0f));
        hnVar.x(hl.o());
        hnVar.u(aob.w0(null, i9, false));
        hnVar.t("", true, true);
        hnVar.b = 1;
        hn hnVar2 = new hn(false, false, true);
        mn4Var.c = hnVar2;
        hnVar2.n(0.3f, 250L, k43Var);
        hnVar2.setCallback(mn4Var);
        hnVar2.w(hl.L(12.0f));
        hnVar2.x(hl.o());
        hnVar2.u(aob.w0(null, i8, false));
        hnVar2.t("", true, true);
        hnVar2.b = 1;
        mn4Var.setWillNotDraw(false);
        this.g2 = mn4Var;
        mn4Var.setOnClickListener(new mh3(this, (byte) 19));
        this.b.addView(this.g2, tre.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.h2 = view2;
        yob.h(aob.a7, null, view2);
        this.b.addView(this.h2, tre.d(-1, 1.0f / hl.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        this.n1.setPadding(hl.L(6.0f), 0, hl.L(6.0f), hl.L(this.g2 != null ? 68.0f : 0.0f));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2 = frameLayout;
        this.b.addView(frameLayout, tre.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        K(aob.w0(null, aob.h5, false));
        d1(false);
        this.o1.setTitle(K0());
    }

    public final void d1(boolean z) {
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.U1;
        int size = this.d2.size();
        mn4 mn4Var = this.g2;
        if (mn4Var != null) {
            if (this.W1) {
                mn4Var.b(ob6.M0(size > 0 ? 2131750629 : 2131750630, null), z);
            } else {
                ArrayList arrayList = this.b2;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.g2.b(ob6.M0(2131747558, null), z);
                } else {
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.g2.b(ob6.V(null, null, 2131750635, r47.A5(pv3.m(this.X1, this.g2.b.a.getFontMetricsInt(), false, null, 0), this.Y1, this.g2.b.a.getFontMetricsInt(), false)), z);
                        this.g2.b.p = this.Z1 ? 26 : 0;
                    } else {
                        this.g2.b(size > 0 ? ob6.G(size, "FolderLinkButtonJoinPlural", new Object[0]) : ob6.M0(2131750631, null), z);
                    }
                }
            }
            mn4 mn4Var2 = this.g2;
            hn hnVar = mn4Var2.c;
            if (z) {
                hnVar.a();
                int i = mn4Var2.y;
                if (size != i && size > 0 && i > 0) {
                    ValueAnimator valueAnimator = mn4Var2.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mn4Var2.x = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mn4Var2.x = ofFloat;
                    ofFloat.addUpdateListener(new kn4(mn4Var2, (byte) 1));
                    mn4Var2.x.addListener(new cn2(mn4Var2, (byte) 22));
                    c00.o(2.0f, mn4Var2.x);
                    mn4Var2.x.setDuration(200L);
                    mn4Var2.x.start();
                }
            }
            mn4Var2.y = size;
            mn4Var2.d = size != 0 ? 1.0f : 0.0f;
            hnVar.t(String.valueOf(size), z, true);
            mn4Var2.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.g2.setEnabled(!r1.isEmpty());
            }
        }
        pn4 pn4Var = this.i2;
        if (pn4Var != null) {
            pn4Var.a();
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        super.dismiss();
        if (this.u2 >= 0) {
            this.r1.getConnectionsManager().cancelRequest(this.u2, true);
        }
        pcc pccVar = this.w2;
        if (pccVar != null) {
            pccVar.a(Boolean.valueOf(this.v2));
            this.w2 = null;
        }
    }

    public final void e1() {
        ArrayList arrayList = this.c2;
        ArrayList arrayList2 = this.b2;
        nn4 nn4Var = this.t2;
        if (nn4Var == null) {
            return;
        }
        if (this.W1) {
            nn4Var.b(ob6.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            nn4Var.b(ob6.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 == null || arrayList2.size() - arrayList.size() <= 1) {
            this.t2.a("", null);
        } else {
            boolean z = this.d2.size() >= arrayList2.size() - arrayList.size();
            this.t2.a(ob6.M0(z ? 2131751422 : 2131745398, null), new xac((byte) 20, this, z));
        }
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        try {
            int w0 = aob.w0(null, aob.h5, false);
            if (this.H0 != w0) {
                K(w0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
