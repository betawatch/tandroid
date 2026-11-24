// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class xr8 extends FrameLayout implements gk7 {
    public final uq0 a;
    public final vec b;
    public final u1b c;
    public final wr8 d;
    public int e;
    public boolean f;
    public ValueAnimator h;
    public float n;
    public boolean r;
    public final Rect s;
    public final sr8 w;

    public xr8(Context context, u1b u1bVar, final nca ncaVar) {
        super(context);
        this.s = new Rect();
        this.c = u1bVar;
        Objects.requireNonNull(u1bVar);
        final byte b = 0;
        this.w = new sr8(u1bVar, b);
        final oca ocaVar = (oca) this;
        uq0 uq0Var = new uq0(ocaVar, context, ncaVar, (byte) 2);
        this.a = uq0Var;
        final byte b2 = 1;
        uq0Var.setAllowDisallowInterceptTouch(true);
        wr8 wr8Var = new wr8(ocaVar);
        this.d = wr8Var;
        wr8Var.a = u1bVar.a();
        uq0Var.setAdapter(wr8Var);
        uq0Var.setTranslationY(gl.L(42.0f));
        vec l = uq0Var.l(10, true);
        this.b = l;
        l.h(bkb.wi, bkb.F6, bkb.ui, bkb.xi, bkb.r8);
        l.r = 12;
        l.setPreTabClick(new j8c() { // from class: tr8
            @Override // j8c
            public final Object g(Integer num, Object obj) {
                g2b storiesController;
                byte b3 = b;
                final nca ncaVar2 = ncaVar;
                oca ocaVar2 = ocaVar;
                switch (b3) {
                    case 0:
                        if (!ocaVar2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                ij.P(ncaVar2.a, ncaVar2.b, ncaVar2.c, new wh9(ncaVar2, (byte) 16));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ocaVar2.f) {
                            final int intValue = num.intValue();
                            nfa nfaVar = ncaVar2.d;
                            d dVar = nfaVar.y1;
                            storiesController = nfaVar.getStoriesController();
                            if (storiesController.h(nfaVar.m1)) {
                                cs5 I = cs5.I(dVar, view);
                                I.X(new bq8(ncaVar2));
                                final byte b4 = 0;
                                I.b(R.drawable.menu_add_stories, k96.M0(2131744561, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b5 = b4;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b5) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                nfaVar.g(new u39(I, (byte) 12), dVar, nfaVar.m1, intValue);
                                final byte b5 = 1;
                                I.b(R.drawable.msg_edit, k96.M0(2131744556, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b5;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b52) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b6 = 2;
                                I.b(R.drawable.tabs_reorder, k96.M0(2131744553, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b6;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b52) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b7 = 3;
                                I.b(R.drawable.msg_delete, k96.M0(2131744559, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b7;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b52) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        l.setOnTabLongClick(new j8c() { // from class: tr8
            @Override // j8c
            public final Object g(Integer num, Object obj) {
                g2b storiesController;
                byte b3 = b2;
                final nca ncaVar2 = ncaVar;
                oca ocaVar2 = ocaVar;
                switch (b3) {
                    case 0:
                        if (!ocaVar2.f) {
                            if (num.intValue() != -1) {
                                break;
                            } else {
                                ij.P(ncaVar2.a, ncaVar2.b, ncaVar2.c, new wh9(ncaVar2, (byte) 16));
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        View view = (View) obj;
                        if (num.intValue() != -1 && num.intValue() != 0 && !ocaVar2.f) {
                            final int intValue = num.intValue();
                            nfa nfaVar = ncaVar2.d;
                            d dVar = nfaVar.y1;
                            storiesController = nfaVar.getStoriesController();
                            if (storiesController.h(nfaVar.m1)) {
                                cs5 I = cs5.I(dVar, view);
                                I.X(new bq8(ncaVar2));
                                final byte b4 = 0;
                                I.b(R.drawable.menu_add_stories, k96.M0(2131744561, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b4;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b52) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                nfaVar.g(new u39(I, (byte) 12), dVar, nfaVar.m1, intValue);
                                final byte b5 = 1;
                                I.b(R.drawable.msg_edit, k96.M0(2131744556, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b5;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b52) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b6 = 2;
                                I.b(R.drawable.tabs_reorder, k96.M0(2131744553, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b6;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b52) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, false);
                                final byte b7 = 3;
                                I.b(R.drawable.msg_delete, k96.M0(2131744559, null), new Runnable() { // from class: mca
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b52 = b7;
                                        int i = intValue;
                                        nca ncaVar3 = ncaVar2;
                                        switch (b52) {
                                            case 0:
                                                nfa nfaVar2 = ncaVar3.d;
                                                nfaVar2.U0(i, nfaVar2.m1, nfaVar2.y1);
                                                break;
                                            case 1:
                                                nfa nfaVar3 = ncaVar3.d;
                                                nfaVar3.W0(i, nfaVar3.m1, nfaVar3.y1);
                                                break;
                                            case 2:
                                                ncaVar3.d.o1(i);
                                                break;
                                            default:
                                                nfa nfaVar4 = ncaVar3.d;
                                                nfaVar4.V0(i, nfaVar4.m1, nfaVar4.y1);
                                                break;
                                        }
                                    }
                                }, true);
                                I.a0();
                            }
                            break;
                        } else {
                            break;
                        }
                        break;
                }
                return Boolean.FALSE;
            }
        });
        addView(l, nme.e(-1, 42, 48));
        c(!u1bVar.h.isEmpty(), false, true);
    }

    public final void a() {
        vec vecVar = this.b;
        int currentTabId = vecVar != null ? vecVar.getCurrentTabId() : 0;
        u1b u1bVar = this.c;
        boolean a = u1bVar.a();
        wr8 wr8Var = this.d;
        wr8Var.a = a;
        byte b = 1;
        this.a.m(true);
        c(!u1bVar.h.isEmpty(), true, false);
        int i = this.e;
        if (i > 0) {
            if (wr8Var.i(i) != -1) {
                gl.e3(new ur8(this, this.e, b), 500L);
                this.e = 0;
                return;
            }
            return;
        }
        if (vecVar == null || currentTabId <= 0 || u1bVar.b(currentTabId) != null) {
            return;
        }
        vecVar.e(0, 0);
    }

    public abstract void b();

    public final void c(boolean z, boolean z2, boolean z3) {
        if (this.r != z || z3) {
            this.r = z;
            setEnabled(z);
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            if (!z2) {
                this.n = z ? 1.0f : 0.0f;
                b();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z ? 1.0f : 0.0f);
            this.h = ofFloat;
            ofFloat.setDuration(480L);
            this.h.setInterpolator(s33.h);
            this.h.addUpdateListener(new u28(this, (byte) 18));
            this.h.start();
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k3 && ((Long) objArr[0]).longValue() == this.c.b) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.r && super.dispatchTouchEvent(motionEvent);
    }

    public int getCurrentAlbumId() {
        return this.d.f(this.b.getCurrentPosition());
    }

    public float getVisibilityFactor() {
        return this.n;
    }

    public float getVisualHeight() {
        return getMeasuredHeight() * this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u1b u1bVar = this.c;
        kk7.f(u1bVar.a).b(this, kk7.k3);
        if (this.r == u1bVar.h.isEmpty() || this.d.a != u1bVar.a()) {
            a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.c.a).n(this, kk7.k3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredWidth = getMeasuredWidth();
        int visualHeight = (int) getVisualHeight();
        Rect rect = this.s;
        rect.set(0, 0, measuredWidth, visualHeight);
        setClipBounds(rect);
    }

    public void setInitialTabId(int i) {
        if (this.d.i(i) != -1) {
            gl.e3(new ur8(this, i, (byte) 0), 500L);
        } else {
            this.e = i;
        }
    }

    public void setReorderingAlbums(boolean z) {
        if (this.f != z) {
            this.f = z;
            vec vecVar = this.b;
            vecVar.setReordering(z);
            boolean z2 = this.f;
            oca ocaVar = (oca) this;
            nfa nfaVar = ocaVar.x;
            TextView textView = nfaVar.t0;
            byte b = 0;
            textView.setVisibility(0);
            textView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.4f).scaleY(z2 ? 1.0f : 0.4f).withEndAction(new k08((byte) 14, (Object) ocaVar, z2)).start();
            nfaVar.G1(true);
            nfaVar.Q0();
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.j3(false);
                    gl.d3(new vr8(profileActivity, b));
                }
            }
            if (z) {
                return;
            }
            gl.r(this.w);
            u1b u1bVar = this.c;
            u1bVar.e();
            u1bVar.f(false);
            int currentPosition = vecVar.getCurrentPosition();
            wr8 wr8Var = this.d;
            int f = wr8Var.f(currentPosition);
            this.a.m(true);
            int i = wr8Var.i(f);
            vecVar.f(0.0f, i, i);
        }
    }
}
