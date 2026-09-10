package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vp extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ yp d;

    public vp(yp ypVar, Context context) {
        this.d = ypVar;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2;
    }

    @Override // s4.h0
    public final int h() {
        yp ypVar = this.d;
        if (!ypVar.w || ypVar.x) {
            return ypVar.M;
        }
        return 0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        yp ypVar = this.d;
        ypVar.getClass();
        if (i10 == 0) {
            return 3;
        }
        if (i10 == ypVar.F || i10 == ypVar.I) {
            return 2;
        }
        if (i10 < ypVar.G || i10 >= ypVar.H) {
            return i10 == ypVar.K ? 4 : 1;
        }
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        yp ypVar = this.d;
        boolean z10 = ypVar.s;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
            b5Var.setTag(Integer.valueOf(i10));
            TLRPC.Chat chat = (TLRPC.Chat) ypVar.v.get(i10 - ypVar.G);
            String publicUsername = ChatObject.getPublicUsername(chat);
            b5Var.b(chat, null, TextUtils.isEmpty(publicUsername) ? null : org.telegram.ui.Cells.r6.i("@", publicUsername), (i10 == ypVar.H - 1 && ypVar.h.linked_chat_id == 0) ? false : true);
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == ypVar.L) {
                f9Var.setText(LocaleController.getString(R.string.ChannelSettingsJoinRequestInfo));
                return;
            } else {
                if (i10 == ypVar.J) {
                    if (z10) {
                        f9Var.setText(LocaleController.getString(R.string.DiscussionChannelHelp2));
                        return;
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.DiscussionGroupHelp2));
                        return;
                    }
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.y4 y4Var = (org.telegram.ui.Cells.y4) view;
        if (!z10) {
            int i12 = org.telegram.ui.ActionBar.j6.p7;
            y4Var.a(i12, i12);
            y4Var.b(LocaleController.getString(R.string.DiscussionUnlinkChannel), R.drawable.msg_remove, 5, false);
        } else if (ypVar.h.linked_chat_id == 0) {
            y4Var.a(org.telegram.ui.ActionBar.j6.v6, org.telegram.ui.ActionBar.j6.u6);
            y4Var.b(LocaleController.getString(R.string.DiscussionCreateGroup), R.drawable.msg_groups, 5, true);
        } else {
            int i13 = org.telegram.ui.ActionBar.j6.p7;
            y4Var.a(i13, i13);
            y4Var.b(LocaleController.getString(R.string.DiscussionUnlinkGroup), R.drawable.msg_remove, 5, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout b5Var;
        yp ypVar = this.d;
        boolean z10 = ypVar.s;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                b5Var = new org.telegram.ui.Cells.f9(context);
            } else if (i10 == 2) {
                b5Var = new org.telegram.ui.Cells.y4(context);
            } else if (i10 != 4) {
                sp spVar = new sp(context);
                rp rpVar = new rp(context);
                rpVar.c = UserConfig.selectedAccount;
                rpVar.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                rpVar.setOrientation(1);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                rpVar.a = w9Var;
                org.telegram.ui.Components.s90 s90Var = new org.telegram.ui.Components.s90(w9Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", AndroidUtilities.dp(104.0f), AndroidUtilities.dp(104.0f));
                rpVar.b = s90Var;
                w9Var.setImageDrawable(s90Var);
                rpVar.addView(w9Var, w7.a6.t(104, 104, 49, 0, 2, 0, 0));
                spVar.addView(rpVar, w7.a6.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.g9, false));
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (z10) {
                    TLRPC.ChatFull chatFull = ypVar.h;
                    if (chatFull == null || chatFull.linked_chat_id == 0) {
                        textView.setText(LocaleController.getString(R.string.DiscussionChannelHelp3));
                    } else {
                        TLRPC.Chat chat = ypVar.getMessagesController().getChat(Long.valueOf(ypVar.h.linked_chat_id));
                        if (chat != null) {
                            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionChannelGroupSetHelp2", R.string.DiscussionChannelGroupSetHelp2, chat.title)));
                        }
                    }
                } else {
                    TLRPC.Chat chat2 = ypVar.getMessagesController().getChat(Long.valueOf(ypVar.h.linked_chat_id));
                    if (chat2 != null) {
                        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("DiscussionGroupHelp", R.string.DiscussionGroupHelp, chat2.title)));
                    }
                }
                spVar.addView(textView, w7.a6.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                spVar.setTag(-33024);
                b5Var = spVar;
            } else {
                TLRPC.Chat chat3 = z10 ? (TLRPC.Chat) ypVar.v.get(0) : ypVar.f;
                up upVar = new up(this, context, chat3, chat3);
                ypVar.y = upVar;
                b5Var = upVar;
            }
        } else {
            b5Var = new org.telegram.ui.Cells.b5(6, 2, this.c, null, false);
        }
        return new org.telegram.ui.Components.fl0(b5Var);
    }
}
