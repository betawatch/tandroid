// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class v3a extends c79 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ z3a d;

    public v3a(z3a z3aVar) {
        this.d = z3aVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        z3a z3aVar = this.d;
        y3a y3aVar = z3aVar.F;
        int i = 0;
        if (z3aVar.R) {
            arrayList.add(new s3a(0));
            arrayList.add(new s3a(6));
        } else {
            arrayList.add(new s3a(0));
            if (y3aVar != null) {
                n3a n3aVar = y3aVar.s;
                boolean z = y3aVar.j;
                if (y3aVar.b() <= 0 && (z || (!y3aVar.e && !y3aVar.m))) {
                    if (!TextUtils.isEmpty(n3aVar.c)) {
                        arrayList.add(new s3a(7));
                    } else if (z) {
                        arrayList.add(new s3a(5));
                    } else if (y3aVar.a <= 0) {
                        arrayList.add(new s3a(5));
                    } else if (n3aVar.b) {
                        arrayList.add(new s3a(8));
                    } else {
                        arrayList.add(new s3a(10));
                    }
                }
            }
            if (y3aVar != null) {
                ArrayList arrayList2 = y3aVar.g;
                ArrayList arrayList3 = y3aVar.i;
                if (y3aVar.f) {
                    while (i < arrayList3.size()) {
                        arrayList.add(new s3a((TL_stories.StoryReaction) arrayList3.get(i)));
                        i++;
                    }
                } else {
                    while (i < arrayList2.size()) {
                        arrayList.add(new s3a((TL_stories.StoryView) arrayList2.get(i)));
                        i++;
                    }
                }
            }
            if (y3aVar != null) {
                if (y3aVar.e || y3aVar.m) {
                    if (y3aVar.b() <= 0) {
                        arrayList.add(new s3a(6));
                    } else {
                        arrayList.add(new s3a(4));
                    }
                } else if (y3aVar.k) {
                    arrayList.add(new s3a(11));
                } else {
                    n3a n3aVar2 = y3aVar.s;
                    if (y3aVar.b() < y3aVar.a && TextUtils.isEmpty(n3aVar2.c) && !n3aVar2.b) {
                        arrayList.add(new s3a(12));
                    }
                }
            }
        }
        arrayList.add(new s3a(9));
        f();
    }

    @Override // j79
    public final int b() {
        return this.c.size();
    }

    @Override // j79
    public final int d(int i) {
        return ((s3a) this.c.get(i)).a;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j;
        TLRPC.Chat chat;
        TLRPC.User user;
        String str;
        long j2;
        boolean z;
        float f;
        byte b;
        String str2;
        TLRPC.Message message2;
        if (f89Var.f != 1 || i < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            s3a s3aVar = (s3a) arrayList.get(i);
            e39 e39Var = (e39) f89Var.a;
            TL_stories.StoryView storyView = s3aVar.b;
            TL_stories.StoryReaction storyReaction = s3aVar.c;
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
            long n = wf3.n(peer);
            z3a z3aVar = this.d;
            int i2 = z3aVar.w;
            if (n >= 0) {
                user = uc7.s1(i2).X1(Long.valueOf(n));
                j = n;
                chat = null;
            } else {
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-n));
                j = n;
                chat = M0;
                user = null;
            }
            boolean remove = z3aVar.G.p.remove(Long.valueOf(j));
            if (storyView == null) {
                TLRPC.Reaction reaction = null;
                TLRPC.User user2 = user;
                if (storyReaction != null) {
                    if (storyReaction instanceof TL_stories.TL_storyReaction) {
                        TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                        TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                        boolean z2 = (reaction2 == null || (str = w49.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                        if (!z2) {
                            reaction = tL_storyReaction.reaction;
                        }
                        e39Var.c(user2, chat, reaction, z2, tL_storyReaction.date, null, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                        e39Var.c(user2, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                    } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                        long j3 = storyReaction.message != null ? r5.date : 0L;
                        f4a f4aVar = z3aVar.E;
                        e39Var.c(user2, chat, null, false, j3, f4aVar == null ? null : f4aVar.a, true, true, remove);
                    }
                    byte b2 = i < arrayList.size() - 1 ? ((s3a) arrayList.get(i + 1)).a : (byte) -1;
                    e39Var.a = b2 == 1 || b2 == 11 || b2 == 12;
                    e39Var.a(false, 1.0f);
                    return;
                }
                return;
            }
            TLRPC.Reaction reaction3 = storyView.reaction;
            if (reaction3 == null || (str2 = w49.d(reaction3).f) == null || !str2.equals("❤")) {
                j2 = 0;
                z = false;
            } else {
                j2 = 0;
                z = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                f = 1.0f;
                b = 11;
                e39Var.c(user, null, null, z, 0L, storyView.story, false, true, remove);
            } else {
                f = 1.0f;
                b = 11;
                TLRPC.Reaction reaction4 = null;
                TLRPC.User user3 = user;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j4 = storyView.message != null ? r8.date : j2;
                    f4a f4aVar2 = z3aVar.E;
                    e39Var.c(user3, null, null, z, j4, f4aVar2 == null ? null : f4aVar2.a, true, true, remove);
                } else {
                    if (!z) {
                        reaction4 = storyView.reaction;
                    }
                    e39Var.c(user3, null, reaction4, z, storyView.date, null, false, true, remove);
                }
            }
            byte b3 = i < arrayList.size() + (-1) ? ((s3a) arrayList.get(i + 1)).a : (byte) -1;
            e39Var.a = b3 == 1 || b3 == b || b3 == 12;
            e39Var.a(false, z3aVar.b(storyView) ? f : 0.5f);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        z3a z3aVar = this.d;
        int i2 = z3aVar.w;
        x53 x53Var = z3aVar.s;
        byte b = 10;
        byte b2 = 1;
        byte b3 = 0;
        switch (i) {
            case 0:
                view = new t3a(this, z3aVar.getContext(), b3);
                break;
            case 1:
                w57 w57Var = e39.I;
                view = new u3a(i2, x53Var, this, z3aVar.getContext());
                break;
            case 2:
            case 9:
            default:
                view = new t3a(this, z3aVar.getContext(), b2);
                break;
            case 3:
                view = new ak4(z3aVar.getContext(), 70, (byte) 0);
                break;
            case 4:
                tk4 tk4Var = new tk4(z3aVar.getContext(), x53Var);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(28);
                tk4Var.x = false;
                view = tk4Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                h32 h32Var = new h32(z3aVar.G.j ? 12 : (i == 10 || i == 7 || i == 8 || i == 5) ? 1 : 0, x53Var, this, z3aVar.getContext());
                tpa tpaVar = h32Var.d;
                if (i == 7) {
                    tpaVar.setVisibility(8);
                    h32Var.setSubtitle(ob6.M0(2131747898, null));
                } else if (i == 8) {
                    tpaVar.setVisibility(8);
                    h32Var.setSubtitle(ob6.M0(2131747953, null));
                } else if (i == 10) {
                    tpaVar.setVisibility(0);
                    tpaVar.setText(ob6.M0(2131745290, null));
                    h32Var.setSubtitle(ob6.M0(2131745292, null));
                } else if (z3aVar.G.j) {
                    tpaVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) hl.S2(ob6.M0(2131750836, null)));
                    boolean M3 = uc7.s1(i2).M3();
                    p66 p66Var = h32Var.e;
                    if (!M3) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) hl.N2(ob6.M0(2131750835, null), -1, 0, new ux9(z3aVar, (byte) 11), null));
                        String M0 = ob6.M0(2131748764, null);
                        ux9 ux9Var = new ux9(z3aVar, (byte) 11);
                        ((LinearLayout.LayoutParams) p66Var.getLayoutParams()).topMargin = hl.L(12.0f);
                        TextView textView = new TextView(h32Var.getContext());
                        textView.setText(M0);
                        int i3 = aob.Ji;
                        vnb vnbVar = h32Var.n;
                        yob.X(textView, i3, vnbVar);
                        textView.setPadding(hl.L(45.0f), hl.L(12.0f), hl.L(45.0f), hl.L(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(hl.o());
                        textView.setTextSize(1, 15.0f);
                        ir8 ir8Var = new ir8(h32Var.getContext(), (byte) 13);
                        ir8Var.setOnClickListener(new kla(ux9Var, b));
                        int L = hl.L(8.0f);
                        int i4 = aob.Fi;
                        int v0 = aob.v0(i4, vnbVar);
                        int o = vm2.o(aob.v0(i3, vnbVar), 30);
                        hf0 i0 = aob.i0(L, L, L, L, v0, o, o);
                        uob M = yob.M(i4);
                        uob g = yob.g(i3, 30);
                        ir8Var.setBackground(i0);
                        yob.j(ir8Var, i0, M, g, vnbVar);
                        iye.b(ir8Var, 0.05f, 1.5f);
                        ir8Var.addView(textView);
                        oob oobVar = h32Var.a;
                        oobVar.setClipChildren(false);
                        oobVar.addView(ir8Var, tre.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    p66Var.setText(spannableStringBuilder);
                } else {
                    tpaVar.setVisibility(0);
                    if (z3aVar.G.f) {
                        tpaVar.setText(ob6.M0(2131747906, null));
                        h32Var.setSubtitle(ob6.M0(2131747904, null));
                    } else {
                        tpaVar.setText(ob6.M0(2131747863, null));
                        h32Var.setSubtitle(ob6.M0(2131747862, null));
                    }
                }
                h32Var.e(false, false);
                view = h32Var;
                break;
            case 6:
                tk4 tk4Var2 = new tk4(z3aVar.getContext(), x53Var);
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setIgnoreHeightCheck(true);
                tk4Var2.setItemsCount(20);
                tk4Var2.setViewType(28);
                tk4Var2.x = false;
                view = tk4Var2;
                break;
            case 11:
            case 12:
                p66 p66Var2 = new p66(z3aVar.getContext(), null);
                p66Var2.setTextSize(1, 13.0f);
                yob.X(p66Var2, aob.y6, x53Var);
                yob.G(p66Var2, aob.J6, x53Var);
                int L2 = hl.L(16.0f);
                int L3 = hl.L(21.0f);
                p66Var2.setPadding(L3, L2, L3, L2);
                p66Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                p66Var2.setGravity(17);
                p66Var2.setDisablePaddingsOffsetY(true);
                if (i == 11) {
                    p66Var2.setText(hl.N2(ob6.M0(2131744100, null), -1, 0, new ux9(this, (byte) 10), null));
                } else {
                    p66Var2.setText(ob6.M0(2131745291, null));
                }
                p66Var2.setLayoutParams(new r79(-1, -2));
                view = p66Var2;
                break;
        }
        return new n69(view);
    }
}
