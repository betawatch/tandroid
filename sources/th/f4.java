package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f4 extends FrameLayout {
    public long D;
    public final a4 E;
    public final ArrayList F;
    public final ArrayList G;
    public final l3 H;
    public float I;
    public final c4 a;
    public float b;
    public float c;
    public float d;
    public final d4 e;
    public float f;
    public final z3 h;
    public float n;
    public final o7 r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public f4(Context context, o7 o7Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new l3();
        b bVar = o7Var.D;
        this.r = o7Var;
        z3 z3Var = new z3(getContext(), this, o7Var);
        this.h = z3Var;
        Drawable f7 = i0.a.f(context, R.drawable.sheet_shadow_round);
        this.s = f7;
        org.telegram.ui.ActionBar.a7.y(this, f7, org.telegram.ui.ActionBar.t6.h5, bVar, PorterDuff.Mode.MULTIPLY);
        d4 d4Var = new d4(this, context);
        this.e = d4Var;
        a4 a4Var = new a4(this, context);
        this.E = a4Var;
        a4Var.b(new hc0(2, this));
        c4 c4Var = new c4(context, this, o7Var);
        this.a = c4Var;
        a4Var.setAdapter(c4Var);
        d4Var.addView(a4Var, w7.b6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(z3Var, w7.b6.c(-1.0f, -1));
        addView(d4Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        y3 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j10, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.D = j10;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            e4 e4Var = new e4();
            e4Var.a = storyItem;
            arrayList2.add(e4Var);
        }
        ArrayList F = vp.r1(this.r.h).h0.F(d20.i(d20.s0).e());
        if (F != null) {
            for (int i12 = 0; i12 < F.size(); i12++) {
                d5 d5Var = (d5) F.get(i12);
                e4 e4Var2 = new e4();
                e4Var2.b = d5Var;
                arrayList2.add(e4Var2);
            }
        }
        z3 z3Var = this.h;
        ArrayList arrayList3 = z3Var.G;
        ArrayList arrayList4 = z3Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        z3Var.d();
        if (z3Var.getMeasuredHeight() > 0) {
            z3Var.c(i10, false, false);
        } else {
            z3Var.x = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((e3) arrayList3.get(i13)).a(((e3) arrayList3.get(i13)).b);
        }
        a4 a4Var = this.E;
        a4Var.setAdapter(null);
        c4 c4Var = this.a;
        a4Var.setAdapter(c4Var);
        c4Var.g();
        a4Var.setCurrentItem(i10);
    }

    public e3 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public y3 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((y3) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (y3) arrayList.get(i10);
            }
            i10++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.F;
        if (closestPosition >= arrayList.size()) {
            return null;
        }
        return ((e4) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? org.telegram.messenger.i0.m : 0;
        int size = View.MeasureSpec.getSize(i11);
        z3 z3Var = this.h;
        ((FrameLayout.LayoutParams) z3Var.getLayoutParams()).topMargin = i13;
        this.n = z3Var.getFinalHeight();
        this.b = org.telegram.messenger.i0.L(20.0f) + i13;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = org.telegram.messenger.i0.m;
        float L = (((org.telegram.messenger.i0.L(20.0f) + i13) + this.n) + org.telegram.messenger.i0.L(24.0f)) - org.telegram.messenger.i0.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.G;
            if (i12 >= arrayList.size()) {
                super.onMeasure(i10, i11);
                return;
            } else {
                ((y3) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        y3 currentPage;
        boolean z10 = this.y >= org.telegram.messenger.i0.L(20.0f);
        boolean z11 = i10 >= org.telegram.messenger.i0.L(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new qh.e0(this, 20));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.m1.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i10;
        if (i10 <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(org.telegram.messenger.i0.R());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.z((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.m1.w);
        }
    }

    public void setOffset(float f7) {
        int closestPosition;
        if (this.w == f7) {
            return;
        }
        this.w = f7;
        this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.w);
        float f10 = this.f;
        float i10 = Utilities.i(f7 / this.c, 1.0f, 0.0f);
        this.f = i10;
        Utilities.i(i10 / 0.5f, 1.0f, 0.0f);
        o7 o7Var = this.r;
        z2 H = o7Var.H();
        l7 l7Var = o7Var.s0;
        z3 z3Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (o7Var.O0 != null) {
                jj jjVar = (jj) o7Var.O0.i.get(Utilities.j(z3Var.getClosestPosition(), o7Var.O0.i.size() - 1, 0));
                long b10 = x4.b(jjVar);
                ImageReceiver imageReceiver = l7Var.c;
                if (imageReceiver != null) {
                    imageReceiver.O0(true, true);
                    l7Var.c = null;
                }
                e7 e7Var = o7Var.n0;
                int i11 = jjVar.l.id;
                o7 o7Var2 = e7Var.N0;
                int i12 = 0;
                while (true) {
                    if (i12 >= e7Var.x0.size()) {
                        break;
                    }
                    if (b10 == x4.b(o7Var2.O0.f(((Integer) ((ArrayList) e7Var.x0.get(i12)).get(0)).intValue()))) {
                        int size = o7Var2.R0 ? (e7Var.x0.size() - 1) - i12 : i12;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= ((ArrayList) e7Var.x0.get(i12)).size()) {
                                i13 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) e7Var.x0.get(i12)).get(i13)).intValue() == i11) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                        if (e7Var.getCurrentPeerView() == null || e7Var.getCurrentItem() != size) {
                            e7Var.x(size, false);
                            z2 currentPeerView = e7Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                z5 z5Var = (z5) currentPeerView.getParent();
                                z5Var.a(true);
                                if (e7Var.x0 != null) {
                                    z2 z2Var = z5Var.a;
                                    long j10 = z5Var.b;
                                    ArrayList arrayList = z5Var.c;
                                    z2Var.k1 = j10;
                                    z2Var.i1 = arrayList;
                                    z2Var.m0(i13);
                                } else {
                                    z5Var.a.S0(i13, z5Var.b);
                                }
                            }
                        } else {
                            z2 currentPeerView2 = e7Var.getCurrentPeerView();
                            if (currentPeerView2.s1 != i13) {
                                currentPeerView2.s1 = i13;
                                currentPeerView2.d1(false);
                            }
                        }
                    } else {
                        i12++;
                    }
                }
            } else if (H != null && H.s1 != (closestPosition = z3Var.getClosestPosition())) {
                H.s1 = closestPosition;
                H.d1(false);
            }
            z3Var.d.abortAnimation();
            ValueAnimator valueAnimator = z3Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                z3Var.M = null;
            }
            z3Var.c(z3Var.K, false, true);
        }
        if (H != null) {
            g2 g2Var = H.L0;
            z3Var.a = g2Var.getTop();
            z3Var.b = g2Var.getMeasuredWidth();
            z3Var.c = g2Var.getMeasuredHeight();
        }
        z3Var.setProgressToOpen(this.f);
        a4 a4Var = this.E;
        if (a4Var.w0 && this.f != 1.0f) {
            a4Var.onTouchEvent(org.telegram.messenger.i0.R());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            a4Var.w0 = false;
        }
    }
}
