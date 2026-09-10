package zh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.gc1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v3 extends ul0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ z3 d;

    public v3(z3 z3Var) {
        this.d = z3Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    public final void E() {
        ArrayList arrayList = this.c;
        arrayList.clear();
        z3 z3Var = this.d;
        y3 y3Var = z3Var.E;
        int i10 = 0;
        if (z3Var.Q) {
            arrayList.add(new r3(0));
            arrayList.add(new r3(6));
        } else {
            arrayList.add(new r3(0));
            if (y3Var != null) {
                m3 m3Var = y3Var.s;
                boolean z10 = y3Var.j;
                if (y3Var.b() <= 0 && (z10 || (!y3Var.e && !y3Var.m))) {
                    if (!TextUtils.isEmpty(m3Var.c)) {
                        arrayList.add(new r3(7));
                    } else if (z10) {
                        arrayList.add(new r3(5));
                    } else {
                        int i11 = y3Var.a;
                        if (i11 > 0 && m3Var.b) {
                            arrayList.add(new r3(8));
                        } else if (i11 > 0) {
                            arrayList.add(new r3(10));
                        } else {
                            arrayList.add(new r3(5));
                        }
                    }
                }
            }
            if (y3Var != null) {
                ArrayList arrayList2 = y3Var.g;
                ArrayList arrayList3 = y3Var.i;
                if (y3Var.f) {
                    while (i10 < arrayList3.size()) {
                        arrayList.add(new r3((TL_stories.StoryReaction) arrayList3.get(i10)));
                        i10++;
                    }
                } else {
                    while (i10 < arrayList2.size()) {
                        arrayList.add(new r3((TL_stories.StoryView) arrayList2.get(i10)));
                        i10++;
                    }
                }
            }
            if (y3Var == null || !(y3Var.e || y3Var.m)) {
                if (y3Var != null && y3Var.k) {
                    arrayList.add(new r3(11));
                } else if (y3Var != null) {
                    m3 m3Var2 = y3Var.s;
                    if (y3Var.b() < y3Var.a && TextUtils.isEmpty(m3Var2.c) && !m3Var2.b) {
                        arrayList.add(new r3(12));
                    }
                }
            } else if (y3Var.b() <= 0) {
                arrayList.add(new r3(6));
            } else {
                arrayList.add(new r3(4));
            }
        }
        arrayList.add(new r3(9));
        l();
    }

    @Override // s4.h0
    public final int h() {
        return this.c.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((r3) this.c.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.Peer peer;
        TLRPC.Message message;
        long j3;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i11;
        String str;
        long j10;
        boolean z10;
        int i12;
        int i13;
        String str2;
        TLRPC.Message message2;
        z3 z3Var = this.d;
        int i14 = z3Var.v;
        if (c1Var.f != 1 || i10 < 0) {
            return;
        }
        ArrayList arrayList = this.c;
        if (i10 >= arrayList.size()) {
            return;
        }
        r3 r3Var = (r3) arrayList.get(i10);
        org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) c1Var.a;
        TL_stories.StoryView storyView = r3Var.b;
        TL_stories.StoryReaction storyReaction = r3Var.c;
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
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        if (peerDialogId >= 0) {
            user = MessagesController.getInstance(i14).getUser(Long.valueOf(peerDialogId));
            j3 = peerDialogId;
            chat = null;
        } else {
            j3 = peerDialogId;
            chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-peerDialogId));
            user = null;
        }
        boolean remove = z3Var.F.p.remove(Long.valueOf(j3));
        if (storyView != null) {
            TLRPC.Reaction reaction = storyView.reaction;
            if (reaction == null || (str2 = yg.p0.d(reaction).f) == null || !str2.equals("❤")) {
                j10 = 0;
                z10 = false;
            } else {
                j10 = 0;
                z10 = true;
            }
            if (storyView instanceof TL_stories.TL_storyViewPublicRepost) {
                TLRPC.User user2 = user;
                i12 = 11;
                i13 = 12;
                p6Var.c(user2, null, null, z10, 0L, storyView.story, false, true, remove);
            } else {
                TLRPC.User user3 = user;
                i12 = 11;
                i13 = 12;
                if (storyView instanceof TL_stories.TL_storyViewPublicForward) {
                    long j11 = storyView.message != null ? r10.date : j10;
                    f4 f4Var = z3Var.y;
                    p6Var.c(user3, null, null, z10, j11, f4Var == null ? null : f4Var.a, true, true, remove);
                } else {
                    p6Var.c(user3, null, z10 ? null : storyView.reaction, z10, storyView.date, null, false, true, remove);
                }
            }
            int i15 = i10 < arrayList.size() + (-1) ? ((r3) arrayList.get(i10 + 1)).a : -1;
            p6Var.a = i15 == 1 || i15 == i12 || i15 == i13;
            p6Var.a(z3Var.d(storyView) ? 1.0f : 0.5f, false);
            return;
        }
        TLRPC.User user4 = user;
        if (storyReaction != null) {
            if (storyReaction instanceof TL_stories.TL_storyReaction) {
                TL_stories.TL_storyReaction tL_storyReaction = (TL_stories.TL_storyReaction) storyReaction;
                TLRPC.Reaction reaction2 = tL_storyReaction.reaction;
                boolean z11 = (reaction2 == null || (str = yg.p0.d(reaction2).f) == null || !str.equals("❤")) ? false : true;
                i11 = 12;
                p6Var.c(user4, chat, z11 ? null : tL_storyReaction.reaction, z11, tL_storyReaction.date, null, false, true, remove);
            } else {
                i11 = 12;
                if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                    p6Var.c(user4, chat, null, false, 0L, ((TL_stories.TL_storyReactionPublicRepost) storyReaction).story, false, true, remove);
                } else if (storyReaction instanceof TL_stories.TL_storyReactionPublicForward) {
                    long j12 = storyReaction.message != null ? r7.date : 0L;
                    f4 f4Var2 = z3Var.y;
                    p6Var.c(user4, chat, null, false, j12, f4Var2 == null ? null : f4Var2.a, true, true, remove);
                }
            }
            boolean z12 = true;
            int i16 = i10 < arrayList.size() - 1 ? ((r3) arrayList.get(i10 + 1)).a : -1;
            if (i16 != 1 && i16 != 11 && i16 != i11) {
                z12 = false;
            }
            p6Var.a = z12;
            p6Var.a(1.0f, false);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        final z3 z3Var = this.d;
        int i11 = z3Var.v;
        b bVar = z3Var.s;
        final int i12 = 1;
        final int i13 = 0;
        switch (i10) {
            case 0:
                view = new t3(this, z3Var.getContext(), i13);
                break;
            case 1:
                jc0 jc0Var = org.telegram.ui.Cells.p6.G;
                view = new u3(i11, z3Var.getContext(), bVar, this);
                break;
            case 2:
            case 9:
            default:
                view = new t3(this, z3Var.getContext(), i12);
                break;
            case 3:
                view = new org.telegram.ui.Cells.s3(z3Var.getContext(), 70);
                break;
            case 4:
                a10 a10Var = new a10(z3Var.getContext(), bVar);
                a10Var.setIsSingleCell(true);
                a10Var.setViewType(28);
                a10Var.w = false;
                view = a10Var;
                break;
            case 5:
            case 7:
            case 8:
            case 10:
                hk hkVar = new hk(z3Var.F.j ? 12 : (i10 == 10 || i10 == 7 || i10 == 8 || i10 == 5) ? 1 : 0, z3Var.getContext(), bVar, this);
                uh.o oVar = hkVar.d;
                if (i10 == 7) {
                    oVar.setVisibility(8);
                    hkVar.setSubtitle(LocaleController.getString(R.string.NoResult));
                } else if (i10 == 8) {
                    oVar.setVisibility(8);
                    hkVar.setSubtitle(LocaleController.getString(R.string.NoContactsViewed));
                } else if (i10 == 10) {
                    oVar.setVisibility(0);
                    oVar.setText(LocaleController.getString(R.string.ServerErrorViewersTitle));
                    hkVar.setSubtitle(LocaleController.getString(R.string.ServerErrorViewers));
                } else if (z3Var.F.j) {
                    oVar.setVisibility(8);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.ExpiredViewsStub)));
                    boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
                    m90 m90Var = hkVar.e;
                    if (!premiumFeaturesBlocked) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ExpiredViewsStubPremiumDescription), new Runnable() { // from class: zh.s3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        z3.a(z3Var);
                                        break;
                                    default:
                                        z3.a(z3Var);
                                        break;
                                }
                            }
                        }));
                        String string = LocaleController.getString(R.string.LearnMore);
                        Runnable runnable = new Runnable() { // from class: zh.s3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i12) {
                                    case 0:
                                        z3.a(z3Var);
                                        break;
                                    default:
                                        z3.a(z3Var);
                                        break;
                                }
                            }
                        };
                        ((LinearLayout.LayoutParams) m90Var.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                        TextView textView = new TextView(hkVar.getContext());
                        textView.setText(string);
                        int i14 = org.telegram.ui.ActionBar.j6.Sh;
                        org.telegram.ui.ActionBar.f6 f6Var = hkVar.n;
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
                        textView.setPadding(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(45.0f), AndroidUtilities.dp(12.0f));
                        textView.setGravity(17);
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 15.0f);
                        bi.l4 l4Var = new bi.l4(hkVar.getContext(), 18);
                        l4Var.setOnClickListener(new g80(runnable, 19));
                        int dp = AndroidUtilities.dp(8.0f);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
                        int k10 = i0.a.k(org.telegram.ui.ActionBar.j6.v0(i14, f6Var), 30);
                        l4Var.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, k10, k10));
                        w7.c6.b(l4Var, 0.05f, 1.5f);
                        l4Var.addView(textView);
                        gc1 gc1Var = hkVar.a;
                        gc1Var.setClipChildren(false);
                        gc1Var.addView(l4Var, w7.a6.t(-2, -2, 1, 0, 28, 0, 4));
                    }
                    m90Var.setText(spannableStringBuilder);
                } else {
                    oVar.setVisibility(0);
                    if (z3Var.F.f) {
                        oVar.setText(LocaleController.getString(R.string.NoReactions));
                        hkVar.setSubtitle(LocaleController.getString(R.string.NoReactionsStub));
                    } else {
                        oVar.setText(LocaleController.getString(R.string.NoViews));
                        hkVar.setSubtitle(LocaleController.getString(R.string.NoViewsStub));
                    }
                }
                hkVar.e(false, false);
                view = hkVar;
                break;
            case 6:
                a10 a10Var2 = new a10(z3Var.getContext(), bVar);
                a10Var2.setIsSingleCell(true);
                a10Var2.setIgnoreHeightCheck(true);
                a10Var2.setItemsCount(20);
                a10Var2.setViewType(28);
                a10Var2.w = false;
                view = a10Var2;
                break;
            case 11:
            case 12:
                m90 m90Var2 = new m90(z3Var.getContext(), null);
                m90Var2.setTextSize(1, 13.0f);
                m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, bVar));
                m90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J6, bVar));
                int dp2 = AndroidUtilities.dp(16.0f);
                int dp3 = AndroidUtilities.dp(21.0f);
                m90Var2.setPadding(dp3, dp2, dp3, dp2);
                m90Var2.setMaxLines(ConnectionsManager.DEFAULT_DATACENTER_ID);
                m90Var2.setGravity(17);
                m90Var2.setDisablePaddingsOffsetY(true);
                if (i10 == 11) {
                    m90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryViewsPremiumHint), new xh.x(this, 26)));
                } else {
                    m90Var2.setText(LocaleController.getString(R.string.ServerErrorViewersFull));
                }
                m90Var2.setLayoutParams(new s4.p0(-1, -2));
                view = m90Var2;
                break;
        }
        return new fl0(view);
    }
}
