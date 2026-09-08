package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import bi.j5;
import com.google.android.gms.internal.vision.e2;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.x9;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l extends wg.c {
    public final ImageView E;
    public boolean F;
    public TLRPC.User G;
    public TLRPC.Chat H;
    public TL_stories.TL_myBoost I;
    public final jw0 J;
    public final boolean[] r;
    public final mp s;
    public final ImageView v;
    public boolean w;
    public final ImageView x;
    public boolean y;

    public l(Context context, boolean z10, boolean z11, f6 f6Var, boolean z12) {
        super(context, f6Var);
        this.r = new boolean[1];
        this.F = true;
        this.J = new jw0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            mp mpVar = new mp(context, 21, f6Var);
            this.s = mpVar;
            mpVar.b(j6.B5, j6.h5, j6.k7);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(mpVar, x5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            mp mpVar2 = new mp(context, 21, f6Var);
            this.s = mpVar2;
            if (z12) {
                mpVar2.b(j6.i7, j6.j7, j6.C5);
            } else {
                mpVar2.b(j6.B5, j6.j7, j6.C5);
            }
            mpVar2.setDrawUnchecked(true);
            mpVar2.setDrawBackgroundAsArc(10);
            addView(mpVar2);
            mpVar2.a(false, false);
            mpVar2.setLayoutParams(x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.s = null;
        }
        ImageView imageView = new ImageView(context);
        this.v = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int v02 = j6.v0(j6.Ac, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        addView(imageView, x5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.x = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = j6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), mode));
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, x5.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.E = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), mode));
        addView(imageView3, x5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        imageView3.setVisibility(8);
    }

    public static String f(long j3) {
        long j10 = j3 / 3600000;
        long j11 = j3 % 3600000;
        long j12 = j11 / 60000;
        long j13 = (j11 % 60000) / 1000;
        StringBuilder sb2 = new StringBuilder();
        if (j10 > 0) {
            sb2.append(String.format("%02d", Long.valueOf(j10)));
            sb2.append(":");
        }
        sb2.append(String.format("%02d", Long.valueOf(j12)));
        sb2.append(":");
        sb2.append(String.format("%02d", Long.valueOf(j13)));
        return sb2.toString();
    }

    @Override // wg.c
    public final boolean b() {
        mp mpVar = this.s;
        return mpVar != null && mpVar.getDrawUnchecked();
    }

    @Override // wg.c
    public final void c(boolean z10, boolean z11) {
        mp mpVar = this.s;
        if (mpVar != null && mpVar.getVisibility() == 0) {
            mpVar.a(z10, z11);
        }
    }

    public final void g(boolean z10, boolean z11) {
        Runnable runnable;
        if (this.F == z10) {
            return;
        }
        this.F = z10;
        float f7 = 0.0f;
        ImageView imageView = this.E;
        ImageView imageView2 = this.x;
        if (!z11) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z10 && this.w) ? 1.0f : 0.0f);
            imageView2.setVisibility((z10 && this.w) ? 0 : 8);
            imageView.animate().cancel();
            if (z10 && this.y) {
                f7 = 1.0f;
            }
            imageView.setAlpha(f7);
            imageView.setVisibility((z10 && this.y) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator alpha = imageView2.animate().alpha((z10 && this.w) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z10 && this.w) {
            runnable = null;
        } else {
            final int i10 = 0;
            runnable = new Runnable(this) { // from class: yg.j
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.x.setVisibility(8);
                            break;
                        default:
                            this.b.E.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha.withEndAction(runnable).start();
        imageView.setVisibility(0);
        ViewPropertyAnimator animate = imageView.animate();
        if (z10 && this.y) {
            f7 = 1.0f;
        }
        ViewPropertyAnimator alpha2 = animate.alpha(f7);
        if (!z10 || !this.y) {
            final int i11 = 1;
            runnable2 = new Runnable(this) { // from class: yg.j
                public final /* synthetic */ l b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.x.setVisibility(8);
                            break;
                        default:
                            this.b.E.setVisibility(8);
                            break;
                    }
                }
            };
        }
        alpha2.withEndAction(runnable2).start();
    }

    public TL_stories.TL_myBoost getBoost() {
        return this.I;
    }

    public TLRPC.Chat getChat() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.G;
    }

    public final void h(int i10, TLRPC.Chat chat) {
        String string;
        this.v.setVisibility(8);
        this.H = chat;
        this.G = null;
        i9 i9Var = this.b;
        i9Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        x9 x9Var = this.c;
        x9Var.setRoundRadius(dp);
        x9Var.e(chat, i9Var);
        String str = chat.title;
        j5 j5Var = this.d;
        j5Var.k(str);
        j5Var.i(null);
        if (i10 <= 0) {
            i10 = chat.participants_count;
        }
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        if (i10 >= 1) {
            string = LocaleController.formatPluralString(isChannelAndNotMegaGroup ? "Subscribers" : "Members", i10, new Object[0]);
        } else {
            string = LocaleController.getString(isChannelAndNotMegaGroup ? R.string.DiscussChannel : R.string.AccDescrGroup);
        }
        setSubtitle(string);
        this.e.setTextColor(j6.v0(j6.r5, this.a));
        i(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f7, boolean z10) {
        mp mpVar = this.s;
        if (mpVar == null) {
            return;
        }
        if (!z10) {
            mpVar.animate().cancel();
            mpVar.setAlpha(f7);
        } else if (Math.abs(mpVar.getAlpha() - f7) > 0.1d) {
            mpVar.animate().cancel();
            mpVar.animate().alpha(f7).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J.a.b();
    }

    public void setBoost(TL_stories.TL_myBoost tL_myBoost) {
        this.v.setVisibility(8);
        this.I = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.H = chat;
        i9 i9Var = this.b;
        i9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        x9 x9Var = this.c;
        x9Var.setRoundRadius(dp);
        x9Var.e(this.H, i9Var);
        String str = this.H.title;
        j5 j5Var = this.d;
        j5Var.k(str);
        int v02 = j6.v0(j6.r5, this.a);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.e;
        j5Var2.setTextColor(v02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            j5Var.setAlpha(1.0f);
            j5Var2.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            j5Var.setAlpha(0.65f);
            j5Var2.setAlpha(0.65f);
            i(0.3f, false);
        }
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.v;
        if (onClickListener == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setUser(TLRPC.User user) {
        this.v.setVisibility(8);
        this.G = user;
        this.H = null;
        i9 i9Var = this.b;
        i9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        x9 x9Var = this.c;
        x9Var.setRoundRadius(dp);
        x9Var.e(user, i9Var);
        String userName = UserObject.getUserName(user);
        j5 j5Var = this.d;
        j5Var.k(userName);
        boolean[] zArr = this.r;
        zArr[0] = false;
        if (UserObject.isBot(user)) {
            int i10 = user.bot_active_users;
            if (i10 > 0) {
                setSubtitle(LocaleController.formatPluralStringComma("BotUsers", i10, ','));
            } else {
                setSubtitle(LocaleController.getString(R.string.Bot));
            }
        } else {
            setSubtitle(LocaleController.formatUserStatus(UserConfig.selectedAccount, user, zArr));
        }
        this.e.setTextColor(j6.v0(zArr[0] ? j6.n5 : j6.r5, this.a));
        mp mpVar = this.s;
        if (mpVar != null) {
            mpVar.setAlpha(1.0f);
        }
        int w02 = j6.w0(null, j6.z9, false);
        boolean u10 = e2.u(user);
        jw0 jw0Var = this.J;
        j5Var.i(u10 ? jw0Var.a(user, null, w02, false) : jw0Var.a(null, null, w02, false));
    }
}
