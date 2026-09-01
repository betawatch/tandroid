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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yz extends org.telegram.ui.Components.sl0 {
    public final /* synthetic */ zz c;

    public yz(zz zzVar) {
        this.c = zzVar;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return m1Var.f == 4;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.E;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        zz zzVar = this.c;
        if (i10 == zzVar.L || i10 == zzVar.H) {
            return 2;
        }
        if (i10 == zzVar.F) {
            return 3;
        }
        if (i10 < zzVar.J || i10 >= zzVar.K) {
            return (i10 == zzVar.I || i10 == zzVar.G) ? 5 : 0;
        }
        return 4;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        zz zzVar = this.c;
        ArrayList arrayList = zzVar.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = zzVar.d;
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            zzVar.N = (pz) view;
            zzVar.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(zzVar.getParentActivity(), i10 == zzVar.L ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
            if (i10 != zzVar.L) {
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
            sz szVar = (sz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            hg.q qVar = szVar.h;
            org.telegram.ui.ActionBar.l5 l5Var = szVar.c;
            TextView textView = szVar.n;
            ImageView imageView = szVar.d;
            hg.q qVar2 = szVar.f;
            szVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            l5Var.l(str4, false);
            if (szVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = szVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    szVar.w = null;
                }
                float f10 = str4 != null ? 1.0f : 0.0f;
                szVar.v = f10;
                rz rzVar = szVar.e;
                rzVar.b = f10;
                rzVar.invalidate();
                qVar2.setAlpha(szVar.v);
                szVar.h.setAlpha(szVar.v);
                imageView.setAlpha(szVar.v);
                textView.setAlpha(1.0f - szVar.v);
                l5Var.setAlpha(szVar.v);
                szVar.b.setAlpha(1.0f - szVar.v);
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
                org.telegram.ui.Components.a10 a10Var = (org.telegram.ui.Components.a10) view;
                if (a10Var == zzVar.M) {
                    zzVar.M = null;
                }
                if (i10 == zzVar.G) {
                    a10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    a10Var.a("", null);
                    return;
                }
                zzVar.M = a10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    zzVar.f0(false);
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
        Long l10 = (Long) zzVar.h.get(i10 - zzVar.J);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User user = zzVar.getMessagesController().getUser(l10);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = zzVar.getMessagesController().getChat(Long.valueOf(-longValue));
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
            g4Var.c(zzVar.e.contains(l10), false);
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

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View a10Var;
        View view;
        zz zzVar = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.a9(zzVar.getParentActivity());
            } else {
                if (i10 == 3) {
                    a10Var = new xz(this, zzVar.getParentActivity(), zzVar);
                    a10Var.setLayoutParams(new f2.x0(-1, -2));
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                } else if (i10 == 4) {
                    View g4Var = new org.telegram.ui.Cells.g4(zzVar.getParentActivity(), 1, 0, false);
                    g4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    view = g4Var;
                } else if (i10 == 5) {
                    a10Var = new org.telegram.ui.Components.a10(zzVar.getParentActivity());
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                }
                view2 = a10Var;
            }
            return new org.telegram.ui.Components.fl0(view2);
        }
        Activity parentActivity = zzVar.getParentActivity();
        int i11 = R.raw.folder_share;
        pz pzVar = new pz(parentActivity);
        org.telegram.ui.Components.lj0 lj0Var = new org.telegram.ui.Components.lj0(parentActivity);
        lj0Var.f(i11, 90, 90, null);
        lj0Var.setScaleType(ImageView.ScaleType.CENTER);
        lj0Var.d();
        lj0Var.setImportantForAccessibility(2);
        pzVar.addView(lj0Var, k7.c6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        jh.s sVar = new jh.s(parentActivity);
        pzVar.a = sVar;
        sVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.B6, false));
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(17);
        sVar.setLines(2);
        pzVar.addView(sVar, k7.c6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = pzVar;
        view2 = view;
        return new org.telegram.ui.Components.fl0(view2);
    }
}
