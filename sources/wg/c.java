package wg;

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
import cg.l0;
import gh.s;
import kg.q0;
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
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.t41;
import org.telegram.ui.q30;
import org.telegram.ui.web.t1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c extends ViewGroup implements wd.a, NotificationCenter.NotificationCenterDelegate, vd.b {
    public static final Rect H = new Rect();
    public RenderNode A;
    public float B;
    public View C;
    public GroupCallMessage D;
    public a E;
    public final l0 F;
    public final RectF G;
    public final vd.a a;
    public final vd.a b;
    public final wd.b c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver n;
    public p5 r;
    public q0 s;
    public final s v;
    public a9.a w;
    public boolean x;
    public final t1 y;

    public c(Context context) {
        super(context);
        jr jrVar = jr.h;
        this.a = new vd.a(0, this, jrVar, 320L, false);
        this.b = new vd.a(1, this, jrVar, 320L, false);
        this.c = new wd.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.y = new t1(this, 29);
        this.F = new l0(this, 9);
        this.G = new RectF();
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

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.a.setAlpha(round);
        hVar.c.setAlpha(round);
        invalidate();
    }

    public final int a(float f9, float f10) {
        a9.a aVar = this.w;
        if (aVar == null) {
            return -1;
        }
        RectF rectF = (RectF) aVar.e;
        RectF rectF2 = this.G;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF2.contains(f9, f10)) {
            return 1;
        }
        return ((RectF) this.w.c).contains(f9, f10) ? 0 : -1;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a9.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        canvas.drawPath((Path) aVar.d, this.e);
        if (Build.VERSION.SDK_INT >= 29 && this.A != null && canvas.isHardwareAccelerated()) {
            float f9 = 0.0f;
            View view = this;
            while (view != this.C) {
                f9 += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath((Path) this.w.d);
            canvas.translate(0.0f, -f9);
            float f10 = this.B;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(this.A);
            canvas.restore();
        }
        Paint paint = this.f;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.w.d, paint);
        }
        if (this.a.e > 0.0f) {
            RectF rectF = (RectF) this.w.c;
            RectF rectF2 = this.G;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            this.h.a(AndroidUtilities.dp(14.0f), canvas, rectF2, null);
            invalidate();
        }
        super.dispatchDraw(canvas);
        this.d.draw(canvas);
        this.n.draw(canvas);
        p5 p5Var = this.r;
        if (p5Var != null) {
            p5Var.draw(canvas);
        }
    }

    @Override // wd.a
    public final /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // wd.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.D;
    }

    public float getReactionCenterX() {
        a9.a aVar = this.w;
        if (aVar != null) {
            return ((RectF) aVar.f).centerX();
        }
        return 0.0f;
    }

    @Override // wd.a
    public final /* synthetic */ boolean ignoreHapticFeedbackSettings(float f9, float f10) {
        return false;
    }

    @Override // wd.a
    public final /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // wd.a
    public final boolean needClickAt(View view, float f9, float f10) {
        return a(f9, f10) == 1;
    }

    @Override // wd.a
    public final /* synthetic */ boolean needLongPress(float f9, float f10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.n.onAttachedToWindow();
        p5 p5Var = this.r;
        if (p5Var != null) {
            p5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.y);
        }
    }

    @Override // wd.a
    public final void onClickAt(View view, float f9, float f10) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f9, f10) != 1 || (aVar = this.E) == null || (groupCallMessage = this.D) == null) {
            return;
        }
        ((q30) aVar).a(groupCallMessage);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.n.onDetachedFromWindow();
        p5 p5Var = this.r;
        if (p5Var != null) {
            p5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.y);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a9.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        int round = Math.round(((PointF) aVar.g).x);
        int round2 = Math.round(((PointF) this.w.g).y);
        s sVar = this.v;
        sVar.layout(round, round2, sVar.getMeasuredWidth() + round, sVar.getMeasuredHeight() + round2);
    }

    @Override // wd.a
    public final /* synthetic */ boolean onLongPressRequestedAt(View view, float f9, float f10) {
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int ceil;
        int dp;
        float f9;
        int size = View.MeasureSpec.getSize(i10);
        a9.a aVar = this.w;
        if (aVar == null || this.x || aVar.a != size) {
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
            int b10 = x3.b(8.0f, sVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            a9.a aVar2 = new a9.a();
            RectF rectF = (RectF) aVar2.e;
            PointF pointF = (PointF) aVar2.g;
            RectF rectF2 = (RectF) aVar2.f;
            RectF rectF3 = (RectF) aVar2.c;
            aVar2.a = size;
            aVar2.b = b10;
            rectF3.set(0.0f, 0.0f, i12, b10);
            rectF3.offset((size - i12) / 2.0f, 0.0f);
            ((Path) aVar2.d).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            boolean z10 = sVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z10) {
                f9 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f9 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f9), AndroidUtilities.dp(f9));
            if (z10) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - sVar.getLayout().getLineBaseline(0));
            if (z10) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.w = aVar2;
            this.d.setImageCoords(rectF);
            this.n.setImageCoords((RectF) this.w.f);
            if (this.r != null) {
                RectF rectF4 = (RectF) this.w.f;
                Rect rect = H;
                rectF4.round(rect);
                this.r.setBounds(rect);
            }
        }
        setMeasuredDimension(size, this.w.b);
        this.h.f = Math.round(((RectF) this.w.c).width() + AndroidUtilities.dp(48.0f));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c.a(motionEvent, this);
    }

    public void set(GroupCallMessage groupCallMessage) {
        GroupCallMessage groupCallMessage2;
        GroupCallMessage groupCallMessage3;
        boolean isAttachedToWindow = isAttachedToWindow();
        t1 t1Var = this.y;
        if (isAttachedToWindow && (groupCallMessage3 = this.D) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(t1Var);
        }
        this.D = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.D) != null) {
            groupCallMessage2.subscribeToStateUpdates(t1Var);
        }
        GroupCallMessage groupCallMessage4 = this.D;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.D.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        e9 e9Var = new e9((c6) null);
        e9Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, e9Var);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.o(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.F, 0, spannableStringBuilder.length(), 33);
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
            p5 p5Var = new p5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = p5Var;
            p5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
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
        this.E = aVar;
    }

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }

    @Override // wd.a
    public final /* synthetic */ void onClickTouchDown(View view, float f9, float f10) {
    }

    @Override // wd.a
    public final /* synthetic */ void onClickTouchMove(View view, float f9, float f10) {
    }

    @Override // wd.a
    public final /* synthetic */ void onClickTouchUp(View view, float f9, float f10) {
    }

    @Override // wd.a
    public final /* synthetic */ void onLongPressCancelled(View view, float f9, float f10) {
    }

    @Override // wd.a
    public final /* synthetic */ void onLongPressFinish(View view, float f9, float f10) {
    }

    @Override // wd.a
    public final /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f9, float f10, float f11, float f12) {
    }
}
