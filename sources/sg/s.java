package sg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.gk;
import org.telegram.ui.un;
import org.telegram.ui.vj;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s extends FrameLayout {
    public final int[] D;
    public final un a;
    public q b;
    public List c;
    public boolean d;
    public jj e;
    public final int f;
    public final int h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public s(un unVar, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = 22;
        this.h = 24;
        this.D = new int[2];
        setVisibility(8);
        this.a = unVar;
        setClipToPadding(false);
        setClipChildren(false);
        unVar.z0.j(new bu0(this, 21));
    }

    public final void a(boolean z10) {
        int i10 = 0;
        if (z10) {
            setVisibility(0);
            post(new p(this, 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new qh.e0(this, 8));
        duration.addListener(new r(this, i10));
        duration.start();
    }

    public final jj b() {
        ej L8;
        ArrayList arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i10 = 0;
        jj jjVar = (jj) this.c.get(0);
        if (jjVar.d1() != 0 && (L8 = this.a.L8(jjVar.d1())) != null && (arrayList = L8.d) != null) {
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                jj jjVar2 = (jj) obj;
                TLRPC.Message message = jjVar2.k;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                    return jjVar2;
                }
            }
        }
        return jjVar;
    }

    public final void c(boolean z10) {
        int height;
        boolean z11;
        boolean z12;
        if (!this.d || this.e == null || this.b == null) {
            return;
        }
        long min = Math.min(16L, System.currentTimeMillis() - this.w);
        this.w = System.currentTimeMillis();
        float f7 = this.n;
        float f10 = this.r;
        if (f7 != f10) {
            float f11 = min / 220.0f;
            if (f10 > f7) {
                this.n = Math.min(f7 + f11, f10);
            } else if (f10 < f7) {
                this.n = Math.max(f7 - f11, f10);
            }
            org.telegram.messenger.i0.g3(new p(this, 0));
        }
        un unVar = this.a;
        vj vjVar = unVar.z0;
        int[] iArr = this.D;
        vjVar.getLocationInWindow(iArr);
        boolean z13 = true;
        float f12 = iArr[1];
        getLocationInWindow(iArr);
        float f13 = (f12 - iArr[1]) - unVar.ga;
        boolean z14 = false;
        for (int i10 = 0; i10 < vjVar.getChildCount(); i10++) {
            View childAt = vjVar.getChildAt(i10);
            if (childAt instanceof q1) {
                q1 q1Var = (q1) childAt;
                jj messageObject = q1Var.getMessageObject();
                if (messageObject.f1() == this.e.f1()) {
                    boolean P3 = messageObject.P3();
                    q qVar = this.b;
                    if (qVar != null) {
                        qVar.setMirrorX(P3);
                        q qVar2 = this.b;
                        int L = org.telegram.messenger.i0.L(4.0f);
                        boolean z15 = cd.X;
                        int i11 = this.h;
                        int i12 = L + ((z15 || P3) ? 0 : i11);
                        float f14 = this.f;
                        int L2 = org.telegram.messenger.i0.L(f14);
                        int L3 = org.telegram.messenger.i0.L(4.0f);
                        if (!cd.X && !P3) {
                            i11 = 0;
                        }
                        qVar2.setPadding(i12, L2, L3 + i11, org.telegram.messenger.i0.L(f14));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : vjVar.getHeight();
                    if (q1Var.getCurrentMessagesGroup() != null) {
                        dj djVar = q1Var.getCurrentMessagesGroup().m;
                        height = djVar.d - djVar.b;
                    } else {
                        height = q1Var.getHeight();
                    }
                    float y3 = (q1Var.getY() + f13) - org.telegram.messenger.i0.L(74.0f);
                    float L4 = org.telegram.messenger.i0.L(14.0f);
                    float L5 = height2 - org.telegram.messenger.i0.L(218.0f);
                    gk gkVar = unVar.l2;
                    if (gkVar != null && gkVar.getVisibility() == 0) {
                        L4 += gkVar.getHeight();
                    }
                    float f15 = height;
                    if (y3 <= L4 - (f15 / 2.0f) || y3 >= L5) {
                        if (y3 < (L4 - f15) - org.telegram.messenger.i0.L(92.0f) || y3 > L5) {
                            z11 = false;
                        } else {
                            this.s = org.telegram.messenger.i0.L(56.0f) + height;
                            this.r = 1.0f;
                            z11 = true;
                        }
                        z12 = z11;
                    } else {
                        this.r = 0.0f;
                        z11 = false;
                        z12 = true;
                    }
                    if (!z10) {
                        this.n = this.r;
                    }
                    float interpolation = (gr.f.getInterpolation(this.n) * this.s) + y3;
                    q qVar3 = this.b;
                    if (qVar3 == null) {
                        return;
                    }
                    if (z11 != qVar3.N) {
                        qVar3.setFlippedVertically(z11);
                        org.telegram.messenger.i0.g3(new p(this, 0));
                    }
                    if (z12 != this.b.isEnabled()) {
                        this.b.setEnabled(z12);
                        this.b.invalidate();
                        if (z12) {
                            this.b.setVisibility(0);
                            if (!this.y) {
                                this.y = true;
                                this.b.p(this.e, unVar.p8, true);
                            }
                        }
                    }
                    this.b.setTranslationY(w7.u.a(interpolation, L4, L5));
                    this.b.setTranslationX(q1Var.P1(true));
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                    int d = i0.a.d(32.0f, q1Var.getBackgroundDrawableLeft(), 0);
                    int d10 = i0.a.d(32.0f, q1Var.getWidth() - q1Var.getBackgroundDrawableRight(), (int) q1Var.P1(true));
                    int L6 = org.telegram.messenger.i0.L(40.0f) * 8;
                    if ((getWidth() - d10) - d < L6) {
                        if (P3) {
                            d = Math.min(d, getWidth() - L6);
                            d10 = 0;
                        } else {
                            d10 = Math.min(d10, getWidth() - L6);
                            d = 0;
                        }
                    }
                    int i13 = P3 ? 5 : 3;
                    if (i13 != layoutParams.gravity) {
                        layoutParams.gravity = i13;
                        z14 = true;
                    }
                    if (d != layoutParams.leftMargin) {
                        layoutParams.leftMargin = d;
                        z14 = true;
                    }
                    if (d10 != layoutParams.rightMargin) {
                        layoutParams.rightMargin = d10;
                    } else {
                        z13 = z14;
                    }
                    if (z13) {
                        this.b.requestLayout();
                        return;
                    }
                    return;
                }
            }
        }
        q qVar4 = this.b;
        if (qVar4 == null || !qVar4.isEnabled()) {
            return;
        }
        this.b.setEnabled(false);
    }

    public final boolean d() {
        return this.d && !this.x;
    }

    public void setHiddenByScroll(boolean z10) {
        this.x = z10;
        if (z10) {
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelectedMessages(List<jj> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        un unVar = this.a;
        int i10 = unVar.f4;
        boolean z10 = true;
        if (i10 != 1 && i10 != 5 && i10 != 6 && !unVar.M9() && !unVar.z() && (((chatFull = unVar.p8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j10 = 0;
            boolean z11 = false;
            for (jj jjVar : list) {
                if ((jjVar != null && (message = jjVar.k) != null && message.rich_message != null) || (jjVar != null && !jjVar.m5() && ((jj.S3(jjVar.k) && jj.o1(jjVar.k).webpage == null) || (jjVar.F0() != null && (jj.K4(jjVar.F0()) || jj.s3(jjVar.F0(), false)))))) {
                    if (!z11) {
                        j10 = jjVar.d1();
                        z11 = true;
                    } else if (j10 == jjVar.d1() && j10 != 0) {
                    }
                }
            }
            if (z10 == this.d) {
                this.d = z10;
                this.x = false;
                a(z10);
                return;
            } else {
                if (z10) {
                    this.e = b();
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10 == this.d) {
        }
    }
}
