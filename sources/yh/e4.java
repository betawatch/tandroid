package yh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k21;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class e4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final d4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final bo a;
    public org.telegram.ui.Cells.a0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.c6 s;
    public final org.telegram.ui.Components.m6 v;
    public boolean w;
    public final uh.i x;
    public float y;

    public e4(bo boVar) {
        super(boVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.c6(this, 0L, 420L, qr.h);
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false, false);
        this.v = m6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = boVar;
        m6Var.setCallback(this);
        m6Var.o(false, true, false);
        m6Var.t(AndroidUtilities.dp(40.0f));
        m6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        m6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        m6Var.G = AndroidUtilities.displaySize.x;
        m6Var.r(-1);
        m6Var.b = 17;
        this.H = new d4(this, 0);
        this.x = new uh.i(20, this, boVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        }
        return null;
    }

    public final void a() {
        String str;
        if (getMessageObject() != null) {
            MessageObject messageObject = getMessageObject();
            bo boVar = this.a;
            v5 y3 = v5.y(boVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (!y3.e || y3.q(false, false, null).amount >= E) {
                return;
            }
            u5 u5Var = v5.y(boVar.getCurrentAccount(), false).B;
            if (u5Var != null) {
                u5Var.a();
            }
            long a2 = boVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(boVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = boVar.getMessagesController().getChat(Long.valueOf(-a2));
                str = chat == null ? "" : chat.title;
            }
            new n7(boVar.getParentActivity(), boVar.getResourceProvider(), E, 5, str, new k21(this, y3, messageObject, E, 9), 0L).show();
        }
    }

    public final void b(float f7, d4 d4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 24));
        this.E.addListener(new ai.t2(this, f7, d4Var, 4));
        this.E.setInterpolator(qr.h);
        this.E.setDuration(320L);
        this.E.start();
    }

    public final void c() {
        this.I = true;
        AndroidUtilities.cancelRunOnUIThread(this.H);
        this.v.q("", true, true);
        this.r = false;
        invalidate();
        b(0.0f, new d4(this, 2));
    }

    public final void d(float f7, float f10, boolean z10) {
        ArrayList arrayList;
        if (this.b == null || this.I) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        zg.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (messageObject == null || reactionsLayoutInBubble == null) {
            return;
        }
        bo boVar = this.a;
        v5 y3 = v5.y(boVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.J;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((yi0) arrayList.remove(0)).C(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.K;
        yi0 yi0Var = new yi0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        yi0Var.R(this);
        yi0Var.J(true);
        yi0Var.K(0);
        yi0Var.start();
        arrayList.add(yi0Var);
        invalidate();
        zg.n0 l4 = reactionsLayoutInBubble.l("stars");
        if (l4 != null) {
            l4.q();
        }
        if (z10) {
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            v5.y(boVar.getCurrentAccount(), false).d0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.m6 m6Var = this.v;
        m6Var.b();
        m6Var.q("+" + y3.E(messageObject), true, true);
        this.r = true;
        d4 d4Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(d4Var);
        AndroidUtilities.runOnUIThread(d4Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.F < 100) {
            this.G += 0.5f;
            return;
        }
        this.G = Utilities.clamp(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.G;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || boVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            boVar.getLayoutContainer().getLocationInWindow(iArr2);
        }
        LaunchActivity.b0(iArr2[0] + f7, iArr2[1] + f10, Utilities.clamp(this.G, 0.9f, 0.3f));
        this.G = 0.0f;
        this.F = currentTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        char c10;
        char c11;
        Integer num;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            if (!((org.telegram.ui.Cells.t1) a0Var).M0) {
                return;
            }
        } else if ((a0Var instanceof org.telegram.ui.Cells.w0) && !((org.telegram.ui.Cells.w0) a0Var).U1) {
            return;
        }
        MessageObject messageObject = getMessageObject();
        if ((messageObject != null ? messageObject.getId() : 0) != this.c) {
            setMessageCell(null);
            return;
        }
        zg.q0 reactionsLayoutInBubble = getReactionsLayoutInBubble();
        if (reactionsLayoutInBubble == null) {
            setMessageCell(null);
            return;
        }
        float lerp = AndroidUtilities.lerp(1.0f, 1.8f, this.y);
        bo boVar = this.a;
        float y3 = boVar.x0.getY() + (((boVar.V9 == null || (boVar.R9 && !boVar.S9)) && !boVar.Oa) ? (boVar.s9 - boVar.u9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (boVar.fragmentView.getBottom() - boVar.x0.getBottom()) + (((boVar.V9 == null || (boVar.R9 && !boVar.S9)) && !boVar.Oa) ? boVar.Aa : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.y) * y3, getWidth(), com.google.android.gms.internal.vision.e2.b(1.0f, this.y, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        int[] iArr2 = this.d;
        a0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) boVar.ya);
        canvas.save();
        zg.n0 l4 = reactionsLayoutInBubble.l("stars");
        RectF rectF2 = this.f;
        if (l4 != null) {
            f7 = 4.0f;
            int i10 = (iArr2[0] - iArr[0]) + reactionsLayoutInBubble.c + l4.x;
            int i11 = (iArr2[1] - iArr[1]) + reactionsLayoutInBubble.d + l4.y;
            float f13 = i10;
            float f14 = i11;
            c10 = 1;
            rectF2.set(f13, f14, i10 + l4.A, i11 + l4.B);
            AndroidUtilities.scaleRect(rectF2, lerp, (l4.A * 0.1f) + f13, (l4.B / 2.0f) + f14);
            Paint paint = this.n;
            paint.setColor(0);
            c11 = 0;
            paint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.l1(this.y, 1426063360));
            canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, paint);
            canvas.scale(lerp, lerp, (l4.A * 0.1f) + f13, (l4.B / 2.0f) + f14);
            num = Integer.valueOf(l4.r.hashCode());
        } else {
            f7 = 4.0f;
            c10 = 1;
            c11 = 0;
            num = null;
        }
        canvas.translate(iArr2[c11] - iArr[c11], this.b.getPaddingTop() + (iArr2[c10] - iArr[c10]));
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) a0Var3;
            t1Var.setScrimReaction(null);
            t1Var.d2(canvas, 1.0f, num);
            t1Var.e2(canvas);
            t1Var.setScrimReaction(num);
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) a0Var3;
            w0Var.setScrimReaction(null);
            w0Var.B(canvas, true, num);
            org.telegram.ui.Cells.v0 v0Var = w0Var.j2;
            zg.q0 q0Var = w0Var.C0;
            float alpha = w0Var.getAlpha();
            org.telegram.ui.ActionBar.f6 f6Var = w0Var.Y0;
            if (f6Var != null) {
                f10 = 255.0f;
                f6Var.m(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(f7), w0Var.getMeasuredWidth(), w0Var.v0);
            } else {
                f10 = 255.0f;
                org.telegram.ui.ActionBar.j6.q(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(f7), w0Var.getMeasuredWidth(), w0Var.v0);
            }
            MessageObject messageObject2 = w0Var.H0;
            if (messageObject2 == null || !messageObject2.shouldDrawReactions() || (q0Var.b && !(v0Var.b && q0Var.l))) {
                rectF = rectF2;
            } else {
                q0Var.a = 1.0f;
                if (alpha < 1.0f) {
                    rectF = rectF2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, w0Var.getWidth(), w0Var.getHeight(), (int) (alpha * f10), 31);
                } else {
                    rectF = rectF2;
                }
                q0Var.e(canvas, v0Var.b ? v0Var.c : 1.0f);
                if (alpha < 1.0f) {
                    canvas.restore();
                }
            }
            w0Var.setScrimReaction(num);
            canvas.restore();
            canvas.restore();
            if (l4 != null) {
                RectF rectF3 = this.h;
                rectF3.set(rectF);
                rectF3.inset(-AndroidUtilities.dp(42.0f), -AndroidUtilities.dp(42.0f));
                int dp = (int) (AndroidUtilities.dp(90.0f) * lerp);
                int i12 = 0;
                while (true) {
                    ArrayList arrayList = this.J;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    yi0 yi0Var = (yi0) arrayList.get(i12);
                    if (yi0Var.a0 >= yi0Var.e[c11]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f15 = dp / 2.0f;
                        yi0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f15), (int) (rectF.centerY() - f15), (int) org.telegram.ui.Cells.p6.a(AndroidUtilities.dp(15.0f), lerp, rectF.left, f15), (int) (rectF.centerY() + f15));
                        yi0Var.setAlpha((int) (this.y * f10));
                        yi0Var.draw(canvas);
                    }
                    i12++;
                }
                float centerX = rectF.centerX();
                float dp2 = rectF.top - AndroidUtilities.dp(36.0f);
                canvas.save();
                float e = this.s.e(this.r);
                if (this.r) {
                    f12 = AndroidUtilities.dp(60.0f);
                    f11 = 1.0f;
                } else {
                    f11 = 1.0f;
                    f12 = -AndroidUtilities.dp(30.0f);
                }
                canvas.translate(0.0f, (f11 - e) * f12);
                float lerp2 = AndroidUtilities.lerp(this.r ? 1.8f : 1.3f, f11, e);
                canvas.scale(lerp2, lerp2, centerX, dp2);
                org.telegram.ui.Components.m6 m6Var = this.v;
                m6Var.w = (int) (e * f10);
                m6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.j6.l1(e, -1442840576));
                m6Var.l(centerX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), centerX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
                m6Var.draw(canvas);
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
        if (l4 != null) {
        }
        if (!this.r) {
        }
        invalidate();
    }

    public zg.q0 getReactionsLayoutInBubble() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) a0Var).N;
        }
        if (a0Var instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) a0Var).C0;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zg.q0 reactionsLayoutInBubble;
        if (this.b == null || this.I || (reactionsLayoutInBubble = getReactionsLayoutInBubble()) == null) {
            return false;
        }
        int action = motionEvent.getAction();
        uh.i iVar = this.x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.w = true;
                zg.n0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(iVar);
                AndroidUtilities.runOnUIThread(iVar, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            zg.n0 l10 = reactionsLayoutInBubble.l("stars");
            if (motionEvent.getAction() == 1) {
                d(motionEvent.getX(), motionEvent.getY(), true);
            }
            if (l10 != null) {
                l10.Y.c(false);
            }
            this.w = false;
            AndroidUtilities.cancelRunOnUIThread(iVar);
        }
        return this.w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.t1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = a0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().getId();
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.t1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.t1) this.b).setInvalidateListener(new d4(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.b).setInvalidateListener(new d4(this, 1));
        }
        invalidate();
    }
}
