// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qe2 extends FrameLayout {
    public final int[] E;
    public final yv1 a;
    public pe2 b;
    public List c;
    public boolean d;
    public k47 e;
    public final byte f;
    public final byte h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public qe2(yv1 yv1Var, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = (byte) 22;
        this.h = (byte) 24;
        this.E = new int[2];
        setVisibility(8);
        this.a = yv1Var;
        setClipToPadding(false);
        setClipChildren(false);
        yv1Var.A0.j(new y(this, (byte) 26));
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
            post(new oe2(this, (byte) 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new et1(this, (byte) 10));
        duration.addListener(new b91((Object) this, (byte) 25));
        duration.start();
    }

    public final k47 b() {
        f47 T6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i = 0;
        k47 k47Var = (k47) this.c.get(0);
        if (k47Var.c1() != 0 && (T6 = this.a.T6(k47Var.c1())) != null) {
            ArrayList arrayList2 = T6.d;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                k47 k47Var2 = (k47) obj;
                TLRPC.Message message = k47Var2.k;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
                    return k47Var2;
                }
            }
        }
        return k47Var;
    }

    public final void c(boolean z) {
        int height;
        boolean z2;
        boolean z3;
        if (!this.d || this.e == null || this.b == null) {
            return;
        }
        long min = Math.min(16L, System.currentTimeMillis() - this.w);
        this.w = System.currentTimeMillis();
        float f = this.n;
        float f2 = this.r;
        byte b = 0;
        if (f != f2) {
            float f3 = min / 220.0f;
            if (f2 > f) {
                this.n = Math.min(f + f3, f2);
            } else if (f2 < f) {
                this.n = Math.max(f - f3, f2);
            }
            gm.c3(new oe2(this, b));
        }
        yv1 yv1Var = this.a;
        vr1 vr1Var = yv1Var.A0;
        int[] iArr = this.E;
        vr1Var.getLocationInWindow(iArr);
        byte b2 = 1;
        float f4 = iArr[1];
        getLocationInWindow(iArr);
        float f5 = (f4 - iArr[1]) - yv1Var.ka;
        for (int i = 0; i < vr1Var.getChildCount(); i++) {
            View childAt = vr1Var.getChildAt(i);
            if (childAt instanceof rc2) {
                rc2 rc2Var = (rc2) childAt;
                k47 messageObject = rc2Var.getMessageObject();
                if (messageObject.e1() == this.e.e1()) {
                    boolean O3 = messageObject.O3();
                    pe2 pe2Var = this.b;
                    if (pe2Var != null) {
                        pe2Var.setMirrorX(O3);
                        pe2 pe2Var2 = this.b;
                        int L = gm.L(4.0f);
                        boolean z4 = jb6.a0;
                        byte b3 = this.h;
                        int i2 = L + ((z4 || O3) ? (byte) 0 : b3);
                        float f6 = this.f;
                        int L2 = gm.L(f6);
                        int L3 = gm.L(4.0f);
                        if (!jb6.a0 && !O3) {
                            b3 = 0;
                        }
                        pe2Var2.setPadding(i2, L2, L3 + b3, gm.L(f6));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : vr1Var.getHeight();
                    if (rc2Var.getCurrentMessagesGroup() != null) {
                        e47 e47Var = rc2Var.getCurrentMessagesGroup().m;
                        height = e47Var.d - e47Var.b;
                    } else {
                        height = rc2Var.getHeight();
                    }
                    float y = (rc2Var.getY() + f5) - gm.L(74.0f);
                    float L4 = gm.L(14.0f);
                    float L5 = height2 - gm.L(218.0f);
                    gs1 gs1Var = yv1Var.m2;
                    if (gs1Var != null && gs1Var.getVisibility() == 0) {
                        L4 += gs1Var.getHeight();
                    }
                    float f7 = height;
                    if (y <= L4 - (f7 / 2.0f) || y >= L5) {
                        if (y < (L4 - f7) - gm.L(92.0f) || y > L5) {
                            z2 = false;
                        } else {
                            this.s = gm.L(56.0f) + height;
                            this.r = 1.0f;
                            z2 = true;
                        }
                        z3 = z2;
                    } else {
                        this.r = 0.0f;
                        z3 = true;
                        z2 = false;
                    }
                    if (!z) {
                        this.n = this.r;
                    }
                    float interpolation = (d53.f.getInterpolation(this.n) * this.s) + y;
                    pe2 pe2Var3 = this.b;
                    if (pe2Var3 != null) {
                        if (z2 != pe2Var3.O) {
                            pe2Var3.setFlippedVertically(z2);
                            gm.c3(new oe2(this, b));
                        }
                        if (z3 != this.b.isEnabled()) {
                            this.b.setEnabled(z3);
                            this.b.invalidate();
                            if (z3) {
                                this.b.setVisibility(0);
                                if (!this.y) {
                                    this.y = true;
                                    this.b.m(this.e, yv1Var.r8, true);
                                }
                            }
                        }
                        this.b.setTranslationY(pqe.a(interpolation, L4, L5));
                        this.b.setTranslationX(rc2Var.U1(true));
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                        int c = b10.c(32.0f, rc2Var.getBackgroundDrawableLeft(), 0);
                        int c2 = b10.c(32.0f, rc2Var.getWidth() - rc2Var.getBackgroundDrawableRight(), (int) rc2Var.U1(true));
                        int L6 = gm.L(40.0f) << 3;
                        if ((getWidth() - c2) - c < L6) {
                            if (O3) {
                                c = Math.min(c, getWidth() - L6);
                                c2 = 0;
                            } else {
                                c2 = Math.min(c2, getWidth() - L6);
                                c = 0;
                            }
                        }
                        int i3 = O3 ? 5 : 3;
                        if (i3 != layoutParams.gravity) {
                            layoutParams.gravity = i3;
                            b = 1;
                        }
                        if (c != layoutParams.leftMargin) {
                            layoutParams.leftMargin = c;
                            b = 1;
                        }
                        if (c2 != layoutParams.rightMargin) {
                            layoutParams.rightMargin = c2;
                        } else {
                            b2 = b;
                        }
                        if (b2 != 0) {
                            this.b.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        pe2 pe2Var4 = this.b;
        if (pe2Var4 == null || !pe2Var4.isEnabled()) {
            return;
        }
        this.b.setEnabled(false);
    }

    public final boolean d() {
        return this.d && !this.x;
    }

    public void setHiddenByScroll(boolean z) {
        this.x = z;
        if (z) {
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSelectedMessages(List<k47> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        yv1 yv1Var = this.a;
        int i = yv1Var.g4;
        boolean z = true;
        if (i != 1 && i != 5 && i != 6 && !yv1Var.c8() && !yv1Var.x() && (((chatFull = yv1Var.r8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j = 0;
            boolean z2 = false;
            for (k47 k47Var : list) {
                if ((k47Var != null && (message = k47Var.k) != null && message.rich_message != null) || (k47Var != null && !k47Var.l5() && ((k47.R3(k47Var.k) && k47.n1(k47Var.k).webpage == null) || (k47Var.F0() != null && (k47.J4(k47Var.F0()) || k47.s3(k47Var.F0(), false)))))) {
                    if (!z2) {
                        j = k47Var.c1();
                        z2 = true;
                    } else if (j == k47Var.c1() && j != 0) {
                    }
                }
            }
            if (z == this.d) {
                this.d = z;
                this.x = false;
                a(z);
                return;
            } else {
                if (z) {
                    this.e = b();
                    return;
                }
                return;
            }
        }
        z = false;
        if (z == this.d) {
        }
    }
}
