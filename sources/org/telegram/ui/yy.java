package org.telegram.ui;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yy extends org.telegram.ui.Components.ra {
    public int T1;
    public final org.telegram.messenger.ro U1;
    public final ArrayList V1;
    public final FrameLayout W1;
    public xy X1;
    public final TextView Y1;
    public final ArrayList Z1;
    public final ArrayList a2;

    public yy(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.ro roVar, ArrayList arrayList) {
        super(g2Var, false);
        ArrayList arrayList2 = new ArrayList();
        this.V1 = arrayList2;
        this.Z1 = new ArrayList();
        this.a2 = new ArrayList();
        this.U1 = roVar;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        i1(false);
        this.p1.setTitle(f1(null));
        P(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false));
        this.T1 = this.H0;
        TextView textView = new TextView(getContext());
        this.Y1 = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setBackground(org.telegram.ui.ActionBar.b6.f(org.telegram.ui.ActionBar.n6.Fi, 8.0f));
        textView.setText(org.telegram.messenger.gd.N0(2131750629, null));
        textView.setGravity(17);
        textView.setOnClickListener(new a(this, 21));
        FrameLayout.LayoutParams d = c8.na.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
        int i7 = d.leftMargin;
        int i10 = this.u0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.b.addView(textView, d);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W1 = frameLayout;
        this.b.addView(frameLayout, c8.na.d(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
        h1();
    }

    public static void g1(org.telegram.ui.ActionBar.g2 g2Var, org.telegram.messenger.ro roVar, kz kzVar) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = roVar.a;
        g2Var.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new di.y(g2Var, roVar, kzVar, currentTimeMillis, 4));
    }

    @Override // org.telegram.ui.Components.ra
    public final org.telegram.ui.Components.dk0 M0(org.telegram.ui.Components.ek0 ek0Var) {
        xy xyVar = new xy(this);
        this.X1 = xyVar;
        return xyVar;
    }

    @Override // org.telegram.ui.Components.ra
    public final CharSequence P0() {
        return f1(null);
    }

    @Override // org.telegram.ui.Components.ra
    public final void V0(org.telegram.ui.Components.cu0 cu0Var) {
        org.telegram.ui.Components.ek0 ek0Var = this.o1;
        ek0Var.setOverScrollMode(2);
        ek0Var.setOnItemClickListener(new h(this, 11));
        v4.l lVar = new v4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.kr.h);
        lVar.n(350L);
        ek0Var.setItemAnimator(lVar);
    }

    public final void e1() {
        org.telegram.messenger.ro roVar;
        org.telegram.ui.ActionBar.g2 g2Var;
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            roVar = this.U1;
            int size = roVar.h.size();
            g2Var = this.s1;
            if (i7 >= size) {
                break;
            }
            long longValue = ((Long) roVar.h.get(i7)).longValue();
            if (longValue < 0 && jz.m0(g2Var.getMessagesController().O0(Long.valueOf(-longValue)))) {
                arrayList.add(g2Var.getMessagesController().l1(longValue));
            }
            i7++;
        }
        if (arrayList.isEmpty()) {
            dismiss();
            g2Var.presentFragment(new jy(roVar, null));
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = roVar.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        g2Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new l(this, 7));
    }

    public final CharSequence f1(xh.l lVar) {
        Object obj;
        org.telegram.messenger.ro roVar = this.U1;
        if (roVar != null) {
            Paint.FontMetricsInt fontMetricsInt = lVar == null ? null : lVar.getPaint().getFontMetricsInt();
            obj = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(new SpannableStringBuilder(roVar.b), fontMetricsInt, false, null, 0), roVar.c, fontMetricsInt, false);
        } else {
            obj = "";
        }
        return org.telegram.messenger.gd.V(null, null, 2131750626, obj);
    }

    public final void h1() {
        ArrayList arrayList = this.V1;
        this.Y1.setVisibility(arrayList.isEmpty() ? 0 : 8);
        this.o1.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), arrayList.isEmpty() ? org.telegram.messenger.g0.L(68.0f) : 0);
    }

    public final void i1(boolean z10) {
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        ArrayList arrayList2 = this.a2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        bz bzVar = new bz(0, false);
        bzVar.d = null;
        arrayList2.add(bzVar);
        ArrayList arrayList3 = this.V1;
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
        xy xyVar = this.X1;
        if (xyVar != null) {
            if (z10) {
                xyVar.E(arrayList, arrayList2);
            } else {
                this.o1.getAdapter().f();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int x02;
        super.s0();
        try {
            if (this.H0 != this.T1 || (x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.h5, false)) == this.H0) {
                return;
            }
            P(x02);
            this.T1 = this.H0;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
