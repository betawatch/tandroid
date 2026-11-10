package org.telegram.ui;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ru0(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                if (i11 == 0) {
                    yv0 yv0Var = profileActivity.N;
                    if (!yv0Var.E1) {
                        if (org.telegram.ui.Components.ys0.J0(yv0Var.getClosestTab())) {
                            yv0 yv0Var2 = profileActivity.N;
                            profileActivity.N.a1(profileActivity, profileActivity.a(), yv0Var2.w1(yv0Var2.getClosestTab()));
                            break;
                        } else if (profileActivity.getMessagesController().W4()) {
                            profileActivity.getMessagesController().e7.edit().putBoolean("story_keep", true).apply();
                            fi.va D = fi.va.D(profileActivity.getParentActivity(), profileActivity.getCurrentAccount());
                            D.y = new xv0(profileActivity);
                            D.Q(null);
                            break;
                        } else {
                            profileActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) profileActivity, 14, true));
                            break;
                        }
                    }
                }
                if (!org.telegram.ui.Components.ys0.J0(profileActivity.N.getClosestTab())) {
                    long e10 = profileActivity.getUserConfig().e();
                    org.telegram.messenger.video.n nVar = profileActivity.z5;
                    if (nVar != null) {
                        nVar.run();
                        profileActivity.z5 = null;
                    }
                    org.telegram.ui.Components.bc.e();
                    boolean z9 = profileActivity.N.getClosestTab() == 9;
                    ArrayList arrayList = new ArrayList();
                    SparseArray<org.telegram.messenger.ij> actionModeSelected = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected != null) {
                        int i12 = 0;
                        for (int i13 = 0; i13 < actionModeSelected.size(); i13++) {
                            TL_stories.StoryItem storyItem = actionModeSelected.valueAt(i13).l;
                            if (storyItem != null) {
                                arrayList.add(storyItem);
                                i12++;
                            }
                        }
                        i7 = i12;
                    } else {
                        i7 = 0;
                    }
                    profileActivity.N.V(false);
                    if (z9) {
                        profileActivity.N.k1(8);
                    }
                    if (!arrayList.isEmpty()) {
                        boolean[] zArr = new boolean[arrayList.size()];
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i14);
                            zArr[i14] = storyItem2.pinned;
                            storyItem2.pinned = z9;
                        }
                        profileActivity.getMessagesController().P1().q0(e10, arrayList, false);
                        boolean[] zArr2 = {false};
                        boolean z10 = z9;
                        profileActivity.z5 = new org.telegram.messenger.video.n(profileActivity, e10, arrayList, z9);
                        bi.i0 i0Var = new bi.i0(profileActivity, zArr2, arrayList, zArr, e10, 15);
                        (z10 ? org.telegram.ui.Components.gc.a0(profileActivity).L(R.raw.contact_check, org.telegram.messenger.id.G(i7, "StorySavedTitle", new Object[0]), org.telegram.messenger.id.M0(2131744484, null), org.telegram.messenger.id.M0(2131743885, null), i0Var).j() : org.telegram.ui.Components.gc.a0(profileActivity).J(R.raw.chats_archived, org.telegram.messenger.id.G(i7, "StoryArchived", new Object[0]), org.telegram.messenger.id.M0(2131743885, null), 5000, false, i0Var).j()).v = new tn0(24, profileActivity, zArr2);
                        break;
                    }
                } else {
                    long a10 = profileActivity.a();
                    yv0 yv0Var3 = profileActivity.N;
                    int w12 = yv0Var3.w1(yv0Var3.getClosestTab());
                    String w10 = profileActivity.getMessagesController().P1().w(w12, a10);
                    org.telegram.messenger.video.n nVar2 = profileActivity.z5;
                    if (nVar2 != null) {
                        nVar2.run();
                        profileActivity.z5 = null;
                    }
                    org.telegram.ui.Components.bc.e();
                    ArrayList arrayList2 = new ArrayList();
                    SparseArray<org.telegram.messenger.ij> actionModeSelected2 = profileActivity.N.getActionModeSelected();
                    if (actionModeSelected2 != null) {
                        for (int i15 = 0; i15 < actionModeSelected2.size(); i15++) {
                            TL_stories.StoryItem storyItem3 = actionModeSelected2.valueAt(i15).l;
                            if (storyItem3 != null) {
                                arrayList2.add(storyItem3);
                            }
                        }
                    }
                    profileActivity.N.V(false);
                    if (!arrayList2.isEmpty()) {
                        bi.f9 f9Var = new bi.f9(profileActivity, a10, w12, arrayList2);
                        profileActivity.getMessagesController().P1().f0(w12, a10, arrayList2);
                        org.telegram.ui.Components.gc.a0(profileActivity).K(R.raw.chats_archived, org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(arrayList2.size(), "StoryRemovedFromAlbumTitle", w10)), org.telegram.messenger.id.M0(2131743885, null), f9Var).j();
                        break;
                    }
                }
                break;
            case 1:
                e51 e51Var = (e51) obj;
                e51Var.h0.E(i11);
                e51Var.p0(i11, true);
                break;
            default:
                org.telegram.ui.Wallet.pa paVar = (org.telegram.ui.Wallet.pa) obj;
                EditText editText = paVar.a;
                TextView[] textViewArr = paVar.N;
                TextView textView = textViewArr[i11];
                if (textView != null && !TextUtils.isEmpty(textView.getText())) {
                    String charSequence = textViewArr[i11].getText().toString();
                    editText.setText(charSequence);
                    editText.setSelection(charSequence.length());
                    paVar.a();
                    paVar.a();
                    Runnable runnable = paVar.r;
                    if (runnable != null) {
                        editText.post(runnable);
                        break;
                    }
                }
                break;
        }
    }
}
