package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ xv(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        nx nxVar;
        nx nxVar2;
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                if (wyVar.a4() && (arrayList = wyVar.D2) != null && !arrayList.isEmpty() && wyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) wyVar.D2.get(0);
                    gx gxVar = wyVar.B1;
                    CharSequence fieldText = gxVar != null ? gxVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = wyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, wyVar, wyVar.getResourceProvider());
                    PhotoViewer.t1().p7 = true;
                    PhotoViewer.t1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(wyVar.D2);
                    boolean[] zArr = new boolean[wyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new dy(wyVar, zArr), null);
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.f4 = true;
                    CheckBox checkBox = t12.N0;
                    if (checkBox != null) {
                        checkBox.setVisibility(8);
                    }
                    PhotoViewer.CounterView counterView = t12.O0;
                    if (counterView != null) {
                        counterView.setVisibility(8);
                        break;
                    }
                }
                break;
            case 1:
                wy wyVar2 = this.b;
                wyVar2.O4(true, false, true, false);
                wyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new rv(wyVar2, 3), 100L);
                break;
            case 2:
                wy wyVar3 = this.b;
                if (wyVar3.G0 && (nxVar = wyVar3.E0) != null && !nxVar.g()) {
                    wyVar3.x4(true, true);
                    break;
                } else {
                    wyVar3.P4();
                    break;
                }
                break;
            case 3:
                wy wyVar4 = this.b;
                if (wyVar4.G0 && (nxVar2 = wyVar4.E0) != null && !nxVar2.g()) {
                    wyVar4.x4(true, true);
                    break;
                } else {
                    wyVar4.P4();
                    break;
                }
                break;
            case 4:
                wy wyVar5 = this.b;
                wyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", wyVar5.X2);
                wyVar5.presentFragment(new ei.s(bundle));
                break;
            case 5:
                wy wyVar6 = this.b;
                ArrayList arrayList4 = wyVar6.I2;
                if (wyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    wyVar6.C2.v(wyVar6, arrayList5, wyVar6.B1.getFieldText(), false, wyVar6.J2, wyVar6.K2, wyVar6.L2, null);
                    break;
                }
                break;
            case 6:
                this.b.b4(true);
                break;
            case 7:
                this.b.finishPreviewFragment();
                break;
            case 8:
                wy wyVar7 = this.b;
                wyVar7.z0.setIsEditing(false);
                wyVar7.I4(false);
                break;
            case 9:
                wy wyVar8 = this.b;
                wyVar8.getClass();
                wyVar8.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) wyVar8, 2, true));
                break;
            case 10:
                wy wyVar9 = this.b;
                wyVar9.getContactsController().loadGlobalPrivacySetting();
                wyVar9.K4();
                break;
            case 11:
                this.b.p4(view);
                break;
            case 12:
                wy.t0(this.b);
                break;
            case 13:
                wy.J0(this.b);
                break;
            case 14:
                wy.v0(this.b);
                break;
            case 15:
                wy wyVar10 = this.b;
                wyVar10.showDialog(org.telegram.ui.Components.d5.m(wyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new aw(wyVar10, 1), new rv(wyVar10, 17), false, false, wyVar10.getResourceProvider()).a);
                break;
            case 16:
                wy.C0(this.b);
                break;
            case 17:
                wy.A0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                wy wyVar11 = this.b;
                wyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new rv(wyVar11, 21), 250L);
                break;
            case 19:
                wy.a0(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                wy wyVar12 = this.b;
                wyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new rv(wyVar12, 15), 250L);
                break;
            case 21:
                y6 y6Var = new y6();
                wy wyVar13 = this.b;
                wyVar13.presentFragment(y6Var);
                AndroidUtilities.runOnUIThread(new kw(wyVar13, 10), 250L);
                break;
            case 22:
                wy.D0(this.b);
                break;
            case 23:
                wy.Z(this.b);
                break;
            case 24:
                wy.m0(this.b);
                break;
            case 25:
                wy wyVar14 = this.b;
                nf.f.s(wyVar14.getParentActivity(), wyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                wy.l0(this.b);
                break;
            case 27:
                wy.z0(this.b);
                break;
            default:
                wy.Y(this.b);
                break;
        }
    }
}
