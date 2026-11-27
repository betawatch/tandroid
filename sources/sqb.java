// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class sqb extends LinearLayout {
    public final s8b E;
    public Drawable F;
    public boolean G;
    public final mm H;
    public xd0 a;
    public xd0 b;
    public Drawable c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f;
    public boolean h;
    public final wb2[] n;
    public final Drawable r;
    public final wk5 s;
    public final int w;
    public e x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0484 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sqb(Context context, wk5 wk5Var, int i, long j, vnb vnbVar) {
        super(context);
        int i2;
        String M0;
        String sb;
        int i3;
        String str;
        int i4;
        r47 r47Var;
        int i5;
        wb2[] wb2VarArr;
        int i6 = i;
        this.n = new wb2[2];
        this.y = -1;
        this.E = new s8b(this, (byte) 22);
        this.H = new mm(this, 0L, 350L, k43.h);
        this.w = i6;
        int i7 = yac.t0;
        this.s = wk5Var;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, hl.L(11.0f), 0, hl.L(11.0f));
        vnb vnbVar2 = vnbVar;
        this.r = aob.V0(context, R.drawable.greydivider_bottom, aob.v0(aob.b7, vnbVar2));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        byte b = 16;
        r47 r47Var2 = null;
        if (i6 == 3) {
            boolean z = j < 0;
            i2 = 4;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = ob6.M0(z ? 2131752407 : 2131743406, null);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = yac.h(yac.t0).e();
            } else {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerChannel();
                tL_message.reply_to.reply_to_peer_id.channel_id = -j;
            }
            TLRPC.Message message = new TLRPC.Message();
            tL_message.replyMessage = message;
            message.media = new TLRPC.TL_messageMediaEmpty();
            TLRPC.Message message2 = tL_message.replyMessage;
            if (j == 0) {
                message2.from_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.from_id.user_id = yac.h(yac.t0).e();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = yac.h(yac.t0).e();
            } else {
                message2.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message3 = tL_message.replyMessage;
                long j2 = -j;
                message3.from_id.channel_id = j2;
                message3.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j2;
            }
            tL_message.replyMessage.message = ob6.M0(z ? 2131752404 : 2131743403, null);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = ob6.M0(R.string.AppName, null);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = ob6.M0(z ? 2131752405 : 2131743404, null);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = ob6.M0(z ? 2131752406 : 2131743405, null);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = jn7.h4;
            if (j == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = yac.h(yac.t0).e();
            } else {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_message.from_id = tL_peerChannel;
                tL_peerChannel.channel_id = -j;
            }
            tL_message.id = 1;
            tL_message.out = false;
            if (j == 0) {
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = 0L;
            } else {
                TLRPC.TL_peerChannel tL_peerChannel2 = new TLRPC.TL_peerChannel();
                tL_message.peer_id = tL_peerChannel2;
                tL_peerChannel2.channel_id = -j;
            }
            r47 r47Var3 = new r47(yac.t0, tL_message, true, false);
            r47Var3.w1 = true;
            r47Var3.l2 = true;
            r47Var3.S1 = false;
            r47Var3.T = 1L;
            r47Var = r47Var3;
        } else {
            i2 = 4;
            if (i6 == 2) {
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.message = ob6.M0(2131751318, null);
                tL_message2.date = currentTimeMillis - 3540;
                tL_message2.dialog_id = 1L;
                tL_message2.flags = jn7.h4;
                TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                tL_message2.from_id = tL_peerUser3;
                tL_peerUser3.user_id = yac.h(yac.t0).e();
                tL_message2.id = 1;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.out = false;
                TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                tL_message2.peer_id = tL_peerUser4;
                tL_peerUser4.user_id = 0L;
                r47Var = new r47(yac.t0, tL_message2, true, false);
                r47Var.S1 = false;
                r47Var.T = 1L;
                r47Var.G = ob6.M0(2131751316, null);
                r47Var.m2 = context.getDrawable(R.drawable.dino_pic);
                r47Var.e1 = 5;
                r47Var.f1 = 0L;
            } else {
                TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
                if (i6 == 0) {
                    M0 = ob6.M0(2131750565, null);
                    tL_message3.message = M0;
                } else {
                    M0 = ob6.M0(2131748008, null);
                    tL_message3.message = M0;
                }
                int indexOf = M0.indexOf("👋");
                if (indexOf >= 0) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji.offset = indexOf;
                    tL_messageEntityCustomEmoji.length = 2;
                    tL_messageEntityCustomEmoji.document_id = 5386654653003864312L;
                    tL_message3.entities.add(tL_messageEntityCustomEmoji);
                }
                int i8 = currentTimeMillis - 3540;
                tL_message3.date = i8;
                tL_message3.dialog_id = 1L;
                tL_message3.flags = jn7.h4;
                TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
                tL_message3.from_id = tL_peerUser5;
                tL_peerUser5.user_id = yac.h(yac.t0).e();
                tL_message3.id = 1;
                tL_message3.media = new TLRPC.TL_messageMediaEmpty();
                tL_message3.out = true;
                TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
                tL_message3.peer_id = tL_peerUser6;
                tL_peerUser6.user_id = 0L;
                r47 r47Var4 = new r47(yac.t0, tL_message3, true, false);
                TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
                if (i6 == 0) {
                    sb = ob6.M0(2131750567, null);
                    tL_message4.message = sb;
                } else {
                    String M02 = ob6.M0(2131748010, null);
                    StringBuilder sb2 = new StringBuilder(M02);
                    int indexOf2 = M02.indexOf(42);
                    int lastIndexOf = M02.lastIndexOf(42);
                    if (indexOf2 != -1 && lastIndexOf != -1) {
                        sb2.replace(lastIndexOf, lastIndexOf + 1, "");
                        sb2.replace(indexOf2, indexOf2 + 1, "");
                        TLRPC.TL_messageEntityTextUrl tL_messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
                        tL_messageEntityTextUrl.offset = indexOf2;
                        tL_messageEntityTextUrl.length = (lastIndexOf - indexOf2) - 1;
                        tL_messageEntityTextUrl.url = "https://telegram.org";
                        tL_message4.entities.add(tL_messageEntityTextUrl);
                    }
                    sb = sb2.toString();
                    tL_message4.message = sb;
                }
                int indexOf3 = sb.indexOf("😎");
                if (indexOf3 >= 0) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                    tL_messageEntityCustomEmoji2.offset = indexOf3;
                    tL_messageEntityCustomEmoji2.length = 2;
                    tL_messageEntityCustomEmoji2.document_id = 5373141891321699086L;
                    tL_message4.entities.add(tL_messageEntityCustomEmoji2);
                }
                tL_message4.date = currentTimeMillis - 2640;
                tL_message4.dialog_id = 1L;
                tL_message4.flags = jn7.h4;
                TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
                tL_message4.from_id = tL_peerUser7;
                tL_peerUser7.user_id = yac.h(yac.t0).e();
                tL_message4.id = 1;
                tL_message4.media = new TLRPC.TL_messageMediaEmpty();
                tL_message4.out = true;
                TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
                tL_message4.peer_id = tL_peerUser8;
                tL_peerUser8.user_id = 0L;
                r47 r47Var5 = new r47(yac.t0, tL_message4, true, false);
                r47Var5.S1 = false;
                r47Var5.e1 = 5;
                r47Var5.f1 = 0L;
                r47Var5.T = 1L;
                TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
                if (i6 == 0) {
                    tL_message5.message = ob6.M0(2131750568, null);
                } else {
                    tL_message5.message = ob6.M0(2131748011, null);
                }
                tL_message5.date = i8;
                tL_message5.dialog_id = 1L;
                tL_message5.flags = jn7.n4;
                tL_message5.from_id = new TLRPC.TL_peerUser();
                tL_message5.id = 1;
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message5.reply_to = tL_messageReplyHeader2;
                tL_messageReplyHeader2.flags |= 16;
                tL_messageReplyHeader2.reply_to_msg_id = 5;
                tL_message5.media = new TLRPC.TL_messageMediaEmpty();
                i3 = 0;
                tL_message5.out = false;
                TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
                tL_message5.peer_id = tL_peerUser9;
                tL_peerUser9.user_id = yac.h(yac.t0).e();
                r47 r47Var6 = new r47(yac.t0, tL_message5, true, false);
                if (i6 == 0) {
                    str = null;
                } else {
                    str = null;
                    r47Var6.D0 = ob6.M0(2131748009, null);
                }
                r47Var6.T = 1L;
                r47Var6.S1 = false;
                r47Var6.C = r47Var4;
                i4 = 4;
                if (i6 == 4) {
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    String M03 = ob6.M0(2131749149, str);
                    tL_user.first_name = M03;
                    r47Var6.G = M03;
                    r47Var6.m2 = new rb0(0, tL_user);
                }
                r47Var = r47Var5;
                r47Var2 = r47Var6;
                i5 = i3;
                while (true) {
                    wb2VarArr = this.n;
                    if (i5 < wb2VarArr.length) {
                        return;
                    }
                    int i9 = i4;
                    int i10 = i6;
                    wb2VarArr[i5] = new rqb(this, context, i7, vnbVar2, context, i10);
                    byte b2 = b;
                    this.n[i5].setDelegate(new k09(this, b2));
                    wb2 wb2Var = this.n[i5];
                    wb2Var.f6 = (i10 == 2 || i10 == i9) ? 1 : i3;
                    wb2Var.setFullyDraw(true);
                    r47 r47Var7 = i5 == 0 ? r47Var2 : r47Var;
                    if (r47Var7 != null) {
                        this.n[i5].z3(r47Var7, null, false, false, false, false);
                        addView(this.n[i5], tre.o(-1, -2));
                    }
                    i5++;
                    b = b2;
                    i4 = i9;
                    vnbVar2 = vnbVar;
                    i6 = i10;
                }
            }
        }
        i4 = i2;
        i3 = 0;
        i5 = i3;
        while (true) {
            wb2VarArr = this.n;
            if (i5 < wb2VarArr.length) {
            }
            i5++;
            b = b2;
            i4 = i9;
            vnbVar2 = vnbVar;
            i6 = i10;
        }
    }

    private Drawable getCompactBackground() {
        int w0 = aob.w0(null, aob.ua, false);
        ColorDrawable colorDrawable = this.e;
        if (colorDrawable == null || colorDrawable.getColor() != w0) {
            this.e = new ColorDrawable(w0);
        }
        return this.e;
    }

    public final boolean a() {
        int i = this.w;
        return i == 3 || i == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public wb2[] getCells() {
        return this.n;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            wb2[] wb2VarArr = this.n;
            if (i >= wb2VarArr.length) {
                return;
            }
            wb2VarArr[i].invalidate();
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.F;
        if (drawable instanceof g82) {
            ((g82) drawable).f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xd0 xd0Var = this.a;
        if (xd0Var != null) {
            xd0Var.dispose();
            this.a = null;
        }
        xd0 xd0Var2 = this.b;
        if (xd0Var2 != null) {
            xd0Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof g82) {
            ((g82) drawable).g(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.F;
        if (drawable == null) {
            drawable = aob.s0();
        }
        if (aob.d != null) {
            invalidate();
        }
        boolean z = this.F == null && xea.D0;
        if (z) {
            drawable = getCompactBackground();
        }
        if (this.f != z) {
            this.f = z;
            this.h = this.c != null;
        }
        Drawable drawable2 = this.c;
        mm mmVar = this.H;
        if (drawable != drawable2 && drawable != null) {
            if (aob.f1() || this.G || this.h) {
                this.d = this.c;
                this.b = this.a;
            } else {
                xd0 xd0Var = this.a;
                if (xd0Var != null) {
                    xd0Var.dispose();
                    this.a = null;
                }
            }
            this.c = drawable;
            mmVar.e(true, 0.0f);
        }
        boolean z2 = this.G;
        wk5 wk5Var = this.s;
        float e = (z2 || this.h) ? mmVar.e(false, 1.0f) : wk5Var.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable3 = i == 0 ? this.d : this.c;
            if (drawable3 != null) {
                int i2 = (i != 1 || this.d == null || (wk5Var == null && !this.G)) ? jn7.d4 : (int) (255.0f * e);
                if (i2 > 0) {
                    drawable3.setAlpha(i2);
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof hh7)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof yd0) {
                            this.a = ((yd0) drawable3).b(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / hl.p;
                            canvas.scale(f, f);
                            drawable3.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable3.getIntrinsicWidth(), measuredHeight / drawable3.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable3.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable3.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i3 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable3.setBounds(measuredWidth, i3, ceil + measuredWidth, ceil2 + i3);
                        }
                        drawable3.draw(canvas);
                        canvas.restore();
                    } else {
                        c8b.j(canvas, drawable3, getWidth(), getHeight());
                    }
                    if (i == 0 && this.d != null && e >= 1.0f) {
                        xd0 xd0Var2 = this.b;
                        if (xd0Var2 != null) {
                            xd0Var2.dispose();
                            this.b = null;
                        }
                        this.d = null;
                        this.h = false;
                        invalidate();
                    }
                }
            }
            i++;
        }
        if ((getParent() instanceof d79) && ((d79) getParent()).d1()) {
            return;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable4 = this.r;
        drawable4.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable4.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w == 2 || a()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setOverrideBackground(Drawable drawable) {
        this.F = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        if ((this.F instanceof g82) && isAttachedToWindow()) {
            ((g82) this.F).f(this);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || drawable == this.d || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
    }

    public sqb(Context context, wk5 wk5Var, int i) {
        this(context, wk5Var, i, 0L, null);
    }
}
