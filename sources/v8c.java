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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v8c extends FrameLayout implements vlb {
    public final ylb a;
    public final bf0 b;
    public final dg0 c;
    public final lka d;
    public final ImageView e;
    public final pc0 f;
    public String h;
    public int n;
    public final int r;
    public int s;
    public int w;
    public final boolean x;

    public v8c(Context context, ylb ylbVar) {
        super(context);
        this.r = z8c.t0;
        this.x = true;
        this.a = ylbVar;
        this.s = cmb.v0(cmb.x6, ylbVar);
        this.w = cmb.v0(cmb.m6, ylbVar);
        this.f = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(24.0f));
        boolean z = jb6.a0;
        addView(bf0Var, qoe.d(48, 48.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 11.0f, z ? 11.0f : 0.0f, 0.0f));
        dg0 dg0Var = new dg0(context, (byte) 5);
        this.c = dg0Var;
        nm7.i(dg0Var);
        anb.W(dg0Var, cmb.F6, ylbVar);
        dg0Var.setTextSize(17);
        dg0Var.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z2 = jb6.a0;
        addView(dg0Var, qoe.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 14.5f, z2 ? 72.0f : 28.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.d = lkaVar;
        lkaVar.setTextSize(14);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z3 = jb6.a0;
        addView(lkaVar, qoe.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 37.5f, z3 ? 72.0f : 28.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        boolean z4 = jb6.a0;
        addView(imageView, qoe.d(-2, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 0.0f : 16.0f, 0.0f, z4 ? 16.0f : 0.0f, 0.0f));
    }

    public final void a(String str, TLObject tLObject) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.UserStatus userStatus;
        bf0 bf0Var = this.b;
        lka lkaVar = this.d;
        dg0 dg0Var = this.c;
        if (tLObject == null && str == null) {
            this.h = null;
            dg0Var.k("");
            lkaVar.l("", false);
            bf0Var.setImageDrawable(null);
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
        pc0 pc0Var = this.f;
        if (user != null) {
            pc0Var.q(user);
        } else if (chat != null) {
            pc0Var.p(chat);
        } else {
            pc0Var.j(this.n, "#", null, null);
        }
        dg0Var.k(user != null ? m9c.r(user) : chat.title);
        if (this.h != null) {
            lkaVar.setTextColor(this.s);
            lkaVar.l(this.h, false);
            if (bf0Var != null) {
                bf0Var.f(user, pc0Var);
            }
        } else if (user != null) {
            if (user.bot) {
                lkaVar.setTextColor(this.s);
                if (user.bot_chat_history) {
                    lkaVar.l(jb6.M0(2131752899, null), false);
                } else {
                    lkaVar.l(jb6.M0(2131752900, null), false);
                }
            } else {
                long j = user.id;
                int i = this.r;
                if (j == z8c.h(i).e() || (((userStatus = user.status) != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || oc7.r1(i).a0.containsKey(Long.valueOf(user.id)))) {
                    lkaVar.setTextColor(this.w);
                    lkaVar.l(jb6.M0(2131747559, null), false);
                } else {
                    lkaVar.setTextColor(this.s);
                    lkaVar.l(jb6.d0(i, user, null, null), false);
                }
            }
            bf0Var.f(user, pc0Var);
        } else if (chat != null) {
            lkaVar.setTextColor(this.s);
            if (!sd2.T(chat) || chat.megagroup) {
                int i2 = chat.participants_count;
                if (i2 != 0) {
                    lkaVar.l(jb6.G(i2, "Members", new Object[0]), false);
                } else if (chat.has_geo) {
                    lkaVar.l(jb6.M0(2131748399, null), false);
                } else if (sd2.t0(chat)) {
                    lkaVar.l(jb6.M0(2131748395, null), false);
                } else {
                    lkaVar.l(jb6.M0(2131748398, null), false);
                }
            } else {
                int i3 = chat.participants_count;
                if (i3 != 0) {
                    lkaVar.l(jb6.G(i3, "Subscribers", new Object[0]), false);
                } else if (sd2.t0(chat)) {
                    lkaVar.l(jb6.M0(2131752260, null), false);
                } else {
                    lkaVar.l(jb6.M0(2131752271, null), false);
                }
            }
            bf0Var.f(chat, pc0Var);
        } else {
            bf0Var.setImageDrawable(pc0Var);
        }
        bf0Var.setRoundRadius(gm.L((chat == null || !chat.forum) ? 24.0f : 14.0f));
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(70.0f), TLObject.FLAG_30));
    }

    public void setCurrentId(int i) {
        this.n = i;
    }

    public void setNameTypeface(Typeface typeface) {
        this.c.setTypeface(typeface);
    }

    @Override // vlb
    public final void updateColors() {
        int i;
        int i2;
        try {
            int i3 = this.s;
            int i4 = this.w;
            ylb ylbVar = this.a;
            if (this.x) {
                this.s = cmb.v0(cmb.x6, ylbVar);
                this.w = cmb.v0(cmb.m6, ylbVar);
            }
            lka lkaVar = this.d;
            if (lkaVar != null) {
                int textColor = lkaVar.getTextColor();
                if (textColor == i4 && i4 != (i2 = this.w)) {
                    lkaVar.setTextColor(i2);
                } else {
                    if (textColor != i3 || i3 == (i = this.s)) {
                        return;
                    }
                    lkaVar.setTextColor(i);
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckDisabled(boolean z) {
    }
}
