package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.pb;
import bi.r9;
import bi.rd;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class z3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public y3 E;
    public y3 F;
    public c5 G;
    public int H;
    public boolean I;
    public final zk0 J;
    public final u7 K;
    public final l3 L;
    public final m3 M;
    public final bi.i5 N;
    public final m3 O;
    public final q3 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public Drawable U;
    public boolean V;
    public long W;
    public final View a;
    public final View b;
    public final FrameLayout c;
    public final a5.a d;
    public int e;
    public p3 f;
    public final TextView h;
    public int n;
    public final h3 r;
    public final b s;
    public final int v;
    public final v3 w;
    public final wz x;
    public f4 y;

    public z3(u7 u7Var, Context context, m3 m3Var, bi.i5 i5Var) {
        super(context);
        this.e = 96;
        this.O = new m3();
        this.M = m3Var;
        this.N = i5Var;
        b bVar = u7Var.y;
        this.s = bVar;
        this.K = u7Var;
        this.v = u7Var.h;
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, bVar));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(8.0f));
        q3 q3Var = new q3(this, getContext());
        this.P = q3Var;
        h3 h3Var = new h3(this, context, bVar);
        this.r = h3Var;
        h3Var.setClipToPadding(false);
        this.J = new zk0(h3Var, true);
        wz wzVar = new wz(h3Var, 0);
        this.x = wzVar;
        h3Var.setLayoutManager(wzVar);
        h3Var.setNestedScrollingEnabled(true);
        v3 v3Var = new v3(this);
        this.w = v3Var;
        h3Var.setAdapter(v3Var);
        new SparseArray();
        new HashMap();
        addView(h3Var);
        this.d = new a5.a(h3Var);
        h3Var.setOnScrollListener(new al0(this, 21));
        h3Var.setOnItemClickListener(new ai.b0(24, this, u7Var));
        h3Var.setOnItemLongClickListener(new k3(this, u7Var));
        v3Var.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        view.setBackground(new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.j6.v0(i10, bVar), 0}));
        frameLayout.addView(view, w7.a6.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        view2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        frameLayout.addView(view2, w7.a6.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(q3Var);
        frameLayout.addView(textView);
        l3 l3Var = new l3(this, getContext(), bVar);
        this.L = l3Var;
        l3Var.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(l3Var, w7.a6.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void a(z3 z3Var) {
        new qg.a1(z3Var.K.f, 14, false).show();
    }

    public static void b(z3 z3Var) {
        y3 y3Var = z3Var.E;
        if (y3Var != null) {
            y3Var.r.remove(z3Var);
        }
        y3 y3Var2 = z3Var.F;
        z3Var.E = y3Var2;
        if (y3Var2 == null) {
            return;
        }
        ArrayList arrayList = y3Var2.r;
        if (!arrayList.contains(z3Var)) {
            arrayList.add(z3Var);
        }
        z3Var.E.e(z3Var.O, z3Var.T, z3Var.S);
        z3Var.w.E();
        z3Var.x.h1(0, (int) (z3Var.getTopOffset() - z3Var.r.getPaddingTop()));
    }

    public static void f(int i10, long j3, TL_stories.StoryItem storyItem) {
        if (storyItem == null) {
            return;
        }
        SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i10).storiesController.x.f(storyItem.dialogId);
        y3 y3Var = sparseArray == null ? null : (y3) sparseArray.get(storyItem.id);
        TL_stories.StoryViews storyViews = storyItem.views;
        int i11 = storyViews == null ? 0 : storyViews.views_count;
        if (y3Var == null || y3Var.a != i11) {
            if (y3Var != null) {
                y3Var.d();
            }
            y3 y3Var2 = new y3(i10, j3, storyItem);
            y3Var2.c();
            if (sparseArray == null) {
                a0.i iVar = MessagesController.getInstance(i10).storiesController.x;
                long j10 = storyItem.dialogId;
                sparseArray = new SparseArray();
                iVar.k(sparseArray, j10);
            }
            sparseArray.put(storyItem.id, y3Var2);
        }
    }

    public final void c() {
        if (this.E == null || this.x.N0() <= this.w.c.size() - 10) {
            return;
        }
        this.E.c();
    }

    public final boolean d(TL_stories.StoryView storyView) {
        r9 r9Var;
        pb pbVar;
        if (storyView == null) {
            return true;
        }
        int i10 = this.v;
        if (MessagesController.getInstance(i10).getStoriesController().L(storyView) || MessagesController.getInstance(i10).blockePeers.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(storyView.user_id));
        f4 f4Var = this.y;
        if (f4Var != null) {
            TL_stories.StoryItem storyItem = f4Var.a;
            if (storyItem != null) {
                if (storyItem.parsedPrivacy == null) {
                    storyItem.parsedPrivacy = new pb(i10, storyItem.privacy);
                }
                return this.y.a.parsedPrivacy.b(user);
            }
            h5 h5Var = f4Var.b;
            if (h5Var != null && (r9Var = h5Var.c) != null && (pbVar = r9Var.E0) != null) {
                return pbVar.b(user);
            }
        }
        return true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int R;
        int i12 = 0;
        if (i10 == NotificationCenter.storiesUpdated) {
            if (this.y.b != null) {
                int i13 = this.v;
                TL_stories.PeerStories y3 = MessagesController.getInstance(i13).storiesController.y(UserConfig.getInstance(i13).clientUserId);
                if (y3 != null) {
                    while (i12 < y3.stories.size()) {
                        TL_stories.StoryItem storyItem = y3.stories.get(i12);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.y.b.e)) {
                            f4 f4Var = this.y;
                            f4Var.b = null;
                            f4Var.a = storyItem;
                            g(this.W, f4Var);
                            return;
                        }
                        i12++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.storiesBlocklistUpdate) {
            return;
        }
        while (true) {
            h3 h3Var = this.r;
            if (i12 >= h3Var.getChildCount()) {
                return;
            }
            View childAt = h3Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Cells.p6) && (R = RecyclerView.R(childAt)) >= 0) {
                v3 v3Var = this.w;
                if (R < v3Var.c.size()) {
                    ((org.telegram.ui.Cells.p6) childAt).a(d(((r3) v3Var.c.get(R)).b) ? 1.0f : 0.5f, true);
                }
            }
            i12++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h3 h3Var;
        View view = null;
        int i10 = 0;
        int i11 = -1;
        while (true) {
            h3Var = this.r;
            if (i10 >= h3Var.getChildCount()) {
                break;
            }
            View childAt = h3Var.getChildAt(i10);
            int S = RecyclerView.S(childAt);
            if (S < i11 || i11 == -1) {
                view = childAt;
                i11 = S;
            }
            i10++;
        }
        int max = i11 == 0 ? (int) Math.max(0.0f, view.getY()) : i11 > 0 ? 0 : h3Var.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f7 = max;
        if (frameLayout.getTranslationY() != f7) {
            frameLayout.setTranslationY(f7);
            c4 c4Var = (c4) this;
            int intValue = ((Integer) c4Var.getTag()).intValue();
            g4 g4Var = c4Var.a0.e;
            a4 a4Var = g4Var.h;
            if (intValue == g4Var.E.getCurrentItem()) {
                a4Var.setAlpha(Utilities.clamp(f7 / g4Var.d, 1.0f, 0.0f));
                a4Var.setTranslationY((-(g4Var.d - f7)) / 2.0f);
            }
        }
        this.U.setBounds(-AndroidUtilities.dp(6.0f), max, AndroidUtilities.dp(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.U.draw(canvas);
        if (this.V) {
            this.V = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != h3Var.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = h3Var.getPaddingTop() / 2.0f;
                a5.a aVar = this.d;
                if (translationY > paddingTop) {
                    aVar.u((int) (-(h3Var.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    aVar.u((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.r) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, AndroidUtilities.dp(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    public final void e(y3 y3Var) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        v3 v3Var = this.w;
        int size = v3Var.c.size();
        m3 m3Var = this.O;
        if (TextUtils.isEmpty(m3Var.c) && !m3Var.b) {
            i();
        }
        v3Var.E();
        this.J.b(size - 1);
        c();
        if (this.G != null) {
            ArrayList arrayList = y3Var.i;
            if (y3Var != this.E || arrayList == null || this.H >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = this.H; i10 < arrayList.size(); i10++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i10);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.H = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.G.F(arrayList2);
        }
    }

    public final void g(long j3, f4 f4Var) {
        this.W = j3;
        this.y = f4Var;
        i();
        h(false);
        if (f4Var == null || f4Var.a == null) {
            return;
        }
        NotificationsController.getInstance(this.v).processSeenStoryReactions(j3, f4Var.a.id);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    public final void h(boolean z10) {
        int i10;
        m3 m3Var = this.O;
        boolean z11 = m3Var.b;
        q3 q3Var = this.P;
        if (z11 != q3Var.s || !z10) {
            ValueAnimator valueAnimator = q3Var.w;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                q3Var.w.cancel();
            }
            q3Var.s = z11 ? 1 : 0;
            if (z10) {
                q3Var.e.set(q3Var.n);
                q3Var.f = q3Var.c.getAlpha();
                q3Var.h = q3Var.d.getAlpha();
                q3Var.r = 0.0f;
                q3Var.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                q3Var.w = ofFloat;
                ofFloat.addUpdateListener(new qg.o(q3Var, 24));
                q3Var.w.addListener(new yg.b(q3Var, 11));
                q3Var.w.setDuration(250L);
                q3Var.w.setInterpolator(wr.f);
                q3Var.w.start();
            } else {
                q3Var.r = 1.0f;
                q3Var.invalidate();
            }
        }
        boolean z12 = m3Var.a;
        am0 am0Var = q3Var.v;
        if (z12) {
            y3 y3Var = this.E;
            i10 = (y3Var == null || !y3Var.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i10 = R.drawable.menu_views_recent3;
        }
        am0Var.a(i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        this.R = false;
        this.T = false;
        this.S = false;
        TL_stories.StoryItem storyItem = this.y.a;
        l3 l3Var = this.L;
        q3 q3Var = this.P;
        TextView textView = this.h;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews != null) {
                int i10 = storyViews.views_count;
                this.R = i10 >= 15;
                this.S = storyViews.reactions_count >= (BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 10);
                this.T = (storyItem.dialogId < 0 || i10 < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            }
            int i11 = this.v;
            SparseArray sparseArray = (SparseArray) MessagesController.getInstance(i11).storiesController.x.f(storyItem.dialogId);
            y3 y3Var = sparseArray != null ? (y3) sparseArray.get(storyItem.id) : null;
            this.F = y3Var;
            TL_stories.StoryViews storyViews2 = storyItem.views;
            int i12 = storyViews2 == null ? 0 : storyViews2.views_count;
            m3 m3Var = this.O;
            if (y3Var == null || !(y3Var.f || y3Var.a == i12)) {
                if (y3Var != null) {
                    y3Var.d();
                }
                y3 y3Var2 = new y3(i11, this.W, storyItem);
                this.F = y3Var2;
                y3Var2.e(m3Var, this.T, this.S);
                this.F.c();
                if (sparseArray != null) {
                    sparseArray.put(storyItem.id, this.F);
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    sparseArray2.put(storyItem.id, this.F);
                    MessagesController.getInstance(i11).storiesController.x.k(sparseArray2, storyItem.dialogId);
                }
            } else {
                y3Var.e(m3Var, this.T, this.S);
            }
            y3 y3Var3 = this.E;
            if (y3Var3 != null) {
                y3Var3.r.remove(this);
            }
            y3 y3Var4 = this.F;
            this.E = y3Var4;
            if (y3Var4 != null && this.I) {
                ArrayList arrayList = y3Var4.r;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            y3 y3Var5 = this.E;
            if (y3Var5 == null || !y3Var5.j || UserConfig.getInstance(i11).isPremium()) {
                y3 y3Var6 = this.E;
                if (y3Var6.e || y3Var6.m || !y3Var6.g.isEmpty() || !this.E.i.isEmpty() || !TextUtils.isEmpty(this.E.s.c)) {
                    TL_stories.StoryViews storyViews3 = storyItem.views;
                    if (storyViews3 == null || storyViews3.views_count == 0) {
                        this.R = false;
                        this.S = false;
                        this.T = false;
                        textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
                        l3Var.setVisibility(8);
                        q3Var.setVisibility(8);
                        this.e = 46;
                    } else {
                        q3Var.setVisibility(0);
                        y3 y3Var7 = this.E;
                        if (y3Var7.k) {
                            textView.setText(LocaleController.getString(y3Var7.f ? R.string.Reactions : R.string.Viewers));
                            this.R = false;
                            this.S = false;
                            this.T = false;
                        } else {
                            if (y3Var7.b() < 20 && this.E.b() < storyItem.views.views_count) {
                                y3 y3Var8 = this.E;
                                if (!y3Var8.e && !y3Var8.m) {
                                    this.R = false;
                                    this.S = false;
                                    this.T = false;
                                    textView.setText(LocaleController.getString(!this.E.f ? R.string.Reactions : R.string.Viewers));
                                }
                            }
                            this.R = !this.E.f && storyItem.views.views_count >= 15;
                            TL_stories.StoryViews storyViews4 = storyItem.views;
                            this.S = storyViews4.reactions_count >= (BuildVars.DEBUG_VERSION ? 5 : 10);
                            this.T = (storyItem.dialogId < 0 || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                            textView.setText(LocaleController.getString(!this.E.f ? R.string.Reactions : R.string.Viewers));
                        }
                        l3Var.setVisibility(this.R ? 0 : 8);
                        this.e = this.R ? 96 : 46;
                    }
                }
            }
            this.R = false;
            this.S = false;
            this.T = false;
            textView.setText(LocaleController.getString(this.E.f ? R.string.Reactions : R.string.Viewers));
            l3Var.setVisibility(8);
            q3Var.setVisibility(8);
            this.e = 46;
        } else {
            this.e = 46;
            textView.setText(LocaleController.getString(R.string.UploadingStory));
            l3Var.setVisibility(8);
            q3Var.setVisibility(8);
        }
        q3Var.a.setVisibility(this.S ? 0 : 8);
        q3Var.c.setVisibility(this.T ? 0 : 8);
        q3Var.d.setVisibility(this.T ? 0 : 8);
        if (this.T) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(this.e - 8);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = AndroidUtilities.dp(this.e - 17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        y3 y3Var = this.E;
        if (y3Var != null) {
            ArrayList arrayList = y3Var.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.E.p.clear();
        }
        this.w.E();
        int i10 = this.v;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesBlocklistUpdate);
        pc.a(this, new rd(this, 10));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        y3 y3Var = this.E;
        if (y3Var != null) {
            y3Var.r.remove(this);
        }
        int i10 = this.v;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesBlocklistUpdate);
        pc.h(this);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getY() < this.c.getTranslationY()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListBottomPadding(float f7) {
        h3 h3Var = this.r;
        if (f7 != h3Var.getPaddingBottom()) {
            h3Var.setPadding(0, (int) f7, 0, 0);
            h3Var.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.U = drawable;
    }
}
