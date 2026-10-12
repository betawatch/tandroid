package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class y41 extends pg.b {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public y41(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.s.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((z41) this.d.s.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        int i11;
        View view = b1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((z41) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.r8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((z41) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                w8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                w8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                w8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
                w8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((z41) arrayList.get(i10)).a != 7) {
            if (((z41) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.m4) view).setText(((z41) arrayList.get(i10)).d);
                return;
            }
            if (((z41) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((z41) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                xaVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.m2) saveToGallerySettingsActivity).currentAccount;
                xaVar.e(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((z41) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            e9Var.setText(((z41) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.X().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i12 = saveToGallerySettingsActivity.a;
        if (i12 == 1) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i12 == 4) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i12 == 2) {
            e9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject chat;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                r8Var.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view3 = r8Var;
                break;
            case 2:
                View xaVar = new org.telegram.ui.Cells.xa(4, 0, viewGroup.getContext(), null, false, false);
                xaVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = xaVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.d0) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                r8Var2.e(-1, org.telegram.ui.ActionBar.g6.p7);
                r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = r8Var2;
                view3 = view2;
                break;
            case 5:
                View m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext());
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = m4Var;
                view3 = view2;
                break;
            case 6:
                View w8Var = new org.telegram.ui.Cells.w8(viewGroup.getContext());
                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view2 = w8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.e9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                a51 a51Var = new a51(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a51Var.setTextSize(AndroidUtilities.dp(13.0f));
                a51Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(a51Var, w7.a6.e(-2, -2, 83));
                a51 a51Var2 = new a51(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a51Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(a51Var2, w7.a6.e(-2, -2, 81));
                a51 a51Var3 = new a51(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a51Var3.setTextSize(AndroidUtilities.dp(13.0f));
                a51Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(a51Var3, w7.a6.e(-2, -2, 85));
                linearLayout.addView(frameLayout, w7.a6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(gp0Var, w7.a6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                gp0Var.setReportChanges(true);
                gp0Var.setDelegate(new x41(this, gp0Var, a51Var, a51Var2, a51Var3));
                gp0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? a1.g.d(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                gp0Var.w.X(gp0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.wa waVar = new org.telegram.ui.Cells.wa(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.m2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.m2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                waVar.a(chat, null);
                waVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                view2 = waVar;
                view3 = view2;
                break;
            case 10:
                View b7Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.d0) null);
                b7Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.b7, saveToGallerySettingsActivity.getResourceProvider())));
                view2 = b7Var;
                view3 = view2;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view3, view3, -1, -2);
    }
}
