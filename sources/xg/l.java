package xg;

import ai.a6;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.y9;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l extends vg.c {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final nx0 K;
    public final boolean[] s;
    public final dq v;
    public final ImageView w;
    public boolean x;
    public final ImageView y;

    public l(Context context, boolean z10, boolean z11, e6 e6Var, boolean z12) {
        super(context, e6Var);
        this.s = new boolean[1];
        this.G = true;
        this.K = new nx0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            dq dqVar = new dq(context, 21, e6Var);
            this.v = dqVar;
            dqVar.b(i6.B5, i6.h5, i6.k7);
            dqVar.setDrawUnchecked(false);
            dqVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(dqVar, x5.a(24.0f, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f, 24, (z13 ? 5 : 3) | 48));
            d();
        } else if (z10) {
            dq dqVar2 = new dq(context, 21, e6Var);
            this.v = dqVar2;
            if (z12) {
                dqVar2.b(i6.i7, i6.j7, i6.C5);
            } else {
                dqVar2.b(i6.B5, i6.j7, i6.C5);
            }
            dqVar2.setDrawUnchecked(true);
            dqVar2.setDrawBackgroundAsArc(10);
            addView(dqVar2);
            dqVar2.a(false, false);
            dqVar2.setLayoutParams(x5.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int w02 = i6.w0(i6.Ac, e6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        addView(imageView, x5.a(32.0f, 12.0f, 0.0f, 12.0f, 0.0f, 32, (LocaleController.isRTL ? 3 : 5) | 16));
        ImageView imageView2 = new ImageView(context);
        this.y = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i10 = i6.Oh;
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.w0(i10, e6Var), mode));
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, x5.a(32.0f, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f, 32, (z14 ? 3 : 5) | 16));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        imageView3.setColorFilter(new PorterDuffColorFilter(i6.w0(i10, e6Var), mode));
        addView(imageView3, x5.a(32.0f, 12.0f, 0.0f, 12.0f, 0.0f, 32, (LocaleController.isRTL ? 3 : 5) | 16));
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

    @Override // vg.c
    public final boolean b() {
        dq dqVar = this.v;
        return dqVar != null && dqVar.getDrawUnchecked();
    }

    @Override // vg.c
    public final void c(boolean z10, boolean z11) {
        dq dqVar = this.v;
        if (dqVar != null && dqVar.getVisibility() == 0) {
            dqVar.a(z10, z11);
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
            runnable = new Runnable(this) { // from class: xg.j
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
            runnable2 = new Runnable(this) { // from class: xg.j
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
        j9 j9Var = this.b;
        j9Var.q(chat);
        int dp = AndroidUtilities.dp(ChatObject.isForum(chat) ? 12.0f : 20.0f);
        y9 y9Var = this.c;
        y9Var.setRoundRadius(dp);
        y9Var.e(chat, j9Var);
        String str = chat.title;
        a6 a6Var = this.d;
        a6Var.k(str);
        a6Var.i(null);
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
        this.e.setTextColor(i6.w0(i6.r5, this.a));
        i(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f7, boolean z10) {
        dq dqVar = this.v;
        if (dqVar == null) {
            return;
        }
        if (!z10) {
            dqVar.animate().cancel();
            dqVar.setAlpha(f7);
        } else if (Math.abs(dqVar.getAlpha() - f7) > 0.1d) {
            dqVar.animate().cancel();
            dqVar.animate().alpha(f7).start();
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
        j9 j9Var = this.b;
        j9Var.q(chat);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.c;
        y9Var.setRoundRadius(dp);
        y9Var.e(this.I, j9Var);
        String str = this.I.title;
        a6 a6Var = this.d;
        a6Var.k(str);
        int w02 = i6.w0(i6.r5, this.a);
        j5 j5Var = this.e;
        j5Var.setTextColor(w02);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i10 = tL_myBoost.cooldown_until_date;
        if (i10 <= 0) {
            a6Var.setAlpha(1.0f);
            j5Var.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i10 * 1000) - System.currentTimeMillis())));
            a6Var.setAlpha(0.65f);
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
        j9 j9Var = this.b;
        j9Var.r(user);
        int dp = AndroidUtilities.dp(20.0f);
        y9 y9Var = this.c;
        y9Var.setRoundRadius(dp);
        y9Var.e(user, j9Var);
        String userName = UserObject.getUserName(user);
        a6 a6Var = this.d;
        a6Var.k(userName);
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
        this.e.setTextColor(i6.w0(zArr[0] ? i6.n5 : i6.r5, this.a));
        dq dqVar = this.v;
        if (dqVar != null) {
            dqVar.setAlpha(1.0f);
        }
        int x02 = i6.x0(null, i6.z9, false);
        boolean t10 = e2.t(user);
        nx0 nx0Var = this.K;
        a6Var.i(t10 ? nx0Var.a(user, null, x02, false) : nx0Var.a(null, null, x02, false));
    }
}
