package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import eg.l0;
import ih.s;
import mg.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.z8;
import org.telegram.ui.e40;
import vh.z1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c extends ViewGroup implements yd.a, NotificationCenter.NotificationCenterDelegate, xd.b {
    public static final Rect I = new Rect();
    public RenderNode B;
    public float C;
    public View D;
    public GroupCallMessage E;
    public a F;
    public final l0 G;
    public final RectF H;
    public final xd.a a;
    public final xd.a b;
    public final yd.b c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver n;
    public l5 r;
    public q0 s;
    public final s v;
    public c9.a w;
    public boolean x;
    public final z1 y;

    public c(Context context) {
        super(context);
        mr mrVar = mr.h;
        this.a = new xd.a(0, this, mrVar, 320L, false);
        this.b = new xd.a(1, this, mrVar, 320L, false);
        this.c = new yd.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.y = new z1(this, 2);
        this.G = new l0(this, 9);
        this.H = new RectF();
        s sVar = new s(context);
        this.v = sVar;
        sVar.setDisablePaddingsOffset(true);
        sVar.setTextSize(14.0f);
        sVar.setTextColor(-1);
        sVar.setLinkTextColor(-11683585);
        sVar.setHintTextColor(-1);
        addView(sVar);
        paint.setColor(-13946053);
        paint2.setColor(-65536);
        paint2.setAlpha(0);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(11.0f));
        hVar.c.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.n = new ImageReceiver(this);
        setWillNotDraw(false);
    }

    public static boolean b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int codePointAt = Character.codePointAt(charSequence, i10);
            i10 += Character.charCount(codePointAt);
            byte directionality = Character.getDirectionality(codePointAt);
            if (directionality == 0) {
                break;
            }
            if (directionality == 1 || directionality == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.a.setAlpha(round);
        hVar.c.setAlpha(round);
        invalidate();
    }

    public final int a(float f10, float f11) {
        c9.a aVar = this.w;
        if (aVar == null) {
            return -1;
        }
        RectF rectF = (RectF) aVar.e;
        RectF rectF2 = this.H;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF2.contains(f10, f11)) {
            return 1;
        }
        return ((RectF) this.w.a).contains(f10, f11) ? 0 : -1;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        c9.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        canvas.drawPath((Path) aVar.d, this.e);
        if (Build.VERSION.SDK_INT >= 29 && this.B != null && canvas.isHardwareAccelerated()) {
            float f10 = 0.0f;
            View view = this;
            while (view != this.D) {
                f10 += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath((Path) this.w.d);
            canvas.translate(0.0f, -f10);
            float f11 = this.C;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(this.B);
            canvas.restore();
        }
        Paint paint = this.f;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.w.d, paint);
        }
        if (this.a.e > 0.0f) {
            RectF rectF = (RectF) this.w.a;
            RectF rectF2 = this.H;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF2, null);
            invalidate();
        }
        super.dispatchDraw(canvas);
        this.d.draw(canvas);
        this.n.draw(canvas);
        l5 l5Var = this.r;
        if (l5Var != null) {
            l5Var.draw(canvas);
        }
    }

    @Override // yd.a
    public final /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // yd.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.E;
    }

    public float getReactionCenterX() {
        c9.a aVar = this.w;
        if (aVar != null) {
            return ((RectF) aVar.f).centerX();
        }
        return 0.0f;
    }

    @Override // yd.a
    public final /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override // yd.a
    public final /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // yd.a
    public final boolean needClickAt(View view, float f10, float f11) {
        return a(f10, f11) == 1;
    }

    @Override // yd.a
    public final /* synthetic */ boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.n.onAttachedToWindow();
        l5 l5Var = this.r;
        if (l5Var != null) {
            l5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.E;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.y);
        }
    }

    @Override // yd.a
    public final void onClickAt(View view, float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) != 1 || (aVar = this.F) == null || (groupCallMessage = this.E) == null) {
            return;
        }
        ((e40) aVar).a(groupCallMessage);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.n.onDetachedFromWindow();
        l5 l5Var = this.r;
        if (l5Var != null) {
            l5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.E;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.y);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        c9.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        int round = Math.round(((PointF) aVar.g).x);
        int round2 = Math.round(((PointF) this.w.g).y);
        s sVar = this.v;
        sVar.layout(round, round2, sVar.getMeasuredWidth() + round, sVar.getMeasuredHeight() + round2);
    }

    @Override // yd.a
    public final /* synthetic */ boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int dp;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        c9.a aVar = this.w;
        if (aVar == null || this.x || aVar.b != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            q0 q0Var = this.s;
            int d = org.telegram.ui.b.d(44.0f, (size - paddingLeft) - paddingRight, TLObject.FLAG_31);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            s sVar = this.v;
            sVar.measure(d, makeMeasureSpec);
            float measuredWidth = sVar.getMeasuredWidth();
            if (q0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i12 = dp + ceil;
            int b10 = y3.b(8.0f, sVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            c9.a aVar2 = new c9.a();
            aVar2.a = new RectF();
            aVar2.d = new Path();
            aVar2.e = new RectF();
            aVar2.f = new RectF();
            aVar2.g = new PointF();
            RectF rectF = (RectF) aVar2.e;
            PointF pointF = (PointF) aVar2.g;
            RectF rectF2 = (RectF) aVar2.f;
            RectF rectF3 = (RectF) aVar2.a;
            aVar2.b = size;
            aVar2.c = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) aVar2.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            boolean z4 = sVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z4) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            if (z4) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - sVar.getLayout().getLineBaseline(0));
            if (z4) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.w = aVar2;
            this.d.setImageCoords(rectF);
            this.n.setImageCoords((RectF) this.w.f);
            if (this.r != null) {
                RectF rectF4 = (RectF) this.w.f;
                Rect rect = I;
                rectF4.round(rect);
                this.r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.w.c);
        this.h.f = Math.round(((RectF) this.w.a).width() + AndroidUtilities.dp(48.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        z1 z1Var = this.y;
        if (isAttachedToWindow && (groupCallMessage3 = this.E) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(z1Var);
        }
        this.E = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.E) != null) {
            groupCallMessage2.subscribeToStateUpdates(z1Var);
        }
        GroupCallMessage groupCallMessage4 = this.E;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.E.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        z8 z8Var = new z8((f6) null);
        z8Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, z8Var);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.o(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.G, 0, spannableStringBuilder.length(), 33);
        q0 q0Var = groupCallMessage.visibleReaction;
        s sVar = this.v;
        if (q0Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, sVar.getPaint());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            boolean b10 = b(spannableStringBuilder);
            boolean b11 = b(formatTextWithEntities);
            if (b10 != b11) {
                spannableStringBuilder2.append(b11 ? (char) 8295 : (char) 8294);
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                spannableStringBuilder2.append((char) 8297);
            } else {
                spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
            }
            spannableStringBuilder2.append((CharSequence) "  ");
            spannableStringBuilder2.append(formatTextWithEntities);
            spannableStringBuilder = spannableStringBuilder2;
        } else if (q0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (q0Var.g != 0) {
            l5 l5Var = new l5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = l5Var;
            l5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.a(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.x = true;
        sVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.e.setColor(i10);
    }

    public void setDelegate(a aVar) {
        this.F = aVar;
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }

    @Override // yd.a
    public final /* synthetic */ void onClickTouchDown(View view, float f10, float f11) {
    }

    @Override // yd.a
    public final /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override // yd.a
    public final /* synthetic */ void onClickTouchUp(View view, float f10, float f11) {
    }

    @Override // yd.a
    public final /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override // yd.a
    public final /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override // yd.a
    public final /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
