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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u6c extends FrameLayout implements tjb {
    public final wjb a;
    public final be0 b;
    public final df0 c;
    public final jia d;
    public final ImageView e;
    public final pb0 f;
    public String h;
    public int n;
    public final int r;
    public int s;
    public int w;
    public final boolean x;

    public u6c(Context context, wjb wjbVar) {
        super(context);
        this.r = y6c.t0;
        this.x = true;
        this.a = wjbVar;
        this.s = bkb.v0(bkb.x6, wjbVar);
        this.w = bkb.v0(bkb.m6, wjbVar);
        this.f = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z = k96.a0;
        addView(be0Var, nme.d(48, 48.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 11.0f, z ? 11.0f : 0.0f, 0.0f));
        df0 df0Var = new df0(context, (byte) 5);
        this.c = df0Var;
        kk7.i(df0Var);
        zkb.W(df0Var, bkb.F6, wjbVar);
        df0Var.setTextSize(17);
        df0Var.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z2 = k96.a0;
        addView(df0Var, nme.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 14.5f, z2 ? 72.0f : 28.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        jiaVar.setTextSize(14);
        jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
        boolean z3 = k96.a0;
        addView(jiaVar, nme.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 37.5f, z3 ? 72.0f : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, wjbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z4 = k96.a0;
        addView(imageView, nme.d(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 16.0f, 0.0f, z4 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        be0 be0Var = this.b;
        jia jiaVar = this.d;
        df0 df0Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            df0Var.k("");
            jiaVar.l("", false);
            be0Var.setImageDrawable(null);
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
        pb0 pb0Var = this.f;
        if (user != null) {
            pb0Var.q(user);
        } else if (chat != null) {
            pb0Var.p(chat);
        } else {
            pb0Var.j(this.n, "#", null, null);
        }
        df0Var.k(user != null ? l7c.r(user) : chat.title);
        if (this.h != null) {
            jiaVar.setTextColor(this.s);
            jiaVar.l(this.h, false);
            if (be0Var != null) {
                be0Var.f(user, pb0Var);
            }
        } else if (user != null) {
            if (user.bot) {
                jiaVar.setTextColor(this.s);
                if (user.bot_chat_history) {
                    jiaVar.l(k96.M0(2131752934, null), false);
                } else {
                    jiaVar.l(k96.M0(2131752935, null), false);
                }
            } else {
                long j = user.id;
                int i = this.r;
                if (j == y6c.h(i).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || na7.q1(i).a0.containsKey(Long.valueOf(user.id)))) {
                    jiaVar.setTextColor(this.w);
                    jiaVar.l(k96.M0(2131747633, null), false);
                } else {
                    jiaVar.setTextColor(this.s);
                    jiaVar.l(k96.d0(i, user, null, null), false);
                }
            }
            be0Var.f(user, pb0Var);
        } else if (chat != null) {
            jiaVar.setTextColor(this.s);
            if (!hc2.T(chat) || chat.megagroup) {
                int i2 = chat.participants_count;
                if (i2 != 0) {
                    jiaVar.l(k96.G(i2, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    jiaVar.l(k96.M0(2131748450, null), false);
                } else if (hc2.t0(chat)) {
                    jiaVar.l(k96.M0(2131748446, null), false);
                } else {
                    jiaVar.l(k96.M0(2131748449, null), false);
                }
            } else {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    jiaVar.l(k96.G(i3, "Subscribers", new Object[0]), false);
                } else if (hc2.t0(chat)) {
                    jiaVar.l(k96.M0(2131752306, null), false);
                } else {
                    jiaVar.l(k96.M0(2131752317, null), false);
                }
            }
            be0Var.f(chat, pb0Var);
        } else {
            be0Var.setImageDrawable(pb0Var);
        }
        be0Var.setRoundRadius(gl.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i) {
        this.n = i;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override // tjb
    public final void updateColors() {
        int i;
        int i2;
        try {
            int i3 = this.s;
            int i4 = this.w;
            wjb wjbVar = this.a;
            if (this.x) {
                this.s = bkb.v0(bkb.x6, wjbVar);
                this.w = bkb.v0(bkb.m6, wjbVar);
            }
            jia jiaVar = this.d;
            if (jiaVar != null) {
                int textColor = jiaVar.getTextColor();
                if (textColor == i4 && i4 != (i2 = this.w)) {
                    jiaVar.setTextColor(i2);
                } else {
                    if (textColor != i3 || i3 == (i = this.s)) {
                        return;
                    }
                    jiaVar.setTextColor(i);
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z) {
    }
}
