package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tm0(int i7, org.telegram.messenger.fj fjVar) {
        this.a = 1;
        this.b = i7;
        this.c = fjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        int i12 = 1;
        switch (i10) {
            case 0:
                an0 an0Var = (an0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = an0Var.n0;
                if (g1Var != null && g1Var.isShowing()) {
                    an0Var.n0.d(true);
                }
                if (i11 == 0) {
                    org.telegram.ui.Components.b5.I(an0Var.getParentActivity(), an0Var.V.a(), new sm0(an0Var, i12));
                    break;
                } else {
                    an0Var.j0(0, true);
                    break;
                }
                break;
            case 1:
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj;
                int i13 = PopupNotificationActivity.c0;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) view.getTag();
                if (keyboardButtonProto != null) {
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.ek(org.telegram.messenger.zy.C(i11), org.telegram.messenger.fj.B0(fjVar.k), fjVar.e1(), keyboardButtonProto.getData(), 10));
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    uv0 uv0Var = profileActivity.O;
                    if (!uv0Var.F1) {
                        if (org.telegram.ui.Components.it0.J0(uv0Var.getClosestTab())) {
                            uv0 uv0Var2 = profileActivity.O;
                            profileActivity.O.a1(uv0Var2.w1(uv0Var2.getClosestTab()), profileActivity.a(), profileActivity);
                            break;
                        } else if (profileActivity.getMessagesController().i5()) {
                            profileActivity.getMessagesController().h7.edit().putBoolean("story_keep", true).apply();
                            hi.nb D = hi.nb.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.y = new tv0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!org.telegram.ui.Components.it0.J0(profileActivity.O.getClosestTab())) {
                    long e10 = profileActivity.getUserConfig().e();
                    ai.f2 f2Var = profileActivity.D5;
                    if (f2Var != null) {
                        f2Var.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.fc.e();
                    boolean z10 = profileActivity.O.getClosestTab() == 9;
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.fj> actionModeSelected = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected != null) {
                        int i14 = 0;
                        for (int i15 = 0; i15 < actionModeSelected.size(); i15++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i15).l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                                i14++;
                            }
                        }
                        i7 = i14;
                    } else {
                        i7 = 0;
                    }
                    profileActivity.O.V(false);
                    if (z10) {
                        profileActivity.O.k1(8);
                    }
                    if (!arrayList.isEmpty()) {
                        boolean[] zArr = new boolean[arrayList.size()];
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i16);
                            zArr[i16] = storyItem2.pinned;
                            storyItem2.pinned = z10;
                        }
                        profileActivity.getMessagesController().R1().q0(e10, arrayList, false);
                        boolean[] zArr2 = {false};
                        boolean z11 = z10;
                        profileActivity.D5 = new ai.f2(profileActivity, e10, arrayList, z10, 3);
                        bi.q2 q2Var = new bi.q2(profileActivity, zArr2, arrayList, zArr, e10, 15);
                        (z11 ? org.telegram.ui.Components.kc.b0(profileActivity).L(R.raw.contact_check, org.telegram.messenger.gd.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.gd.N0(2131744240, null), org.telegram.messenger.gd.N0(2131743638, null), q2Var).j() : org.telegram.ui.Components.kc.b0(profileActivity).J(R.raw.chats_archived, org.telegram.messenger.gd.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.gd.N0(2131743638, null), 5000, false, q2Var).j()).v = new mp0(20, profileActivity, zArr2);
                        break;
                    }
                } else {
                    long a10 = profileActivity.a();
                    uv0 uv0Var3 = profileActivity.O;
                    int w12 = uv0Var3.w1(uv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().R1().w(w12, a10);
                    ai.f2 f2Var2 = profileActivity.D5;
                    if (f2Var2 != null) {
                        f2Var2.run();
                        profileActivity.D5 = null;
                    }
                    org.telegram.ui.Components.fc.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<org.telegram.messenger.fj> actionModeSelected2 = profileActivity.O.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i17 = 0; i17 < actionModeSelected2.size(); i17++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i17).l;
                            if (storyItem3 != null) {
                                arrayList2.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.O.V(false);
                    if (!arrayList2.isEmpty()) {
                        bi.w3 w3Var = new bi.w3(profileActivity, a10, w12, arrayList2, 5);
                        profileActivity.getMessagesController().R1().f0(w12, a10, arrayList2);
                        org.telegram.ui.Components.kc.b0(profileActivity).K(R.raw.chats_archived, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.gd.N0(2131743638, null), w3Var).j();
                        break;
                    }
                }
                break;
            case 3:
                b51 b51Var = (b51) obj;
                b51Var.i0.C(i11);
                b51Var.p0(i11, true);
                break;
            default:
                org.telegram.ui.Wallet.eb ebVar = (org.telegram.ui.Wallet.eb) obj;
                EditText editText = ebVar.a;
                TextView[] textViewArr = ebVar.O;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    ebVar.a();
                    ebVar.a();
                    Runnable runnable = ebVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ tm0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
