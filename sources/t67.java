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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class t67 extends d implements jm7 {
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
    public final st S;
    public s09 T;
    public LinearLayout U;
    public int V;
    public boolean W;
    public ImageReceiver X;
    public boolean Y;
    public boolean Z;
    public TLRPC.ChatFull a;
    public final o04 a0;
    public final long b;
    public FrameLayout b0;
    public final int c;
    public p67 c0;
    public r67 d;
    public mg0 d0;
    public r34 e;
    public final boolean e0;
    public r59 f;
    public uza f0;
    public u46 h;
    public final k47 n;
    public jza r;
    public jza s;
    public final ir w;
    public wza x;
    public final ArrayList y;

    public t67(k47 k47Var) {
        super(null);
        long j;
        this.w = new ir(15);
        this.y = new ArrayList();
        this.H = null;
        this.S = new st(0);
        this.a0 = new o04(this, (byte) 29);
        this.n = k47Var;
        if (k47Var.k.fwd_from == null) {
            j = k47Var.x0();
            this.b = j;
            this.c = k47Var.e1();
        } else {
            j = -k47Var.Z0();
            this.b = j;
            this.c = k47Var.k.fwd_msg_id;
        }
        this.a = getMessagesController().M0(j);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.hk));
    }

    public final void c0() {
        r59 r59Var;
        r59 r59Var2;
        r59 r59Var3;
        r59 r59Var4;
        r59 r59Var5 = this.f;
        if (r59Var5 != null) {
            int childCount = r59Var5.getChildCount();
            int i = 0;
            int i2 = 0;
            while (true) {
                r59Var = this.f;
                if (i2 >= childCount) {
                    break;
                }
                j0(r59Var.getChildAt(i2));
                i2++;
            }
            int hiddenChildCount = r59Var.getHiddenChildCount();
            int i3 = 0;
            while (true) {
                r59Var2 = this.f;
                if (i3 >= hiddenChildCount) {
                    break;
                }
                j0(r59Var2.W(i3));
                i3++;
            }
            int cachedChildCount = r59Var2.getCachedChildCount();
            int i4 = 0;
            while (true) {
                r59Var3 = this.f;
                if (i4 >= cachedChildCount) {
                    break;
                }
                j0(r59Var3.P(i4));
                i4++;
            }
            int attachedScrapChildCount = r59Var3.getAttachedScrapChildCount();
            while (true) {
                r59Var4 = this.f;
                if (i >= attachedScrapChildCount) {
                    break;
                }
                j0(r59Var4.O(i));
                i++;
            }
            r59Var4.getRecycledViewPool().a();
        }
        mg0 mg0Var = this.d0;
        if (mg0Var != null) {
            mg0Var.b = true;
        }
        p67 p67Var = this.c0;
        View subtitleTextView = p67Var == null ? null : p67Var.getSubtitleTextView();
        if (subtitleTextView instanceof lka) {
            ((lka) subtitleTextView).setLinkTextColor(cmb.v0(cmb.Fj, getResourceProvider()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ae  */
    @Override // org.telegram.ui.ActionBar.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i;
        CharSequence charSequence;
        p67 p67Var;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        anb.h(cmb.Z6, getResourceProvider(), frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        r34 r34Var = new r34(context, null);
        this.e = r34Var;
        r34Var.setText(jb6.M0(2131747901, null));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
        s09 s09Var = new s09(context);
        this.T = s09Var;
        s09Var.setAutoRepeat(true);
        this.T.f(R.raw.statistic_preload, nm7.E1, nm7.E1, null);
        this.T.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        int i2 = cmb.Ej;
        anb.X(textView, i2, getResourceProvider());
        textView.setTag(Integer.valueOf(i2));
        textView.setText(jb6.M0(2131748534, null));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i3 = cmb.Fj;
        anb.X(textView2, i3, getResourceProvider());
        textView2.setTag(Integer.valueOf(i3));
        textView2.setText(jb6.M0(2131748533, null));
        textView2.setGravity(1);
        this.U.addView(this.T, qoe.t(nm7.E1, nm7.E1, 1, 0, 0, 0, 20));
        this.U.addView(textView, qoe.t(-2, -2, 1, 0, 0, 0, 10));
        this.U.addView(textView2, qoe.r(-2, -2, 1));
        this.U.setAlpha(0.0f);
        frameLayout2.addView(this.U, qoe.d(nm7.O3, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        r59 r59Var = new r59(context, getResourceProvider());
        this.f = r59Var;
        r59Var.r1();
        r59 r59Var2 = this.f;
        byte b = 0;
        u46 u46Var = new u46(1, false);
        this.h = u46Var;
        r59Var2.setLayoutManager(u46Var);
        ((jka) this.f.getItemAnimator()).m = false;
        r59 r59Var3 = this.f;
        r67 r67Var = new r67(this, context);
        this.d = r67Var;
        r59Var3.setAdapter(r67Var);
        this.f.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new kg4(this, (byte) 14));
        this.f.setOnItemLongClickListener(new cj6(this, (byte) 10));
        this.f.setOnScrollListener(new ip2(this, (byte) 28));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.b0 = frameLayout3;
        frameLayout3.addView(this.f, qoe.c(-1.0f, -1));
        this.b0.addView(this.e, qoe.c(-1.0f, -1));
        this.b0.setVisibility(8);
        frameLayout2.addView(this.b0, qoe.c(-1.0f, -1));
        gm.d3(this.a0, 300L);
        m0();
        this.f.setEmptyView(this.e);
        this.c0 = new p67(this, context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        imageReceiver.p0(this.c0);
        this.X.q0(gm.L(9.0f));
        this.Z = false;
        k47 k47Var = this.n;
        int i4 = 50;
        if (k47Var.w4()) {
            i = i3;
        } else {
            if (!k47Var.l5() && (k47.R3(k47Var.k) || k47Var.L3() || k47.K4(k47Var.k))) {
                String str = k47Var.Y4() ? k47Var.k.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize w = bc4.w(k47Var.p0, 50, false, null, false);
                    TLRPC.PhotoSize w2 = bc4.w(k47Var.p0, gm.Y0(false), false, null, false);
                    if (w == w2) {
                        w2 = null;
                    }
                    if (w != null) {
                        this.Z = true;
                        this.Y = k47.K4(k47Var.k);
                        String r = bc4.r(null, w2);
                        if (k47Var.z0 || er3.q(this.currentAccount).d(k47Var) || bc4.G(this.currentAccount).S(r)) {
                            int i5 = (k47Var.D != 1 || w2 == null) ? 0 : w2.size;
                            ImageReceiver imageReceiver2 = this.X;
                            gn5 f = gn5.f(w2, k47Var.n0);
                            gn5 f2 = gn5.f(w, k47Var.n0);
                            i = i3;
                            imageReceiver2.Z(f, "50_50", f2, "50_50", null, i5, null, this.n, 0);
                            if (TextUtils.isEmpty(k47Var.z)) {
                                charSequence = k47Var.z;
                            } else {
                                boolean isEmpty = TextUtils.isEmpty(k47Var.k.message);
                                CharSequence charSequence2 = k47Var.v;
                                if (isEmpty) {
                                    charSequence = charSequence2;
                                } else {
                                    if (charSequence2.length() > 150) {
                                        charSequence2 = charSequence2.subSequence(0, nm7.f2);
                                    }
                                    charSequence = gw3.m(charSequence2, this.c0.getSubtitlePaint().getFontMetricsInt(), false, null, 0);
                                }
                            }
                            if (!k47.K4(k47Var.k) || k47.R3(k47Var.k)) {
                                p67Var = this.c0;
                                if (p67Var.getSubtitleTextView() != null) {
                                    p67Var.getSubtitleTextView().setVisibility(8);
                                }
                            } else {
                                this.c0.setSubtitle(charSequence);
                            }
                        } else {
                            this.X.a0(null, null, gn5.f(w, k47Var.n0), "50_50", null, this.n, 0);
                        }
                    }
                }
            }
            i = i3;
            if (TextUtils.isEmpty(k47Var.z)) {
            }
            if (k47.K4(k47Var.k)) {
            }
            p67Var = this.c0;
            if (p67Var.getSubtitleTextView() != null) {
            }
        }
        if (this.Z || k47Var.w4()) {
            this.c0.setRightAvatarPadding(-gm.L(3.0f));
        } else {
            i4 = 56;
        }
        this.actionBar.addView(this.c0, 0, qoe.d(-2, -1.0f, 51, !this.inPreviewMode ? i4 : 0.0f, 0.0f, 40.0f, 0.0f));
        k0();
        this.c0.i(cmb.v0(i2, getResourceProvider()), cmb.v0(i, getResourceProvider()));
        View subtitleTextView = this.c0.getSubtitleTextView();
        if (subtitleTextView instanceof lka) {
            ((lka) subtitleTextView).setLinkTextColor(cmb.v0(i, getResourceProvider()));
        }
        anb.l(this.actionBar, 1, cmb.F6, getResourceProvider());
        anb.l(this.actionBar, 3, cmb.y8, getResourceProvider());
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 11));
        this.c0.setOnClickListener(new m67(this, b));
        l0();
        return this.fragmentView;
    }

    public final boolean d0(k47 k47Var) {
        if (!k47Var.w4() || !(k47Var.l instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        ts2.u(null, 2131744292, c41.b0(this), R.raw.story_bomb1, 36);
        return true;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a == null && chatFull.id == this.b) {
                k0();
                this.a = chatFull;
                i0();
                h0();
                l0();
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
            getMessagesController().X3(tL_publicForwards.chats, false);
            getMessagesController().d4(tL_publicForwards.users, false);
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
                    tL_publicForwardStory.story.dialogId = pg3.n(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    k47 k47Var = new k47(this.currentAccount, storyItem);
                    k47Var.r0(false);
                    arrayList2.add(k47Var);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new k47(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            r34 r34Var = this.e;
            if (r34Var != null) {
                r34Var.c();
            }
        }
        this.G = true;
        this.F = false;
        m0();
    }

    public final /* synthetic */ void f0(TLObject tLObject, TLRPC.TL_error tL_error) {
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
            getMessagesController().X3(tL_publicForwards.chats, false);
            getMessagesController().d4(tL_publicForwards.users, false);
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
                    tL_publicForwardStory.story.dialogId = pg3.n(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    k47 k47Var = new k47(this.currentAccount, storyItem);
                    k47Var.r0(false);
                    arrayList2.add(k47Var);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList2.add(new k47(this.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            r34 r34Var = this.e;
            if (r34Var != null) {
                r34Var.c();
            }
        }
        this.G = true;
        this.F = false;
        m0();
    }

    public final void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        this.E = true;
        if (tL_error != null) {
            m0();
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
        this.r = xza.g0(statsGraph, jb6.M0(2131743214, null), 1, false);
        this.s = xza.g0(statsGraph2, jb6.M0(2131746118, null), 2, false);
        jza jzaVar = this.r;
        if (jzaVar == null || jzaVar.d.a.length > 5) {
            m0();
            return;
        }
        this.E = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        jza jzaVar2 = this.r;
        tL_loadAsyncGraph.token = jzaVar2.g;
        long[] jArr = jzaVar2.d.a;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_loadAsyncGraph, new i65(this, this.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, (byte) 14), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        t10 t10Var = new t10(this, (byte) 11);
        p67 p67Var = this.c0;
        arrayList.add(new cnb(p67Var != null ? p67Var.getTitleTextView() : null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ej));
        p67 p67Var2 = this.c0;
        arrayList.add(new cnb(cmb.Fj, p67Var2 != null ? p67Var2.getSubtitleTextView() : null));
        arrayList.add(new cnb(this.f, 0, new Class[]{ij6.class}, new String[]{"statusColor"}, (Drawable[]) null, t10Var, cmb.x6));
        arrayList.add(new cnb(this.f, 0, new Class[]{ij6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, t10Var, cmb.m6));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_31, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F8));
        arrayList.add(new cnb(this.actionBar, TLObject.FLAG_30, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.D8));
        arrayList.add(new cnb(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.E8));
        xza.n0(this.r, arrayList, t10Var);
        xza.n0(this.s, arrayList, t10Var);
        return arrayList;
    }

    public final void h0() {
        if (this.F) {
            return;
        }
        byte b = 1;
        this.F = true;
        r67 r67Var = this.d;
        if (r67Var != null) {
            r67Var.f();
        }
        k47 k47Var = this.n;
        if (k47Var.w4()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = k47Var.l.id;
            tL_getStoryPublicForwards.peer = getMessagesController().i1(-this.b);
            String str = this.H;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new n67(this, b), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = k47Var.k.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-k47Var.Z0());
        } else {
            tL_getMessagePublicForwards.msg_id = k47Var.e1();
            tL_getMessagePublicForwards.channel = getMessagesController().g1(-k47.B0(k47Var.k));
        }
        String str2 = this.H;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new n67(this, (byte) 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        k47 k47Var = this.n;
        if (k47Var.w4()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = k47Var.l.id;
            tL_stats_getStoryStats.peer = getMessagesController().i1(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = k47Var.k.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().g1(-k47Var.Z0());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = k47Var.e1();
                tL_getMessageStats2.channel = getMessagesController().g1(-k47.B0(k47Var.k));
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new n67(this, (byte) 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public boolean isLightStatusBar() {
        return on2.h(cmb.v0(cmb.c6, getResourceProvider())) > 0.699999988079071d;
    }

    public final void j0(View view) {
        if (view instanceof ij6) {
            ij6 ij6Var = (ij6) view;
            int v0 = cmb.v0(cmb.x6, getResourceProvider());
            int v02 = cmb.v0(cmb.m6, getResourceProvider());
            ij6Var.P = true;
            ij6Var.I = v0;
            ij6Var.J = v02;
            ij6Var.d(0);
        } else if (view instanceof gza) {
            ((gza) view).d();
            anb.h(cmb.c6, getResourceProvider(), view);
        } else {
            boolean z = view instanceof bba;
            if (z && (view.getBackground() instanceof sn2) && (((sn2) view.getBackground()).a instanceof ColorDrawable)) {
                ((ColorDrawable) ((sn2) view.getBackground()).a).setColor(cmb.v0(cmb.Z6, getResourceProvider()));
                view.invalidate();
            } else if (z) {
                sn2 sn2Var = new sn2(new ColorDrawable(cmb.v0(cmb.Z6, getResourceProvider())), cmb.W0(a.b, R.drawable.greydivider, cmb.a7), 0, 0);
                sn2Var.x = true;
                view.setBackground(sn2Var);
            } else if (view instanceof pl1) {
                ((pl1) view).a();
            } else if (view instanceof s67) {
                int i = s67.d;
                ((s67) view).a();
                anb.h(cmb.c6, getResourceProvider(), view);
            }
        }
        if (view instanceof j34) {
            anb.h(cmb.c6, getResourceProvider(), view);
        }
    }

    public final void k0() {
        k47 k47Var = this.n;
        boolean w4 = k47Var.w4();
        p67 p67Var = this.c0;
        if (!w4) {
            p67Var.setTitle(jb6.M0(2131746830, null));
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.b));
            if (L0 == null || this.Z) {
                return;
            }
            this.c0.setChatAvatar(L0);
            return;
        }
        p67Var.setTitle(jb6.M0(2131744144, null));
        p67 p67Var2 = this.c0;
        if (p67Var2.getSubtitleTextView() != null) {
            p67Var2.getSubtitleTextView().setVisibility(8);
        }
        p67 p67Var3 = this.c0;
        p67Var3.b = true;
        p67Var3.setStoriesForceState(1);
        ArrayList arrayList = k47Var.p0;
        if (arrayList != null) {
            this.c0.getAvatarImageView().h(gn5.f(bc4.w(arrayList, gm.Y0(false), false, null, false), k47Var.n0), "50_50", gn5.f(bc4.w(k47Var.p0, 50, false, null, false), k47Var.n0), "b1", 0, this.n);
            this.c0.setClipChildren(false);
            this.c0.getAvatarImageView().setScaleX(0.96f);
            this.c0.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void l0() {
        TLRPC.ChatFull chatFull;
        if (this.e0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            r6 t = this.actionBar.t();
            ArrayList arrayList = t.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            t.removeAllViews();
            t.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, jb6.M0(2131743243, null));
        }
    }

    public final void m0() {
        st stVar = this.S;
        stVar.clear();
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
            gm.r(this.a0);
            if (this.b0.getVisibility() == 8) {
                this.U.animate().alpha(0.0f).setListener(new v85(this, (byte) 20));
                this.b0.setVisibility(0);
                this.b0.setAlpha(0.0f);
                this.b0.animate().alpha(1.0f).start();
            }
            int i = this.R;
            this.P = i;
            this.O = i + 1;
            this.R = i + 3;
            stVar.add(Integer.valueOf(i + 2));
            if (this.r != null) {
                int i2 = this.R;
                this.M = i2;
                this.R = i2 + 2;
                stVar.add(Integer.valueOf(i2 + 1));
            }
            if (this.s != null) {
                int i3 = this.R;
                this.N = i3;
                this.R = i3 + 2;
                stVar.add(Integer.valueOf(i3 + 1));
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
                stVar.add(Integer.valueOf(size + 1));
                if (!this.W) {
                    int i6 = this.R;
                    this.R = i6 + 1;
                    this.L = i6;
                }
            }
        }
        r67 r67Var = this.d;
        if (r67Var != null) {
            r67Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            i0();
            h0();
        } else {
            oc7.r1(this.currentAccount).a3(this.classGuid, this.b, true);
        }
        nm7.f(this.currentAccount).b(this, nm7.T);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        nm7.f(this.currentAccount).n(this, nm7.T);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        gm.V2(getParentActivity(), this.classGuid);
        r67 r67Var = this.d;
        if (r67Var != null) {
            r67Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            p67 p67Var = this.c0;
            if (p67Var != null) {
                p67Var.i(cmb.v0(cmb.Ej, getResourceProvider()), cmb.v0(cmb.Fj, getResourceProvider()));
            }
            c0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public t67(long j, k47 k47Var, boolean z) {
        super(null);
        this.w = new ir(15);
        this.y = new ArrayList();
        this.H = null;
        this.S = new st(0);
        this.a0 = new o04(this, (byte) 29);
        this.n = k47Var;
        this.c = 0;
        this.b = j;
        this.a = getMessagesController().M0(j);
        this.e0 = z;
    }
}
