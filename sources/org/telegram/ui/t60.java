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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class t60 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ u60 d;

    public t60(u60 u60Var, Context context) {
        this.d = u60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        u60 u60Var = this.d;
        return b10 == u60Var.r || b10 == u60Var.n || b10 == u60Var.s || b10 == 0;
    }

    @Override // s4.g0
    public final int h() {
        u60 u60Var = this.d;
        if (u60Var.e) {
            return 0;
        }
        return u60Var.w;
    }

    @Override // s4.g0
    public final int j(int i10) {
        u60 u60Var = this.d;
        if (i10 == u60Var.n || i10 == u60Var.s || i10 == u60Var.r) {
            return 0;
        }
        if (i10 == u60Var.v || i10 == u60Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        u60 u60Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (i10 == u60Var.n) {
                baVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == u60Var.s) {
                baVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == u60Var.r) {
                    baVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = u60Var.f;
            o8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            o8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        int i12 = u60Var.v;
        Context context = this.c;
        if (i10 == i12) {
            d9Var.setText("");
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
        } else if (i10 == u60Var.h) {
            TLRPC.Chat chat = u60Var.getMessagesController().getChat(Long.valueOf(u60Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                d9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                d9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            d9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = baVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
            TextView textView = new TextView(context);
            o8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            o8Var.addView(textView, w7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            o8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = o8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.d9(context);
        }
        return new org.telegram.ui.Components.sl0(frameLayout);
    }
}
