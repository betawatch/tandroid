package th;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.u71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u3 extends sk0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ y3 d;

    public u3(y3 y3Var) {
        this.d = y3Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        y3 y3Var = this.d;
        x3 x3Var = y3Var.E;
        int i10 = 0;
        if (y3Var.Q) {
            arrayList.add(new q3(0));
            arrayList.add(new q3(6));
        } else {
            arrayList.add(new q3(0));
            if (x3Var != null) {
                l3 l3Var = x3Var.s;
                boolean z10 = x3Var.j;
                if (x3Var.b() <= 0 && (z10 || (!x3Var.e && !x3Var.m))) {
                    if (!TextUtils.isEmpty(l3Var.c)) {
                        arrayList.add(new q3(7));
                    } else if (z10) {
                        arrayList.add(new q3(5));
                    } else {
                        int i11 = x3Var.a;
                        if (i11 > 0 && l3Var.b) {
                            arrayList.add(new q3(8));
                        } else if (i11 > 0) {
                            arrayList.add(new q3(10));
                        } else {
                            arrayList.add(new q3(5));
                        }
                    }
                }
            }
            if (x3Var != null) {
                ArrayList arrayList2 = x3Var.g;
                ArrayList arrayList3 = x3Var.i;
                if (x3Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new q3((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new q3((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (x3Var == null || !(x3Var.e || x3Var.m)) {
                if (x3Var != null && x3Var.k) {
                    arrayList.add(new q3(11));
                } else if (x3Var != null) {
                    l3 l3Var2 = x3Var.s;
                    if (x3Var.b() < x3Var.a && TextUtils.isEmpty(l3Var2.c) && !l3Var2.b) {
                        arrayList.add(new q3(12));
                    }
                }
            } else if (x3Var.b() <= 0) {
                arrayList.add(new q3(6));
            } else {
                arrayList.add(new q3(4));
            }
        }
        arrayList.add(new q3(9));
        f();
    }

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        return ((q3) this.c.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j10;
        TLRPC.Chat L0;
        TLRPC.User user;
        int i11;
        String str;
        long j11;
        boolean z10;
        int i12;
        int i13;
        String str2;
        TLRPC.Message message2;
        y3 y3Var = this.d;
        int i14 = y3Var.w;
        if (c1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        q3 q3Var = (q3) arrayList.get(i10);
        org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) c1Var.a;
        TL_stories.StoryView storyView = q3Var.b;
        TL_stories.StoryReaction storyReaction = q3Var.c;
        if (storyView != null) {
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                peer = storyView.peer_id;
            } else if (!(storyView instanceof TL_stories.TL_storyViewPublicForward) || (message2 = storyView.message) == null) {
                peer = new TLRPC.TL_peerUser();
                peer.user_id = storyView.user_id;
            } else {
                peer = message2.peer_id;
            }
        } else if (storyReaction != null) {
            peer = storyReaction.peer_id;
            if ((storyReaction instanceof TL_stories.TL_storyReactionPublicForward) && (message = storyReaction.message) != null) {
                peer = message.peer_id;
            }
        } else {
            peer = null;
        }
        long o10 = org.telegram.messenger.o5.o(peer);
        if (o10 >= 0) {
            user = vp.r1(i14).Z1(Long.valueOf(o10));
            j10 = o10;
            L0 = null;
        } else {
            j10 = o10;
            L0 = vp.r1(i14).L0(Long.valueOf(-o10));
            user = null;
        }
        boolean remove = y3Var.F.p.remove(Long.valueOf(j10));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = sg.o0.d(reaction).f) == null || !str2.equals("❤")) {
                j11 = 0;
                z10 = false;
            } else {
                j11 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i13 = 11;
                i12 = 12;
                q6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 12;
                i13 = 11;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j12 = storyView.message != null ? r10.date : j11;
                    e4 e4Var = y3Var.D;
                    q6Var.c(user3, null, null, z10, j12, e4Var == null ? null : e4Var.a, true, true, remove);
                } else {
                    q6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((q3) arrayList.get(i10 + 1)).a : -1;
            q6Var.a = i15 == 1 || i15 == i13 || i15 == i12;
            q6Var.a(false, y3Var.d(storyView) ? 1.0f : 0.5f);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = sg.o0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                q6Var.c(user4, L0, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    q6Var.c(user4, L0, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j13 = storyReaction.message != null ? r7.date : 0L;
                    e4 e4Var2 = y3Var.D;
                    q6Var.c(user4, L0, null, false, j13, e4Var2 == null ? null : e4Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((q3) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            q6Var.a = z12;
            q6Var.a(false, 1.0f);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        final y3 y3Var = this.d;
        int i11 = y3Var.w;
        b bVar = y3Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new s3(this, y3Var.getContext(), i13);
                break;
            case 1:
                hb0 hb0Var = org.telegram.ui.Cells.q6.H;
                view = new t3(i11, y3Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new s3(this, y3Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.x3(y3Var.getContext(), 70);
                break;
            case 4:
                zz zzVar = new zz(y3Var.getContext(), bVar);
                zzVar.setIsSingleCell(true);
                zzVar.setViewType(28);
                zzVar.x = false;
                view = zzVar;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                kj kjVar = new kj(y3Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, y3Var.getContext(), bVar, this);
                nh.p pVar = kjVar.d;
                if (i10 == 7) {
                    pVar.setVisibility(8);
                    kjVar.setSubtitle(cd.L0(2131748183, null));
                } else if (i10 == 8) {
                    pVar.setVisibility(8);
                    kjVar.setSubtitle(cd.L0(2131748239, null));
                } else if (i10 == 10) {
                    pVar.setVisibility(0);
                    pVar.setText(cd.L0(2131745579, null));
                    kjVar.setSubtitle(cd.L0(2131745581, null));
                } else if (y3Var.F.j) {
                    pVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.W2(cd.L0(2131750872, null)));
                    boolean A3 = vp.r1(i11).A3();
                    p80 p80Var = kjVar.e;
                    if (!A3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i0.T2(cd.L0(2131750871, null), new Runnable() { // from class: th.r3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        y3.a(y3Var);
                                        break;
                                    default:
                                        y3.a(y3Var);
                                        break;
                                }
                            }
                        }));
                        String L0 = cd.L0(2131749020, null);
                        Runnable runnable = new Runnable() { // from class: th.r3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        y3.a(y3Var);
                                        break;
                                    default:
                                        y3.a(y3Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) p80Var.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(12.0f);
                        TextView textView = new TextView(kjVar.getContext());
                        textView.setText(L0);
                        int i14 = org.telegram.ui.ActionBar.t6.Gi;
                        org.telegram.ui.ActionBar.p6 p6Var = kjVar.n;
                        org.telegram.ui.ActionBar.a7.V(textView, i14, p6Var);
                        textView.setPadding(org.telegram.messenger.i0.L(45.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(45.0f), org.telegram.messenger.i0.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        textView.setTextSize(1, 15.0f);
                        org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(kjVar.getContext(), 24);
                        a5Var.setOnClickListener(new db0(runnable, 16));
                        int L = org.telegram.messenger.i0.L(8.0f);
                        int i15 = org.telegram.ui.ActionBar.t6.Ci;
                        int w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
                        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.w0(i14, p6Var), 30);
                        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, w02, o10, o10);
                        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i15);
                        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i14, 30);
                        a5Var.setBackground(k02);
                        org.telegram.ui.ActionBar.a7.k(a5Var, k02, N, h, p6Var);
                        w7.e6.b(a5Var, 0.05f, 1.5f);
                        a5Var.addView(textView);
                        u71 u71Var = kjVar.a;
                        u71Var.setClipChildren(false);
                        u71Var.addView(a5Var, w7.b6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    p80Var.setText(spannableStringBuilder);
                } else {
                    pVar.setVisibility(0);
                    if (y3Var.F.f) {
                        pVar.setText(cd.L0(2131748191, null));
                        kjVar.setSubtitle(cd.L0(2131748189, null));
                    } else {
                        pVar.setText(cd.L0(2131748148, null));
                        kjVar.setSubtitle(cd.L0(2131748147, null));
                    }
                }
                kjVar.e(false, false);
                view = kjVar;
                break;
            case 6:
                zz zzVar2 = new zz(y3Var.getContext(), bVar);
                zzVar2.setIsSingleCell(true);
                zzVar2.setIgnoreHeightCheck(true);
                zzVar2.setItemsCount(20);
                zzVar2.setViewType(28);
                zzVar2.x = false;
                view = zzVar2;
                break;
            case 11:
            case 12:
                p80 p80Var2 = new p80(y3Var.getContext(), null);
                p80Var2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.y6, bVar);
                org.telegram.ui.ActionBar.a7.H(p80Var2, org.telegram.ui.ActionBar.t6.J6, bVar);
                int L2 = org.telegram.messenger.i0.L(16.0f);
                int L3 = org.telegram.messenger.i0.L(21.0f);
                p80Var2.setPadding(L3, L2, L3, L2);
                p80Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                p80Var2.setGravity(17);
                p80Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    p80Var2.setText(org.telegram.messenger.i0.T2(cd.L0(2131744472, null), new sg.v(this, 10)));
                } else {
                    p80Var2.setText(cd.L0(2131745580, null));
                }
                p80Var2.setLayoutParams(new s4.o0(-1, -2));
                view = p80Var2;
                break;
        }
        return new ck0(view);
    }
}
