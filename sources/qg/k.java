package qg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends og.d implements k6 {
    public final ImageView D;
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final pv0 K;
    public int L;
    public final boolean[] s;
    public final ep w;
    public final ImageView x;
    public boolean y;

    public k(Context context, boolean z10, boolean z11, p6 p6Var, boolean z12) {
        super(context, p6Var);
        this.s = new boolean[1];
        this.G = true;
        this.K = new pv0(this);
        this.d.setTypeface(i0.o());
        this.f.setVisibility(8);
        if (z11) {
            ep epVar = new ep(21, context, p6Var);
            this.w = epVar;
            epVar.b(t6.B5, t6.h5, t6.k7);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(3);
            boolean z13 = cd.X;
            addView(epVar, b6.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            ep epVar2 = new ep(21, context, p6Var);
            this.w = epVar2;
            if (z12) {
                epVar2.b(t6.i7, t6.j7, t6.C5);
            } else {
                epVar2.b(t6.B5, t6.j7, t6.C5);
            }
            epVar2.setDrawUnchecked(true);
            epVar2.setDrawBackgroundAsArc(10);
            addView(epVar2);
            epVar2.a(false, false);
            epVar2.setLayoutParams(b6.d(24, 24.0f, (cd.X ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.w = null;
        }
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i10 = t6.od;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        a7.t(imageView, i10, p6Var, mode);
        addView(imageView, b6.d(32, 32.0f, (cd.X ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.D = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i11 = t6.Ci;
        a7.t(imageView2, i11, p6Var, mode);
        boolean z14 = cd.X;
        addView(imageView2, b6.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        a7.t(imageView3, i11, p6Var, mode);
        addView(imageView3, b6.d(32, 32.0f, (cd.X ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j10) {
        long j11 = j10 / 3600000;
        long j12 = j10 % 3600000;
        long j13 = j12 / 60000;
        long j14 = (j12 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j11 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j11)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j14)));
        return sb2.toString();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.z9));
    }

    @Override // og.d
    public final boolean b() {
        ep epVar = this.w;
        return epVar != null && epVar.getDrawUnchecked();
    }

    @Override // og.d
    public final void c(boolean z10, boolean z11) {
        ep epVar = this.w;
        if (epVar != null && epVar.getVisibility() == 0) {
            epVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        Runnable runnable;
        if (this.G == z10) {
            return;
        }
        this.G = z10;
        float f7 = 0.0f;
        ImageView imageView = this.F;
        ImageView imageView2 = this.D;
        if (!z11) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z10 && this.y) ? 1.0f : 0.0f);
            imageView2.setVisibility((z10 && this.y) ? 0 : 8);
            imageView.animate().cancel();
            if (z10 && this.E) {
                f7 = 1.0f;
            }
            imageView.setAlpha(f7);
            imageView.setVisibility((z10 && this.E) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator alpha = imageView2.animate().alpha((z10 && this.y) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z10 && this.y) {
            runnable = null;
        } else {
            final int i10 = 0;
            runnable = new Runnable(this) { // from class: qg.i
                public final /* synthetic */ k b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.D.setVisibility(8);
                            break;
                        default:
                            this.b.F.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha.withEndAction(runnable).start();
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        if (z10 && this.E) {
            f7 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f7);
        if (!z10 || !this.E) {
            final int i11 = 1;
            runnable2 = new Runnable(this) { // from class: qg.i
                public final /* synthetic */ k b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.D.setVisibility(8);
                            break;
                        default:
                            this.b.F.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha2.withEndAction(runnable2).start();
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.J;
    }

    public TLRPC.Chat getChat() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.H;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        String L0;
        this.x.setVisibility(8);
        this.I = chat;
        this.H = null;
        r8 r8Var = this.b;
        r8Var.q(chat);
        int L = i0.L(w3.c0(chat) ? 12.0f : 20.0f);
        g9 g9Var = this.c;
        g9Var.setRoundRadius(L);
        g9Var.e(chat, r8Var);
        String str = chat.title;
        og.c cVar = this.d;
        cVar.k(str);
        cVar.i(null);
        if (i10 <= 0) {
            i10 = chat.participants_count;
        }
        boolean V = w3.V(chat);
        if (i10 >= 1) {
            L0 = cd.G(i10, V ? "Subscribers" : "Members", new Object[0]);
        } else {
            L0 = cd.L0(V ? 2131751391 : 2131754876, null);
        }
        setSubtitle(L0);
        a7.Y(this.e, t6.r5, this.a);
        i(false, i10 > 200 ? 0.3f : 1.0f);
    }

    public final void i(boolean z10, float f7) {
        ep epVar = this.w;
        if (epVar == null) {
            return;
        }
        if (!z10) {
            epVar.animate().cancel();
            epVar.setAlpha(f7);
        } else if (Math.abs(epVar.getAlpha() - f7) > 0.1d) {
            epVar.animate().cancel();
            epVar.animate().alpha(f7).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K.a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.x.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(-o5.o(tL_myBoost.peer)));
        this.I = L0;
        r8 r8Var = this.b;
        r8Var.q(L0);
        int L = i0.L(20.0f);
        g9 g9Var = this.c;
        g9Var.setRoundRadius(L);
        g9Var.e(this.I, r8Var);
        String str = this.I.title;
        og.c cVar = this.d;
        cVar.k(str);
        int i10 = t6.r5;
        p6 p6Var = this.a;
        u5 u5Var = this.e;
        a7.Y(u5Var, i10, p6Var);
        setSubtitle(cd.a0(null, null, 2131753661, cd.D0().n0().format(new Date(tL_myBoost.expires * 1000))));
        int i11 = tL_myBoost.cooldown_until_date;
        if (i11 <= 0) {
            cVar.setAlpha(1.0f);
            u5Var.setAlpha(1.0f);
            i(false, 1.0f);
        } else {
            setSubtitle(cd.a0(null, null, 2131753594, f((i11 * 1000) - System.currentTimeMillis())));
            cVar.setAlpha(0.65f);
            u5Var.setAlpha(0.65f);
            i(false, 0.3f);
        }
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.x;
        if (onClickListener == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setUser(TLRPC.User user) {
        this.x.setVisibility(8);
        this.H = user;
        this.I = null;
        r8 r8Var = this.b;
        r8Var.r(user);
        int L = i0.L(20.0f);
        g9 g9Var = this.c;
        g9Var.setRoundRadius(L);
        g9Var.e(user, r8Var);
        String p5 = h20.p(user);
        og.c cVar = this.d;
        cVar.k(p5);
        boolean[] zArr = this.s;
        zArr[0] = false;
        if (h20.t(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(cd.H(',', "BotUsers", i10));
            } else {
                setSubtitle(cd.L0(2131753156, null));
            }
        } else {
            setSubtitle(cd.d0(d20.s0, user, zArr, null));
        }
        a7.Y(this.e, zArr[0] ? t6.n5 : t6.r5, this.a);
        ep epVar = this.w;
        if (epVar != null) {
            epVar.setAlpha(1.0f);
        }
        int x02 = t6.x0(null, t6.z9, false);
        this.L = x02;
        cVar.i(this.K.a(user, x02, false));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        pv0 pv0Var;
        og.c cVar;
        int x02;
        try {
            if (this.H != null && (pv0Var = this.K) != null && (cVar = this.d) != null && (x02 = t6.x0(null, t6.z9, false)) != this.L) {
                this.L = x02;
                pv0Var.a(this.H, x02, false);
                cVar.invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
