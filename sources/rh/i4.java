package rh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l40;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i4 extends View {
    public float D;
    public ValueAnimator E;
    public long F;
    public float G;
    public final h4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final un a;
    public org.telegram.ui.Cells.z b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.t5 s;
    public final org.telegram.ui.Components.e6 w;
    public boolean x;
    public final o y;

    public i4(un unVar) {
        super(unVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.t5(this, 0L, 420L, gr.h);
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, false, false);
        this.w = e6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = unVar;
        e6Var.setCallback(this);
        e6Var.r(false, true);
        e6Var.w(org.telegram.messenger.i0.L(40.0f));
        e6Var.x(org.telegram.messenger.i0.o1("fonts/num.otf"));
        e6Var.s(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(3.5f), 0);
        e6Var.M = org.telegram.messenger.i0.q.x;
        e6Var.u(-1);
        e6Var.b = 17;
        this.H = new h4(this, 0);
        this.y = new o(11, this, unVar);
    }

    private jj getMessageObject() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        }
        if (zVar instanceof org.telegram.ui.Cells.s0) {
            return ((org.telegram.ui.Cells.s0) zVar).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            jj messageObject = getMessageObject();
            un unVar = this.a;
            e6 y3 = e6.y(unVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (!y3.e || y3.q(null, false, false).amount >= E) {
                return;
            }
            c6 c6Var = e6.y(unVar.getCurrentAccount(), false).B;
            if (c6Var != null) {
                c6Var.a();
            }
            long a2 = unVar.a();
            if (a2 >= 0) {
                str = h20.k(unVar.getMessagesController().Z1(Long.valueOf(a2)));
            } else {
                TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-a2));
                str = L0 == null ? "" : L0.title;
            }
            new x7(unVar.getParentActivity(), unVar.getResourceProvider(), E, 5, str, new ag.a3(this, y3, messageObject, E, 18), 0L).show();
        }
    }

    public final void b(float f7, h4 h4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.D, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new qh.e0(this, 5));
        this.E.addListener(new l40(this, f7, h4Var, 2));
        this.E.setInterpolator(gr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        org.telegram.messenger.i0.r(this.H);
        this.w.t("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new h4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.I) {
            return;
        }
        jj messageObject = getMessageObject();
        sg.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        un unVar = this.a;
        e6 y3 = e6.y(unVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.J;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((bi0) arrayList.remove(0)).C(true);
            }
        }
        d5.a aVar = Utilities.c;
        int[] iArr = this.K;
        bi0 bi0Var = new bi0(iArr[aVar.nextInt(iArr.length)], org.telegram.messenger.i0.L(70.0f), org.telegram.messenger.i0.L(70.0f));
        bi0Var.R(this);
        bi0Var.J(true);
        bi0Var.K(0);
        bi0Var.start();
        arrayList.add(bi0Var);
        invalidate();
        sg.m0 k10 = reactionsLayoutInBubble.k("stars");
        if (k10 != null) {
            k10.p();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            e6.y(unVar.getCurrentAccount(), false).b0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.e6 e6Var = this.w;
        e6Var.a();
        e6Var.t("+" + y3.E(messageObject), true, true);
        this.r = true;
        h4 h4Var = this.H;
        org.telegram.messenger.i0.r(h4Var);
        org.telegram.messenger.i0.h3(h4Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.F < 100) {
            this.G += 0.5f;
            return;
        }
        this.G = Utilities.i(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.G;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || unVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            unVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f7, iArr2[1] + f10, Utilities.i(this.G, 0.9f, 0.3f));
        this.G = 0.0f;
        this.F = currentTimeMillis;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0331  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10;
        boolean z10;
        Integer num;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            if (!((org.telegram.ui.Cells.q1) zVar).N0) {
                return;
            }
        } else if ((zVar instanceof org.telegram.ui.Cells.s0) && !((org.telegram.ui.Cells.s0) zVar).d2) {
            return;
        }
        jj messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.f1() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        sg.p0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float T1 = org.telegram.messenger.i0.T1(1.0f, 1.8f, this.D);
        un unVar = this.a;
        float y3 = unVar.z0.getY() + (((unVar.oa == null || (unVar.ka && !unVar.la)) && !unVar.ib) ? (unVar.L9 - unVar.N9) - org.telegram.messenger.i0.L(4.0f) : 0.0f);
        float bottom = (unVar.fragmentView.getBottom() - unVar.z0.getBottom()) + (((unVar.oa == null || (unVar.ka && !unVar.la)) && !unVar.ib) ? unVar.Ua : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.D) * y3, getWidth(), sc.e.z(1.0f, this.D, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.z zVar2 = this.b;
        int[] iArr2 = this.d;
        zVar2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) unVar.Sa);
        canvas.save();
        sg.m0 k10 = reactionsLayoutInBubble.k("stars");
        RectF rectF2 = this.f;
        if (k10 != null) {
            f7 = 4.0f;
            int i11 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.b + k10.w;
            int i12 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.c + k10.x;
            float f13 = i11;
            float f14 = i12;
            z10 = 1;
            rectF2.set(f13, f14, i11 + k10.z, i12 + k10.A);
            org.telegram.messenger.i0.i3(rectF2, T1, (k10.z * 0.1f) + f13, (k10.A / 2.0f) + f14);
            Paint paint = this.n;
            paint.setColor(0);
            i10 = 0;
            paint.setShadowLayer(org.telegram.messenger.i0.L(12.0f), 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.ui.ActionBar.t6.r1(this.D, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(T1, T1, (k10.z * 0.1f) + f13, (k10.A / 2.0f) + f14);
            num = Integer.valueOf(k10.q.hashCode());
        } else {
            f7 = 4.0f;
            i10 = 0;
            z10 = 1;
            num = null;
        }
        canvas.translate(iArr2[i10] - iArr[i10], this.b.getPaddingTop() + (iArr2[z10] - iArr[z10]));
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) zVar3;
            q1Var.setScrimReaction(null);
            q1Var.m1(canvas, 1.0f, num);
            q1Var.n1(canvas);
            q1Var.setScrimReaction(num);
        } else if (zVar3 instanceof org.telegram.ui.Cells.s0) {
            org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) zVar3;
            s0Var.setScrimReaction(null);
            s0Var.K(canvas, z10, num);
            org.telegram.ui.Cells.r0 r0Var = s0Var.r2;
            sg.p0 p0Var = s0Var.E0;
            float alpha = s0Var.getAlpha();
            org.telegram.ui.ActionBar.p6 p6Var = s0Var.g1;
            if (p6Var != null) {
                f10 = 255.0f;
                p6Var.b(s0Var.u0, s0Var.t0 + org.telegram.messenger.i0.L(f7), s0Var.getMeasuredWidth(), s0Var.v0);
            } else {
                f10 = 255.0f;
                org.telegram.ui.ActionBar.t6.r(s0Var.u0, s0Var.t0 + org.telegram.messenger.i0.L(f7), s0Var.getMeasuredWidth(), s0Var.v0);
            }
            jj jjVar = s0Var.P0;
            if (jjVar == null || !jjVar.N5()) {
                rectF = rectF2;
            } else {
                p0Var.getClass();
                p0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, s0Var.getWidth(), s0Var.getHeight(), (int) (alpha * f10), 31);
                } else {
                    rectF = rectF2;
                }
                p0Var.e(canvas, r0Var.b ? r0Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            s0Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (k10 != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-org.telegram.messenger.i0.L(42.0f), -org.telegram.messenger.i0.L(42.0f));
                int L = (int) (org.telegram.messenger.i0.L(90.0f) * T1);
                int i13 = i10;
                while (true) {
                    ArrayList arrayList = this.J;
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    bi0 bi0Var = (bi0) arrayList.get(i13);
                    if (bi0Var.a0 >= bi0Var.e[i10]) {
                        arrayList.remove(i13);
                        i13--;
                    } else {
                        float f15 = L / 2.0f;
                        bi0Var.setBounds((int) (((org.telegram.messenger.i0.L(15.0f) * T1) + rectF.left) - f15), (int) (rectF.centerY() - f15), (int) sc.e.d(org.telegram.messenger.i0.L(15.0f), T1, rectF.left, f15), (int) (rectF.centerY() + f15));
                        bi0Var.setAlpha((int) (this.D * f10));
                        bi0Var.draw(canvas);
                    }
                    i13++;
                }
                float centerX = rectF.centerX();
                float L2 = rectF.top - org.telegram.messenger.i0.L(36.0f);
                canvas.save();
                float d = this.s.d(this.r);
                if (this.r) {
                    f12 = org.telegram.messenger.i0.L(60.0f);
                    f11 = 1.0f;
                } else {
                    f11 = 1.0f;
                    f12 = -org.telegram.messenger.i0.L(30.0f);
                }
                canvas.translate(0.0f, (f11 - d) * f12);
                float T12 = org.telegram.messenger.i0.T1(this.r ? 1.8f : 1.3f, f11, d);
                canvas.scale(T12, T12, centerX, L2);
                org.telegram.ui.Components.e6 e6Var = this.w;
                e6Var.B = (int) (d * f10);
                e6Var.s(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(3.5f), org.telegram.ui.ActionBar.t6.r1(d, -1442840576));
                e6Var.o(centerX - org.telegram.messenger.i0.L(100.0f), rectF.top - org.telegram.messenger.i0.L(48.0f), centerX + org.telegram.messenger.i0.L(100.0f), rectF.top - org.telegram.messenger.i0.L(24.0f));
                e6Var.draw(canvas);
                canvas.restore();
            }
            if (!this.r) {
                a();
            }
            invalidate();
        }
        rectF = rectF2;
        f10 = 255.0f;
        canvas.restore();
        canvas.restore();
        if (k10 != null) {
        }
        if (!this.r) {
        }
        invalidate();
    }

    public sg.p0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.z zVar = this.b;
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) zVar).N;
        }
        if (zVar instanceof org.telegram.ui.Cells.s0) {
            return ((org.telegram.ui.Cells.s0) zVar).E0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        sg.p0 reactionsLayoutInBubble;
        if (this.b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        o oVar = this.y;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.x = true;
                sg.m0 k10 = reactionsLayoutInBubble.k("stars");
                if (k10 != null) {
                    k10.X.c(true);
                }
                org.telegram.messenger.i0.r(oVar);
                org.telegram.messenger.i0.h3(oVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            sg.m0 k11 = reactionsLayoutInBubble.k("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (k11 != null) {
                k11.X.c(false);
            }
            this.x = false;
            org.telegram.messenger.i0.r(oVar);
        }
        return this.x;
    }

    public void setMessageCell(org.telegram.ui.Cells.z zVar) {
        org.telegram.ui.Cells.z zVar2 = this.b;
        if (zVar2 == zVar) {
            return;
        }
        if (zVar2 instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.q1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (zVar2 instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) zVar2).setScrimReaction(null);
            ((org.telegram.ui.Cells.s0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = zVar;
        this.c = getMessageObject() == null ? 0 : getMessageObject().f1();
        org.telegram.ui.Cells.z zVar3 = this.b;
        if (zVar3 instanceof org.telegram.ui.Cells.q1) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.q1) this.b).setInvalidateListener(new h4(this, 1));
        } else if (zVar3 instanceof org.telegram.ui.Cells.s0) {
            zVar3.invalidate();
            ((org.telegram.ui.Cells.s0) this.b).setInvalidateListener(new h4(this, 1));
        }
        invalidate();
    }
}
