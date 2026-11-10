package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yy extends org.telegram.ui.Components.ma {
    public int S1;
    public final org.telegram.messenger.vo T1;
    public final ArrayList U1;
    public final FrameLayout V1;
    public xy W1;
    public final TextView X1;
    public final ArrayList Y1;
    public final ArrayList Z1;

    public yy(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, ArrayList arrayList) {
        super(f2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.U1 = arrayList2;
        this.Y1 = new ArrayList();
        this.Z1 = new ArrayList();
        this.T1 = voVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        h1(false);
        this.o1.setTitle(e1(null));
        O(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
        this.S1 = this.G0;
        TextView textView = new TextView(getContext());
        this.X1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.m6.Ci, 8.0f));
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
        this.V1 = frameLayout;
        this.b.addView(frameLayout, c8.ha.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        g1();
    }

    public static void f1(org.telegram.ui.ActionBar.f2 f2Var, org.telegram.messenger.vo voVar, kz kzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = voVar.a;
        f2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new bi.f0(f2Var, voVar, kzVar, currentTimeMillis, 4));
    }

    @Override // org.telegram.ui.Components.ma
    public final org.telegram.ui.Components.oj0 L0(org.telegram.ui.Components.pj0 pj0Var) {
        xy xyVar = new xy(this);
        this.W1 = xyVar;
        return xyVar;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        return e1(null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void U0(org.telegram.ui.Components.st0 st0Var) {
        org.telegram.ui.Components.pj0 pj0Var = this.n1;
        pj0Var.setOverScrollMode(2);
        pj0Var.setOnItemClickListener(new h(this, 11));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.wq.h);
        kVar.n(350L);
        pj0Var.setItemAnimator(kVar);
    }

    public final void d1() {
        org.telegram.messenger.vo voVar;
        org.telegram.ui.ActionBar.f2 f2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            voVar = this.T1;
            int size = voVar.h.size();
            f2Var = this.r1;
            if (i7 >= size) {
                break;
            }
            long longValue = ((Long) voVar.h.get(i7)).longValue();
            if (longValue < 0 && jz.m0(f2Var.getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(f2Var.getMessagesController().j1(longValue));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            f2Var.presentFragment(new jy(voVar, null));
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
        org.telegram.messenger.vo voVar = this.T1;
        if (voVar != null) {
            Paint.FontMetricsInt fontMetricsInt = lVar == null ? null : lVar.getPaint().getFontMetricsInt();
            obj = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(new SpannableStringBuilder(voVar.b), fontMetricsInt, false, null, 0), voVar.c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.id.V(null, null, 2131750643, obj);
    }

    public final void g1() {
        ArrayList arrayList = this.U1;
        this.X1.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.n1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), arrayList.isEmpty() ? org.telegram.messenger.g0.L(68.0f) : 0);
    }

    public final void h1(boolean z9) {
        ArrayList arrayList = this.Y1;
        arrayList.clear();
        ArrayList arrayList2 = this.Z1;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        bz bzVar = new bz(0, false);
        bzVar.d = null;
        arrayList2.add(bzVar);
        ArrayList arrayList3 = this.U1;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(bz.d(null));
            arrayList2.add(new bz(8, false));
            for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i7);
                bz bzVar2 = new bz(7, false);
                bzVar2.m = tL_exportedChatlistInvite;
                arrayList2.add(bzVar2);
            }
        }
        xy xyVar = this.W1;
        if (xyVar != null) {
            if (z9) {
                xyVar.E(arrayList, arrayList2);
            } else {
                this.n1.getAdapter().f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.G0 != this.S1 || (x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false)) == this.G0) {
                return;
            }
            O(x02);
            this.S1 = this.G0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
