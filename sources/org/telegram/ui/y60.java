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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y60 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ z60 d;

    public y60(z60 z60Var, Context context) {
        this.d = z60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        z60 z60Var = this.d;
        return b10 == z60Var.r || b10 == z60Var.n || b10 == z60Var.s || b10 == 0;
    }

    @Override // s4.h0
    public final int h() {
        z60 z60Var = this.d;
        if (z60Var.e) {
            return 0;
        }
        return z60Var.w;
    }

    @Override // s4.h0
    public final int j(int i10) {
        z60 z60Var = this.d;
        if (i10 == z60Var.n || i10 == z60Var.s || i10 == z60Var.r) {
            return 0;
        }
        if (i10 == z60Var.v || i10 == z60Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        z60 z60Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
            if (i10 == z60Var.n) {
                gaVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == z60Var.s) {
                gaVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == z60Var.r) {
                    gaVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = z60Var.f;
            t8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            t8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
        if (i10 == z60Var.v) {
            i9Var.setText("");
            return;
        }
        if (i10 == z60Var.h) {
            TLRPC.Chat chat = z60Var.getMessagesController().getChat(Long.valueOf(z60Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                i9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                i9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout gaVar = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, gaVar, null);
            frameLayout = gaVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.t8 t8Var = new org.telegram.ui.Cells.t8(context);
            TextView textView = new TextView(context);
            t8Var.a = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            t8Var.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, t8Var, null);
            frameLayout = t8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.i9(context);
        }
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
