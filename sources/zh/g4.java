package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ld0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g4 extends FrameLayout {
    public final b4 E;
    public final ArrayList F;
    public final ArrayList G;
    public final m3 H;
    public float I;
    public final d4 a;
    public float b;
    public float c;
    public float d;
    public final e4 e;
    public float f;
    public final a4 h;
    public float n;
    public final u7 r;
    public final Drawable s;
    public float v;
    public boolean w;
    public int x;
    public long y;

    public g4(Context context, u7 u7Var) {
        super(context);
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new m3();
        b bVar = u7Var.y;
        this.r = u7Var;
        a4 a4Var = new a4(getContext(), this, u7Var);
        this.h = a4Var;
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.s = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, bVar), PorterDuff.Mode.MULTIPLY));
        e4 e4Var = new e4(this, context);
        this.e = e4Var;
        b4 b4Var = new b4(this, context);
        this.E = b4Var;
        b4Var.b(new ld0(2, this));
        d4 d4Var = new d4(context, this, u7Var);
        this.a = d4Var;
        b4Var.setAdapter(d4Var);
        e4Var.addView(b4Var, w7.a6.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 0.0f));
        addView(a4Var, w7.a6.c(-1.0f, -1));
        addView(e4Var);
        setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getCurrentTopOffset() {
        float f7 = this.d;
        z3 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.getTopOffset() : f7;
    }

    public final void b(int i10, long j3, ArrayList arrayList) {
        ArrayList arrayList2 = this.F;
        arrayList2.clear();
        this.y = j3;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_stories.StoryItem storyItem = (TL_stories.StoryItem) arrayList.get(i11);
            f4 f4Var = new f4();
            f4Var.a = storyItem;
            arrayList2.add(f4Var);
        }
        ArrayList E = MessagesController.getInstance(this.r.h).storiesController.E(UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId());
        if (E != null) {
            for (int i12 = 0; i12 < E.size(); i12++) {
                h5 h5Var = (h5) E.get(i12);
                f4 f4Var2 = new f4();
                f4Var2.b = h5Var;
                arrayList2.add(f4Var2);
            }
        }
        a4 a4Var = this.h;
        ArrayList arrayList3 = a4Var.G;
        ArrayList arrayList4 = a4Var.E;
        arrayList4.clear();
        arrayList4.addAll(arrayList2);
        a4Var.d();
        if (a4Var.getMeasuredHeight() > 0) {
            a4Var.c(i10, false, false);
        } else {
            a4Var.w = i10;
        }
        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
            ((f3) arrayList3.get(i13)).a(((f3) arrayList3.get(i13)).b);
        }
        b4 b4Var = this.E;
        b4Var.setAdapter(null);
        d4 d4Var = this.a;
        b4Var.setAdapter(d4Var);
        d4Var.g();
        b4Var.setCurrentItem(i10);
    }

    public f3 getCrossfadeToImage() {
        return this.h.getCenteredImageReciever();
    }

    public z3 getCurrentPage() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((Integer) ((z3) arrayList.get(i10)).getTag()).intValue() == this.E.getCurrentItem()) {
                return (z3) arrayList.get(i10);
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
        return ((f4) arrayList.get(closestPosition)).a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        int i13 = this.r.b ? AndroidUtilities.statusBarHeight : 0;
        int size = View.MeasureSpec.getSize(i11);
        a4 a4Var = this.h;
        ((FrameLayout.LayoutParams) a4Var.getLayoutParams()).topMargin = i13;
        this.n = a4Var.getFinalHeight();
        this.b = AndroidUtilities.dp(20.0f) + i13;
        ((FrameLayout.LayoutParams) this.e.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        float dp = (((AndroidUtilities.dp(20.0f) + i13) + this.n) + AndroidUtilities.dp(24.0f)) - AndroidUtilities.statusBarHeight;
        this.d = dp;
        this.c = size - dp;
        while (true) {
            ArrayList arrayList = this.G;
            if (i12 >= arrayList.size()) {
                super.onMeasure(i10, i11);
                return;
            } else {
                ((z3) arrayList.get(i12)).setListBottomPadding(this.d);
                i12++;
            }
        }
    }

    public void setKeyboardHeight(int i10) {
        z3 currentPage;
        boolean z10 = this.x >= AndroidUtilities.dp(20.0f);
        boolean z11 = i10 >= AndroidUtilities.dp(20.0f);
        if (z11 != z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
            ofFloat.addUpdateListener(new qg.o(this, 25));
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            ofFloat.setDuration(250L);
            ofFloat.start();
        }
        this.x = i10;
        if (i10 <= 0 || (currentPage = getCurrentPage()) == null) {
            return;
        }
        currentPage.r.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
        FrameLayout frameLayout = currentPage.c;
        if (frameLayout.getTranslationY() != 0.0f) {
            currentPage.d.v((int) frameLayout.getTranslationY(), 250L, org.telegram.ui.ActionBar.r1.w);
        }
    }

    public void setOffset(float f7) {
        int closestPosition;
        if (this.v == f7) {
            return;
        }
        this.v = f7;
        this.e.setTranslationY(((-this.d) + getMeasuredHeight()) - this.v);
        float f10 = this.f;
        float clamp = Utilities.clamp(f7 / this.c, 1.0f, 0.0f);
        this.f = clamp;
        Utilities.clamp(clamp / 0.5f, 1.0f, 0.0f);
        u7 u7Var = this.r;
        a3 t10 = u7Var.t();
        r7 r7Var = u7Var.s0;
        a4 a4Var = this.h;
        if (f10 == 1.0f && this.f != 1.0f) {
            if (u7Var.O0 != null) {
                MessageObject messageObject = (MessageObject) u7Var.O0.i.get(Utilities.clamp(a4Var.getClosestPosition(), u7Var.O0.i.size() - 1, 0));
                long b10 = a5.b(messageObject);
                ImageReceiver imageReceiver = r7Var.c;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(true, true);
                    r7Var.c = null;
                }
                k7 k7Var = u7Var.n0;
                int i10 = messageObject.storyItem.id;
                u7 u7Var2 = k7Var.N0;
                int i11 = 0;
                while (true) {
                    if (i11 >= k7Var.x0.size()) {
                        break;
                    }
                    if (b10 == a5.b(u7Var2.O0.f(((Integer) ((ArrayList) k7Var.x0.get(i11)).get(0)).intValue()))) {
                        int size = u7Var2.R0 ? (k7Var.x0.size() - 1) - i11 : i11;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= ((ArrayList) k7Var.x0.get(i11)).size()) {
                                i12 = 0;
                                break;
                            } else if (((Integer) ((ArrayList) k7Var.x0.get(i11)).get(i12)).intValue() == i10) {
                                break;
                            } else {
                                i12++;
                            }
                        }
                        if (k7Var.getCurrentPeerView() == null || k7Var.getCurrentItem() != size) {
                            k7Var.x(size, false);
                            a3 currentPeerView = k7Var.getCurrentPeerView();
                            if (currentPeerView != null) {
                                e6 e6Var = (e6) currentPeerView.getParent();
                                e6Var.a(true);
                                if (k7Var.x0 != null) {
                                    a3 a3Var = e6Var.a;
                                    long j3 = e6Var.b;
                                    ArrayList arrayList = e6Var.c;
                                    a3Var.B1 = j3;
                                    a3Var.z1 = arrayList;
                                    a3Var.o0(i12);
                                } else {
                                    e6Var.a.U0(i12, e6Var.b);
                                }
                            }
                        } else {
                            a3 currentPeerView2 = k7Var.getCurrentPeerView();
                            if (currentPeerView2.J1 != i12) {
                                currentPeerView2.J1 = i12;
                                currentPeerView2.f1(false);
                            }
                        }
                    } else {
                        i11++;
                    }
                }
            } else if (t10 != null && t10.J1 != (closestPosition = a4Var.getClosestPosition())) {
                t10.J1 = closestPosition;
                t10.f1(false);
            }
            a4Var.d.abortAnimation();
            ValueAnimator valueAnimator = a4Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                a4Var.M = null;
            }
            a4Var.c(a4Var.K, false, true);
        }
        if (t10 != null) {
            h2 h2Var = t10.c1;
            a4Var.a = h2Var.getTop();
            a4Var.b = h2Var.getMeasuredWidth();
            a4Var.c = h2Var.getMeasuredHeight();
        }
        a4Var.setProgressToOpen(this.f);
        b4 b4Var = this.E;
        if (b4Var.w0 && this.f != 1.0f) {
            b4Var.onTouchEvent(AndroidUtilities.emptyMotionEvent());
        }
        setVisibility(this.f == 0.0f ? 4 : 0);
        if (this.f != 1.0f) {
            b4Var.w0 = false;
        }
    }
}
