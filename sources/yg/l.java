package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import bi.l5;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l extends wg.c {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final jx0 K;
    public final boolean[] s;
    public final aq v;
    public final ImageView w;
    public boolean x;
    public final ImageView y;

    public l(Context context, boolean z10, boolean z11, c6 c6Var, boolean z12) {
        super(context, c6Var);
        this.s = new boolean[1];
        this.G = true;
        this.K = new jx0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            aq aqVar = new aq(context, 21, c6Var);
            this.v = aqVar;
            aqVar.b(g6.B5, g6.h5, g6.k7);
            aqVar.setDrawUnchecked(false);
            aqVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(aqVar, z5.a(24.0f, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f, 24, (z13 ? 5 : 3) | 48));
            d();
        } else if (z10) {
            aq aqVar2 = new aq(context, 21, c6Var);
            this.v = aqVar2;
            if (z12) {
                aqVar2.b(g6.i7, g6.j7, g6.C5);
            } else {
                aqVar2.b(g6.B5, g6.j7, g6.C5);
            }
            aqVar2.setDrawUnchecked(true);
            aqVar2.setDrawBackgroundAsArc(10);
            addView(aqVar2);
            aqVar2.a(false, false);
            aqVar2.setLayoutParams(z5.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = g6.w0(g6.Ac, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        addView(imageView, z5.a(32.0f, 12.0f, 0.0f, 12.0f, 0.0f, 32, (LocaleController.isRTL ? 3 : 5) | 16));
        ImageView imageView2 = new ImageView(context);
        this.y = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = g6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(i10, c6Var), mode));
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, z5.a(32.0f, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f, 32, (z14 ? 3 : 5) | 16));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(g6.w0(i10, c6Var), mode));
        addView(imageView3, z5.a(32.0f, 12.0f, 0.0f, 12.0f, 0.0f, 32, (LocaleController.isRTL ? 3 : 5) | 16));
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
        aq aqVar = this.v;
        return aqVar != null && aqVar.getDrawUnchecked();
    }

    @Override // wg.c
    public final void c(boolean z10, boolean z11) {
        aq aqVar = this.v;
        if (aqVar != null && aqVar.getVisibility() == 0) {
            aqVar.a(z10, z11);
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
            runnable = new Runnable(this) { // from class: yg.j
                public final /* synthetic */ l b;

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
            runnable2 = new Runnable(this) { // from class: yg.j
                public final /* synthetic */ l b;

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
        k9 k9Var = this.b;
        k9Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        z9 z9Var = this.c;
        z9Var.setRoundRadius(dp);
        z9Var.e(chat, k9Var);
        String str = chat.title;
        l5 l5Var = this.d;
        l5Var.k(str);
        l5Var.i(null);
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
        this.e.setTextColor(g6.w0(g6.r5, this.a));
        i(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f7, boolean z10) {
        aq aqVar = this.v;
        if (aqVar == null) {
            return;
        }
        if (!z10) {
            aqVar.animate().cancel();
            aqVar.setAlpha(f7);
        } else if (Math.abs(aqVar.getAlpha() - f7) > 0.1d) {
            aqVar.animate().cancel();
            aqVar.animate().alpha(f7).start();
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
        k9 k9Var = this.b;
        k9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        z9 z9Var = this.c;
        z9Var.setRoundRadius(dp);
        z9Var.e(this.I, k9Var);
        String str = this.I.title;
        l5 l5Var = this.d;
        l5Var.k(str);
        int w02 = g6.w0(g6.r5, this.a);
        h5 h5Var = this.e;
        h5Var.setTextColor(w02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            l5Var.setAlpha(1.0f);
            h5Var.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            l5Var.setAlpha(0.65f);
            h5Var.setAlpha(0.65f);
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
        k9 k9Var = this.b;
        k9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        z9 z9Var = this.c;
        z9Var.setRoundRadius(dp);
        z9Var.e(user, k9Var);
        String userName = UserObject.getUserName(user);
        l5 l5Var = this.d;
        l5Var.k(userName);
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
        this.e.setTextColor(g6.w0(zArr[0] ? g6.n5 : g6.r5, this.a));
        aq aqVar = this.v;
        if (aqVar != null) {
            aqVar.setAlpha(1.0f);
        }
        int x02 = g6.x0(null, g6.z9, false);
        boolean s10 = k3.s(user);
        jx0 jx0Var = this.K;
        l5Var.i(s10 ? jx0Var.a(user, null, x02, false) : jx0Var.a(null, null, x02, false));
    }
}
