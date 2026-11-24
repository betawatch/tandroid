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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class tmb extends LinearLayout {
    public final cib E;
    public Drawable F;
    public boolean G;
    public final lm H;
    public vd0 a;
    public vd0 b;
    public Drawable c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f;
    public boolean h;
    public final gb2[] n;
    public final Drawable r;
    public final ui5 s;
    public final int w;
    public d x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x047d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tmb(Context context, ui5 ui5Var, int i, long j, wjb wjbVar) {
        super(context);
        Context context2;
        String M0;
        String sb;
        int i2;
        int i3;
        k27 k27Var;
        int i4;
        gb2[] gb2VarArr;
        int i5 = i;
        this.n = new gb2[2];
        this.y = -1;
        this.E = new cib(this, (byte) 5);
        this.H = new lm(this, 0L, 350L, s33.h);
        this.w = i5;
        int i6 = y6c.t0;
        this.s = ui5Var;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, gl.L(11.0f), 0, gl.L(11.0f));
        wjb wjbVar2 = wjbVar;
        this.r = bkb.V0(context, R.drawable.greydivider_bottom, bkb.v0(bkb.a7, wjbVar2));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        byte b = 16;
        k27 k27Var2 = null;
        if (i5 == 3) {
            boolean z = j < 0;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = k96.M0(z ? 2131752421 : 2131743512, null);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = y6c.h(y6c.t0).e();
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
                tL_message.replyMessage.from_id.user_id = y6c.h(y6c.t0).e();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = y6c.h(y6c.t0).e();
            } else {
                message2.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message3 = tL_message.replyMessage;
                long j2 = -j;
                message3.from_id.channel_id = j2;
                message3.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j2;
            }
            tL_message.replyMessage.message = k96.M0(z ? 2131752418 : 2131743509, null);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = k96.M0(R.string.AppName, null);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = k96.M0(z ? 2131752419 : 2131743510, null);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = k96.M0(z ? 2131752420 : 2131743511, null);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = kk7.h4;
            if (j == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = y6c.h(y6c.t0).e();
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
            k27 k27Var3 = new k27(y6c.t0, tL_message, true, false);
            k27Var3.w1 = true;
            k27Var3.l2 = true;
            k27Var3.S1 = false;
            k27Var3.T = 1L;
            context2 = context;
            k27Var = k27Var3;
        } else if (i5 == 2) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = k96.M0(2131751341, null);
            tL_message2.date = currentTimeMillis - 3540;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = kk7.h4;
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_message2.from_id = tL_peerUser3;
            tL_peerUser3.user_id = y6c.h(y6c.t0).e();
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message2.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = 0L;
            k27 k27Var4 = new k27(y6c.t0, tL_message2, true, false);
            k27Var4.S1 = false;
            k27Var4.T = 1L;
            k27Var4.G = k96.M0(2131751339, null);
            context2 = context;
            k27Var4.m2 = context2.getDrawable(R.drawable.dino_pic);
            k27Var4.e1 = 5;
            k27Var4.f1 = 0L;
            k27Var = k27Var4;
        } else {
            context2 = context;
            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
            if (i5 == 0) {
                M0 = k96.M0(2131750588, null);
                tL_message3.message = M0;
            } else {
                M0 = k96.M0(2131748062, null);
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
            int i7 = currentTimeMillis - 3540;
            tL_message3.date = i7;
            tL_message3.dialog_id = 1L;
            tL_message3.flags = kk7.h4;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message3.from_id = tL_peerUser5;
            tL_peerUser5.user_id = y6c.h(y6c.t0).e();
            tL_message3.id = 1;
            tL_message3.media = new TLRPC.TL_messageMediaEmpty();
            tL_message3.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message3.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            k27 k27Var5 = new k27(y6c.t0, tL_message3, true, false);
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            if (i5 == 0) {
                sb = k96.M0(2131750590, null);
                tL_message4.message = sb;
            } else {
                String M02 = k96.M0(2131748064, null);
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
            tL_message4.flags = kk7.h4;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message4.from_id = tL_peerUser7;
            tL_peerUser7.user_id = y6c.h(y6c.t0).e();
            tL_message4.id = 1;
            tL_message4.media = new TLRPC.TL_messageMediaEmpty();
            tL_message4.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message4.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            k27 k27Var6 = new k27(y6c.t0, tL_message4, true, false);
            k27Var6.S1 = false;
            k27Var6.e1 = 5;
            k27Var6.f1 = 0L;
            k27Var6.T = 1L;
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (i5 == 0) {
                tL_message5.message = k96.M0(2131750591, null);
            } else {
                tL_message5.message = k96.M0(2131748065, null);
            }
            tL_message5.date = i7;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = kk7.n4;
            tL_message5.from_id = new TLRPC.TL_peerUser();
            tL_message5.id = 1;
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
            tL_message5.reply_to = tL_messageReplyHeader2;
            tL_messageReplyHeader2.flags |= 16;
            tL_messageReplyHeader2.reply_to_msg_id = 5;
            tL_message5.media = new TLRPC.TL_messageMediaEmpty();
            i2 = 0;
            tL_message5.out = false;
            TLRPC.TL_peerUser tL_peerUser9 = new TLRPC.TL_peerUser();
            tL_message5.peer_id = tL_peerUser9;
            tL_peerUser9.user_id = y6c.h(y6c.t0).e();
            k27 k27Var7 = new k27(y6c.t0, tL_message5, true, false);
            if (i5 != 0) {
                k27Var7.D0 = k96.M0(2131748063, null);
            }
            k27Var7.T = 1L;
            k27Var7.S1 = false;
            k27Var7.C = k27Var5;
            i3 = 4;
            if (i5 == 4) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                String M03 = k96.M0(2131749203, null);
                tL_user.first_name = M03;
                k27Var7.G = M03;
                k27Var7.m2 = new pb0(0, tL_user);
            }
            k27Var = k27Var6;
            k27Var2 = k27Var7;
            i4 = i2;
            while (true) {
                gb2VarArr = this.n;
                if (i4 < gb2VarArr.length) {
                    return;
                }
                int i8 = i3;
                int i9 = i5;
                byte b2 = b;
                gb2VarArr[i4] = new smb(this, context2, i6, wjbVar2, context, i9);
                this.n[i4].setDelegate(new v39(this, b2));
                gb2 gb2Var = this.n[i4];
                gb2Var.f6 = (i9 == 2 || i9 == i8) ? 1 : i2;
                gb2Var.setFullyDraw(true);
                k27 k27Var8 = i4 == 0 ? k27Var2 : k27Var;
                if (k27Var8 != null) {
                    this.n[i4].z3(k27Var8, null, false, false, false, false);
                    addView(this.n[i4], nme.o(-1, -2));
                }
                i4++;
                context2 = context;
                wjbVar2 = wjbVar;
                b = b2;
                i3 = i8;
                i5 = i9;
            }
        }
        i3 = 4;
        i2 = 0;
        i4 = i2;
        while (true) {
            gb2VarArr = this.n;
            if (i4 < gb2VarArr.length) {
            }
            i4++;
            context2 = context;
            wjbVar2 = wjbVar;
            b = b2;
            i3 = i8;
            i5 = i9;
        }
    }

    private Drawable getCompactBackground() {
        int w0 = bkb.w0(null, bkb.ta, false);
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

    public gb2[] getCells() {
        return this.n;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            gb2[] gb2VarArr = this.n;
            if (i >= gb2VarArr.length) {
                return;
            }
            gb2VarArr[i].invalidate();
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.F;
        if (drawable instanceof p72) {
            ((p72) drawable).f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vd0 vd0Var = this.a;
        if (vd0Var != null) {
            vd0Var.dispose();
            this.a = null;
        }
        vd0 vd0Var2 = this.b;
        if (vd0Var2 != null) {
            vd0Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof p72) {
            ((p72) drawable).g(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.F;
        if (drawable == null) {
            drawable = bkb.s0();
        }
        if (bkb.d != null) {
            invalidate();
        }
        boolean z = this.F == null && gba.D0;
        if (z) {
            drawable = getCompactBackground();
        }
        if (this.f != z) {
            this.f = z;
            this.h = this.c != null;
        }
        Drawable drawable2 = this.c;
        lm lmVar = this.H;
        if (drawable != drawable2 && drawable != null) {
            if (bkb.f1() || this.G || this.h) {
                this.d = this.c;
                this.b = this.a;
            } else {
                vd0 vd0Var = this.a;
                if (vd0Var != null) {
                    vd0Var.dispose();
                    this.a = null;
                }
            }
            this.c = drawable;
            lmVar.e(true, 0.0f);
        }
        boolean z2 = this.G;
        ui5 ui5Var = this.s;
        float e = (z2 || this.h) ? lmVar.e(false, 1.0f) : ui5Var.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable3 = i == 0 ? this.d : this.c;
            if (drawable3 != null) {
                int i2 = (i != 1 || this.d == null || (ui5Var == null && !this.G)) ? kk7.d4 : (int) (255.0f * e);
                if (i2 > 0) {
                    drawable3.setAlpha(i2);
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof ye7)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof wd0) {
                            this.a = ((wd0) drawable3).b(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / gl.p;
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
                        f4b.j(canvas, drawable3, getWidth(), getHeight());
                    }
                    if (i == 0 && this.d != null && e >= 1.0f) {
                        vd0 vd0Var2 = this.b;
                        if (vd0Var2 != null) {
                            vd0Var2.dispose();
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
        if ((getParent() instanceof o39) && ((o39) getParent()).c1()) {
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
        if ((this.F instanceof p72) && isAttachedToWindow()) {
            ((p72) this.F).f(this);
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

    public tmb(Context context, ui5 ui5Var, int i) {
        this(context, ui5Var, i, 0L, null);
    }
}
