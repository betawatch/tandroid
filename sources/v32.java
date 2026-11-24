// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v32 extends FrameLayout {
    public final bf0 a;
    public final dg0 b;
    public final lka c;
    public final jh2 d;
    public final pc0 e;
    public TLRPC.User f;
    public int h;
    public CharSequence n;
    public CharSequence r;
    public TLRPC.User s;
    public String w;
    public boolean x;

    public v32(Context context, ylb ylbVar) {
        super(context);
        this.e = new pc0(ylbVar);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(23.0f));
        boolean z = jb6.a0;
        addView(bf0Var, qoe.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 14.0f, 9.0f, z ? 14.0f : 0.0f, 0.0f));
        dg0 dg0Var = new dg0(context, (byte) 1);
        this.b = dg0Var;
        nm7.i(dg0Var);
        anb.W(dg0Var, cmb.i5, ylbVar);
        dg0Var.setTypeface(gm.o());
        dg0Var.setTextSize(16);
        dg0Var.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z2 = jb6.a0;
        addView(dg0Var, qoe.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 28.0f : 72.0f, 12.0f, z2 ? 72.0f : 28.0f, 0.0f));
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        lkaVar.setTextSize(13);
        anb.W(lkaVar, cmb.p5, ylbVar);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
        boolean z3 = jb6.a0;
        addView(lkaVar, qoe.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 28.0f : 72.0f, 36.0f, z3 ? 72.0f : 28.0f, 0.0f));
        jh2 jh2Var = new jh2(21, ylbVar, context);
        this.d = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        boolean z4 = jb6.a0;
        addView(jh2Var, qoe.d(24, 24.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 44.0f, 37.0f, z4 ? 44.0f : 0.0f, 0.0f));
    }

    public final void a(TLRPC.User user, CharSequence charSequence, u32 u32Var, boolean z) {
        bf0 bf0Var = this.a;
        dg0 dg0Var = this.b;
        if (user == null && charSequence == null) {
            this.r = null;
            this.n = null;
            dg0Var.l("", false);
            this.c.l("", false);
            bf0Var.setImageDrawable(null);
        } else {
            this.r = null;
            this.n = charSequence;
            this.f = user;
            this.x = z;
            setWillNotDraw(!z);
            pc0 pc0Var = this.e;
            TLRPC.User user2 = this.f;
            if (user2 != null) {
                pc0Var.q(user2);
                TLRPC.UserStatus userStatus = this.f.status;
            } else {
                CharSequence charSequence2 = this.n;
                long j = this.h;
                if (charSequence2 != null) {
                    pc0Var.j(j, charSequence2.toString(), null, null);
                } else {
                    pc0Var.j(j, "#", null, null);
                }
            }
            CharSequence charSequence3 = this.n;
            if (charSequence3 != null) {
                dg0Var.l(charSequence3, false);
            } else {
                TLRPC.User user3 = this.f;
                dg0Var.l(user3 != null ? m9c.r(user3) : "", false);
            }
            setStatus(this.r);
            TLRPC.User user4 = this.f;
            if (user4 != null) {
                bf0Var.f(user4, pc0Var);
            } else {
                bf0Var.setImageDrawable(pc0Var);
            }
        }
        Utilities.e.c(new lx1(this, u32Var, (byte) 13));
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(70.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.x ? 1 : 0), TLObject.FLAG_30));
    }

    public void setCurrentId(int i) {
        this.h = i;
    }

    public void setStatus(CharSequence charSequence) {
        String str;
        this.r = charSequence;
        if (charSequence != null) {
            this.c.l(charSequence, false);
            return;
        }
        TLRPC.User user = this.f;
        if (user != null) {
            if (TextUtils.isEmpty(user.phone)) {
                this.c.l(jb6.M0(2131747565, null), false);
            } else if (this.s != this.f && (str = this.w) != null) {
                this.c.l(str, false);
            } else {
                this.c.l("", false);
                Utilities.e.c(new t32(this, (byte) 0));
            }
        }
    }
}
