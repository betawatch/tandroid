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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class zz extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ a00 c;

    public zz(a00 a00Var) {
        this.c = a00Var;
    }

    @Override // org.telegram.ui.Components.ql0
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
        a00 a00Var = this.c;
        if (i10 == a00Var.L || i10 == a00Var.H) {
            return 2;
        }
        if (i10 == a00Var.F) {
            return 3;
        }
        if (i10 < a00Var.J || i10 >= a00Var.K) {
            return (i10 == a00Var.I || i10 == a00Var.G) ? 5 : 0;
        }
        return 4;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        String str;
        String str2;
        TLRPC.Chat chat;
        a00 a00Var = this.c;
        ArrayList arrayList = a00Var.f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = a00Var.d;
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            a00Var.N = (qz) view;
            a00Var.g0();
            return;
        }
        if (i11 == 2) {
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(a00Var.getParentActivity(), i10 == a00Var.L ? R.drawable.greydivider_bottom : R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7));
            if (i10 != a00Var.L) {
                z8Var.setFixedSize(12);
                return;
            }
            z8Var.setFixedSize(0);
            if (tL_exportedChatlistInvite == null || arrayList.isEmpty()) {
                z8Var.setText(LocaleController.getString(R.string.FilterInviteHintNo));
                return;
            } else {
                z8Var.setText(LocaleController.getString(R.string.FilterInviteHint));
                return;
            }
        }
        String str3 = null;
        if (i11 == 3) {
            tz tzVar = (tz) view;
            String str4 = tL_exportedChatlistInvite == null ? null : tL_exportedChatlistInvite.url;
            gg.q qVar = tzVar.h;
            org.telegram.ui.ActionBar.k5 k5Var = tzVar.c;
            TextView textView = tzVar.n;
            ImageView imageView = tzVar.d;
            gg.q qVar2 = tzVar.f;
            tzVar.s = str4;
            if (str4 != null) {
                if (str4.startsWith("http://")) {
                    str4 = str4.substring(7);
                }
                if (str4.startsWith("https://")) {
                    str4 = str4.substring(8);
                }
            }
            k5Var.l(str4, false);
            if (tzVar.v != (str4 == null ? 0 : 1)) {
                ValueAnimator valueAnimator = tzVar.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    tzVar.w = null;
                }
                float f10 = str4 != null ? 1.0f : 0.0f;
                tzVar.v = f10;
                sz szVar = tzVar.e;
                szVar.b = f10;
                szVar.invalidate();
                qVar2.setAlpha(tzVar.v);
                tzVar.h.setAlpha(tzVar.v);
                imageView.setAlpha(tzVar.v);
                textView.setAlpha(1.0f - tzVar.v);
                k5Var.setAlpha(tzVar.v);
                tzVar.b.setAlpha(1.0f - tzVar.v);
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
                if (a10Var == a00Var.M) {
                    a00Var.M = null;
                }
                if (i10 == a00Var.G) {
                    a10Var.b(LocaleController.getString(R.string.InviteLink), false);
                    a10Var.a("", null);
                    return;
                }
                a00Var.M = a10Var;
                if (tL_exportedChatlistInvite != null && !arrayList.isEmpty()) {
                    a00Var.f0(false);
                    return;
                } else {
                    a10Var.b(LocaleController.getString(R.string.FilterInviteHeaderChatsNo), false);
                    a10Var.a("", null);
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
        Long l10 = (Long) a00Var.h.get(i10 - a00Var.J);
        long longValue = l10.longValue();
        if (longValue >= 0) {
            TLRPC.User user = a00Var.getMessagesController().getUser(l10);
            if (user != null) {
                str2 = UserObject.getUserName(user);
                chat = user;
            } else {
                str2 = null;
                chat = user;
            }
        } else {
            TLRPC.Chat chat2 = a00Var.getMessagesController().getChat(Long.valueOf(-longValue));
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
            f4Var.setForbiddenCheck(false);
            f4Var.c(a00Var.e.contains(l10), false);
        } else {
            f4Var.setForbiddenCheck(true);
            f4Var.c(false, false);
            if (chat instanceof TLRPC.User) {
                str3 = ((TLRPC.User) chat).bot ? LocaleController.getString(R.string.FilterInviteBot) : LocaleController.getString(R.string.FilterInviteUser);
            } else if (chat instanceof TLRPC.Chat) {
                str3 = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.getString(R.string.FilterInviteChannel) : LocaleController.getString(R.string.FilterInviteGroup);
            }
        }
        f4Var.setTag(l10);
        f4Var.d(chat, str2, str3);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View a10Var;
        View view;
        a00 a00Var = this.c;
        View view2 = null;
        if (i10 != 0) {
            if (i10 == 2) {
                view2 = new org.telegram.ui.Cells.z8(a00Var.getParentActivity());
            } else {
                if (i10 == 3) {
                    a10Var = new yz(this, a00Var.getParentActivity(), a00Var);
                    a10Var.setLayoutParams(new f2.w0(-1, -2));
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                } else if (i10 == 4) {
                    View f4Var = new org.telegram.ui.Cells.f4(a00Var.getParentActivity(), 1, 0, false);
                    f4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                    view = f4Var;
                } else if (i10 == 5) {
                    a10Var = new org.telegram.ui.Components.a10(a00Var.getParentActivity());
                    a10Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
                }
                view2 = a10Var;
            }
            return new org.telegram.ui.Components.dl0(view2);
        }
        Activity parentActivity = a00Var.getParentActivity();
        int i11 = R.raw.folder_share;
        qz qzVar = new qz(parentActivity);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(parentActivity);
        jj0Var.f(i11, 90, 90, null);
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        jj0Var.d();
        jj0Var.setImportantForAccessibility(2);
        qzVar.addView(jj0Var, k7.b6.d(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
        ih.s sVar = new ih.s(parentActivity);
        qzVar.a = sVar;
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B6, false));
        sVar.setTextSize(1, 14.0f);
        sVar.setGravity(17);
        sVar.setLines(2);
        qzVar.addView(sVar, k7.b6.d(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        view = qzVar;
        view2 = view;
        return new org.telegram.ui.Components.dl0(view2);
    }
}
