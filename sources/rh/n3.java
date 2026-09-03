package rh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a4;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.qc;
import org.telegram.ui.q31;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class n3 extends di implements NotificationCenter.NotificationCenterDelegate {
    public long B;
    public int C;
    public String D;
    public boolean E;
    public j3 F;
    public g2 G;
    public org.telegram.ui.ActionBar.w0 H;
    public org.telegram.ui.ActionBar.g1 I;
    public org.telegram.ui.ActionBar.g1 J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public boolean Q;
    public f3 R;
    public boolean S;
    public int T;
    public i3 n;
    public ValueAnimator r;
    public boolean s;
    public long v;
    public long w;
    public long x;
    public int y;

    @Override // org.telegram.ui.Components.di
    public final void D(di diVar) {
        i3 i3Var = this.n;
        CharSequence userName = UserObject.getUserName(MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        li liVar = this.b;
        liVar.U0.setTitle(userName);
        this.G.setSwipeOffsetY(0.0f);
        if (i3Var.getWebView() != null) {
            i3Var.getWebView().scrollTo(0, 0);
        }
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if (p2Var != null) {
            i3Var.setParentActivity(p2Var.getParentActivity());
        }
        this.H.setVisibility(0);
        if (i3Var.O) {
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(liVar.U0.getBackButton(), R.drawable.ic_close_white);
    }

    @Override // org.telegram.ui.Components.di
    public final void E() {
        if (this.n.K) {
            K();
        }
        this.G.setSwipeOffsetAnimationDisallowed(false);
        AndroidUtilities.runOnUIThread(new f3(this, 0));
    }

    @Override // org.telegram.ui.Components.di
    public final void F() {
        g2 g2Var = this.G;
        g2Var.e(g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY()));
    }

    public final boolean J() {
        if (!this.P) {
            this.b.dismiss();
            return true;
        }
        TLRPC.User user = MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v));
        String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : null;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.O = formatName;
        alertDialog$Builder.a.Q = LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved);
        alertDialog$Builder.k(LocaleController.getString(R.string.BotWebViewCloseAnyway), new h3(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.show();
        ((TextView) d2Var.d(-1)).setTextColor(j6.v0(j6.q7, this.a));
        return false;
    }

    public final void K() {
        li liVar = this.b;
        org.telegram.ui.ActionBar.p2 p2Var = liVar.c0;
        if ((p2Var instanceof zn) && ((zn) p2Var).U0.R() > AndroidUtilities.dp(20.0f)) {
            AndroidUtilities.hideKeyboard(liVar.c0.getFragmentView());
            AndroidUtilities.runOnUIThread(new f3(this, 1), 250L);
        } else {
            liVar.getWindow().setSoftInputMode(20);
            setFocusable(true);
            liVar.setFocusable(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i3 i3Var = this.n;
        if (i10 != NotificationCenter.webViewResultSent) {
            if (i10 == NotificationCenter.didSetNewTheme) {
                i3Var.n.b(j6.v0(j6.h5, this.a), 153);
                return;
            }
            return;
        }
        if (this.x == ((Long) objArr[0]).longValue()) {
            i3Var.i();
            this.E = true;
            this.b.dismiss();
        }
    }

    @Override // org.telegram.ui.Components.di
    public final boolean e() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.di
    public final boolean f() {
        return this.N;
    }

    @Override // org.telegram.ui.Components.di
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(12.0f) + ((int) this.G.getTopActionBarOffsetY());
    }

    @Override // org.telegram.ui.Components.di
    public int getCurrentItemTop() {
        g2 g2Var = this.G;
        return (int) (g2Var.getOffsetY() + g2Var.getSwipeOffsetY());
    }

    @Override // org.telegram.ui.Components.di
    public int getCustomActionBarBackground() {
        return this.T;
    }

    @Override // org.telegram.ui.Components.di
    public int getCustomBackground() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.di
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.di
    public int getListTopPadding() {
        return (int) this.G.getOffsetY();
    }

    public String getStartCommand() {
        return this.D;
    }

    public org.telegram.ui.web.c1 getWebViewContainer() {
        return this.n;
    }

    @Override // org.telegram.ui.Components.di
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.di
    public final boolean i() {
        if (this.n.D()) {
            return true;
        }
        J();
        return true;
    }

    @Override // org.telegram.ui.Components.di
    public final void m() {
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        org.telegram.ui.ActionBar.z n10 = this.b.U0.n();
        org.telegram.ui.ActionBar.w0 w0Var = this.H;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        n10.removeView(w0Var);
        this.n.i();
        this.Q = true;
        AndroidUtilities.cancelRunOnUIThread(this.R);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.L) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // org.telegram.ui.Components.di
    public final boolean p() {
        J();
        return false;
    }

    @Override // org.telegram.ui.Components.di
    public final void q() {
        li liVar = this.b;
        liVar.setFocusable(false);
        liVar.getWindow().setSoftInputMode(48);
    }

    @Override // org.telegram.ui.Components.di
    public final void r() {
        this.H.setVisibility(8);
        this.M = false;
        i3 i3Var = this.n;
        boolean z4 = i3Var.O;
        li liVar = this.b;
        if (!z4) {
            AndroidUtilities.updateImageViewImageAnimated(liVar.U0.getBackButton(), R.drawable.ic_ab_back);
        }
        liVar.U0.setBackground(null);
        if (i3Var.Q) {
            i3Var.i();
            this.E = true;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s) {
            return;
        }
        super.requestLayout();
    }

    public void setAllowSwipes(boolean z4) {
        this.G.setAllowSwipes(z4);
    }

    public void setCustomActionBarBackground(int i10) {
        this.S = true;
        this.T = i10;
    }

    public void setCustomBackground(int i10) {
        this.O = i10;
        this.N = true;
    }

    public void setDelegate(org.telegram.ui.web.g0 g0Var) {
        this.n.setDelegate(g0Var);
    }

    public void setMeasureOffsetY(int i10) {
        this.K = i10;
        this.G.requestLayout();
    }

    public void setNeedCloseConfirmation(boolean z4) {
        this.P = z4;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.di
    public final void t(int i10) {
        j3 j3Var = this.F;
        i3 i3Var = this.n;
        if (i10 == -1) {
            if (i3Var.D()) {
                return;
            }
            J();
            return;
        }
        int i11 = R.id.menu_open_bot;
        li liVar = this.b;
        if (i10 == i11) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", this.v);
            liVar.c0.presentFragment(new zn(bundle));
            liVar.dismiss();
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
            i3Var.setBotUser(MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
            i3Var.t(this.C, this.v);
            NotificationCenter.getInstance(i3Var.J).doOnIdle(new org.telegram.ui.web.t(i3Var, 2));
            return;
        }
        if (i10 == R.id.menu_delete_bot) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.C).getAttachMenuBots().bots;
            int size = arrayList.size();
            while (i12 < size) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i12);
                i12++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.bot_id == this.v) {
                    liVar.w1(tL_attachMenuBot2, MessagesController.getInstance(this.C).getUser(Long.valueOf(this.v)));
                    return;
                }
            }
            return;
        }
        if (i10 == R.id.menu_settings) {
            i3Var.getClass();
            i3Var.M = System.currentTimeMillis();
            i3Var.y("settings_button_pressed", null);
        } else {
            if (i10 == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(this.C).installShortcut(this.v, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
                return;
            }
            if (i10 == R.id.menu_tos_bot) {
                ze.d.s(getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
                return;
            }
            if (i10 == R.id.menu_report_bot) {
                int i13 = this.C;
                Context context = getContext();
                qc qcVar = new qc(cb.a(getContext()), this.a);
                long j10 = this.v;
                int i14 = q31.v;
                q31.J(i13, context, j10, false, false, new ArrayList(), qcVar, null, new byte[0], null, null);
            }
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void v() {
        this.L = false;
        this.G.setSwipeOffsetAnimationDisallowed(false);
        this.n.setViewPortByMeasureSuppressed(false);
        requestLayout();
    }

    @Override // org.telegram.ui.Components.di
    public final void w(int i10, boolean z4) {
        boolean z10;
        i3 i3Var = this.n;
        g2 g2Var = this.G;
        if (z4) {
            i3Var.setViewPortByMeasureSuppressed(true);
            float topActionBarOffsetY = g2Var.getTopActionBarOffsetY() + (-g2Var.getOffsetY());
            if (g2Var.getSwipeOffsetY() != topActionBarOffsetY) {
                g2Var.e(topActionBarOffsetY);
                z10 = true;
            } else {
                z10 = false;
            }
            int R = this.b.o1.R() + i10;
            setMeasuredDimension(getMeasuredWidth(), i10);
            this.L = true;
            g2Var.setSwipeOffsetAnimationDisallowed(true);
            if (z10) {
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
                duration.setInterpolator(wh.n.V);
                this.r.addUpdateListener(new g3(this, 1));
                this.r.addListener(new a4(this, i11, 10));
                this.r.start();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // org.telegram.ui.Components.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int i12;
        float f10;
        g2 g2Var = this.G;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                this.b.setAllowNestedScroll(true);
                if (i12 < 0) {
                    i12 = 0;
                }
                f10 = i12;
                if (g2Var.getOffsetY() == f10) {
                    this.s = true;
                    g2Var.setOffsetY(f10);
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
        f10 = i12;
        if (g2Var.getOffsetY() == f10) {
        }
    }
}
