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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xz extends org.telegram.ui.Components.rl0 {
    public final /* synthetic */ yz c;

    public xz(yz yzVar) {
        this.c = yzVar;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f == 4;
    }

    @Override // f2.o0
    public final int h() {
        return this.c.E;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        yz yzVar = this.c;
        if (i10 == yzVar.L || i10 == yzVar.H) {
            return 2;
        }
        if (i10 == yzVar.F) {
            return 3;
        }
        if (i10 < yzVar.J || i10 >= yzVar.K) {
            return (i10 == yzVar.I || i10 == yzVar.G) ? 5 : 0;
        }
        return 4;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        yz yzVar = this.c;
        ArrayList arrayList = yzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = yzVar.d;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            yzVar.N = (oz) view;
            yzVar.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(yzVar.getParentActivity(), i10 == yzVar.L ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
            if (i10 != yzVar.L) {
                a9Var.setFixedSize(12);
                return;
            }
            a9Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                a9Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                a9Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            rz rzVar = (rz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            gg.q qVar = rzVar.h;
            org.telegram.ui.ActionBar.k5 k5Var = rzVar.c;
            TextView textView = rzVar.n;
            ImageView imageView = rzVar.d;
            gg.q qVar2 = rzVar.f;
            rzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            k5Var.l(str4, false);
            if (rzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = rzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    rzVar.w = null;
                }
                float f10 = str4 != null ? 1.0f : 0.0f;
                rzVar.v = f10;
                qz qzVar = rzVar.e;
                qzVar.b = f10;
                qzVar.invalidate();
                qVar2.setAlpha(rzVar.v);
                rzVar.h.setAlpha(rzVar.v);
                imageView.setAlpha(rzVar.v);
                textView.setAlpha(1.0f - rzVar.v);
                k5Var.setAlpha(rzVar.v);
                rzVar.b.setAlpha(1.0f - rzVar.v);
                if (str4 == null) {
                    textView.setVisibility(0);
                    imageView.setVisibility(8);
                    qVar2.setVisibility(8);
                    qVar.setVisibility(8);
                    return;
                }
                textView.setVisibility(8);
                imageView.setVisibility(0);
                qVar2.setVisibility(0);
                qVar.setVisibility(0);
                return;
            }
            return;
        }
        if (i11 != 4) {
            if (i11 == 5) {
                org.telegram.ui.Components.z00 z00Var = (org.telegram.ui.Components.z00) view;
                if (z00Var == yzVar.M) {
                    yzVar.M = null;
                }
                if (i10 == yzVar.G) {
                    z00Var.b(LocaleController.getString(R.string.InviteLink), false);
                    z00Var.a("", null);
                    return;
                }
                yzVar.M = z00Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    yzVar.f0(false);
                    return;
                } else {
                    z00Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    z00Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
        Long l10 = (Long) yzVar.h.get(i10 - yzVar.J);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User user = yzVar.getMessagesController().getUser(l10);
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
        if (arrayList.contains(l10)) {
            g4Var.setForbiddenCheck(false);
            g4Var.c(yzVar.e.contains(l10), false);
        } else {
            g4Var.setForbiddenCheck(true);
            g4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        g4Var.setTag(l10);
        g4Var.d(chat, str2, str3);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View z00Var;
        View view;
        yz yzVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.a9(yzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    z00Var = new wz(this, yzVar.getParentActivity(), yzVar);
                    z00Var.setLayoutParams(new f2.w0(-1, -2));
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(yzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    z00Var = new org.telegram.ui.Components.z00(yzVar.getParentActivity());
                    z00Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                }
                view2 = z00Var;
            }
            return new org.telegram.ui.Components.el0(view2);
        }
        Activity parentActivity = yzVar.getParentActivity();
        int i11 = R.raw.folder_share;
        oz ozVar = new oz(parentActivity);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(parentActivity);
        jj0Var.f(i11, 90, 90, null);
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        jj0Var.d();
        jj0Var.setImportantForAccessibility(2);
        ozVar.addView(jj0Var, k7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        ih.s sVar = new ih.s(parentActivity);
        ozVar.a = sVar;
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(17);
        sVar.setLines(2);
        ozVar.addView(sVar, k7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = ozVar;
        view2 = view;
        return new org.telegram.ui.Components.el0(view2);
    }
}
