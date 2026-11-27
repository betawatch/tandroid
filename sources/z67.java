// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class z67 extends e implements fn7 {
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final ss S;
    public e29 T;
    public LinearLayout U;
    public int V;
    public boolean W;
    public ImageReceiver X;
    public boolean Y;
    public boolean Z;
    public TLRPC.ChatFull a;
    public final zz3 a0;
    public final long b;
    public FrameLayout b0;
    public final int c;
    public v67 c0;
    public x67 d;
    public of0 d0;
    public b34 e;
    public final boolean e0;
    public d79 f;
    public t1b f0;
    public x46 h;
    public final r47 n;
    public i1b r;
    public i1b s;
    public final jq w;
    public v1b x;
    public final ArrayList y;

    public z67(r47 r47Var) {
        super(null);
        long j;
        this.w = new jq(15);
        this.y = new ArrayList();
        this.H = null;
        this.S = new ss(0);
        this.a0 = new zz3(this, (byte) 29);
        this.n = r47Var;
        if (r47Var.k.fwd_from == null) {
            j = r47Var.x0();
            this.b = j;
            this.c = r47Var.e1();
        } else {
            j = -r47Var.Z0();
            this.b = j;
            this.c = r47Var.k.fwd_msg_id;
        }
        this.a = getMessagesController().N0(j);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.s8));
        hashSet.add(Integer.valueOf(aob.ik));
    }

    public final void b0() {
        d79 d79Var;
        d79 d79Var2;
        d79 d79Var3;
        d79 d79Var4;
        d79 d79Var5 = this.f;
        if (d79Var5 != null) {
            int childCount = d79Var5.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                d79Var = this.f;
                if (i2 >= childCount) {
                    break;
                }
                i0(d79Var.getChildAt(i2));
                i2++;
            }
            int hiddenChildCount = d79Var.getHiddenChildCount();
            int i3 = 0;
            while (true) {
                d79Var2 = this.f;
                if (i3 >= hiddenChildCount) {
                    break;
                }
                i0(d79Var2.X(i3));
                i3++;
            }
            int cachedChildCount = d79Var2.getCachedChildCount();
            int i4 = 0;
            while (true) {
                d79Var3 = this.f;
                if (i4 >= cachedChildCount) {
                    break;
                }
                i0(d79Var3.Q(i4));
                i4++;
            }
            int attachedScrapChildCount = d79Var3.getAttachedScrapChildCount();
            while (true) {
                d79Var4 = this.f;
                if (i >= attachedScrapChildCount) {
                    break;
                }
                i0(d79Var4.P(i));
                i++;
            }
            d79Var4.getRecycledViewPool().a();
        }
        of0 of0Var = this.d0;
        if (of0Var != null) {
            of0Var.b = true;
        }
        v67 v67Var = this.c0;
        View subtitleTextView = v67Var == null ? null : v67Var.getSubtitleTextView();
        if (subtitleTextView instanceof ema) {
            ((ema) subtitleTextView).setLinkTextColor(aob.v0(aob.Gj, getResourceProvider()));
        }
    }

    public final boolean c0(r47 r47Var) {
        if (!r47Var.w4() || !(r47Var.l instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        bs2.v(null, 2131744260, d31.b0(this), R.raw.story_bomb1, 36);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        CharSequence charSequence;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yob.h(aob.a7, getResourceProvider(), frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        b34 b34Var = new b34(context, null);
        this.e = b34Var;
        b34Var.setText(ob6.M0(2131747898, null));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        e29 e29Var = new e29(context);
        this.T = e29Var;
        e29Var.setAutoRepeat(true);
        this.T.f(R.raw.statistic_preload, jn7.E1, jn7.E1, null);
        this.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        int i = aob.Fj;
        yob.X(textView, i, getResourceProvider());
        textView.setTag(Integer.valueOf(i));
        textView.setText(ob6.M0(2131748531, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i2 = aob.Gj;
        yob.X(textView2, i2, getResourceProvider());
        textView2.setTag(Integer.valueOf(i2));
        textView2.setText(ob6.M0(2131748530, null));
        textView2.setGravity(1);
        this.U.addView(this.T, tre.t(jn7.E1, jn7.E1, 1, 0, 0, 0, 20));
        this.U.addView(textView, tre.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, tre.r(-2, -2, 1));
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, tre.d(jn7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        d79 d79Var = new d79(context, getResourceProvider());
        this.f = d79Var;
        d79Var.s1();
        d79 d79Var2 = this.f;
        x46 x46Var = new x46(1, false);
        this.h = x46Var;
        d79Var2.setLayoutManager(x46Var);
        ((cma) this.f.getItemAnimator()).m = false;
        d79 d79Var3 = this.f;
        x67 x67Var = new x67(this, context);
        this.d = x67Var;
        d79Var3.setAdapter(x67Var);
        this.f.setVerticalScrollbarPosition(ob6.a0 ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new zg4(this, (byte) 13));
        this.f.setOnItemLongClickListener(new bm6(this, (byte) 11));
        this.f.setOnScrollListener(new to2(this, (byte) 27));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.addView(this.f, tre.c(-1.0f, -1));
        this.b0.addView(this.e, tre.c(-1.0f, -1));
        this.b0.setVisibility(8);
        frameLayout2.addView(this.b0, tre.c(-1.0f, -1));
        hl.d3(this.a0, 300L);
        l0();
        this.f.setEmptyView(this.e);
        this.c0 = new v67(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.p0(this.c0);
        this.X.q0(hl.L(9.0f));
        this.Z = false;
        r47 r47Var = this.n;
        int i3 = 50;
        if (!r47Var.w4()) {
            if (!r47Var.l5() && (r47.R3(r47Var.k) || r47Var.L3() || r47.K4(r47Var.k))) {
                String str = r47Var.Y4() ? r47Var.k.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w = xb4.w(r47Var.p0, 50, false, null, false);
                    TLRPC.PhotoSize w2 = xb4.w(r47Var.p0, hl.Y0(false), false, null, false);
                    if (w == w2) {
                        w2 = null;
                    }
                    if (w != null) {
                        this.Z = true;
                        this.Y = r47.K4(r47Var.k);
                        String r = xb4.r(null, w2);
                        if (r47Var.z0 || lq3.q(this.currentAccount).d(r47Var) || xb4.G(this.currentAccount).S(r)) {
                            this.X.Z(jn5.f(w2, r47Var.n0), "50_50", jn5.f(w, r47Var.n0), "50_50", null, (r47Var.D != 1 || w2 == null) ? 0 : w2.size, null, this.n, 0);
                        } else {
                            this.X.a0(null, null, jn5.f(w, r47Var.n0), "50_50", null, this.n, 0);
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(r47Var.z)) {
                boolean isEmpty = TextUtils.isEmpty(r47Var.k.message);
                CharSequence charSequence2 = r47Var.v;
                if (isEmpty) {
                    charSequence = charSequence2;
                } else {
                    if (charSequence2.length() > 150) {
                        charSequence2 = charSequence2.subSequence(0, jn7.f2);
                    }
                    charSequence = pv3.m(charSequence2, this.c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                }
            } else {
                charSequence = r47Var.z;
            }
            if (r47.K4(r47Var.k) || r47.R3(r47Var.k)) {
                v67 v67Var = this.c0;
                if (v67Var.getSubtitleTextView() != null) {
                    v67Var.getSubtitleTextView().setVisibility(8);
                }
            } else {
                this.c0.setSubtitle(charSequence);
            }
        }
        if (this.Z || r47Var.w4()) {
            this.c0.setRightAvatarPadding(-hl.L(3.0f));
        } else {
            i3 = 56;
        }
        this.actionBar.addView(this.c0, 0, tre.d(-2, -1.0f, 51, this.inPreviewMode ? 0.0f : i3, 0.0f, 40.0f, 0.0f));
        j0();
        this.c0.i(aob.v0(i, getResourceProvider()), aob.v0(i2, getResourceProvider()));
        View subtitleTextView = this.c0.getSubtitleTextView();
        if (subtitleTextView instanceof ema) {
            ((ema) subtitleTextView).setLinkTextColor(aob.v0(i2, getResourceProvider()));
        }
        yob.l(this.actionBar, 1, aob.G6, getResourceProvider());
        yob.l(this.actionBar, 3, aob.z8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 11));
        this.c0.setOnClickListener(new sa5(this, (byte) 28));
        k0();
        return this.fragmentView;
    }

    public final /* synthetic */ void d0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                this.H = tL_publicForwards.next_offset;
            } else {
                this.H = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                this.V = i;
            } else if (this.V == 0) {
                this.V = tL_publicForwards.forwards.size();
            }
            this.W = this.H == null;
            getMessagesController().c4(tL_publicForwards.chats, false);
            getMessagesController().j4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                boolean z = publicForward2 instanceof TL_stories.TL_publicForwardStory;
                ArrayList arrayList2 = this.y;
                if (z) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = wf3.n(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    r47 r47Var = new r47(this.currentAccount, storyItem);
                    r47Var.r0(false);
                    arrayList2.add(r47Var);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new r47(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            b34 b34Var = this.e;
            if (b34Var != null) {
                b34Var.c();
            }
        }
        this.G = true;
        this.F = false;
        l0();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.T) {
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

    public final /* synthetic */ void e0(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                this.H = tL_publicForwards.next_offset;
            } else {
                this.H = null;
            }
            int i = tL_publicForwards.count;
            if (i != 0) {
                this.V = i;
            } else if (this.V == 0) {
                this.V = tL_publicForwards.forwards.size();
            }
            this.W = this.H == null;
            getMessagesController().c4(tL_publicForwards.chats, false);
            getMessagesController().j4(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList = tL_publicForwards.forwards;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stats.PublicForward publicForward = arrayList.get(i2);
                i2++;
                TL_stats.PublicForward publicForward2 = publicForward;
                boolean z = publicForward2 instanceof TL_stories.TL_publicForwardStory;
                ArrayList arrayList2 = this.y;
                if (z) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = wf3.n(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    r47 r47Var = new r47(this.currentAccount, storyItem);
                    r47Var.r0(false);
                    arrayList2.add(r47Var);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new r47(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            b34 b34Var = this.e;
            if (b34Var != null) {
                b34Var.c();
            }
        }
        this.G = true;
        this.F = false;
        l0();
    }

    public final void f0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        this.E = true;
        if (tL_error != null) {
            l0();
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
        this.r = w1b.f0(statsGraph, ob6.M0(2131743182, null), 1, false);
        this.s = w1b.f0(statsGraph2, ob6.M0(2131746112, null), 2, false);
        i1b i1bVar = this.r;
        if (i1bVar == null || i1bVar.d.a.length > 5) {
            l0();
            return;
        }
        this.E = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        i1b i1bVar2 = this.r;
        tL_loadAsyncGraph.token = i1bVar2.g;
        long[] jArr = i1bVar2.d.a;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_loadAsyncGraph, new m65(this, this.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, (byte) 14), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    public final void g0() {
        if (this.F) {
            return;
        }
        byte b = 1;
        this.F = true;
        x67 x67Var = this.d;
        if (x67Var != null) {
            x67Var.f();
        }
        r47 r47Var = this.n;
        if (r47Var.w4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = r47Var.l.id;
            tL_getStoryPublicForwards.peer = getMessagesController().j1(-this.b);
            String str = this.H;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new t67(this, b), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = r47Var.k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-r47Var.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = r47Var.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().h1(-r47.B0(r47Var.k));
        }
        String str2 = this.H;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new t67(this, (byte) 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        u00 u00Var = new u00(this, (byte) 11);
        v67 v67Var = this.c0;
        arrayList.add(new apb(v67Var != null ? v67Var.getTitleTextView() : null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Fj));
        v67 v67Var2 = this.c0;
        arrayList.add(new apb(aob.Gj, v67Var2 != null ? v67Var2.getSubtitleTextView() : null));
        arrayList.add(new apb(this.f, 0, new Class[]{lj6.class}, new String[]{"statusColor"}, (Drawable[]) null, u00Var, aob.y6));
        arrayList.add(new apb(this.f, 0, new Class[]{lj6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, u00Var, aob.n6));
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G8));
        arrayList.add(new apb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.E8));
        arrayList.add(new apb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.F8));
        w1b.m0(this.r, arrayList, u00Var);
        w1b.m0(this.s, arrayList, u00Var);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        r47 r47Var = this.n;
        if (r47Var.w4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = r47Var.l.id;
            tL_stats_getStoryStats.peer = getMessagesController().j1(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = r47Var.k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().h1(-r47Var.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = r47Var.e1();
                tL_getMessageStats2.channel = getMessagesController().h1(-r47.B0(r47Var.k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new t67(this, (byte) 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    public final void i0(View view) {
        if (view instanceof lj6) {
            lj6 lj6Var = (lj6) view;
            int v0 = aob.v0(aob.y6, getResourceProvider());
            int v02 = aob.v0(aob.n6, getResourceProvider());
            lj6Var.P = true;
            lj6Var.I = v0;
            lj6Var.J = v02;
            lj6Var.d(0);
        } else if (view instanceof g1b) {
            ((g1b) view).d();
            yob.h(aob.d6, getResourceProvider(), view);
        } else {
            boolean z = view instanceof rca;
            if (z && (view.getBackground() instanceof zm2) && (((zm2) view.getBackground()).a instanceof ColorDrawable)) {
                ((ColorDrawable) ((zm2) view.getBackground()).a).setColor(aob.v0(aob.a7, getResourceProvider()));
                view.invalidate();
            } else if (z) {
                zm2 zm2Var = new zm2(new ColorDrawable(aob.v0(aob.a7, getResourceProvider())), aob.W0(a.b, R.drawable.greydivider, aob.b7), 0, 0);
                zm2Var.x = true;
                view.setBackground(zm2Var);
            } else if (view instanceof qk1) {
                ((qk1) view).a();
            } else if (view instanceof y67) {
                int i = y67.d;
                ((y67) view).a();
                yob.h(aob.d6, getResourceProvider(), view);
            }
        }
        if (view instanceof t24) {
            yob.h(aob.d6, getResourceProvider(), view);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public boolean isLightStatusBar() {
        return vm2.h(aob.v0(aob.d6, getResourceProvider())) > 0.699999988079071d;
    }

    public final void j0() {
        r47 r47Var = this.n;
        boolean w4 = r47Var.w4();
        v67 v67Var = this.c0;
        if (!w4) {
            v67Var.setTitle(ob6.M0(2131746824, null));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.b));
            if (M0 == null || this.Z) {
                return;
            }
            this.c0.setChatAvatar(M0);
            return;
        }
        v67Var.setTitle(ob6.M0(2131744112, null));
        v67 v67Var2 = this.c0;
        if (v67Var2.getSubtitleTextView() != null) {
            v67Var2.getSubtitleTextView().setVisibility(8);
        }
        v67 v67Var3 = this.c0;
        v67Var3.b = true;
        v67Var3.setStoriesForceState(1);
        ArrayList arrayList = r47Var.p0;
        if (arrayList != null) {
            this.c0.getAvatarImageView().h(jn5.f(xb4.w(arrayList, hl.Y0(false), false, null, false), r47Var.n0), "50_50", jn5.f(xb4.w(r47Var.p0, 50, false, null, false), r47Var.n0), "b1", 0, this.n);
            this.c0.setClipChildren(false);
            this.c0.getAvatarImageView().setScaleX(0.96f);
            this.c0.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void k0() {
        TLRPC.ChatFull chatFull;
        if (this.e0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            s6 u = this.actionBar.u();
            ArrayList arrayList = u.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            u.removeAllViews();
            u.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, ob6.M0(2131743211, null));
        }
    }

    public final void l0() {
        ss ssVar = this.S;
        ssVar.clear();
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.P = -1;
        this.O = -1;
        this.R = 0;
        if (this.G && this.E) {
            hl.r(this.a0);
            if (this.b0.getVisibility() == 8) {
                this.U.animate().alpha(0.0f).setListener(new ad5(this, (byte) 17));
                this.b0.setVisibility(0);
                this.b0.setAlpha(0.0f);
                this.b0.animate().alpha(1.0f).start();
            }
            int i = this.R;
            this.P = i;
            this.O = i + 1;
            this.R = i + 3;
            ssVar.add(Integer.valueOf(i + 2));
            if (this.r != null) {
                int i2 = this.R;
                this.M = i2;
                this.R = i2 + 2;
                ssVar.add(Integer.valueOf(i2 + 1));
            }
            if (this.s != null) {
                int i3 = this.R;
                this.N = i3;
                this.R = i3 + 2;
                ssVar.add(Integer.valueOf(i3 + 1));
            }
            ArrayList arrayList = this.y;
            if (!arrayList.isEmpty()) {
                int i4 = this.R;
                int i5 = i4 + 1;
                this.R = i5;
                this.I = i4;
                this.J = i5;
                int size = arrayList.size() + i5;
                this.K = size;
                this.Q = size;
                this.R = size + 2;
                ssVar.add(Integer.valueOf(size + 1));
                if (!this.W) {
                    int i6 = this.R;
                    this.R = i6 + 1;
                    this.L = i6;
                }
            }
        }
        x67 x67Var = this.d;
        if (x67Var != null) {
            x67Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            h0();
            g0();
        } else {
            uc7.s1(this.currentAccount).e3(this.classGuid, this.b, true);
        }
        jn7.f(this.currentAccount).b(this, jn7.T);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.f(this.currentAccount).n(this, jn7.T);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        x67 x67Var = this.d;
        if (x67Var != null) {
            x67Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            v67 v67Var = this.c0;
            if (v67Var != null) {
                v67Var.i(aob.v0(aob.Fj, getResourceProvider()), aob.v0(aob.Gj, getResourceProvider()));
            }
            b0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public z67(long j, r47 r47Var, boolean z) {
        super(null);
        this.w = new jq(15);
        this.y = new ArrayList();
        this.H = null;
        this.S = new ss(0);
        this.a0 = new zz3(this, (byte) 29);
        this.n = r47Var;
        this.c = 0;
        this.b = j;
        this.a = getMessagesController().N0(j);
        this.e0 = z;
    }
}
