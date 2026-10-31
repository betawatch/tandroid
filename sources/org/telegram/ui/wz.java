package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wz extends org.telegram.ui.Components.ha {
    public int P1;
    public final org.telegram.messenger.ap Q1;
    public final ArrayList R1;
    public final FrameLayout S1;
    public vz T1;
    public final TextView U1;
    public final ArrayList V1;
    public final ArrayList W1;

    public wz(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.ap apVar, ArrayList arrayList) {
        super(k2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.R1 = arrayList2;
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.Q1 = apVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.l1.setTitle(e1(null));
        P(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
        this.P1 = this.G0;
        TextView textView = new TextView(getContext());
        this.U1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 8.0f));
        textView.setText(org.telegram.messenger.cd.L0(2131750647, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = w7.b6.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i10 = d.leftMargin;
        int i11 = this.t0;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.S1 = frameLayout;
        this.b.addView(frameLayout, w7.b6.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.k2 k2Var, org.telegram.messenger.ap apVar, zy zyVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = apVar.a;
        k2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new org.telegram.ui.Components.c70(k2Var, apVar, zyVar, currentTimeMillis, 1));
    }

    @Override // org.telegram.ui.Components.ha
    public final org.telegram.ui.Components.sk0 L0(org.telegram.ui.Components.tk0 tk0Var) {
        vz vzVar = new vz(this);
        this.T1 = vzVar;
        return vzVar;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return e1(null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void U0(org.telegram.ui.Components.uu0 uu0Var) {
        org.telegram.ui.Components.tk0 tk0Var = this.k1;
        tk0Var.setOverScrollMode(2);
        tk0Var.setOnItemClickListener(new g(this, 11));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        tk0Var.setItemAnimator(jVar);
    }

    public final void d1() {
        org.telegram.messenger.ap apVar;
        org.telegram.ui.ActionBar.k2 k2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            apVar = this.Q1;
            int size = apVar.h.size();
            k2Var = this.o1;
            if (i10 >= size) {
                break;
            }
            long longValue = ((Long) apVar.h.get(i10)).longValue();
            if (longValue < 0 && i00.l0(k2Var.getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(k2Var.getMessagesController().i1(longValue));
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            k2Var.presentFragment(new iz(apVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = apVar.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        k2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new k(this, 7));
    }

    public final CharSequence e1(nh.p pVar) {
        Object obj;
        org.telegram.messenger.ap apVar = this.Q1;
        if (apVar != null) {
            Paint.FontMetricsInt fontMetricsInt = pVar == null ? null : pVar.getPaint().getFontMetricsInt();
            obj = org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(new SpannableStringBuilder(apVar.b), fontMetricsInt, false, null, 0), apVar.c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.cd.V(null, null, 2131750644, obj);
    }

    public final void g1() {
        ArrayList arrayList = this.R1;
        this.U1.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.k1.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), arrayList.isEmpty() ? org.telegram.messenger.i0.L(68.0f) : 0);
    }

    public final void h1(boolean z10) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        ArrayList arrayList2 = this.W1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        a00 a00Var = new a00(0, false);
        a00Var.d = null;
        arrayList2.add(a00Var);
        ArrayList arrayList3 = this.R1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(a00.d(null));
            arrayList2.add(new a00(8, false));
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i10);
                a00 a00Var2 = new a00(7, false);
                a00Var2.m = tL_exportedChatlistInvite;
                arrayList2.add(a00Var2);
            }
        }
        vz vzVar = this.T1;
        if (vzVar != null) {
            if (z10) {
                vzVar.E(arrayList, arrayList2);
            } else {
                this.k1.getAdapter().f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.G0 != this.P1 || (x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false)) == this.G0) {
                return;
            }
            P(x02);
            this.P1 = this.G0;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
