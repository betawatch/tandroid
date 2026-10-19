package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import ci.l4;
import com.google.android.gms.internal.play_billing.k3;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xp;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k extends wg.c {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final fx0 K;
    public final boolean[] s;
    public final xp v;
    public final ImageView w;
    public boolean x;
    public final ImageView y;

    public k(Context context, boolean z10, boolean z11, d6 d6Var, boolean z12) {
        super(context, d6Var);
        this.s = new boolean[1];
        this.G = true;
        this.K = new fx0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            xp xpVar = new xp(context, 21, d6Var);
            this.v = xpVar;
            xpVar.b(h6.B5, h6.h5, h6.k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(xpVar, z5.d(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            xp xpVar2 = new xp(context, 21, d6Var);
            this.v = xpVar2;
            if (z12) {
                xpVar2.b(h6.i7, h6.j7, h6.C5);
            } else {
                xpVar2.b(h6.B5, h6.j7, h6.C5);
            }
            xpVar2.setDrawUnchecked(true);
            xpVar2.setDrawBackgroundAsArc(10);
            addView(xpVar2);
            xpVar2.a(false, false);
            xpVar2.setLayoutParams(z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = h6.w0(h6.Ac, d6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        addView(imageView, z5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.y = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = h6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), mode));
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, z5.d(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), mode));
        addView(imageView3, z5.d(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // wg.c
    public final boolean b() {
        xp xpVar = this.v;
        return xpVar != null && xpVar.getDrawUnchecked();
    }

    @Override // wg.c
    public final void c(boolean z10, boolean z11) {
        xp xpVar = this.v;
        if (xpVar != null && xpVar.getVisibility() == 0) {
            xpVar.a(z10, z11);
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
        ImageView imageView2 = this.y;
        if (!z11) {
            imageView2.animate().cancel();
            imageView2.setAlpha((z10 && this.x) ? 1.0f : 0.0f);
            imageView2.setVisibility((z10 && this.x) ? 0 : 8);
            imageView.animate().cancel();
            if (z10 && this.E) {
                f7 = 1.0f;
            }
            imageView.setAlpha(f7);
            imageView.setVisibility((z10 && this.E) ? 0 : 8);
            return;
        }
        imageView2.setVisibility(0);
        ViewPropertyAnimator alpha = imageView2.animate().alpha((z10 && this.x) ? 1.0f : 0.0f);
        Runnable runnable2 = null;
        if (z10 && this.x) {
            runnable = null;
        } else {
            final int i10 = 0;
            runnable = new Runnable(this) { // from class: yg.i
                public final /* synthetic */ k b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            this.b.y.setVisibility(8);
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
            runnable2 = new Runnable(this) { // from class: yg.i
                public final /* synthetic */ k b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.y.setVisibility(8);
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
        String string;
        this.w.setVisibility(8);
        this.I = chat;
        this.H = null;
        h9 h9Var = this.b;
        h9Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        w9 w9Var = this.c;
        w9Var.setRoundRadius(dp);
        w9Var.e(chat, h9Var);
        String str = chat.title;
        l4 l4Var = this.d;
        l4Var.k(str);
        l4Var.i(null);
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
        this.e.setTextColor(h6.w0(h6.r5, this.a));
        i(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f7, boolean z10) {
        xp xpVar = this.v;
        if (xpVar == null) {
            return;
        }
        if (!z10) {
            xpVar.animate().cancel();
            xpVar.setAlpha(f7);
        } else if (Math.abs(xpVar.getAlpha() - f7) > 0.1d) {
            xpVar.animate().cancel();
            xpVar.animate().alpha(f7).start();
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
        this.w.setVisibility(8);
        this.J = tL_myBoost;
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_myBoost.peer)));
        this.I = chat;
        h9 h9Var = this.b;
        h9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.c;
        w9Var.setRoundRadius(dp);
        w9Var.e(this.I, h9Var);
        String str = this.I.title;
        l4 l4Var = this.d;
        l4Var.k(str);
        int w02 = h6.w0(h6.r5, this.a);
        j5 j5Var = this.e;
        j5Var.setTextColor(w02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            l4Var.setAlpha(1.0f);
            j5Var.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            l4Var.setAlpha(0.65f);
            j5Var.setAlpha(0.65f);
            i(0.3f, false);
        }
    }

    public void setOptions(View.OnClickListener onClickListener) {
        ImageView imageView = this.w;
        if (onClickListener == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setOnClickListener(onClickListener);
        }
    }

    public void setUser(TLRPC.User user) {
        this.w.setVisibility(8);
        this.H = user;
        this.I = null;
        h9 h9Var = this.b;
        h9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        w9 w9Var = this.c;
        w9Var.setRoundRadius(dp);
        w9Var.e(user, h9Var);
        String userName = UserObject.getUserName(user);
        l4 l4Var = this.d;
        l4Var.k(userName);
        boolean[] zArr = this.s;
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
        this.e.setTextColor(h6.w0(zArr[0] ? h6.n5 : h6.r5, this.a));
        xp xpVar = this.v;
        if (xpVar != null) {
            xpVar.setAlpha(1.0f);
        }
        int x02 = h6.x0(null, h6.z9, false);
        boolean s10 = k3.s(user);
        fx0 fx0Var = this.K;
        l4Var.i(s10 ? fx0Var.a(user, null, x02, false) : fx0Var.a(null, null, x02, false));
    }
}
