package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class sh0 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final a0.g R;
    public org.telegram.ui.Components.ei0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final m4 Z;
    public TLRPC.ChatFull a;
    public FrameLayout a0;
    public final long b;
    public oh0 b0;
    public final int c;
    public bg.h c0;
    public qh0 d;
    public final boolean d0;
    public org.telegram.ui.Components.xy e;
    public r61 e0;
    public org.telegram.ui.Components.tk0 f;
    public s4.a0 h;
    public final org.telegram.messenger.jj n;
    public g61 r;
    public g61 s;
    public final e2.j0 w;
    public t61 x;
    public final ArrayList y;

    public sh0(long j10, org.telegram.messenger.jj jjVar, boolean z10) {
        super(null);
        this.w = new e2.j0(15, 3);
        this.y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.n = jjVar;
        this.c = 0;
        this.b = j10;
        this.a = getMessagesController().M0(j10);
        this.d0 = z10;
    }

    public static void Y(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        sh0Var.D = true;
        if (tL_error != null) {
            sh0Var.l0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        sh0Var.r = u61.h0(statsGraph, org.telegram.messenger.cd.L0(2131743556, null), 1, false);
        sh0Var.s = u61.h0(statsGraph2, org.telegram.messenger.cd.L0(2131746400, null), 2, false);
        g61 g61Var = sh0Var.r;
        if (g61Var == null || g61Var.d.a.length > 5) {
            sh0Var.l0();
            return;
        }
        sh0Var.D = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        g61 g61Var2 = sh0Var.r;
        tL_loadAsyncGraph.token = g61Var2.g;
        long[] jArr = g61Var2.d.a;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(sh0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(sh0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new aa(sh0Var, sh0Var.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, 24), null, null, 0, sh0Var.a.stats_dc, 1, true), sh0Var.classGuid);
    }

    public static /* synthetic */ void Z(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = sh0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                sh0Var.G = tL_publicForwards.next_offset;
            } else {
                sh0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                sh0Var.U = i10;
            } else if (sh0Var.U == 0) {
                sh0Var.U = tL_publicForwards.forwards.size();
            }
            sh0Var.V = sh0Var.G == null;
            sh0Var.getMessagesController().P3(tL_publicForwards.chats, false);
            sh0Var.getMessagesController().V3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.o5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(sh0Var.currentAccount, storyItem);
                    jjVar.r0(false);
                    arrayList.add(jjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.jj(sh0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.xy xyVar = sh0Var.e;
            if (xyVar != null) {
                xyVar.c();
            }
        }
        sh0Var.F = true;
        sh0Var.E = false;
        sh0Var.l0();
    }

    public static /* synthetic */ void a0(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = sh0Var.y;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                sh0Var.G = tL_publicForwards.next_offset;
            } else {
                sh0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                sh0Var.U = i10;
            } else if (sh0Var.U == 0) {
                sh0Var.U = tL_publicForwards.forwards.size();
            }
            sh0Var.V = sh0Var.G == null;
            sh0Var.getMessagesController().P3(tL_publicForwards.chats, false);
            sh0Var.getMessagesController().V3(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = org.telegram.messenger.o5.o(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(sh0Var.currentAccount, storyItem);
                    jjVar.r0(false);
                    arrayList.add(jjVar);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new org.telegram.messenger.jj(sh0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.xy xyVar = sh0Var.e;
            if (xyVar != null) {
                xyVar.c();
            }
        }
        sh0Var.F = true;
        sh0Var.E = false;
        sh0Var.l0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.fk));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b3  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        CharSequence charSequence;
        oh0 oh0Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout, getResourceProvider());
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.e = xyVar;
        xyVar.setText(org.telegram.messenger.cd.L0(2131748183, null));
        int i11 = 8;
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ei0 ei0Var = new org.telegram.ui.Components.ei0(context);
        this.S = ei0Var;
        ei0Var.setAutoRepeat(true);
        this.S.f(R.raw.statistic_preload, 120, 120, null);
        this.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int i12 = org.telegram.ui.ActionBar.t6.Cj;
        org.telegram.ui.ActionBar.a7.V(textView, i12, getResourceProvider());
        textView.setTag(Integer.valueOf(i12));
        textView.setText(org.telegram.messenger.cd.L0(2131748787, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i13 = org.telegram.ui.ActionBar.t6.Dj;
        org.telegram.ui.ActionBar.a7.V(textView2, i13, getResourceProvider());
        textView2.setTag(Integer.valueOf(i13));
        textView2.setText(org.telegram.messenger.cd.L0(2131748786, null));
        textView2.setGravity(1);
        this.T.addView(this.S, w7.b6.t(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, w7.b6.t(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, w7.b6.r(-2, -2, 1));
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, w7.b6.d(org.telegram.messenger.zs.P3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, getResourceProvider());
        this.f = tk0Var;
        tk0Var.r1();
        org.telegram.ui.Components.tk0 tk0Var2 = this.f;
        s4.a0 a0Var = new s4.a0(1, false);
        this.h = a0Var;
        tk0Var2.setLayoutManager(a0Var);
        ((s4.f1) this.f.getItemAnimator()).m = false;
        org.telegram.ui.Components.tk0 tk0Var3 = this.f;
        qh0 qh0Var = new qh0(this, context);
        this.d = qh0Var;
        tk0Var3.setAdapter(qh0Var);
        this.f.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new g(this, 18));
        this.f.setOnItemLongClickListener(new tt(this, 23));
        this.f.setOnScrollListener(new h3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.addView(this.f, w7.b6.c(-1.0f, -1));
        this.a0.addView(this.e, w7.b6.c(-1.0f, -1));
        this.a0.setVisibility(8);
        frameLayout2.addView(this.a0, w7.b6.c(-1.0f, -1));
        org.telegram.messenger.i0.h3(this.Z, 300L);
        l0();
        this.f.setEmptyView(this.e);
        this.b0 = new oh0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.W = imageReceiver;
        imageReceiver.H0(this.b0);
        this.W.J0(org.telegram.messenger.i0.L(9.0f));
        this.Y = false;
        org.telegram.messenger.jj jjVar = this.n;
        int i14 = 50;
        if (jjVar.x4()) {
            i10 = i13;
        } else {
            if (!jjVar.m5() && (org.telegram.messenger.jj.S3(jjVar.k) || jjVar.L3() || org.telegram.messenger.jj.L4(jjVar.k))) {
                String str = jjVar.Z4() ? jjVar.k.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar.n0, 50, false, null, false);
                    TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(jjVar.n0, org.telegram.messenger.i0.Z0(false), false, null, false);
                    if (w9 == w10) {
                        w10 = null;
                    }
                    if (w9 != null) {
                        this.Y = true;
                        this.X = org.telegram.messenger.jj.L4(jjVar.k);
                        String r10 = org.telegram.messenger.b8.r(null, w10);
                        if (jjVar.x0 || org.telegram.messenger.b6.q(this.currentAccount).d(jjVar) || org.telegram.messenger.b8.G(this.currentAccount).T(r10)) {
                            int i15 = (jjVar.D != 1 || w10 == null) ? 0 : w10.size;
                            ImageReceiver imageReceiver2 = this.W;
                            org.telegram.messenger.ic f7 = org.telegram.messenger.ic.f(w10, jjVar.l0);
                            org.telegram.messenger.ic f10 = org.telegram.messenger.ic.f(w9, jjVar.l0);
                            i10 = i13;
                            imageReceiver2.r0(f7, "50_50", f10, "50_50", null, i15, null, this.n, 0);
                            if (TextUtils.isEmpty(jjVar.z)) {
                                charSequence = jjVar.z;
                            } else if (TextUtils.isEmpty(jjVar.k.message)) {
                                charSequence = jjVar.v;
                            } else {
                                CharSequence charSequence2 = jjVar.v;
                                if (charSequence2.length() > 150) {
                                    charSequence2 = charSequence2.subSequence(0, org.telegram.messenger.zs.g2);
                                }
                                charSequence = org.telegram.messenger.k6.m(charSequence2, this.b0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                            }
                            if (!org.telegram.messenger.jj.L4(jjVar.k) || org.telegram.messenger.jj.S3(jjVar.k)) {
                                oh0Var = this.b0;
                                if (oh0Var.getSubtitleTextView() != null) {
                                    oh0Var.getSubtitleTextView().setVisibility(8);
                                }
                            } else {
                                this.b0.setSubtitle(charSequence);
                            }
                        } else {
                            this.W.s0(null, null, org.telegram.messenger.ic.f(w9, jjVar.l0), "50_50", null, this.n, 0);
                        }
                    }
                }
            }
            i10 = i13;
            if (TextUtils.isEmpty(jjVar.z)) {
            }
            if (org.telegram.messenger.jj.L4(jjVar.k)) {
            }
            oh0Var = this.b0;
            if (oh0Var.getSubtitleTextView() != null) {
            }
        }
        if (this.Y || jjVar.x4()) {
            this.b0.setRightAvatarPadding(-org.telegram.messenger.i0.L(3.0f));
        } else {
            i14 = 56;
        }
        this.actionBar.addView(this.b0, 0, w7.b6.d(-2, -1.0f, 51, !this.inPreviewMode ? i14 : 0.0f, 0.0f, 40.0f, 0.0f));
        j0();
        this.b0.i(org.telegram.ui.ActionBar.t6.w0(i12, getResourceProvider()), org.telegram.ui.ActionBar.t6.w0(i10, getResourceProvider()));
        View subtitleTextView = this.b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.u5) {
            ((org.telegram.ui.ActionBar.u5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(i10, getResourceProvider()));
        }
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.G6, getResourceProvider());
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.actionBar.setActionBarMenuOnItemClick(new t60(this, i11));
        this.b0.setOnClickListener(new f50(this, 11));
        k0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a == null && chatFull.id == this.b) {
                j0();
                this.a = chatFull;
                h0();
                g0();
                k0();
            }
        }
    }

    public final void e0() {
        org.telegram.ui.Components.tk0 tk0Var = this.f;
        if (tk0Var != null) {
            int childCount = tk0Var.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                i0(this.f.getChildAt(i10));
            }
            int hiddenChildCount = this.f.getHiddenChildCount();
            for (int i11 = 0; i11 < hiddenChildCount; i11++) {
                i0(this.f.V(i11));
            }
            int cachedChildCount = this.f.getCachedChildCount();
            for (int i12 = 0; i12 < cachedChildCount; i12++) {
                i0(this.f.P(i12));
            }
            int attachedScrapChildCount = this.f.getAttachedScrapChildCount();
            for (int i13 = 0; i13 < attachedScrapChildCount; i13++) {
                i0(this.f.O(i13));
            }
            this.f.getRecycledViewPool().a();
        }
        bg.h hVar = this.c0;
        if (hVar != null) {
            hVar.c = true;
        }
        oh0 oh0Var = this.b0;
        View subtitleTextView = oh0Var == null ? null : oh0Var.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.u5) {
            ((org.telegram.ui.ActionBar.u5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, getResourceProvider()));
        }
    }

    public final boolean f0(org.telegram.messenger.jj jjVar) {
        if (!jjVar.x4() || !(jjVar.l instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        org.telegram.messenger.m5.n(null, 2131744625, org.telegram.ui.Components.cc.a0(this), R.raw.story_bomb1, 36);
        return true;
    }

    public final void g0() {
        if (this.E) {
            return;
        }
        this.E = true;
        qh0 qh0Var = this.d;
        if (qh0Var != null) {
            qh0Var.f();
        }
        org.telegram.messenger.jj jjVar = this.n;
        if (jjVar.x4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = jjVar.l.id;
            tL_getStoryPublicForwards.peer = getMessagesController().i1(-this.b);
            String str = this.G;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new mh0(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = jjVar.k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-jjVar.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = jjVar.f1();
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-org.telegram.messenger.jj.B0(jjVar.k));
        }
        String str2 = this.G;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new mh0(this, 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(13, this);
        oh0 oh0Var = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(oh0Var != null ? oh0Var.getTitleTextView() : null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Cj));
        oh0 oh0Var2 = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.c7(org.telegram.ui.ActionBar.t6.Dj, oh0Var2 != null ? oh0Var2.getSubtitleTextView() : null));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        u61.m0(this.r, arrayList, g6Var);
        u61.m0(this.s, arrayList, g6Var);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        org.telegram.messenger.jj jjVar = this.n;
        if (jjVar.x4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = jjVar.l.id;
            tL_stats_getStoryStats.peer = getMessagesController().i1(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = jjVar.k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().g1(-jjVar.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = jjVar.f1();
                tL_getMessageStats2.channel = getMessagesController().g1(-org.telegram.messenger.jj.B0(jjVar.k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new mh0(this, 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    public final void i0(View view) {
        if (view instanceof org.telegram.ui.Cells.e5) {
            org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, getResourceProvider());
            int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, getResourceProvider());
            e5Var.O = true;
            e5Var.H = w02;
            e5Var.I = w03;
            e5Var.d(0);
        } else if (view instanceof e61) {
            ((e61) view).d();
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, view, getResourceProvider());
        } else {
            boolean z10 = view instanceof org.telegram.ui.Cells.c7;
            if (z10 && (view.getBackground() instanceof org.telegram.ui.Components.eq) && (((org.telegram.ui.Components.eq) view.getBackground()).a instanceof ColorDrawable)) {
                ((ColorDrawable) ((org.telegram.ui.Components.eq) view.getBackground()).a).setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, getResourceProvider()));
                view.invalidate();
            } else if (z10) {
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.a7, getResourceProvider())), org.telegram.ui.ActionBar.t6.Y0(org.telegram.messenger.w0.b, R.drawable.greydivider, org.telegram.ui.ActionBar.t6.b7), 0, 0);
                eqVar.x = true;
                view.setBackground(eqVar);
            } else if (view instanceof dg.d) {
                ((dg.d) view).a();
            } else if (view instanceof rh0) {
                int i10 = rh0.d;
                ((rh0) view).a();
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, view, getResourceProvider());
            }
        }
        if (view instanceof org.telegram.ui.Cells.o3) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, view, getResourceProvider());
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public boolean isLightStatusBar() {
        return i0.b.h(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, getResourceProvider())) > 0.699999988079071d;
    }

    public final void j0() {
        org.telegram.messenger.jj jjVar = this.n;
        if (!jjVar.x4()) {
            this.b0.setTitle(org.telegram.messenger.cd.L0(2131747112, null));
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.b));
            if (L0 == null || this.Y) {
                return;
            }
            this.b0.setChatAvatar(L0);
            return;
        }
        this.b0.setTitle(org.telegram.messenger.cd.L0(2131744484, null));
        oh0 oh0Var = this.b0;
        if (oh0Var.getSubtitleTextView() != null) {
            oh0Var.getSubtitleTextView().setVisibility(8);
        }
        oh0 oh0Var2 = this.b0;
        oh0Var2.b = true;
        oh0Var2.setStoriesForceState(1);
        ArrayList arrayList = jjVar.n0;
        if (arrayList != null) {
            this.b0.getAvatarImageView().l(org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(arrayList, org.telegram.messenger.i0.Z0(false), false, null, false), jjVar.l0), "50_50", org.telegram.messenger.ic.f(org.telegram.messenger.b8.w(jjVar.n0, 50, false, null, false), jjVar.l0), "b1", 0, this.n);
            this.b0.setClipChildren(false);
            this.b0.getAvatarImageView().setScaleX(0.96f);
            this.b0.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void k0() {
        TLRPC.ChatFull chatFull;
        if (this.d0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
            ArrayList arrayList = p5.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            p5.removeAllViews();
            p5.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, org.telegram.messenger.cd.L0(2131743585, null));
        }
    }

    public final void l0() {
        a0.g gVar = this.R;
        gVar.clear();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.N = -1;
        this.Q = 0;
        if (this.F && this.D) {
            org.telegram.messenger.i0.r(this.Z);
            if (this.a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.voip.h2(this, 16));
                this.a0.setVisibility(0);
                this.a0.setAlpha(0.0f);
                this.a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                int i13 = this.Q;
                int i14 = i13 + 1;
                this.Q = i14;
                this.H = i13;
                this.I = i14;
                int size = arrayList.size() + i14;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i15 = this.Q;
                    this.Q = i15 + 1;
                    this.K = i15;
                }
            }
        }
        qh0 qh0Var = this.d;
        if (qh0Var != null) {
            qh0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            h0();
            g0();
        } else {
            org.telegram.messenger.vp.r1(this.currentAccount).T2(this.classGuid, this.b, true);
        }
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        qh0 qh0Var = this.d;
        if (qh0Var != null) {
            qh0Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            oh0 oh0Var = this.b0;
            if (oh0Var != null) {
                oh0Var.i(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Cj, getResourceProvider()), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, getResourceProvider()));
            }
            e0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public sh0(org.telegram.messenger.jj jjVar) {
        super(null);
        this.w = new e2.j0(15, 3);
        this.y = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new m4(this, 12);
        this.n = jjVar;
        if (jjVar.k.fwd_from == null) {
            this.b = jjVar.x0();
            this.c = jjVar.f1();
        } else {
            this.b = -jjVar.Z0();
            this.c = jjVar.k.fwd_msg_id;
        }
        this.a = getMessagesController().M0(this.b);
    }
}
