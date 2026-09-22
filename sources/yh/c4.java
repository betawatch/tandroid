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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.z21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class c4 extends View {
    public ValueAnimator E;
    public long F;
    public float G;
    public final b4 H;
    public boolean I;
    public final ArrayList J;
    public final int[] K;
    public final zn a;
    public org.telegram.ui.Cells.a0 b;
    public int c;
    public final int[] d;
    public final int[] e;
    public final RectF f;
    public final RectF h;
    public final Paint n;
    public boolean r;
    public final org.telegram.ui.Components.d6 s;
    public final org.telegram.ui.Components.n6 v;
    public boolean w;
    public final u2.j0 x;
    public float y;

    public c4(zn znVar) {
        super(znVar.getParentActivity());
        this.d = new int[2];
        this.e = new int[2];
        this.f = new RectF();
        this.h = new RectF();
        this.n = new Paint();
        new Paint();
        this.s = new org.telegram.ui.Components.d6(this, 0L, 420L, qr.h);
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.v = n6Var;
        new Matrix();
        this.J = new ArrayList();
        this.K = new int[]{R.raw.star_reaction_effect1, R.raw.star_reaction_effect2, R.raw.star_reaction_effect3, R.raw.star_reaction_effect4, R.raw.star_reaction_effect5};
        this.a = znVar;
        n6Var.setCallback(this);
        n6Var.o(false, true, false);
        n6Var.t(AndroidUtilities.dp(40.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), 0);
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.r(-1);
        n6Var.b = 17;
        this.H = new b4(this, 0);
        this.x = new u2.j0(26, this, znVar);
    }

    private MessageObject getMessageObject() {
        org.telegram.ui.Cells.a0 a0Var = this.b;
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) a0Var).getPrimaryMessageObject();
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
            zn znVar = this.a;
            u5 y3 = u5.y(znVar.getCurrentAccount(), false);
            long E = y3.E(messageObject);
            if (!y3.e || y3.q(false, false, null).amount >= E) {
                return;
            }
            t5 t5Var = u5.y(znVar.getCurrentAccount(), false).B;
            if (t5Var != null) {
                t5Var.a();
            }
            long a2 = znVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-a2));
                str = chat == null ? "" : chat.title;
            }
            new l7(znVar.getParentActivity(), znVar.getResourceProvider(), E, 5, str, new z21(this, y3, messageObject, E, 9), 0L).show();
        }
    }

    public final void b(float f7, b4 b4Var) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            this.E = null;
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f7);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 24));
        this.E.addListener(new ai.t2(this, f7, b4Var, 4));
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
        b(0.0f, new b4(this, 2));
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
        zn znVar = this.a;
        u5 y3 = u5.y(znVar.getCurrentAccount(), false);
        while (true) {
            arrayList = this.J;
            if (arrayList.size() <= 4) {
                break;
            } else {
                ((kj0) arrayList.remove(0)).C(true);
            }
        }
        Random random = Utilities.fastRandom;
        int[] iArr = this.K;
        kj0 kj0Var = new kj0(iArr[random.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        kj0Var.R(this);
        kj0Var.J(true);
        kj0Var.K(0);
        kj0Var.start();
        arrayList.add(kj0Var);
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
            u5.y(znVar.getCurrentAccount(), false).d0(messageObject, this.a, 1L, true, false, null);
        }
        org.telegram.ui.Components.n6 n6Var = this.v;
        n6Var.b();
        n6Var.q("+" + y3.E(messageObject), true, true);
        this.r = true;
        b4 b4Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(b4Var);
        AndroidUtilities.runOnUIThread(b4Var, 1500L);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.F < 100) {
            this.G += 0.5f;
            return;
        }
        this.G = Utilities.clamp(1.0f - ((r2 - 100) / 200.0f), 1.0f, 0.0f) * this.G;
        int measuredWidth = getMeasuredWidth();
        int[] iArr2 = this.e;
        if (measuredWidth != 0 || znVar.getLayoutContainer() == null) {
            getLocationInWindow(iArr2);
        } else {
            znVar.getLayoutContainer().getLocationInWindow(iArr2);
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
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            if (!((org.telegram.ui.Cells.u1) a0Var).M0) {
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
        zn znVar = this.a;
        float y3 = znVar.x0.getY() + (((znVar.V9 == null || (znVar.R9 && !znVar.S9)) && !znVar.Oa) ? (znVar.s9 - znVar.u9) - AndroidUtilities.dp(4.0f) : 0.0f);
        float bottom = (znVar.fragmentView.getBottom() - znVar.x0.getBottom()) + (((znVar.V9 == null || (znVar.R9 && !znVar.S9)) && !znVar.Oa) ? znVar.Aa : 0);
        canvas.save();
        canvas.clipRect(0.0f, (1.0f - this.y) * y3, getWidth(), com.google.android.gms.internal.vision.e2.b(1.0f, this.y, bottom, getHeight()));
        int[] iArr = this.e;
        getLocationInWindow(iArr);
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        int[] iArr2 = this.d;
        a0Var2.getLocationInWindow(iArr2);
        iArr2[1] = iArr2[1] + ((int) znVar.ya);
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
        if (a0Var3 instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) a0Var3;
            u1Var.setScrimReaction(null);
            u1Var.d2(canvas, 1.0f, num);
            u1Var.e2(canvas);
            u1Var.setScrimReaction(num);
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
                    kj0 kj0Var = (kj0) arrayList.get(i12);
                    if (kj0Var.a0 >= kj0Var.e[c11]) {
                        arrayList.remove(i12);
                        i12--;
                    } else {
                        float f15 = dp / 2.0f;
                        kj0Var.setBounds((int) (((AndroidUtilities.dp(15.0f) * lerp) + rectF.left) - f15), (int) (rectF.centerY() - f15), (int) org.telegram.ui.Cells.c1.b(AndroidUtilities.dp(15.0f), lerp, rectF.left, f15), (int) (rectF.centerY() + f15));
                        kj0Var.setAlpha((int) (this.y * f10));
                        kj0Var.draw(canvas);
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
                org.telegram.ui.Components.n6 n6Var = this.v;
                n6Var.w = (int) (e * f10);
                n6Var.p(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(3.5f), org.telegram.ui.ActionBar.j6.l1(e, -1442840576));
                n6Var.l(centerX - AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(48.0f), centerX + AndroidUtilities.dp(100.0f), rectF.top - AndroidUtilities.dp(24.0f));
                n6Var.draw(canvas);
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
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) a0Var).N;
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
        u2.j0 j0Var = this.x;
        if (action == 0) {
            if (this.h.contains(motionEvent.getX(), motionEvent.getY())) {
                this.w = true;
                zg.n0 l4 = reactionsLayoutInBubble.l("stars");
                if (l4 != null) {
                    l4.Y.c(true);
                }
                AndroidUtilities.cancelRunOnUIThread(j0Var);
                AndroidUtilities.runOnUIThread(j0Var, ViewConfiguration.getLongPressTimeout());
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
            AndroidUtilities.cancelRunOnUIThread(j0Var);
        }
        return this.w;
    }

    public void setMessageCell(org.telegram.ui.Cells.a0 a0Var) {
        org.telegram.ui.Cells.a0 a0Var2 = this.b;
        if (a0Var2 == a0Var) {
            return;
        }
        if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.u1) this.b).setInvalidateListener(null);
            this.b.invalidate();
        } else if (a0Var2 instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) a0Var2).setScrimReaction(null);
            ((org.telegram.ui.Cells.w0) this.b).setInvalidateListener(null);
            this.b.invalidate();
        }
        this.b = a0Var;
        this.c = getMessageObject() == null ? 0 : getMessageObject().getId();
        org.telegram.ui.Cells.a0 a0Var3 = this.b;
        if (a0Var3 instanceof org.telegram.ui.Cells.u1) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.u1) this.b).setInvalidateListener(new b4(this, 1));
        } else if (a0Var3 instanceof org.telegram.ui.Cells.w0) {
            a0Var3.invalidate();
            ((org.telegram.ui.Cells.w0) this.b).setInvalidateListener(new b4(this, 1));
        }
        invalidate();
    }
}
