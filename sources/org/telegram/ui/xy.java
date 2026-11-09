package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xy extends org.telegram.ui.Components.na {
    public int P1;
    public final org.telegram.messenger.vo Q1;
    public final ArrayList R1;
    public final FrameLayout S1;
    public wy T1;
    public final TextView U1;
    public final ArrayList V1;
    public final ArrayList W1;

    public xy(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, ArrayList arrayList) {
        super(f2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.R1 = arrayList2;
        this.V1 = new ArrayList();
        this.W1 = new ArrayList();
        this.Q1 = voVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.l1.setTitle(e1(null));
        O(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false));
        this.P1 = this.G0;
        TextView textView = new TextView(getContext());
        this.U1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.l6.Ci, 8.0f));
        textView.setText(org.telegram.messenger.id.M0(2131750646, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = c8.ha.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i7 = d.leftMargin;
        int i10 = this.t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.S1 = frameLayout;
        this.b.addView(frameLayout, c8.ha.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, jz jzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = voVar.a;
        f2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new bi.f0(f2Var, voVar, jzVar, currentTimeMillis, 4));
    }

    @Override // org.telegram.ui.Components.na
    public final org.telegram.ui.Components.pj0 L0(org.telegram.ui.Components.qj0 qj0Var) {
        wy wyVar = new wy(this);
        this.T1 = wyVar;
        return wyVar;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        return e1(null);
    }

    @Override // org.telegram.ui.Components.na
    public final void U0(org.telegram.ui.Components.tt0 tt0Var) {
        org.telegram.ui.Components.qj0 qj0Var = this.k1;
        qj0Var.setOverScrollMode(2);
        qj0Var.setOnItemClickListener(new h(this, 11));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        qj0Var.setItemAnimator(kVar);
    }

    public final void d1() {
        org.telegram.messenger.vo voVar;
        org.telegram.ui.ActionBar.f2 f2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            voVar = this.Q1;
            int size = voVar.h.size();
            f2Var = this.o1;
            if (i7 >= size) {
                break;
            }
            long longValue = ((Long) voVar.h.get(i7)).longValue();
            if (longValue < 0 && iz.m0(f2Var.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(f2Var.getMessagesController().j1(longValue));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            f2Var.presentFragment(new iy(voVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = voVar.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        f2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence e1(xh.l lVar) {
        Object obj;
        org.telegram.messenger.vo voVar = this.Q1;
        if (voVar != null) {
            Paint.FontMetricsInt fontMetricsInt = lVar == null ? null : lVar.getPaint().getFontMetricsInt();
            obj = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(new SpannableStringBuilder(voVar.b), fontMetricsInt, false, null, 0), voVar.c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.id.V(null, null, 2131750643, obj);
    }

    public final void g1() {
        ArrayList arrayList = this.R1;
        this.U1.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.k1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), arrayList.isEmpty() ? org.telegram.messenger.g0.L(68.0f) : 0);
    }

    public final void h1(boolean z9) {
        ArrayList arrayList = this.V1;
        arrayList.clear();
        ArrayList arrayList2 = this.W1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        az azVar = new az(0, false);
        azVar.d = null;
        arrayList2.add(azVar);
        ArrayList arrayList3 = this.R1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(az.d(null));
            arrayList2.add(new az(8, false));
            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i7);
                az azVar2 = new az(7, false);
                azVar2.m = tL_exportedChatlistInvite;
                arrayList2.add(azVar2);
            }
        }
        wy wyVar = this.T1;
        if (wyVar != null) {
            if (z9) {
                wyVar.E(arrayList, arrayList2);
            } else {
                this.k1.getAdapter().f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.G0 != this.P1 || (x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.h5, false)) == this.G0) {
                return;
            }
            O(x02);
            this.P1 = this.G0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
