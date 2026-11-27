// default package

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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class z3a extends FrameLayout implements snb, fn7 {
    public static final /* synthetic */ int c0 = 0;
    public f4a E;
    public y3a F;
    public y3a G;
    public x5b H;
    public int I;
    public boolean J;
    public final i69 K;
    public final lcb L;
    public final m3a M;
    public final n3a N;
    public final sh9 O;
    public final n3a P;
    public final r3a Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public boolean W;
    public final View a;
    public long a0;
    public final View b;
    public int b0;
    public final FrameLayout c;
    public final lp d;
    public byte e;
    public q3a f;
    public final TextView h;
    public int n;
    public final i3a r;
    public final x53 s;
    public final int w;
    public final v3a x;
    public final td4 y;

    public z3a(lcb lcbVar, Context context, n3a n3aVar, sh9 sh9Var) {
        super(context);
        this.e = (byte) 96;
        this.P = new n3a();
        this.N = n3aVar;
        this.O = sh9Var;
        x53 x53Var = lcbVar.E;
        this.s = x53Var;
        this.L = lcbVar;
        this.w = lcbVar.h;
        TextView textView = new TextView(context);
        this.h = textView;
        yob.X(textView, aob.j5, x53Var);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        textView.setPadding(hl.L(21.0f), hl.L(6.0f), hl.L(21.0f), hl.L(8.0f));
        r3a r3aVar = new r3a(this, getContext());
        this.Q = r3aVar;
        i3a i3aVar = new i3a(this, context, x53Var);
        this.r = i3aVar;
        i3aVar.setClipToPadding(false);
        this.K = new i69(i3aVar, true);
        td4 td4Var = new td4(0, i3aVar);
        this.y = td4Var;
        i3aVar.setLayoutManager(td4Var);
        i3aVar.setNestedScrollingEnabled(true);
        v3a v3aVar = new v3a(this);
        this.x = v3aVar;
        i3aVar.setAdapter(v3aVar);
        addView(i3aVar);
        this.d = new lp(i3aVar);
        i3aVar.setOnScrollListener(new e98(this, (byte) 19));
        i3aVar.setOnItemClickListener(new l0(this, lcbVar, (byte) 21));
        i3aVar.setOnItemLongClickListener(new l3a(this, lcbVar));
        v3aVar.E();
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.c = frameLayout;
        View view = new View(getContext());
        this.a = view;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        int i = aob.h5;
        int v0 = aob.v0(i, x53Var);
        this.b0 = v0;
        view.setBackground(new GradientDrawable(orientation, new int[]{v0, 0}));
        frameLayout.addView(view, tre.d(-1, 8.0f, 0, 0.0f, this.e - 8, 0.0f, 0.0f));
        View view2 = new View(getContext());
        this.b = view2;
        yob.h(i, x53Var, view2);
        frameLayout.addView(view2, tre.d(-1, 10.0f, 0, 0.0f, this.e - 17, 0.0f, 0.0f));
        frameLayout.addView(r3aVar);
        frameLayout.addView(textView);
        m3a m3aVar = new m3a(this, getContext(), x53Var);
        this.M = m3aVar;
        m3aVar.setHint(ob6.M0(2131745564, null));
        frameLayout.addView(m3aVar, tre.d(-1, -1.0f, 51, 0.0f, 36.0f, 0.0f, 0.0f));
        addView(frameLayout);
    }

    public static void d(int i, long j, TL_stories.StoryItem storyItem) {
        if (storyItem != null) {
            SparseArray sparseArray = (SparseArray) uc7.s1(i).e0.x.f(storyItem.dialogId);
            y3a y3aVar = sparseArray == null ? null : (y3a) sparseArray.get(storyItem.id);
            TL_stories.StoryViews storyViews = storyItem.views;
            int i2 = storyViews == null ? 0 : storyViews.views_count;
            if (y3aVar != null) {
                if (y3aVar.a == i2) {
                    return;
                } else {
                    y3aVar.d();
                }
            }
            y3a y3aVar2 = new y3a(i, j, storyItem);
            y3aVar2.c();
            if (sparseArray == null) {
                zh6 zh6Var = uc7.s1(i).e0.x;
                long j2 = storyItem.dialogId;
                sparseArray = new SparseArray();
                zh6Var.k(j2, sparseArray);
            }
            sparseArray.put(storyItem.id, y3aVar2);
        }
    }

    public final void a() {
        if (this.F == null || this.y.M0() <= this.x.c.size() - 10) {
            return;
        }
        this.F.c();
    }

    public final boolean b(TL_stories.StoryView storyView) {
        c8b c8bVar;
        u9b u9bVar;
        if (storyView == null) {
            return true;
        }
        int i = this.w;
        if (uc7.s1(i).O1().M(storyView) || uc7.s1(i).x0.indexOfKey(storyView.user_id) >= 0) {
            return false;
        }
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(storyView.user_id));
        f4a f4aVar = this.E;
        if (f4aVar == null) {
            return true;
        }
        TL_stories.StoryItem storyItem = f4aVar.a;
        if (storyItem != null) {
            if (storyItem.parsedPrivacy == null) {
                storyItem.parsedPrivacy = new u9b(i, storyItem.privacy);
            }
            return this.E.a.parsedPrivacy.b(X1);
        }
        b6b b6bVar = f4aVar.b;
        if (b6bVar == null || (c8bVar = b6bVar.c) == null || (u9bVar = c8bVar.E0) == null) {
            return true;
        }
        return u9bVar.b(X1);
    }

    public final void c(y3a y3aVar) {
        TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost;
        TL_stories.StoryItem storyItem;
        v3a v3aVar = this.x;
        int size = v3aVar.c.size();
        n3a n3aVar = this.P;
        if (TextUtils.isEmpty(n3aVar.c) && !n3aVar.b) {
            h();
        }
        v3aVar.E();
        this.K.b(size - 1);
        a();
        if (this.H != null) {
            ArrayList arrayList = y3aVar.i;
            if (y3aVar != this.F || this.I >= arrayList.size()) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i = this.I; i < arrayList.size(); i++) {
                TL_stories.StoryReaction storyReaction = (TL_stories.StoryReaction) arrayList.get(i);
                if ((storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) && (storyItem = (tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction).story) != null) {
                    storyItem.dialogId = wf3.n(tL_storyReactionPublicRepost.peer_id);
                    arrayList2.add(storyItem);
                }
            }
            this.I = arrayList.size();
            if (arrayList2.isEmpty()) {
                return;
            }
            this.H.F(arrayList2);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int S;
        int i3 = 0;
        if (i == jn7.y5) {
            if (this.E.b != null) {
                int i4 = this.w;
                TL_stories.PeerStories x = uc7.s1(i4).e0.x(yac.h(i4).n);
                if (x != null) {
                    while (i3 < x.stories.size()) {
                        TL_stories.StoryItem storyItem = x.stories.get(i3);
                        String str = storyItem.attachPath;
                        if (str != null && str.equals(this.E.b.e)) {
                            f4a f4aVar = this.E;
                            f4aVar.b = null;
                            f4aVar.a = storyItem;
                            f(this.a0, f4aVar);
                            return;
                        }
                        i3++;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i != jn7.c3) {
            return;
        }
        while (true) {
            i3a i3aVar = this.r;
            if (i3 >= i3aVar.getChildCount()) {
                return;
            }
            View childAt = i3aVar.getChildAt(i3);
            if ((childAt instanceof e39) && (S = RecyclerView.S(childAt)) >= 0) {
                v3a v3aVar = this.x;
                if (S < v3aVar.c.size()) {
                    ((e39) childAt).a(true, b(((s3a) v3aVar.c.get(S)).b) ? 1.0f : 0.5f);
                }
            }
            i3++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i3a i3aVar;
        View view = null;
        int i = -1;
        int i2 = 0;
        while (true) {
            i3aVar = this.r;
            if (i2 >= i3aVar.getChildCount()) {
                break;
            }
            View childAt = i3aVar.getChildAt(i2);
            int T = RecyclerView.T(childAt);
            if (T < i || i == -1) {
                view = childAt;
                i = T;
            }
            i2++;
        }
        int max = i == 0 ? (int) Math.max(0.0f, view.getY()) : i > 0 ? 0 : i3aVar.getPaddingTop();
        FrameLayout frameLayout = this.c;
        float f = max;
        if (frameLayout.getTranslationY() != f) {
            frameLayout.setTranslationY(f);
            c4a c4aVar = (c4a) this;
            int intValue = ((Integer) c4aVar.getTag()).intValue();
            g4a g4aVar = c4aVar.d0.e;
            a4a a4aVar = g4aVar.h;
            if (intValue == g4aVar.F.getCurrentItem()) {
                a4aVar.setAlpha(Utilities.i(f / g4aVar.d, 1.0f, 0.0f));
                a4aVar.setTranslationY((-(g4aVar.d - f)) / 2.0f);
            }
        }
        this.V.setBounds(-hl.L(6.0f), max, hl.L(6.0f) + getMeasuredWidth(), getMeasuredHeight());
        this.V.draw(canvas);
        if (this.W) {
            this.W = false;
            if (frameLayout.getTranslationY() != 0.0f && frameLayout.getTranslationY() != i3aVar.getPaddingTop()) {
                float translationY = frameLayout.getTranslationY();
                float paddingTop = i3aVar.getPaddingTop() / 2.0f;
                lp lpVar = this.d;
                if (translationY > paddingTop) {
                    lpVar.z((int) (-(i3aVar.getPaddingTop() - frameLayout.getTranslationY())));
                } else {
                    lpVar.z((int) frameLayout.getTranslationY());
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.r) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, hl.L(this.e), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j);
        canvas.restore();
        return true;
    }

    public final void e() {
        y3a y3aVar = this.F;
        if (y3aVar != null) {
            y3aVar.r.remove(this);
        }
        y3a y3aVar2 = this.G;
        this.F = y3aVar2;
        if (y3aVar2 == null) {
            return;
        }
        ArrayList arrayList = y3aVar2.r;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.F.e(this.P, this.U, this.T);
        this.x.E();
        this.y.g1(0, (int) (getTopOffset() - this.r.getPaddingTop()));
    }

    public final void f(long j, f4a f4aVar) {
        this.a0 = j;
        this.E = f4aVar;
        h();
        g(false);
        if (f4aVar == null || f4aVar.a == null) {
            return;
        }
        ip7 n = ip7.n(this.w);
        int i = f4aVar.a.id;
        if (j == n.getUserConfig().e()) {
            ip7.l0.c(new bp7(n, i, (byte) 5));
        }
    }

    public final void g(boolean z) {
        int i;
        n3a n3aVar = this.P;
        boolean z2 = n3aVar.b;
        r3a r3aVar = this.Q;
        if (z2 != r3aVar.s || !z) {
            ValueAnimator valueAnimator = r3aVar.x;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                r3aVar.x.cancel();
            }
            r3aVar.s = z2;
            if (z) {
                r3aVar.e.set(r3aVar.n);
                r3aVar.f = r3aVar.c.getAlpha();
                r3aVar.h = r3aVar.d.getAlpha();
                r3aVar.r = 0.0f;
                r3aVar.invalidate();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                r3aVar.x = ofFloat;
                ofFloat.addUpdateListener(new b49(r3aVar, (byte) 22));
                r3aVar.x.addListener(new po9((Object) r3aVar, (byte) 9));
                r3aVar.x.setDuration(250L);
                r3aVar.x.setInterpolator(k43.f);
                r3aVar.x.start();
            } else {
                r3aVar.r = 1.0f;
                r3aVar.invalidate();
            }
        }
        boolean z3 = n3aVar.a;
        ya9 ya9Var = r3aVar.w;
        if (z3) {
            y3a y3aVar = this.F;
            i = (y3aVar == null || !y3aVar.f) ? R.drawable.menu_views_reactions3 : R.drawable.menu_views_reposts3;
        } else {
            i = R.drawable.menu_views_recent3;
        }
        ya9Var.a(i, z);
    }

    public float getTopOffset() {
        return this.c.getTranslationY();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        long j;
        y3a y3aVar;
        y3a y3aVar2;
        y3a y3aVar3;
        y3a y3aVar4;
        TL_stories.StoryViews storyViews;
        y3a y3aVar5;
        ArrayList arrayList;
        this.S = false;
        this.U = false;
        this.T = false;
        TL_stories.StoryItem storyItem = this.E.a;
        m3a m3aVar = this.M;
        TextView textView = this.h;
        r3a r3aVar = this.Q;
        if (storyItem != null) {
            TL_stories.StoryViews storyViews2 = storyItem.views;
            if (storyViews2 != null) {
                int i = storyViews2.views_count;
                j = 0;
                this.S = i >= 15;
                int i2 = storyViews2.reactions_count;
                boolean z = f11.a;
                this.T = i2 >= 10;
                this.U = (storyItem.dialogId < 0 || i < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
            } else {
                j = 0;
            }
            int i3 = this.w;
            SparseArray sparseArray = (SparseArray) uc7.s1(i3).e0.x.f(storyItem.dialogId);
            y3a y3aVar6 = sparseArray != null ? (y3a) sparseArray.get(storyItem.id) : null;
            this.G = y3aVar6;
            TL_stories.StoryViews storyViews3 = storyItem.views;
            int i4 = storyViews3 == null ? 0 : storyViews3.views_count;
            n3a n3aVar = this.P;
            if (y3aVar6 != null) {
                if (y3aVar6.f || y3aVar6.a == i4) {
                    y3aVar6.e(n3aVar, this.U, this.T);
                    y3aVar = this.F;
                    if (y3aVar != null) {
                        y3aVar.r.remove(this);
                    }
                    y3aVar2 = this.G;
                    this.F = y3aVar2;
                    if (y3aVar2 != null && this.J) {
                        arrayList = y3aVar2.r;
                        if (!arrayList.contains(this)) {
                            arrayList.add(this);
                        }
                    }
                    y3aVar3 = this.F;
                    if (y3aVar3 != null || !y3aVar3.j || yac.h(i3).p()) {
                        y3aVar4 = this.F;
                        if (!y3aVar4.e || y3aVar4.m || !y3aVar4.g.isEmpty() || !this.F.i.isEmpty() || !TextUtils.isEmpty(this.F.s.c)) {
                            storyViews = storyItem.views;
                            if (storyViews != null || storyViews.views_count == 0) {
                                this.S = false;
                                this.T = false;
                                this.U = false;
                                textView.setText(ob6.M0(this.F.f ? 2131746114 : 2131743189, null));
                                m3aVar.setVisibility(8);
                                r3aVar.setVisibility(8);
                                this.e = (byte) 46;
                            } else {
                                r3aVar.setVisibility(0);
                                y3a y3aVar7 = this.F;
                                if (y3aVar7.k) {
                                    textView.setText(ob6.M0(y3aVar7.f ? 2131746114 : 2131743189, null));
                                    this.S = false;
                                    this.T = false;
                                    this.U = false;
                                } else {
                                    if (y3aVar7.b() < 20 && this.F.b() < storyItem.views.views_count) {
                                        y3aVar5 = this.F;
                                        if (!y3aVar5.e && !y3aVar5.m) {
                                            this.S = false;
                                            this.T = false;
                                            this.U = false;
                                            textView.setText(ob6.M0(y3aVar5.f ? 2131746114 : 2131743189, null));
                                        }
                                    }
                                    y3aVar5 = this.F;
                                    this.S = !y3aVar5.f && storyItem.views.views_count >= 15;
                                    TL_stories.StoryViews storyViews4 = storyItem.views;
                                    int i5 = storyViews4.reactions_count;
                                    boolean z2 = f11.a;
                                    this.T = i5 >= 5;
                                    this.U = (storyItem.dialogId < j || storyViews4.views_count < 20 || storyItem.contacts || storyItem.close_friends || storyItem.selected_contacts) ? false : true;
                                    textView.setText(ob6.M0(y3aVar5.f ? 2131746114 : 2131743189, null));
                                }
                                m3aVar.setVisibility(this.S ? 0 : 8);
                                this.e = this.S ? (byte) 96 : (byte) 46;
                            }
                        }
                    }
                    this.S = false;
                    this.T = false;
                    this.U = false;
                    textView.setText(ob6.M0(this.F.f ? 2131746114 : 2131743189, null));
                    m3aVar.setVisibility(8);
                    r3aVar.setVisibility(8);
                    this.e = (byte) 46;
                } else {
                    y3aVar6.d();
                }
            }
            y3a y3aVar8 = new y3a(i3, this.a0, storyItem);
            this.G = y3aVar8;
            y3aVar8.e(n3aVar, this.U, this.T);
            this.G.c();
            if (sparseArray != null) {
                sparseArray.put(storyItem.id, this.G);
            } else {
                SparseArray sparseArray2 = new SparseArray();
                sparseArray2.put(storyItem.id, this.G);
                uc7.s1(i3).e0.x.k(storyItem.dialogId, sparseArray2);
            }
            y3aVar = this.F;
            if (y3aVar != null) {
            }
            y3aVar2 = this.G;
            this.F = y3aVar2;
            if (y3aVar2 != null) {
                arrayList = y3aVar2.r;
                if (!arrayList.contains(this)) {
                }
            }
            y3aVar3 = this.F;
            if (y3aVar3 != null) {
            }
            y3aVar4 = this.F;
            if (!y3aVar4.e) {
            }
            storyViews = storyItem.views;
            if (storyViews != null) {
            }
            this.S = false;
            this.T = false;
            this.U = false;
            textView.setText(ob6.M0(this.F.f ? 2131746114 : 2131743189, null));
            m3aVar.setVisibility(8);
            r3aVar.setVisibility(8);
            this.e = (byte) 46;
        } else {
            this.e = (byte) 46;
            textView.setText(ob6.M0(2131743455, null));
            m3aVar.setVisibility(8);
            r3aVar.setVisibility(8);
        }
        r3aVar.a.setVisibility(this.T ? 0 : 8);
        r3aVar.c.setVisibility(this.U ? 0 : 8);
        r3aVar.d.setVisibility(this.U ? 0 : 8);
        if (this.U) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = hl.L(this.e - 8);
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).topMargin = hl.L(this.e - 17);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        y3a y3aVar = this.F;
        if (y3aVar != null) {
            ArrayList arrayList = y3aVar.r;
            if (!arrayList.contains(this)) {
                arrayList.add(this);
            }
            this.F.p.clear();
        }
        this.x.E();
        int i = this.w;
        jn7.f(i).b(this, jn7.y5);
        jn7.f(i).b(this, jn7.c3);
        setTag(R.id.bulletin_delegate_tag, new t10(this, (byte) 18));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
        y3a y3aVar = this.F;
        if (y3aVar != null) {
            y3aVar.r.remove(this);
        }
        int i = this.w;
        jn7.f(i).n(this, jn7.y5);
        jn7.f(i).n(this, jn7.c3);
        setTag(R.id.bulletin_delegate_tag, null);
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

    public void setListBottomPadding(float f) {
        i3a i3aVar = this.r;
        if (f != i3aVar.getPaddingBottom()) {
            i3aVar.setPadding(0, (int) f, 0, 0);
            i3aVar.requestLayout();
        }
    }

    public void setShadowDrawable(Drawable drawable) {
        this.V = drawable;
    }

    @Override // snb
    public final void updateColors() {
        try {
            int v0 = aob.v0(aob.h5, this.s);
            View view = this.a;
            if (view == null || v0 == this.b0) {
                return;
            }
            this.b0 = v0;
            view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{v0, 0}));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
