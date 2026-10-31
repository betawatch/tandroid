package th;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.d20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class t5 {
    public int A;
    public boolean D;
    public final boolean E;
    public float G;
    public dc H;
    public org.telegram.ui.ActionBar.p6 J;
    public float K;
    public boolean L;
    public float M;
    public boolean N;
    public float O;
    public float P;
    public o0 Q;
    public View R;
    public int c;
    public TL_stories.StoryItem d;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public boolean r;
    public long s;
    public float t;
    public boolean v;
    public boolean w;
    public long x;
    public int y;
    public int z;
    public boolean a = true;
    public boolean b = true;
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public boolean k = true;
    public float u = 1.0f;
    public float B = 1.0f;
    public boolean C = false;
    public final RectF F = new RectF();
    public boolean I = false;

    public t5(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        this.E = z10;
        this.J = p6Var;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        TLRPC.User user;
        TLRPC.TL_recentStory tL_recentStory3;
        boolean z10;
        TLRPC.TL_recentStory tL_recentStory4;
        this.R = view;
        e5 O1 = vp.r1(d20.s0).O1();
        boolean z11 = false;
        if (motionEvent.getAction() == 0) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                TLRPC.Chat chat = null;
                if (this.x > 0) {
                    user = vp.r1(d20.s0).Z1(Long.valueOf(this.x));
                } else {
                    chat = vp.r1(d20.s0).L0(Long.valueOf(-this.x));
                    user = null;
                }
                if (c(chat, user)) {
                    z10 = true;
                } else if (this.r) {
                    z10 = !O1.h.isEmpty();
                } else {
                    if (this.x <= 0 ? vp.r1(d20.s0).O1().K(this.x) || (chat != null && !chat.stories_unavailable && (tL_recentStory3 = chat.stories_max_id) != null && tL_recentStory3.max_id > 0) : vp.r1(d20.s0).O1().K(this.x) || (user != null && !user.stories_unavailable && (tL_recentStory4 = user.stories_max_id) != null && tL_recentStory4.max_id > 0)) {
                        z11 = true;
                    }
                    z10 = z11;
                }
                if (this.x != d20.i(d20.s0).n && z10) {
                    dc dcVar = this.H;
                    if (dcVar == null) {
                        this.H = new dc(view, 1.5f, 5.0f);
                    } else {
                        dcVar.a = view;
                    }
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    this.H.c(true);
                    this.N = true;
                    this.O = motionEvent.getX();
                    this.P = motionEvent.getY();
                    if (this.I) {
                        o0 o0Var = this.Q;
                        if (o0Var != null) {
                            org.telegram.messenger.i0.r(o0Var);
                        }
                        o0 o0Var2 = new o0(21, this, view);
                        this.Q = o0Var2;
                        org.telegram.messenger.i0.h3(o0Var2, ViewConfiguration.getLongPressTimeout());
                    }
                }
                return this.N;
            }
        }
        if (motionEvent.getAction() == 2 && this.N) {
            if (Math.abs(this.O - motionEvent.getX()) > org.telegram.messenger.i0.e || Math.abs(this.P - motionEvent.getY()) > org.telegram.messenger.i0.e) {
                dc dcVar2 = this.H;
                if (dcVar2 != null) {
                    dcVar2.a = view;
                    dcVar2.c(false);
                }
                o0 o0Var3 = this.Q;
                if (o0Var3 != null) {
                    org.telegram.messenger.i0.r(o0Var3);
                }
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.N = false;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            dc dcVar3 = this.H;
            if (dcVar3 != null) {
                dcVar3.a = view;
                dcVar3.c(false);
            }
            if (this.N && motionEvent.getAction() == 1 && !d(this.x)) {
                vp r12 = vp.r1(d20.s0);
                e5 O12 = r12.O1();
                if (this.r) {
                    f(0L);
                } else if (this.x != d20.i(d20.s0).e()) {
                    if (O12.K(this.x)) {
                        f(this.x);
                    } else {
                        long j10 = this.x;
                        if (j10 > 0) {
                            TLRPC.User Z1 = r12.Z1(Long.valueOf(j10));
                            if (Z1 != null && !Z1.stories_unavailable && (tL_recentStory2 = Z1.stories_max_id) != null && tL_recentStory2.max_id > 0) {
                                new v5().a(this.x, view, this);
                            }
                        } else {
                            TLRPC.Chat L0 = r12.L0(Long.valueOf(-j10));
                            if (L0 != null && !L0.stories_unavailable && (tL_recentStory = L0.stories_max_id) != null && tL_recentStory.max_id > 0) {
                                new v5().a(this.x, view, this);
                            }
                        }
                    }
                }
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).requestDisallowInterceptTouchEvent(false);
            }
            this.N = false;
            o0 o0Var4 = this.Q;
            if (o0Var4 != null) {
                org.telegram.messenger.i0.r(o0Var4);
            }
        }
        return this.N;
    }

    public final float b() {
        dc dcVar = this.H;
        if (dcVar == null) {
            return 1.0f;
        }
        return dcVar.a(0.08f);
    }

    public boolean c(TLRPC.Chat chat, TLRPC.User user) {
        return false;
    }

    public boolean d(long j10) {
        return false;
    }

    public void f(long j10) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null || this.R == null) {
            return;
        }
        Q.getOrCreateStoryViewer().getClass();
        ViewParent parent = this.R.getParent();
        Q.getOrCreateStoryViewer().R(Q.getContext(), j10, parent instanceof RecyclerView ? n5.a((tk0) parent) : null);
    }

    public final void g() {
        this.H = null;
        this.N = false;
    }

    public void e() {
    }
}
