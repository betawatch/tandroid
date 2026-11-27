// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class uac extends FrameLayout implements snb {
    public final vnb a;
    public final de0 b;
    public final ff0 c;
    public final ema d;
    public final ImageView e;
    public final rb0 f;
    public String h;
    public int n;
    public final int r;
    public int s;
    public int w;
    public final boolean x;

    public uac(Context context, vnb vnbVar) {
        super(context);
        this.r = yac.t0;
        this.x = true;
        this.a = vnbVar;
        this.s = aob.v0(aob.y6, vnbVar);
        this.w = aob.v0(aob.n6, vnbVar);
        this.f = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
        boolean z = ob6.a0;
        addView(de0Var, tre.d(48, 48.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 11.0f, z ? 11.0f : 0.0f, 0.0f));
        ff0 ff0Var = new ff0(context, (byte) 5);
        this.c = ff0Var;
        jn7.i(ff0Var);
        yob.W(ff0Var, aob.G6, vnbVar);
        ff0Var.setTextSize(17);
        ff0Var.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z2 = ob6.a0;
        addView(ff0Var, tre.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 14.5f, z2 ? 72.0f : 28.0f, 0.0f));
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTextSize(14);
        emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z3 = ob6.a0;
        addView(emaVar, tre.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 37.5f, z3 ? 72.0f : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z4 = ob6.a0;
        addView(imageView, tre.d(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 16.0f, 0.0f, z4 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        de0 de0Var = this.b;
        ema emaVar = this.d;
        ff0 ff0Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            ff0Var.k("");
            emaVar.l("", false);
            de0Var.setImageDrawable(null);
            return;
        }
        this.h = str;
        if (tLObject instanceof TLRPC.User) {
            user = (TLRPC.User) tLObject;
            chat = null;
        } else if (tLObject instanceof TLRPC.Chat) {
            chat = (TLRPC.Chat) tLObject;
            user = null;
        } else {
            chat = null;
            user = null;
        }
        rb0 rb0Var = this.f;
        if (user != null) {
            rb0Var.q(user);
        } else if (chat != null) {
            rb0Var.p(chat);
        } else {
            rb0Var.j(this.n, "#", null, null);
        }
        ff0Var.k(user != null ? lbc.r(user) : chat.title);
        if (this.h != null) {
            emaVar.setTextColor(this.s);
            emaVar.l(this.h, false);
            if (de0Var != null) {
                de0Var.f(user, rb0Var);
            }
        } else if (user != null) {
            if (user.bot) {
                emaVar.setTextColor(this.s);
                if (user.bot_chat_history) {
                    emaVar.l(ob6.M0(2131752927, null), false);
                } else {
                    emaVar.l(ob6.M0(2131752928, null), false);
                }
            } else {
                long j = user.id;
                int i = this.r;
                if (j == yac.h(i).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || uc7.s1(i).a0.containsKey(Long.valueOf(user.id)))) {
                    emaVar.setTextColor(this.w);
                    emaVar.l(ob6.M0(2131747553, null), false);
                } else {
                    emaVar.setTextColor(this.s);
                    emaVar.l(ob6.d0(i, user, null, null), false);
                }
            }
            de0Var.f(user, rb0Var);
        } else if (chat != null) {
            emaVar.setTextColor(this.s);
            if (!xc2.T(chat) || chat.megagroup) {
                int i2 = chat.participants_count;
                if (i2 != 0) {
                    emaVar.l(ob6.G(i2, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    emaVar.l(ob6.M0(2131748396, null), false);
                } else if (xc2.t0(chat)) {
                    emaVar.l(ob6.M0(2131748392, null), false);
                } else {
                    emaVar.l(ob6.M0(2131748395, null), false);
                }
            } else {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    emaVar.l(ob6.G(i3, "Subscribers", new Object[0]), false);
                } else if (xc2.t0(chat)) {
                    emaVar.l(ob6.M0(2131752288, null), false);
                } else {
                    emaVar.l(ob6.M0(2131752299, null), false);
                }
            }
            de0Var.f(chat, rb0Var);
        } else {
            de0Var.setImageDrawable(rb0Var);
        }
        de0Var.setRoundRadius(hl.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
        ImageView imageView = this.e;
        if (imageView.getVisibility() != 0) {
            imageView.getVisibility();
        } else {
            imageView.setVisibility(8);
            imageView.setImageResource(0);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i) {
        this.n = i;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override // snb
    public final void updateColors() {
        int i;
        int i2;
        try {
            int i3 = this.s;
            int i4 = this.w;
            vnb vnbVar = this.a;
            if (this.x) {
                this.s = aob.v0(aob.y6, vnbVar);
                this.w = aob.v0(aob.n6, vnbVar);
            }
            ema emaVar = this.d;
            if (emaVar != null) {
                int textColor = emaVar.getTextColor();
                if (textColor == i4 && i4 != (i2 = this.w)) {
                    emaVar.setTextColor(i2);
                } else {
                    if (textColor != i3 || i3 == (i = this.s)) {
                        return;
                    }
                    emaVar.setTextColor(i);
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z) {
    }
}
