package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class xz extends org.telegram.ui.Components.vl0 {
    public final /* synthetic */ yz c;

    public xz(yz yzVar) {
        this.c = yzVar;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.H;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        yz yzVar = this.c;
        if (i10 == yzVar.O || i10 == yzVar.K) {
            return 2;
        }
        if (i10 == yzVar.I) {
            return 3;
        }
        if (i10 < yzVar.M || i10 >= yzVar.N) {
            return (i10 == yzVar.L || i10 == yzVar.J) ? 5 : 0;
        }
        return 4;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        yz yzVar = this.c;
        ArrayList arrayList = yzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = yzVar.d;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            yzVar.Q = (pz) view;
            yzVar.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(yzVar.getParentActivity(), i10 == yzVar.O ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
            if (i10 != yzVar.O) {
                e9Var.setFixedSize(12);
                return;
            }
            e9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                e9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                e9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            rz rzVar = (rz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            ai.p4 p4Var = rzVar.h;
            org.telegram.ui.ActionBar.h5 h5Var = rzVar.c;
            TextView textView = rzVar.n;
            ImageView imageView = rzVar.d;
            ai.p4 p4Var2 = rzVar.f;
            rzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            h5Var.l(str4, false);
            if (rzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = rzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    rzVar.w = null;
                }
                float f7 = str4 != null ? 1.0f : 0.0f;
                rzVar.v = f7;
                ci.g9 g9Var = rzVar.e;
                g9Var.c = f7;
                g9Var.invalidate();
                p4Var2.setAlpha(rzVar.v);
                rzVar.h.setAlpha(rzVar.v);
                imageView.setAlpha(rzVar.v);
                textView.setAlpha(1.0f - rzVar.v);
                h5Var.setAlpha(rzVar.v);
                rzVar.b.setAlpha(1.0f - rzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    p4Var2.setVisibility(8);
                    p4Var.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                p4Var2.setVisibility(0);
                p4Var.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.a10 a10Var = (org.telegram.ui.Components.a10) view;
                if (a10Var == yzVar.P) {
                    yzVar.P = null;
                }
                if (i10 == yzVar.J) {
                    a10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    a10Var.a("", null);
                    return;
                }
                yzVar.P = a10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    yzVar.f0(false);
                    return;
                } else {
                    a10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    a10Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        Long l4 = (Long) yzVar.h.get(i10 - yzVar.M);
        long longValue = l4.longValue();
        if (longValue >= 0) {
            TLRPC.User user = yzVar.getMessagesController().getUser(l4);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = yzVar.getMessagesController().getChat(Long.valueOf(-longValue));
            if (chat2 != null) {
                str3 = chat2.title;
                str = chat2.participants_count != 0 ? ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.formatPluralStringComma("Subscribers", chat2.participants_count) : LocaleController.formatPluralStringComma("Members", chat2.participants_count) : ChatObject.isChannelAndNotMegaGroup(chat2) ? LocaleController.getString("ChannelPublic") : LocaleController.getString("MegaPublic");
            } else {
                str = null;
            }
            String str5 = str3;
            str3 = str;
            str2 = str5;
            chat = chat2;
        }
        if (arrayList.contains(l4)) {
            g4Var.setForbiddenCheck(false);
            g4Var.c(yzVar.e.contains(l4), false);
        } else {
            g4Var.setForbiddenCheck(true);
            g4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        g4Var.setTag(l4);
        g4Var.d(chat, str2, str3);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View a10Var;
        View view;
        yz yzVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.e9(yzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    a10Var = new wz(this, yzVar.getParentActivity(), yzVar);
                    a10Var.setLayoutParams(new s4.p0(-1, -2));
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(yzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    a10Var = new org.telegram.ui.Components.a10(yzVar.getParentActivity());
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.d6, false));
                }
                view2 = a10Var;
            }
            return new org.telegram.ui.Components.gl0(view2);
        }
        Activity parentActivity = yzVar.getParentActivity();
        int i11 = R.raw.folder_share;
        pz pzVar = new pz(parentActivity);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(parentActivity);
        lj0Var.f(i11, 90, 90, null);
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        lj0Var.d();
        lj0Var.setImportantForAccessibility(2);
        pzVar.addView(lj0Var, w7.y5.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        vh.n nVar = new vh.n(parentActivity);
        pzVar.a = nVar;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.B6, false));
        nVar.setTextSize(1, 14.0f);
        nVar.setGravity(17);
        nVar.setLines(2);
        pzVar.addView(nVar, w7.y5.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = pzVar;
        view2 = view;
        return new org.telegram.ui.Components.gl0(view2);
    }
}
