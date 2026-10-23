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

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class x60 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ y60 d;

    public x60(y60 y60Var, Context context) {
        this.d = y60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        y60 y60Var = this.d;
        return b10 == y60Var.r || b10 == y60Var.n || b10 == y60Var.s || b10 == 0;
    }

    @Override // s4.g0
    public final int h() {
        y60 y60Var = this.d;
        if (y60Var.e) {
            return 0;
        }
        return y60Var.w;
    }

    @Override // s4.g0
    public final int j(int i10) {
        y60 y60Var = this.d;
        if (i10 == y60Var.n || i10 == y60Var.s || i10 == y60Var.r) {
            return 0;
        }
        if (i10 == y60Var.v || i10 == y60Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        y60 y60Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (i10 == y60Var.n) {
                caVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i10 == y60Var.s) {
                caVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i10 == y60Var.r) {
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
            TLRPC.TL_chatInviteExported tL_chatInviteExported = y60Var.f;
            p8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            p8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        int i12 = y60Var.v;
        Context context = this.c;
        if (i10 == i12) {
            e9Var.setText("");
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7, context, e9Var, null);
        } else if (i10 == y60Var.h) {
            TLRPC.Chat chat = y60Var.getMessagesController().getChat(Long.valueOf(y60Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                e9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                e9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7, context, e9Var, null);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout caVar = new org.telegram.ui.Cells.ca(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, caVar, null);
            frameLayout = caVar;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            TextView textView = new TextView(context);
            p8Var.a = textView;
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            p8Var.addView(textView, w7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, p8Var, null);
            frameLayout = p8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.e9(context);
        }
        return new org.telegram.ui.Components.wl0(frameLayout);
    }
}
