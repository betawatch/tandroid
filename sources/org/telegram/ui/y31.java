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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y31 extends cg.c {
    public final /* synthetic */ SaveToGallerySettingsActivity d;

    public y31(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.d = saveToGallerySettingsActivity;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.s.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((z31) this.d.s.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        String str;
        int i11;
        View view = m1Var.a;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((z31) arrayList.get(i10)).a == 1) {
            ((org.telegram.ui.Cells.o8) view).setNeedDivider(saveToGallerySettingsActivity.v.size() > 0);
            return;
        }
        if (((z31) arrayList.get(i10)).a == 6) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            SaveToGallerySettingsHelper.Settings X = saveToGallerySettingsActivity.X();
            if (i10 == saveToGallerySettingsActivity.e) {
                s8Var.f(LocaleController.getString(R.string.SaveToGalleryPhotos), X.savePhoto, true);
                s8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.lj), R.drawable.msg_filled_data_photos);
                return;
            } else {
                s8Var.f(LocaleController.getString(R.string.SaveToGalleryVideos), X.saveVideo, false);
                s8Var.c(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.ij), R.drawable.msg_filled_data_videos);
                return;
            }
        }
        if (((z31) arrayList.get(i10)).a != 7) {
            if (((z31) arrayList.get(i10)).a == 5) {
                ((org.telegram.ui.Cells.m4) view).setText(((z31) arrayList.get(i10)).d);
                return;
            }
            if (((z31) arrayList.get(i10)).a == 2) {
                org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
                SaveToGallerySettingsHelper.DialogException dialogException = ((z31) arrayList.get(i10)).c;
                TLObject userOrChat = saveToGallerySettingsActivity.getMessagesController().getUserOrChat(dialogException.dialogId);
                if (userOrChat instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) userOrChat;
                    str = user.self ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    str = userOrChat instanceof TLRPC.Chat ? ((TLRPC.Chat) userOrChat).title : null;
                }
                vaVar.setSelfAsSavedMessages(true);
                i11 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                vaVar.d(userOrChat, str, dialogException.createDescription(i11), i10 == arrayList.size() - 1 || ((z31) arrayList.get(i10 + 1)).a == 2);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (i10 != saveToGallerySettingsActivity.h) {
            a9Var.setText(((z31) arrayList.get(i10)).d);
            return;
        }
        long j10 = saveToGallerySettingsActivity.X().limitVideo;
        if (saveToGallerySettingsActivity.c != null) {
            a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintCurrent", R.string.SaveToGalleryVideoHintCurrent, new Object[0]));
            return;
        }
        int i12 = saveToGallerySettingsActivity.a;
        if (i12 == 1) {
            a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintUser", R.string.SaveToGalleryVideoHintUser, new Object[0]));
        } else if (i12 == 4) {
            a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintChannels", R.string.SaveToGalleryVideoHintChannels, new Object[0]));
        } else if (i12 == 2) {
            a9Var.setText(LocaleController.formatString("SaveToGalleryVideoHintGroup", R.string.SaveToGalleryVideoHintGroup, new Object[0]));
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        int i11;
        TLObject chat;
        int i12;
        View view2;
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.d;
        View view3 = null;
        switch (i10) {
            case 1:
                org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                o8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
                o8Var.e(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                o8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view3 = o8Var;
                break;
            case 2:
                View vaVar = new org.telegram.ui.Cells.va(4, 0, viewGroup.getContext(), null, false, false);
                vaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view = vaVar;
                view3 = view;
                break;
            case 3:
                view2 = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
                view3 = view2;
                break;
            case 4:
                org.telegram.ui.Cells.o8 o8Var2 = new org.telegram.ui.Cells.o8(viewGroup.getContext());
                o8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                o8Var2.e(-1, org.telegram.ui.ActionBar.k6.p7);
                o8Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view2 = o8Var2;
                view3 = view2;
                break;
            case 5:
                View m4Var = new org.telegram.ui.Cells.m4(viewGroup.getContext());
                m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view2 = m4Var;
                view3 = view2;
                break;
            case 6:
                View s8Var = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view2 = s8Var;
                view3 = view2;
                break;
            case 7:
                view3 = new org.telegram.ui.Cells.a9(viewGroup.getContext());
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(saveToGallerySettingsActivity.getParentActivity());
                linearLayout.setOrientation(1);
                org.telegram.ui.Components.lo0 lo0Var = new org.telegram.ui.Components.lo0(saveToGallerySettingsActivity.getParentActivity());
                FrameLayout frameLayout = new FrameLayout(saveToGallerySettingsActivity.getParentActivity());
                a41 a41Var = new a41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a41Var.setTextSize(AndroidUtilities.dp(13.0f));
                a41Var.setText(AndroidUtilities.formatFileSize(524288L, true, false));
                frameLayout.addView(a41Var, k7.c6.e(-2, -2, 83));
                a41 a41Var2 = new a41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a41Var2.setTextSize(AndroidUtilities.dp(13.0f));
                frameLayout.addView(a41Var2, k7.c6.e(-2, -2, 81));
                a41 a41Var3 = new a41(saveToGallerySettingsActivity, saveToGallerySettingsActivity.getParentActivity());
                a41Var3.setTextSize(AndroidUtilities.dp(13.0f));
                a41Var3.setText(AndroidUtilities.formatFileSize(4194304000L, true, false));
                frameLayout.addView(a41Var3, k7.c6.e(-2, -2, 85));
                linearLayout.addView(frameLayout, k7.c6.t(-1, 20, 0, 21, 10, 21, 0));
                linearLayout.addView(lo0Var, k7.c6.t(-1, 38, 0, 5, 0, 5, 4));
                long j10 = saveToGallerySettingsActivity.X().limitVideo;
                if (j10 < 0 || j10 > 4194304000L) {
                    j10 = 4194304000L;
                }
                lo0Var.setReportChanges(true);
                lo0Var.setDelegate(new x31(this, lo0Var, a41Var, a41Var2, a41Var3));
                lo0Var.setProgress(((float) j10) > ((float) SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT) * 0.7f ? w.c.c(j10 - SaveToGallerySettingsHelper.DEFAULT_VIDEO_LIMIT, 4089446400L, 0.3f, 0.7f) : ((j10 - 524288) / 104333312) * 0.7f);
                lo0Var.w.X(lo0Var.getProgress(), false);
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                view = linearLayout;
                view3 = view;
                break;
            case 9:
                org.telegram.ui.Cells.ua uaVar = new org.telegram.ui.Cells.ua(saveToGallerySettingsActivity.getParentActivity(), saveToGallerySettingsActivity.getResourceProvider());
                if (DialogObject.isUserDialog(saveToGallerySettingsActivity.b)) {
                    i12 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i12).getUser(Long.valueOf(saveToGallerySettingsActivity.b));
                } else {
                    i11 = ((org.telegram.ui.ActionBar.p2) saveToGallerySettingsActivity).currentAccount;
                    chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-saveToGallerySettingsActivity.b));
                }
                uaVar.a(chat, null);
                uaVar.setBackgroundColor(saveToGallerySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                view2 = uaVar;
                view3 = view2;
                break;
            case 10:
                View z6Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (b) null);
                z6Var.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.U0(saveToGallerySettingsActivity.getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.b7, saveToGallerySettingsActivity.getResourceProvider())));
                view2 = z6Var;
                view3 = view2;
                break;
        }
        return yh.o(view3, view3, -1, -2);
    }
}
