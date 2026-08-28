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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ t60 d;

    public s60(t60 t60Var, Context context) {
        this.d = t60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        t60 t60Var = this.d;
        return b10 == t60Var.r || b10 == t60Var.n || b10 == t60Var.s || b10 == 0;
    }

    @Override // f2.r0
    public final int h() {
        t60 t60Var = this.d;
        if (t60Var.e) {
            return 0;
        }
        return t60Var.w;
    }

    @Override // f2.r0
    public final int j(int i9) {
        t60 t60Var = this.d;
        if (i9 == t60Var.n || i9 == t60Var.s || i9 == t60Var.r) {
            return 0;
        }
        if (i9 == t60Var.v || i9 == t60Var.h) {
            return 1;
        }
        return i9 == 0 ? 2 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        t60 t60Var = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (i9 == t60Var.n) {
                baVar.b(LocaleController.getString(R.string.CopyLink), true);
                return;
            } else if (i9 == t60Var.s) {
                baVar.b(LocaleController.getString(R.string.ShareLink), false);
                return;
            } else {
                if (i9 == t60Var.r) {
                    baVar.b(LocaleController.getString(R.string.RevokeLink), true);
                    return;
                }
                return;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = t60Var.f;
            n8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            n8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        int i11 = t60Var.v;
        Context context = this.c;
        if (i9 == i11) {
            b9Var.setText("");
            b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
        } else if (i9 == t60Var.h) {
            TLRPC.Chat chat = t60Var.getMessagesController().getChat(Long.valueOf(t60Var.d));
            if (!ChatObject.isChannel(chat) || chat.megagroup) {
                b9Var.setText(LocaleController.getString(R.string.LinkInfo));
            } else {
                b9Var.setText(LocaleController.getString(R.string.ChannelLinkInfo));
            }
            b9Var.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i9 == 0) {
            FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
            baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            frameLayout = baVar;
        } else if (i9 != 1) {
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            TextView textView = new TextView(context);
            n8Var.a = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            n8Var.addView(textView, g7.e6.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            n8Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            frameLayout = n8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.b9(context);
        }
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
