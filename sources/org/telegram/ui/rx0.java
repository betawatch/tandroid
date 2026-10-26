package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rx0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ sx0 d;

    public rx0(sx0 sx0Var, Context context) {
        this.d = sx0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.e;
    }

    @Override // s4.h0
    public final int j(int i10) {
        sx0 sx0Var = this.d;
        if (i10 == sx0Var.w) {
            return 4;
        }
        if (i10 == sx0Var.n) {
            return 3;
        }
        if (i10 == sx0Var.f) {
            return 2;
        }
        return (i10 == sx0Var.h || i10 == sx0Var.v) ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        String string;
        sx0 sx0Var = this.d;
        int i11 = sx0Var.y;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) view;
            if (i11 != 1) {
                throw null;
            }
            long keyAt = sx0Var.getMessagesController().blockePeers.keyAt(i10 - sx0Var.r);
            f5Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat chat = sx0Var.getMessagesController().getChat(Long.valueOf(-keyAt));
                if (chat != null) {
                    int i13 = chat.participants_count;
                    f5Var.c(chat, null, i13 != 0 ? LocaleController.formatPluralString("Members", i13, new Object[0]) : chat.has_geo ? LocaleController.getString(R.string.MegaLocation) : !ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.MegaPublic), i10 != sx0Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User user = sx0Var.getMessagesController().getUser(Long.valueOf(keyAt));
            if (user != null) {
                if (user.bot) {
                    string = LocaleController.getString(R.string.Bot).substring(0, 1).toUpperCase() + LocaleController.getString(R.string.Bot).substring(1);
                } else {
                    String str = user.phone;
                    string = (str == null || str.length() == 0) ? LocaleController.getString(R.string.NumberUnknown) : org.telegram.messenger.vh.g(new StringBuilder("+"), user.phone, kf.b.c());
                }
                f5Var.c(user, null, string, i10 != sx0Var.s - 1);
                return;
            }
            return;
        }
        if (i12 == 1) {
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 != sx0Var.h) {
                if (i10 == sx0Var.v) {
                    i9Var.setFixedSize(12);
                    i9Var.setText("");
                    return;
                }
                return;
            }
            if (i11 == 1) {
                i9Var.setFixedSize(0);
                i9Var.setText(LocaleController.getString(R.string.BlockedUsersInfo));
                return;
            } else {
                i9Var.setFixedSize(8);
                i9Var.setText(null);
                return;
            }
        }
        if (i12 == 2) {
            org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) view;
            c5Var.a(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
            if (i11 == 1) {
                c5Var.b(LocaleController.getString(R.string.BlockUser), R.drawable.msg_contact_add, 5, false);
                return;
            } else {
                LocaleController.getString(R.string.PrivacyAddAnException);
                throw null;
            }
        }
        if (i12 != 3) {
            return;
        }
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
        if (i10 == sx0Var.n) {
            if (i11 == 1) {
                q4Var.setText(LocaleController.formatPluralString("BlockedUsersCount", sx0Var.getMessagesController().totalBlockedCount, new Object[0]));
            } else {
                q4Var.setText(LocaleController.getString(R.string.PrivacyExceptions));
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout i9Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                i9Var = new org.telegram.ui.Cells.i9(context);
            } else if (i10 == 2) {
                i9Var = new org.telegram.ui.Cells.c5(context);
            } else if (i10 != 4) {
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(this.c, org.telegram.ui.ActionBar.y6.L6, 21, 11, false, null);
                q4Var.setHeight(43);
                frameLayout = q4Var;
            } else {
                org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                v8Var.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                v8Var.g(-1, org.telegram.ui.ActionBar.y6.p7);
                frameLayout = v8Var;
            }
            frameLayout = i9Var;
        } else {
            org.telegram.ui.Cells.f5 f5Var = new org.telegram.ui.Cells.f5(7, 6, this.c, null, true);
            f5Var.setDelegate(new hl0(this, 11));
            frameLayout = f5Var;
        }
        return new org.telegram.ui.Components.vl0(frameLayout);
    }
}
