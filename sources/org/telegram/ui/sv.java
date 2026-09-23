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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ sv(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        ix ixVar;
        ix ixVar2;
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                if (ryVar.a4() && (arrayList = ryVar.D2) != null && !arrayList.isEmpty() && ryVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) ryVar.D2.get(0);
                    bx bxVar = ryVar.B1;
                    CharSequence fieldText = bxVar != null ? bxVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = ryVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().J2(null, ryVar, ryVar.getResourceProvider());
                    PhotoViewer.t1().p7 = true;
                    PhotoViewer.t1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(ryVar.D2);
                    boolean[] zArr = new boolean[ryVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new xx(ryVar, zArr), null);
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
                ry ryVar2 = this.b;
                ryVar2.O4(true, false, true, false);
                ryVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new mv(ryVar2, 3), 100L);
                break;
            case 2:
                ry ryVar3 = this.b;
                if (ryVar3.G0 && (ixVar = ryVar3.E0) != null && !ixVar.g()) {
                    ryVar3.x4(true, true);
                    break;
                } else {
                    ryVar3.P4();
                    break;
                }
                break;
            case 3:
                ry ryVar4 = this.b;
                if (ryVar4.G0 && (ixVar2 = ryVar4.E0) != null && !ixVar2.g()) {
                    ryVar4.x4(true, true);
                    break;
                } else {
                    ryVar4.P4();
                    break;
                }
                break;
            case 4:
                ry ryVar5 = this.b;
                ryVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ryVar5.X2);
                ryVar5.presentFragment(new fi.s(bundle));
                break;
            case 5:
                ry ryVar6 = this.b;
                ArrayList arrayList4 = ryVar6.I2;
                if (ryVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    ryVar6.C2.u(ryVar6, arrayList5, ryVar6.B1.getFieldText(), false, ryVar6.J2, ryVar6.K2, ryVar6.L2, null);
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
                ry ryVar7 = this.b;
                ryVar7.z0.setIsEditing(false);
                ryVar7.I4(false);
                break;
            case 9:
                ry ryVar8 = this.b;
                ryVar8.getClass();
                ryVar8.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) ryVar8, 2, true));
                break;
            case 10:
                ry ryVar9 = this.b;
                ryVar9.getContactsController().loadGlobalPrivacySetting();
                ryVar9.K4();
                break;
            case 11:
                this.b.p4(view);
                break;
            case 12:
                ry.t0(this.b);
                break;
            case 13:
                ry.J0(this.b);
                break;
            case 14:
                ry.v0(this.b);
                break;
            case 15:
                ry ryVar10 = this.b;
                ryVar10.showDialog(org.telegram.ui.Components.e5.m(ryVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new vv(ryVar10, 1), new mv(ryVar10, 17), false, false, ryVar10.getResourceProvider()).a);
                break;
            case 16:
                ry.C0(this.b);
                break;
            case 17:
                ry.A0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                ry ryVar11 = this.b;
                ryVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new mv(ryVar11, 21), 250L);
                break;
            case 19:
                ry.Z(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                ry ryVar12 = this.b;
                ryVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new mv(ryVar12, 15), 250L);
                break;
            case 21:
                z6 z6Var = new z6();
                ry ryVar13 = this.b;
                ryVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new fw(ryVar13, 10), 250L);
                break;
            case 22:
                ry.D0(this.b);
                break;
            case 23:
                ry.Y(this.b);
                break;
            case 24:
                ry.m0(this.b);
                break;
            case 25:
                ry ryVar14 = this.b;
                nf.f.s(ryVar14.getParentActivity(), ryVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                ry.l0(this.b);
                break;
            case 27:
                ry.z0(this.b);
                break;
            default:
                ry.X(this.b);
                break;
        }
    }
}
