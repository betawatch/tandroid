package zg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import di.l4;
import java.util.Date;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.qx0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l extends xg.c implements p6 {
    public boolean E;
    public final ImageView F;
    public boolean G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public TL_stories.TL_myBoost J;
    public final qx0 K;
    public int L;
    public final boolean[] s;
    public final zp v;
    public final ImageView w;
    public boolean x;
    public final ImageView y;

    public l(Context context, boolean z10, boolean z11, u6 u6Var, boolean z12) {
        super(context, u6Var);
        this.s = new boolean[1];
        this.G = true;
        this.K = new qx0(this);
        this.d.setTypeface(AndroidUtilities.bold());
        this.f.setVisibility(8);
        if (z11) {
            zp zpVar = new zp(context, 21, u6Var);
            this.v = zpVar;
            zpVar.b(y6.B5, y6.h5, y6.k7);
            zpVar.setDrawUnchecked(false);
            zpVar.setDrawBackgroundAsArc(3);
            boolean z13 = LocaleController.isRTL;
            addView(zpVar, gb1.h(24, 24.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 40.0f, 33.0f, z13 ? 39.0f : 0.0f, 0.0f));
            d();
        } else if (z10) {
            zp zpVar2 = new zp(context, 21, u6Var);
            this.v = zpVar2;
            if (z12) {
                zpVar2.b(y6.i7, y6.j7, y6.C5);
            } else {
                zpVar2.b(y6.B5, y6.j7, y6.C5);
            }
            zpVar2.setDrawUnchecked(true);
            zpVar2.setDrawBackgroundAsArc(10);
            addView(zpVar2);
            zpVar2.a(false, false);
            zpVar2.setLayoutParams(gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
            d();
        } else {
            this.v = null;
        }
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.ic_ab_other);
        int i10 = y6.Ac;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        f7.t(imageView, i10, u6Var, mode);
        addView(imageView, gb1.h(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.y = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_phone);
        int i11 = y6.Oh;
        f7.t(imageView2, i11, u6Var, mode);
        boolean z14 = LocaleController.isRTL;
        addView(imageView2, gb1.h(32, 32.0f, (z14 ? 3 : 5) | 16, z14 ? 52.0f : 12.0f, 0.0f, z14 ? 12.0f : 52.0f, 0.0f));
        imageView2.setVisibility(8);
        ImageView imageView3 = new ImageView(context);
        this.F = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.menu_videocall);
        f7.t(imageView3, i11, u6Var, mode);
        addView(imageView3, gb1.h(32, 32.0f, (LocaleController.isRTL ? 3 : 5) | 16, 12.0f, 0.0f, 12.0f, 0.0f));
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.z9));
    }

    @Override // xg.c
    public final boolean b() {
        zp zpVar = this.v;
        return zpVar != null && zpVar.getDrawUnchecked();
    }

    @Override // xg.c
    public final void c(boolean z10, boolean z11) {
        zp zpVar = this.v;
        if (zpVar != null && zpVar.getVisibility() == 0) {
            zpVar.a(z10, z11);
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
            runnable = new Runnable(this) { // from class: zg.j
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
            runnable2 = new Runnable(this) { // from class: zg.j
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
        y9Var.f(chat, j9Var);
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
        f7.Y(this.e, y6.r5, this.a);
        i(i10 > 200 ? 0.3f : 1.0f, false);
    }

    public final void i(float f7, boolean z10) {
        zp zpVar = this.v;
        if (zpVar == null) {
            return;
        }
        if (!z10) {
            zpVar.animate().cancel();
            zpVar.setAlpha(f7);
        } else if (Math.abs(zpVar.getAlpha() - f7) > 0.1d) {
            zpVar.animate().cancel();
            zpVar.animate().alpha(f7).start();
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
        y9Var.f(this.I, j9Var);
        String str = this.I.title;
        l4 l4Var = this.d;
        l4Var.k(str);
        int i10 = y6.r5;
        u6 u6Var = this.a;
        b6 b6Var = this.e;
        f7.Y(b6Var, i10, u6Var);
        setSubtitle(LocaleController.formatString(R.string.BoostExpireOn, LocaleController.getInstance().getFormatterBoostExpired().format(new Date(tL_myBoost.expires * 1000))));
        int i11 = tL_myBoost.cooldown_until_date;
        if (i11 <= 0) {
            l4Var.setAlpha(1.0f);
            b6Var.setAlpha(1.0f);
            i(1.0f, false);
        } else {
            setSubtitle(LocaleController.formatString(R.string.BoostingAvailableIn, f((i11 * 1000) - System.currentTimeMillis())));
            l4Var.setAlpha(0.65f);
            b6Var.setAlpha(0.65f);
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
        y9Var.f(user, j9Var);
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
        f7.Y(this.e, zArr[0] ? y6.n5 : y6.r5, this.a);
        zp zpVar = this.v;
        if (zpVar != null) {
            zpVar.setAlpha(1.0f);
        }
        int x02 = y6.x0(null, y6.z9, false);
        this.L = x02;
        l4Var.i(this.K.a(user, false, x02));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        qx0 qx0Var;
        l4 l4Var;
        int x02;
        try {
            if (this.H != null && (qx0Var = this.K) != null && (l4Var = this.d) != null && (x02 = y6.x0(null, y6.z9, false)) != this.L) {
                this.L = x02;
                qx0Var.a(this.H, false, x02);
                l4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
