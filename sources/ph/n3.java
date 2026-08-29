package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hb;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n3 extends fi implements NotificationCenter.NotificationCenterDelegate {
    public long A;
    public int B;
    public String C;
    public boolean D;
    public j3 E;
    public g2 F;
    public org.telegram.ui.ActionBar.w0 G;
    public org.telegram.ui.ActionBar.g1 H;
    public org.telegram.ui.ActionBar.g1 I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public f3 Q;
    public boolean R;
    public int S;
    public i3 n;
    public ValueAnimator r;
    public boolean s;
    public long v;
    public long w;
    public long x;
    public int y;

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        i3 i3Var = this.n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        ni niVar = this.b;
        niVar.T0.setTitle(userName);
        this.F.setSwipeOffsetY(0.0f);
        if (i3Var.getWebView() != null) {
            i3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if (o2Var != null) {
            i3Var.setParentActivity(o2Var.getParentActivity());
        }
        this.G.setVisibility(0);
        if (i3Var.N) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(niVar.T0.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.fi
    public final void E() {
        if (this.n.J) {
            K();
        }
        this.F.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new f3(this, 0));
    }

    @Override // org.telegram.ui.Components.fi
    public final void F() {
        g2 g2Var = this.F;
        g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
    }

    public final boolean J() {
        if (!this.O) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.N = formatName;
        alertDialog$Builder.a.P = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new h3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.show();
        ((TextView) c2Var.d(-1)).setTextColor(g6.v0(g6.q7, this.a));
        return false;
    }

    public final void K() {
        ni niVar = this.b;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.b0;
        if ((o2Var instanceof tn) && ((tn) o2Var).T0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(niVar.b0.getFragmentView());
            AndroidUtilities.runOnUIThread(new f3(this, 1), 250L);
        } else {
            niVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            niVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.n;
        if (i10 != NotificationCenter.webViewResultSent) {
            if (i10 == NotificationCenter.didSetNewTheme) {
                i3Var.n.b(g6.v0(g6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            i3Var.h();
            this.D = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean e() {
        return this.R;
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean f() {
        return this.M;
    }

    @Override // org.telegram.ui.Components.fi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.F.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        g2 g2Var = this.F;
        return (int) (g2Var.getOffsetY() + g2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.fi
    public int getCustomActionBarBackground() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.fi
    public int getCustomBackground() {
        return this.N;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return (int) this.F.getOffsetY();
    }

    public String getStartCommand() {
        return this.C;
    }

    public org.telegram.ui.web.z0 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.fi
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean i() {
        if (this.n.z()) {
            return true;
        }
        J();
        return true;
    }

    @Override // org.telegram.ui.Components.fi
    public final void m() {
        NotificationCenter.getInstance(this.B).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.a0 n10 = this.b.T0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
        this.n.h();
        this.P = true;
        AndroidUtilities.cancelRunOnUIThread(this.Q);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.K) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean p() {
        J();
        return false;
    }

    @Override // org.telegram.ui.Components.fi
    public final void q() {
        ni niVar = this.b;
        niVar.setFocusable(false);
        niVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.fi
    public final void r() {
        this.G.setVisibility(8);
        this.L = false;
        i3 i3Var = this.n;
        boolean z10 = i3Var.N;
        ni niVar = this.b;
        if (!z10) {
            AndroidUtilities.updateImageViewImageAnimated(niVar.T0.getBackButton(), R.drawable.ic_ab_back);
        }
        niVar.T0.setBackground(null);
        if (i3Var.P) {
            i3Var.h();
            this.D = true;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAllowSwipes(boolean z10) {
        this.F.setAllowSwipes(z10);
    }

    public void setCustomActionBarBackground(int i10) {
        this.R = true;
        this.S = i10;
    }

    public void setCustomBackground(int i10) {
        this.N = i10;
        this.M = true;
    }

    public void setDelegate(org.telegram.ui.web.f0 f0Var) {
        this.n.setDelegate(f0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.J = i10;
        this.F.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z10) {
        this.O = z10;
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.fi
    public final void t(int i10) {
        j3 j3Var = this.E;
        i3 i3Var = this.n;
        if (i10 == -1) {
            if (i3Var.z()) {
                return;
            }
            J();
            return;
        }
        int i11 = R.id.menu_open_bot;
        ni niVar = this.b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            niVar.b0.presentFragment(new tn(bundle));
            niVar.dismiss();
            return;
        }
        int i12 = 0;
        if (i10 == R.id.menu_reload_page) {
            if (i3Var.getWebView() != null) {
                i3Var.getWebView().animate().cancel();
                i3Var.getWebView().animate().alpha(0.0f).start();
            }
            j3Var.setLoadProgress(0.0f);
            j3Var.setAlpha(1.0f);
            j3Var.setVisibility(0);
            i3Var.setBotUser(MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
            i3Var.q(this.B, this.v);
            NotificationCenter.getInstance(i3Var.I).doOnIdle(new org.telegram.ui.web.u(i3Var, 2));
            return;
        }
        if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.B).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    niVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.B).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
            return;
        }
        if (i10 == R.id.menu_settings) {
            i3Var.getClass();
            i3Var.L = System.currentTimeMillis();
            i3Var.v("settings_button_pressed", null);
        } else {
            if (i10 == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.B).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i10 == R.id.menu_tos_bot) {
                ye.d.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i10 == R.id.menu_report_bot) {
                int i13 = this.B;
                Context context = getContext();
                tc tcVar = new tc(hb.a(getContext()), this.a);
                long j10 = this.v;
                int i14 = y21.v;
                y21.J(i13, context, j10, false, false, new ArrayList(), tcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void v() {
        this.K = false;
        this.F.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.fi
    public final void w(int i10, boolean z10) {
        boolean z11;
        i3 i3Var = this.n;
        g2 g2Var = this.F;
        if (z10) {
            i3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY());
            if (g2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                g2Var.e(topActionBarOffsetY);
                z11 = true;
            } else {
                z11 = false;
            }
            int R = this.b.n1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.K = true;
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z11) {
                return;
            }
            ValueAnimator valueAnimator = this.r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.r = null;
            }
            if (i3Var.getWebView() != null) {
                int scrollY = i3Var.getWebView().getScrollY();
                int i11 = (R - i10) + scrollY;
                ValueAnimator duration = ValueAnimator.ofInt(scrollY, i11).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(uh.m.V);
                this.r.addUpdateListener(new g3(this, 1));
                this.r.addListener(new z3(this, i11, 10));
                this.r.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // org.telegram.ui.Components.fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        float f9;
        g2 g2Var = this.F;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                this.b.setAllowNestedScroll(true);
                if (i12 < 0) {
                    i12 = 0;
                }
                f9 = i12;
                if (g2Var.getOffsetY() == f9) {
                    this.s = true;
                    g2Var.setOffsetY(f9);
                    this.s = false;
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        this.b.setAllowNestedScroll(true);
        if (i12 < 0) {
        }
        f9 = i12;
        if (g2Var.getOffsetY() == f9) {
        }
    }
}
