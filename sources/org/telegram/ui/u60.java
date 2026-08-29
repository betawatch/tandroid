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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u60 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ v60 d;

    public u60(v60 v60Var, Context context) {
        this.d = v60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        v60 v60Var = this.d;
        return b10 == v60Var.r || b10 == v60Var.n || b10 == v60Var.s || b10 == 0;
    }

    @Override // f2.p0
    public final int h() {
        v60 v60Var = this.d;
        if (v60Var.e) {
            return 0;
        }
        return v60Var.w;
    }

    @Override // f2.p0
    public final int j(int i10) {
        v60 v60Var = this.d;
        if (i10 == v60Var.n || i10 == v60Var.s || i10 == v60Var.r) {
            return 0;
        }
        if (i10 == v60Var.v || i10 == v60Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        v60 v60Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
            if (i10 == v60Var.n) {
                y9Var.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == v60Var.s) {
                y9Var.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == v60Var.r) {
                    y9Var.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = v60Var.f;
            l8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            l8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        int i12 = v60Var.v;
        Context context = this.c;
        if (i10 == i12) {
            y8Var.setText("");
            y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
        } else if (i10 == v60Var.h) {
            TLRPC.Chat chat = v60Var.getMessagesController().getChat(Long.valueOf(v60Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                y8Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                y8Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            y8Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout y9Var = new org.telegram.ui.Cells.y9(context);
            y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = y9Var;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            TextView textView = new TextView(context);
            l8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            l8Var.addView(textView, i7.f6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = l8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.y8(context);
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
