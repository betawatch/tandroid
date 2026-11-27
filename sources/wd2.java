// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wd2 extends FrameLayout {
    public final int[] E;
    public final zu1 a;
    public ud2 b;
    public List c;
    public boolean d;
    public r47 e;
    public final byte f;
    public final byte h;
    public float n;
    public float r;
    public float s;
    public long w;
    public boolean x;
    public boolean y;

    public wd2(zu1 zu1Var, Context context) {
        super(context);
        this.c = Collections.EMPTY_LIST;
        this.f = (byte) 22;
        this.h = (byte) 24;
        this.E = new int[2];
        setVisibility(8);
        this.a = zu1Var;
        setClipToPadding(false);
        setClipChildren(false);
        zu1Var.A0.j(new y(this, (byte) 25));
    }

    public final void a(boolean z) {
        if (z) {
            setVisibility(0);
            post(new td2(this, (byte) 1));
            return;
        }
        this.y = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new az1(this, (byte) 9));
        duration.addListener(new jb1((Object) this, (byte) 23));
        duration.start();
    }

    public final r47 b() {
        m47 T6;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList;
        if (!this.d || this.c.isEmpty()) {
            return null;
        }
        int i = 0;
        r47 r47Var = (r47) this.c.get(0);
        if (r47Var.c1() != 0 && (T6 = this.a.T6(r47Var.c1())) != null) {
            ArrayList arrayList2 = T6.d;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                r47 r47Var2 = (r47) obj;
                TLRPC.Message message = r47Var2.k;
                if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList = tL_messageReactions.results) != null && !arrayList.isEmpty()) {
                    return r47Var2;
                }
            }
        }
        return r47Var;
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
            hl.c3(new td2(this, b));
        }
        zu1 zu1Var = this.a;
        wq1 wq1Var = zu1Var.A0;
        int[] iArr = this.E;
        wq1Var.getLocationInWindow(iArr);
        byte b2 = 1;
        float f4 = iArr[1];
        getLocationInWindow(iArr);
        float f5 = (f4 - iArr[1]) - zu1Var.ka;
        for (int i = 0; i < wq1Var.getChildCount(); i++) {
            View childAt = wq1Var.getChildAt(i);
            if (childAt instanceof wb2) {
                wb2 wb2Var = (wb2) childAt;
                r47 messageObject = wb2Var.getMessageObject();
                if (messageObject.e1() == this.e.e1()) {
                    boolean O3 = messageObject.O3();
                    ud2 ud2Var = this.b;
                    if (ud2Var != null) {
                        ud2Var.setMirrorX(O3);
                        ud2 ud2Var2 = this.b;
                        int L = hl.L(4.0f);
                        boolean z4 = ob6.a0;
                        byte b3 = this.h;
                        int i2 = L + ((z4 || O3) ? (byte) 0 : b3);
                        float f6 = this.f;
                        int L2 = hl.L(f6);
                        int L3 = hl.L(4.0f);
                        if (!ob6.a0 && !O3) {
                            b3 = 0;
                        }
                        ud2Var2.setPadding(i2, L2, L3 + b3, hl.L(f6));
                    }
                    int height2 = getHeight() != 0 ? getHeight() : wq1Var.getHeight();
                    if (wb2Var.getCurrentMessagesGroup() != null) {
                        l47 l47Var = wb2Var.getCurrentMessagesGroup().m;
                        height = l47Var.d - l47Var.b;
                    } else {
                        height = wb2Var.getHeight();
                    }
                    float y = (wb2Var.getY() + f5) - hl.L(74.0f);
                    float L4 = hl.L(14.0f);
                    float L5 = height2 - hl.L(218.0f);
                    hr1 hr1Var = zu1Var.m2;
                    if (hr1Var != null && hr1Var.getVisibility() == 0) {
                        L4 += hr1Var.getHeight();
                    }
                    float f7 = height;
                    if (y <= L4 - (f7 / 2.0f) || y >= L5) {
                        if (y < (L4 - f7) - hl.L(92.0f) || y > L5) {
                            z2 = false;
                        } else {
                            this.s = hl.L(56.0f) + height;
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
                    float interpolation = (k43.f.getInterpolation(this.n) * this.s) + y;
                    ud2 ud2Var3 = this.b;
                    if (ud2Var3 != null) {
                        if (z2 != ud2Var3.O) {
                            ud2Var3.setFlippedVertically(z2);
                            hl.c3(new td2(this, b));
                        }
                        if (z3 != this.b.isEnabled()) {
                            this.b.setEnabled(z3);
                            this.b.invalidate();
                            if (z3) {
                                this.b.setVisibility(0);
                                if (!this.y) {
                                    this.y = true;
                                    this.b.m(this.e, zu1Var.r8, true);
                                }
                            }
                        }
                        this.b.setTranslationY(ete.a(interpolation, L4, L5));
                        this.b.setTranslationX(wb2Var.U1(true));
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.b.getLayoutParams();
                        int d = c00.d(32.0f, wb2Var.getBackgroundDrawableLeft(), 0);
                        int d2 = c00.d(32.0f, wb2Var.getWidth() - wb2Var.getBackgroundDrawableRight(), (int) wb2Var.U1(true));
                        int L6 = hl.L(40.0f) << 3;
                        if ((getWidth() - d2) - d < L6) {
                            if (O3) {
                                d = Math.min(d, getWidth() - L6);
                                d2 = 0;
                            } else {
                                d2 = Math.min(d2, getWidth() - L6);
                                d = 0;
                            }
                        }
                        int i3 = O3 ? 5 : 3;
                        if (i3 != layoutParams.gravity) {
                            layoutParams.gravity = i3;
                            b = 1;
                        }
                        if (d != layoutParams.leftMargin) {
                            layoutParams.leftMargin = d;
                            b = 1;
                        }
                        if (d2 != layoutParams.rightMargin) {
                            layoutParams.rightMargin = d2;
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
        ud2 ud2Var4 = this.b;
        if (ud2Var4 == null || !ud2Var4.isEnabled()) {
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
    public void setSelectedMessages(List<r47> list) {
        TLRPC.ChatFull chatFull;
        TLRPC.Message message;
        this.c = list;
        zu1 zu1Var = this.a;
        int i = zu1Var.g4;
        boolean z = true;
        if (i != 1 && i != 5 && i != 6 && !zu1Var.c8() && !zu1Var.y() && (((chatFull = zu1Var.r8) == null || !(chatFull.available_reactions instanceof TLRPC.TL_chatReactionsNone)) && !list.isEmpty())) {
            long j = 0;
            boolean z2 = false;
            for (r47 r47Var : list) {
                if ((r47Var != null && (message = r47Var.k) != null && message.rich_message != null) || (r47Var != null && !r47Var.l5() && ((r47.R3(r47Var.k) && r47.n1(r47Var.k).webpage == null) || (r47Var.F0() != null && (r47.J4(r47Var.F0()) || r47.s3(r47Var.F0(), false)))))) {
                    if (!z2) {
                        j = r47Var.c1();
                        z2 = true;
                    } else if (j == r47Var.c1() && j != 0) {
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
