package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zv0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                MessageObject messageObject = (MessageObject) obj;
                int i13 = PopupNotificationActivity.b0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    SendMessagesHelper.getInstance(i12).sendNotificationCallback(messageObject.getDialogId(), messageObject.getId(), keyboardButtonProto.getData());
                    break;
                }
                break;
            case 1:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i12 == 0) {
                    vz0 vz0Var = profileActivity.N;
                    if (!vz0Var.E1) {
                        if (org.telegram.ui.Components.aw0.E0(vz0Var.getClosestTab())) {
                            vz0 vz0Var2 = profileActivity.N;
                            profileActivity.N.U0(profileActivity, profileActivity.a(), vz0Var2.q1(vz0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().storiesEnabled()) {
                            profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
                            fi.sb D = fi.sb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.x = new uz0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!org.telegram.ui.Components.aw0.E0(profileActivity.N.getClosestTab())) {
                    long clientUserId = profileActivity.getUserConfig().getClientUserId();
                    org.telegram.messenger.u8 u8Var = profileActivity.D5;
                    if (u8Var != null) {
                        u8Var.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
                    boolean z10 = profileActivity.N.getClosestTab() == 9;
                    ArrayList arrayList = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        int i14 = 0;
                        for (int i15 = 0; i15 < actionModeSelected.size(); i15++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i15).storyItem;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                                i14++;
                            }
                        }
                        i10 = i14;
                    } else {
                        i10 = 0;
                    }
                    profileActivity.N.S(false);
                    if (z10) {
                        profileActivity.N.e1(8);
                    }
                    if (!arrayList.isEmpty()) {
                        boolean[] zArr = new boolean[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i16);
                            zArr[i16] = storyItem2.pinned;
                            storyItem2.pinned = z10;
                        }
                        profileActivity.getMessagesController().getStoriesController().n0(clientUserId, arrayList, false);
                        boolean[] zArr2 = {false};
                        boolean z11 = z10;
                        profileActivity.D5 = new org.telegram.messenger.u8(profileActivity, clientUserId, arrayList, z10, 9);
                        bi.a0 a0Var = new bi.a0(profileActivity, zArr2, arrayList, zArr, clientUserId, 15);
                        (z11 ? org.telegram.ui.Components.wc.b0(profileActivity).K(R.raw.contact_check, LocaleController.formatPluralString("StorySavedTitle", i10, new Object[0]), LocaleController.getString(R.string.StorySavedSubtitle), LocaleController.getString(R.string.UndoNoCaps), a0Var).j() : org.telegram.ui.Components.wc.b0(profileActivity).I(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", i10, new Object[0]), LocaleController.getString(R.string.UndoNoCaps), 5000, false, a0Var).j()).w = new fy0(4, profileActivity, zArr2);
                        break;
                    }
                } else {
                    long a2 = profileActivity.a();
                    vz0 vz0Var3 = profileActivity.N;
                    int q12 = vz0Var3.q1(vz0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().getStoriesController().w(q12, a2);
                    org.telegram.messenger.u8 u8Var2 = profileActivity.D5;
                    if (u8Var2 != null) {
                        u8Var2.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.qc.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<MessageObject> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i17 = 0; i17 < actionModeSelected2.size(); i17++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i17).storyItem;
                            if (storyItem3 != null) {
                                arrayList2.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.N.S(false);
                    if (!arrayList2.isEmpty()) {
                        bi.da daVar = new bi.da(profileActivity, a2, q12, arrayList2, 16);
                        profileActivity.getMessagesController().getStoriesController().c0(q12, a2, arrayList2);
                        org.telegram.ui.Components.wc.b0(profileActivity).J(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", arrayList2.size(), w10)), LocaleController.getString(R.string.UndoNoCaps), daVar).j();
                        break;
                    }
                }
                break;
            case 2:
                w91 w91Var = (w91) obj;
                w91Var.h0.E(i12);
                w91Var.l0(i12, true);
                break;
            default:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) obj;
                EditText editText = haVar.a;
                TextView[] textViewArr = haVar.N;
                TextView textView = textViewArr[i12];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i12].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    haVar.a();
                    haVar.a();
                    Runnable runnable = haVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ zv0(MessageObject messageObject, int i10) {
        this.a = 0;
        this.b = i10;
        this.c = messageObject;
    }
}
