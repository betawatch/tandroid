package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r70 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ s70 d;

    public r70(s70 s70Var, Context context) {
        this.d = s70Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        s70 s70Var = this.d;
        return b10 == s70Var.r || b10 == s70Var.n || b10 == s70Var.s || b10 == 0;
    }

    @Override // s4.g0
    public final int h() {
        s70 s70Var = this.d;
        if (s70Var.e) {
            return 0;
        }
        return s70Var.w;
    }

    @Override // s4.g0
    public final int j(int i10) {
        s70 s70Var = this.d;
        if (i10 == s70Var.n || i10 == s70Var.s || i10 == s70Var.r) {
            return 0;
        }
        if (i10 == s70Var.v || i10 == s70Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        s70 s70Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (i10 == s70Var.n) {
                caVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == s70Var.s) {
                caVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == s70Var.r) {
                    caVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = s70Var.f;
            p8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            p8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        int i12 = s70Var.v;
        Context context = this.c;
        if (i10 == i12) {
            e9Var.setText("");
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
        } else if (i10 == s70Var.h) {
            TLRPC.Chat chat = s70Var.getMessagesController().getChat(Long.valueOf(s70Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                e9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                e9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            e9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
            caVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = caVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            TextView textView = new TextView(context);
            p8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            p8Var.addView(textView, w7.a6.a(-2.0f, 23.0f, 10.0f, 23.0f, 10.0f, -1, (LocaleController.isRTL ? 5 : 3) | 48));
            p8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = p8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(context);
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
