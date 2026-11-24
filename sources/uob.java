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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class uob extends LinearLayout {
    public final zcb E;
    public Drawable F;
    public boolean G;
    public final ln H;
    public ve0 a;
    public ve0 b;
    public Drawable c;
    public Drawable d;
    public ColorDrawable e;
    public boolean f;
    public boolean h;
    public final rc2[] n;
    public final Drawable r;
    public final tk5 s;
    public final int w;
    public d x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0480 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uob(Context context, tk5 tk5Var, int i, long j, ylb ylbVar) {
        super(context);
        String M0;
        String sb;
        int i2;
        String str;
        k47 k47Var;
        k47 k47Var2;
        int i3;
        rc2[] rc2VarArr;
        Context context2 = context;
        int i4 = i;
        this.n = new rc2[2];
        this.y = -1;
        this.E = new zcb(this, (byte) 13);
        this.H = new ln(this, 0L, 350L, d53.h);
        this.w = i4;
        int i5 = z8c.t0;
        this.s = tk5Var;
        setWillNotDraw(false);
        setOrientation(1);
        setPadding(0, gm.L(11.0f), 0, gm.L(11.0f));
        ylb ylbVar2 = ylbVar;
        this.r = cmb.V0(context2, R.drawable.greydivider_bottom, cmb.v0(cmb.a7, ylbVar2));
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i4 == 3) {
            boolean z = j < 0;
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = jb6.M0(z ? 2131752379 : 2131743438, null);
            TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
            tL_message.reply_to = tL_messageReplyHeader;
            tL_messageReplyHeader.flags |= 1;
            if (j == 0) {
                tL_messageReplyHeader.reply_to_peer_id = new TLRPC.TL_peerUser();
                tL_message.reply_to.reply_to_peer_id.user_id = z8c.h(z8c.t0).e();
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
                tL_message.replyMessage.from_id.user_id = z8c.h(z8c.t0).e();
                tL_message.replyMessage.peer_id = new TLRPC.TL_peerUser();
                tL_message.replyMessage.peer_id.user_id = z8c.h(z8c.t0).e();
            } else {
                message2.from_id = new TLRPC.TL_peerChannel();
                TLRPC.Message message3 = tL_message.replyMessage;
                long j2 = -j;
                message3.from_id.channel_id = j2;
                message3.peer_id = new TLRPC.TL_peerChannel();
                tL_message.replyMessage.peer_id.channel_id = j2;
            }
            tL_message.replyMessage.message = jb6.M0(z ? 2131752376 : 2131743435, null);
            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
            tL_message.media = tL_messageMediaWebPage;
            tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
            TLRPC.WebPage webPage = tL_message.media.webpage;
            webPage.embed_url = "https://telegram.org/";
            webPage.flags |= 2;
            webPage.site_name = jb6.M0(R.string.AppName, null);
            TLRPC.WebPage webPage2 = tL_message.media.webpage;
            webPage2.flags |= 4;
            webPage2.title = jb6.M0(z ? 2131752377 : 2131743436, null);
            TLRPC.WebPage webPage3 = tL_message.media.webpage;
            webPage3.flags |= 8;
            webPage3.description = jb6.M0(z ? 2131752378 : 2131743437, null);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = nm7.h4;
            if (j == 0) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                tL_peerUser.user_id = z8c.h(z8c.t0).e();
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
            k47 k47Var3 = new k47(z8c.t0, tL_message, true, false);
            k47Var3.w1 = true;
            k47Var3.l2 = true;
            k47Var3.S1 = false;
            k47Var3.T = 1L;
            k47Var2 = k47Var3;
        } else if (i4 == 2) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            tL_message2.message = jb6.M0(2131751290, null);
            tL_message2.date = currentTimeMillis - 3540;
            tL_message2.dialog_id = 1L;
            tL_message2.flags = nm7.h4;
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_message2.from_id = tL_peerUser3;
            tL_peerUser3.user_id = z8c.h(z8c.t0).e();
            tL_message2.id = 1;
            tL_message2.media = new TLRPC.TL_messageMediaEmpty();
            tL_message2.out = false;
            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
            tL_message2.peer_id = tL_peerUser4;
            tL_peerUser4.user_id = 0L;
            k47Var2 = new k47(z8c.t0, tL_message2, true, false);
            k47Var2.S1 = false;
            k47Var2.T = 1L;
            k47Var2.G = jb6.M0(2131751288, null);
            k47Var2.m2 = context2.getDrawable(R.drawable.dino_pic);
            k47Var2.e1 = 5;
            k47Var2.f1 = 0L;
        } else {
            TLRPC.TL_message tL_message3 = new TLRPC.TL_message();
            if (i4 == 0) {
                M0 = jb6.M0(2131750537, null);
                tL_message3.message = M0;
            } else {
                M0 = jb6.M0(2131748011, null);
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
            int i6 = currentTimeMillis - 3540;
            tL_message3.date = i6;
            tL_message3.dialog_id = 1L;
            tL_message3.flags = nm7.h4;
            TLRPC.TL_peerUser tL_peerUser5 = new TLRPC.TL_peerUser();
            tL_message3.from_id = tL_peerUser5;
            tL_peerUser5.user_id = z8c.h(z8c.t0).e();
            tL_message3.id = 1;
            tL_message3.media = new TLRPC.TL_messageMediaEmpty();
            tL_message3.out = true;
            TLRPC.TL_peerUser tL_peerUser6 = new TLRPC.TL_peerUser();
            tL_message3.peer_id = tL_peerUser6;
            tL_peerUser6.user_id = 0L;
            k47 k47Var4 = new k47(z8c.t0, tL_message3, true, false);
            TLRPC.TL_message tL_message4 = new TLRPC.TL_message();
            if (i4 == 0) {
                sb = jb6.M0(2131750539, null);
                tL_message4.message = sb;
            } else {
                String M02 = jb6.M0(2131748013, null);
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
            tL_message4.flags = nm7.h4;
            TLRPC.TL_peerUser tL_peerUser7 = new TLRPC.TL_peerUser();
            tL_message4.from_id = tL_peerUser7;
            tL_peerUser7.user_id = z8c.h(z8c.t0).e();
            tL_message4.id = 1;
            tL_message4.media = new TLRPC.TL_messageMediaEmpty();
            tL_message4.out = true;
            TLRPC.TL_peerUser tL_peerUser8 = new TLRPC.TL_peerUser();
            tL_message4.peer_id = tL_peerUser8;
            tL_peerUser8.user_id = 0L;
            k47 k47Var5 = new k47(z8c.t0, tL_message4, true, false);
            k47Var5.S1 = false;
            k47Var5.e1 = 5;
            k47Var5.f1 = 0L;
            k47Var5.T = 1L;
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            if (i4 == 0) {
                tL_message5.message = jb6.M0(2131750540, null);
            } else {
                tL_message5.message = jb6.M0(2131748014, null);
            }
            tL_message5.date = i6;
            tL_message5.dialog_id = 1L;
            tL_message5.flags = nm7.n4;
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
            tL_peerUser9.user_id = z8c.h(z8c.t0).e();
            k47 k47Var6 = new k47(z8c.t0, tL_message5, true, false);
            if (i4 == 0) {
                str = null;
            } else {
                str = null;
                k47Var6.D0 = jb6.M0(2131748012, null);
            }
            k47Var6.T = 1L;
            k47Var6.S1 = false;
            k47Var6.C = k47Var4;
            if (i4 == 4) {
                TLRPC.TL_user tL_user = new TLRPC.TL_user();
                String M03 = jb6.M0(2131749152, str);
                tL_user.first_name = M03;
                k47Var6.G = M03;
                k47Var6.m2 = new pc0(0, tL_user);
            }
            k47Var = k47Var6;
            k47Var2 = k47Var5;
            i3 = i2;
            while (true) {
                rc2VarArr = this.n;
                if (i3 < rc2VarArr.length) {
                    return;
                }
                int i7 = i4;
                rc2VarArr[i3] = new tob(this, context2, i5, ylbVar2, context, i7);
                this.n[i3].setDelegate(new oo8(this, (byte) 19));
                rc2 rc2Var = this.n[i3];
                rc2Var.f6 = (i7 == 2 || i7 == 4) ? 1 : i2;
                rc2Var.setFullyDraw(true);
                k47 k47Var7 = i3 == 0 ? k47Var : k47Var2;
                if (k47Var7 != null) {
                    this.n[i3].z3(k47Var7, null, false, false, false, false);
                    addView(this.n[i3], qoe.o(-1, -2));
                }
                i3++;
                context2 = context;
                ylbVar2 = ylbVar;
                i4 = i7;
            }
        }
        k47Var = null;
        i2 = 0;
        i3 = i2;
        while (true) {
            rc2VarArr = this.n;
            if (i3 < rc2VarArr.length) {
            }
            i3++;
            context2 = context;
            ylbVar2 = ylbVar;
            i4 = i7;
        }
    }

    private Drawable getCompactBackground() {
        int w0 = cmb.w0(null, cmb.ta, false);
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

    public rc2[] getCells() {
        return this.n;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        int i = 0;
        while (true) {
            rc2[] rc2VarArr = this.n;
            if (i >= rc2VarArr.length) {
                return;
            }
            rc2VarArr[i].invalidate();
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.F;
        if (drawable instanceof a92) {
            ((a92) drawable).f(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ve0 ve0Var = this.a;
        if (ve0Var != null) {
            ve0Var.dispose();
            this.a = null;
        }
        ve0 ve0Var2 = this.b;
        if (ve0Var2 != null) {
            ve0Var2.dispose();
            this.b = null;
        }
        Drawable drawable = this.F;
        if (drawable instanceof a92) {
            ((a92) drawable).g(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.F;
        if (drawable == null) {
            drawable = cmb.s0();
        }
        if (cmb.d != null) {
            invalidate();
        }
        boolean z = this.F == null && gda.D0;
        if (z) {
            drawable = getCompactBackground();
        }
        if (this.f != z) {
            this.f = z;
            this.h = this.c != null;
        }
        Drawable drawable2 = this.c;
        ln lnVar = this.H;
        if (drawable != drawable2 && drawable != null) {
            if (cmb.f1() || this.G || this.h) {
                this.d = this.c;
                this.b = this.a;
            } else {
                ve0 ve0Var = this.a;
                if (ve0Var != null) {
                    ve0Var.dispose();
                    this.a = null;
                }
            }
            this.c = drawable;
            lnVar.e(true, 0.0f);
        }
        boolean z2 = this.G;
        tk5 tk5Var = this.s;
        float e = (z2 || this.h) ? lnVar.e(false, 1.0f) : tk5Var.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable3 = i == 0 ? this.d : this.c;
            if (drawable3 != null) {
                int i2 = (i != 1 || this.d == null || (tk5Var == null && !this.G)) ? nm7.d4 : (int) (255.0f * e);
                if (i2 > 0) {
                    drawable3.setAlpha(i2);
                    if ((drawable3 instanceof ColorDrawable) || (drawable3 instanceof GradientDrawable) || (drawable3 instanceof ah7)) {
                        drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        if (drawable3 instanceof we0) {
                            this.a = ((we0) drawable3).b(canvas, this);
                        } else {
                            drawable3.draw(canvas);
                        }
                    } else if (drawable3 instanceof BitmapDrawable) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable3;
                        bitmapDrawable.setFilterBitmap(true);
                        if (bitmapDrawable.getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f = 2.0f / gm.p;
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
                        g6b.j(canvas, drawable3, getWidth(), getHeight());
                    }
                    if (i == 0 && this.d != null && e >= 1.0f) {
                        ve0 ve0Var2 = this.b;
                        if (ve0Var2 != null) {
                            ve0Var2.dispose();
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
        if ((getParent() instanceof r59) && ((r59) getParent()).c1()) {
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
        if ((this.F instanceof a92) && isAttachedToWindow()) {
            ((a92) this.F).f(this);
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

    public uob(Context context, tk5 tk5Var, int i) {
        this(context, tk5Var, i, 0L, null);
    }
}
