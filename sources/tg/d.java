package tg;

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
import dh.u;
import hg.r0;
import kh.lb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.z8;
import org.telegram.ui.n30;
import pf.o1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d extends ViewGroup implements ud.a, NotificationCenter.NotificationCenterDelegate, td.b {
    public static final Rect H = new Rect();
    public RenderNode A;
    public float B;
    public View C;
    public GroupCallMessage D;
    public a E;
    public final lb F;
    public final RectF G;
    public final td.a a;
    public final td.a b;
    public final ud.b c;
    public final ImageReceiver d;
    public final Paint e;
    public final Paint f;
    public final org.telegram.ui.Components.voip.h h;
    public final ImageReceiver n;
    public k5 r;
    public r0 s;
    public final u v;
    public b w;
    public boolean x;
    public final o1 y;

    public d(Context context) {
        super(context);
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 320L, false);
        this.b = new td.a(1, this, grVar, 320L, false);
        this.c = new ud.b(this);
        Paint paint = new Paint(1);
        this.e = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
        this.h = hVar;
        this.y = new o1(this, 8);
        this.F = new lb(this, 7);
        this.G = new RectF();
        u uVar = new u(context);
        this.v = uVar;
        uVar.setDisablePaddingsOffset(true);
        uVar.setTextSize(14.0f);
        uVar.setTextColor(-1);
        uVar.setLinkTextColor(-11683585);
        uVar.setHintTextColor(-1);
        addView(uVar);
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
        int i9 = 0;
        while (i9 < length) {
            int codePointAt = Character.codePointAt(charSequence, i9);
            i9 += Character.charCount(codePointAt);
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

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        this.f.setAlpha(Math.round(this.b.e * 100.0f));
        int round = Math.round(this.a.e * 220.0f);
        org.telegram.ui.Components.voip.h hVar = this.h;
        hVar.a.setAlpha(round);
        hVar.c.setAlpha(round);
        invalidate();
    }

    public final int a(float f10, float f11) {
        b bVar = this.w;
        if (bVar == null) {
            return -1;
        }
        RectF rectF = (RectF) bVar.d;
        RectF rectF2 = this.G;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
        if (rectF2.contains(f10, f11)) {
            return 1;
        }
        return ((RectF) this.w.c).contains(f10, f11) ? 0 : -1;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        b bVar = this.w;
        if (bVar == null) {
            return;
        }
        canvas.drawPath((Path) bVar.f, this.e);
        if (Build.VERSION.SDK_INT >= 29 && this.A != null && canvas.isHardwareAccelerated()) {
            float f10 = 0.0f;
            View view = this;
            while (view != this.C) {
                f10 += view.getY();
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return;
                } else {
                    view = (View) parent;
                }
            }
            canvas.save();
            canvas.clipPath((Path) this.w.f);
            canvas.translate(0.0f, -f10);
            float f11 = this.B;
            canvas.scale(f11, f11);
            canvas.drawRenderNode(this.A);
            canvas.restore();
        }
        Paint paint = this.f;
        if (paint.getAlpha() > 0) {
            canvas.drawPath((Path) this.w.f, paint);
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
        k5 k5Var = this.r;
        if (k5Var != null) {
            k5Var.draw(canvas);
        }
    }

    @Override // ud.a
    public final /* synthetic */ boolean forceEnableVibration() {
        return false;
    }

    @Override // ud.a
    public long getLongPressDuration() {
        return ViewConfiguration.getLongPressTimeout();
    }

    public GroupCallMessage getMessage() {
        return this.D;
    }

    public float getReactionCenterX() {
        b bVar = this.w;
        if (bVar != null) {
            return ((RectF) bVar.e).centerX();
        }
        return 0.0f;
    }

    @Override // ud.a
    public final /* synthetic */ boolean ignoreHapticFeedbackSettings(float f10, float f11) {
        return false;
    }

    @Override // ud.a
    public final /* synthetic */ boolean needCancelTouchBySlopMove() {
        return true;
    }

    @Override // ud.a
    public final boolean needClickAt(View view, float f10, float f11) {
        return a(f10, f11) == 1;
    }

    @Override // ud.a
    public final /* synthetic */ boolean needLongPress(float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.n.onAttachedToWindow();
        k5 k5Var = this.r;
        if (k5Var != null) {
            k5Var.a(this);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.subscribeToStateUpdates(this.y);
        }
    }

    @Override // ud.a
    public final void onClickAt(View view, float f10, float f11) {
        a aVar;
        GroupCallMessage groupCallMessage;
        if (a(f10, f11) != 1 || (aVar = this.E) == null || (groupCallMessage = this.D) == null) {
            return;
        }
        ((n30) aVar).a(groupCallMessage);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.n.onDetachedFromWindow();
        k5 k5Var = this.r;
        if (k5Var != null) {
            k5Var.o(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        GroupCallMessage groupCallMessage = this.D;
        if (groupCallMessage != null) {
            groupCallMessage.unsubscribeFromStateUpdates(this.y);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        b bVar = this.w;
        if (bVar == null) {
            return;
        }
        int round = Math.round(((PointF) bVar.g).x);
        int round2 = Math.round(((PointF) this.w.g).y);
        u uVar = this.v;
        uVar.layout(round, round2, uVar.getMeasuredWidth() + round, uVar.getMeasuredHeight() + round2);
    }

    @Override // ud.a
    public final /* synthetic */ boolean onLongPressRequestedAt(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int ceil;
        int dp;
        float f10;
        int size = View.MeasureSpec.getSize(i9);
        b bVar = this.w;
        if (bVar == null || this.x || bVar.a != size) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            r0 r0Var = this.s;
            int d = ll.d(44.0f, (size - paddingLeft) - paddingRight, TLObject.FLAG_31);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            u uVar = this.v;
            uVar.measure(d, makeMeasureSpec);
            float measuredWidth = uVar.getMeasuredWidth();
            if (r0Var == null) {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(44.0f);
            } else {
                ceil = (int) Math.ceil(measuredWidth);
                dp = AndroidUtilities.dp(70.0f);
            }
            int i11 = dp + ceil;
            int z10 = l0.z(8.0f, uVar.getMeasuredHeight(), AndroidUtilities.dp(28.0f));
            b bVar2 = new b();
            RectF rectF = (RectF) bVar2.d;
            PointF pointF = (PointF) bVar2.g;
            RectF rectF2 = (RectF) bVar2.e;
            RectF rectF3 = (RectF) bVar2.c;
            bVar2.a = size;
            bVar2.b = z10;
            rectF3.set(0.0f, 0.0f, i11, z10);
            rectF3.offset((size - i11) / 2.0f, 0.0f);
            ((Path) bVar2.f).addRoundRect(rectF3, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), Path.Direction.CW);
            boolean z11 = uVar.getLayout().getParagraphDirection(0) == -1;
            rectF.set(0.0f, 0.0f, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f));
            if (z11) {
                f10 = 28.0f;
                rectF.offset(rectF3.right, rectF3.top);
                rectF.offset((-AndroidUtilities.dp(4.0f)) - rectF.width(), AndroidUtilities.dp(3.0f));
            } else {
                f10 = 28.0f;
                rectF.offset(rectF3.left, rectF3.top);
                rectF.offset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            }
            rectF2.set(0.0f, 0.0f, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
            if (z11) {
                rectF2.offset(rectF3.left + AndroidUtilities.dp(5.0f), 0.0f);
            } else {
                rectF2.offset(rectF3.right - AndroidUtilities.dp(33.0f), 0.0f);
            }
            rectF2.inset(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
            pointF.set(0.0f, (rectF3.top + AndroidUtilities.dp(19.0f)) - uVar.getLayout().getLineBaseline(0));
            if (z11) {
                pointF.offset((rectF3.right - AndroidUtilities.dp(32.0f)) - measuredWidth, 0.0f);
            } else {
                pointF.offset(rectF3.left + AndroidUtilities.dp(32.0f), 0.0f);
            }
            this.w = bVar2;
            this.d.setImageCoords(rectF);
            this.n.setImageCoords((RectF) this.w.e);
            if (this.r != null) {
                RectF rectF4 = (RectF) this.w.e;
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
        o1 o1Var = this.y;
        if (isAttachedToWindow && (groupCallMessage3 = this.D) != null) {
            groupCallMessage3.unsubscribeFromStateUpdates(o1Var);
        }
        this.D = groupCallMessage;
        if (isAttachedToWindow() && (groupCallMessage2 = this.D) != null) {
            groupCallMessage2.subscribeToStateUpdates(o1Var);
        }
        GroupCallMessage groupCallMessage4 = this.D;
        if (groupCallMessage4 != null) {
            this.a.a(groupCallMessage4.isSendDelayed(), false);
            this.b.a(this.D.isSendError(), false);
        }
        TLObject userOrChat = MessagesController.getInstance(UserConfig.selectedAccount).getUserOrChat(groupCallMessage.fromId);
        String name = DialogObject.getName(userOrChat);
        z8 z8Var = new z8((b6) null);
        z8Var.j(groupCallMessage.currentAccount, userOrChat);
        this.d.setForUserOrChat(userOrChat, z8Var);
        ImageReceiver imageReceiver = this.n;
        imageReceiver.setImage(null, null, null, null, null, 0);
        if (this.r != null && isAttachedToWindow()) {
            this.r.o(this);
        }
        this.r = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(name);
        spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(this.F, 0, spannableStringBuilder.length(), 33);
        r0 r0Var = groupCallMessage.visibleReaction;
        u uVar = this.v;
        if (r0Var == null) {
            CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(groupCallMessage.message, false, true, uVar.getPaint());
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
        } else if (r0Var.f != null) {
            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(groupCallMessage.currentAccount).getReactionsMap().get(groupCallMessage.visibleReaction.f);
            if (tL_availableReaction != null) {
                imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), "28_28", null, null, null, 0);
            }
        } else if (r0Var.g != 0) {
            k5 k5Var = new k5(0, groupCallMessage.currentAccount, groupCallMessage.visibleReaction.g);
            this.r = k5Var;
            k5Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            if (isAttachedToWindow()) {
                this.r.a(this);
            }
        }
        this.s = groupCallMessage.visibleReaction;
        this.x = true;
        uVar.setText(spannableStringBuilder);
        requestLayout();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) {
        this.e.setColor(i9);
    }

    public void setDelegate(a aVar) {
        this.E = aVar;
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }

    @Override // ud.a
    public final /* synthetic */ void onClickTouchDown(View view, float f10, float f11) {
    }

    @Override // ud.a
    public final /* synthetic */ void onClickTouchMove(View view, float f10, float f11) {
    }

    @Override // ud.a
    public final /* synthetic */ void onClickTouchUp(View view, float f10, float f11) {
    }

    @Override // ud.a
    public final /* synthetic */ void onLongPressCancelled(View view, float f10, float f11) {
    }

    @Override // ud.a
    public final /* synthetic */ void onLongPressFinish(View view, float f10, float f11) {
    }

    @Override // ud.a
    public final /* synthetic */ void onLongPressMove(View view, MotionEvent motionEvent, float f10, float f11, float f12, float f13) {
    }
}
