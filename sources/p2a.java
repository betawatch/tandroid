// default package

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
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class p2a extends FrameLayout {
    public long E;
    public final k2a F;
    public final ArrayList G;
    public final ArrayList H;
    public final v1a I;
    public float J;
    public final m2a a;
    public float b;
    public float c;
    public float d;
    public final n2a e;
    public float f;
    public final j2a h;
    public float n;
    public final oab r;
    public final Drawable s;
    public float w;
    public boolean x;
    public int y;

    public p2a(oab oabVar, Context context) {
        super(context);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = new v1a();
        r63 r63Var = oabVar.E;
        this.r = oabVar;
        j2a j2aVar = new j2a(this, oabVar, getContext());
        this.h = j2aVar;
        Drawable d = b10.d(context, R.drawable.sheet_shadow_round);
        this.s = d;
        anb.x(this, d, cmb.g5, r63Var, PorterDuff.Mode.MULTIPLY);
        n2a n2aVar = new n2a(this, context);
        this.e = n2aVar;
        k2a k2aVar = new k2a(this, context);
        this.F = k2aVar;
        k2aVar.b(new lw(this, (byte) 4));
        m2a m2aVar = new m2a(this, oabVar, context);
        this.a = m2aVar;
        k2aVar.setAdapter(m2aVar);
        n2aVar.addView(k2aVar, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(j2aVar, qoe.c(-1.0f, -1));
        addView(n2aVar);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f = this.d;
        i2a currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f;
    }

    public final void b(int i, long j, ArrayList arrayList) {
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        this.E = j;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i2);
            o2a o2aVar = new o2a();
            o2aVar.a = storyItem;
            arrayList2.add(o2aVar);
        }
        ArrayList E = oc7.r1(this.r.h).e0.E(z8c.h(z8c.t0).e());
        if (E != null) {
            for (int i3 = 0; i3 < E.size(); i3++) {
                g4b g4bVar = (g4b) E.get(i3);
                o2a o2aVar2 = new o2a();
                o2aVar2.b = g4bVar;
                arrayList2.add(o2aVar2);
            }
        }
        j2a j2aVar = this.h;
        ArrayList arrayList3 = j2aVar.H;
        ArrayList arrayList4 = j2aVar.F;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        j2aVar.d();
        if (j2aVar.getMeasuredHeight() > 0) {
            j2aVar.c(i, false, false);
        } else {
            j2aVar.x = i;
        }
        for (int i4 = 0; i4 < arrayList3.size(); i4++) {
            ((o1a) arrayList3.get(i4)).a(((o1a) arrayList3.get(i4)).b);
        }
        k2a k2aVar = this.F;
        k2aVar.setAdapter(null);
        m2a m2aVar = this.a;
        k2aVar.setAdapter(m2aVar);
        m2aVar.g();
        k2aVar.setCurrentItem(i);
    }

    public o1a getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public i2a getCurrentPage() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((i2a) arrayList.get(i)).getTag()).intValue() == this.F.getCurrentItem()) {
                return (i2a) arrayList.get(i);
            }
            i++;
        }
    }

    public TL_stories.StoryItem getSelectedStory() {
        int closestPosition = this.h.getClosestPosition();
        if (closestPosition < 0) {
            return null;
        }
        ArrayList arrayList = this.G;
        if (closestPosition < arrayList.size()) {
            return ((o2a) arrayList.get(closestPosition)).a;
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        int i4 = this.r.b ? gm.m : 0;
        int size = View.MeasureSpec.getSize(i2);
        j2a j2aVar = this.h;
        ((FrameLayout.LayoutParams) j2aVar.getLayoutParams()).topMargin = i4;
        this.n = j2aVar.getFinalHeight();
        this.b = gm.L(20.0f) + i4;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = gm.m;
        float L = (((gm.L(20.0f) + i4) + this.n) + gm.L(24.0f)) - gm.m;
        this.d = L;
        this.c = size - L;
        while (true) {
            ArrayList arrayList = this.H;
            if (i3 >= arrayList.size()) {
                super.onMeasure(i, i2);
                return;
            } else {
                ((i2a) arrayList.get(i3)).setListBottomPadding(this.d);
                i3++;
            }
        }
    }

    public void setKeyboardHeight(int i) {
        i2a currentPage;
        boolean z = this.y >= gm.L(20.0f);
        boolean z2 = i >= gm.L(20.0f);
        if (z2 != z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z2 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new p29(this, (byte) 23));
            ofFloat.setInterpolator(gb.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.y = i;
        if (i <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(gm.R());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.z((int) frameLayout.getTranslationY(), 250L, gb.w);
        }
    }

    public void setOffset(float f) {
        int closestPosition;
        if (this.w != f) {
            this.w = f;
            this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.w);
            float f2 = this.f;
            this.f = Utilities.i(f / this.c, 1.0f, 0.0f);
            oab oabVar = this.r;
            a58 w = oabVar.w();
            lab labVar = oabVar.t0;
            j2a j2aVar = this.h;
            if (f2 == 1.0f && this.f != 1.0f) {
                if (oabVar.O0 != null) {
                    k47 k47Var = (k47) oabVar.O0.i.get(Utilities.j(j2aVar.getClosestPosition(), oabVar.O0.i.size() - 1, 0));
                    long b = z3b.b(k47Var);
                    ImageReceiver imageReceiver = labVar.c;
                    if (imageReceiver != null) {
                        imageReceiver.v0(true, true);
                        labVar.c = null;
                    }
                    eab eabVar = oabVar.o0;
                    int i = k47Var.l.id;
                    oab oabVar2 = eabVar.O0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= eabVar.y0.size()) {
                            break;
                        }
                        if (b == z3b.b(oabVar2.O0.f(((Integer) ((ArrayList) eabVar.y0.get(i2)).get(0)).intValue()))) {
                            int size = oabVar2.R0 ? (eabVar.y0.size() - 1) - i2 : i2;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= ((ArrayList) eabVar.y0.get(i2)).size()) {
                                    i3 = 0;
                                    break;
                                } else if (((Integer) ((ArrayList) eabVar.y0.get(i2)).get(i3)).intValue() == i) {
                                    break;
                                } else {
                                    i3++;
                                }
                            }
                            if (eabVar.getCurrentPeerView() == null || eabVar.getCurrentItem() != size) {
                                eabVar.x(size, false);
                                a58 currentPeerView = eabVar.getCurrentPeerView();
                                if (currentPeerView != null) {
                                    b5b b5bVar = (b5b) currentPeerView.getParent();
                                    b5bVar.a(true);
                                    ArrayList arrayList = eabVar.y0;
                                    a58 a58Var = b5bVar.a;
                                    long j = b5bVar.b;
                                    if (arrayList != null) {
                                        ArrayList arrayList2 = b5bVar.c;
                                        a58Var.r1 = j;
                                        a58Var.p1 = arrayList2;
                                        a58Var.e0(i3);
                                    } else {
                                        a58Var.P0(i3, j);
                                    }
                                }
                            } else {
                                a58 currentPeerView2 = eabVar.getCurrentPeerView();
                                if (currentPeerView2.z1 != i3) {
                                    currentPeerView2.z1 = i3;
                                    currentPeerView2.c1(false);
                                }
                            }
                        } else {
                            i2++;
                        }
                    }
                } else if (w != null && w.z1 != (closestPosition = j2aVar.getClosestPosition())) {
                    w.z1 = closestPosition;
                    w.c1(false);
                }
                j2aVar.d.abortAnimation();
                ValueAnimator valueAnimator = j2aVar.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    j2aVar.N = null;
                }
                j2aVar.c(j2aVar.L, false, true);
            }
            if (w != null) {
                g48 g48Var = w.S0;
                j2aVar.a = g48Var.getTop();
                j2aVar.b = g48Var.getMeasuredWidth();
                j2aVar.c = g48Var.getMeasuredHeight();
            }
            j2aVar.setProgressToOpen(this.f);
            k2a k2aVar = this.F;
            if (k2aVar.x0 && this.f != 1.0f) {
                k2aVar.onTouchEvent(gm.R());
            }
            setVisibility(this.f == 0.0f ? 4 : 0);
            if (this.f != 1.0f) {
                k2aVar.x0 = false;
            }
        }
    }
}
