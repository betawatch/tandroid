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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ rv(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        hx hxVar;
        hx hxVar2;
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                if (qyVar.a4() && (arrayList = qyVar.D2) != null && !arrayList.isEmpty() && qyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) qyVar.D2.get(0);
                    ax axVar = qyVar.B1;
                    CharSequence fieldText = axVar != null ? axVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = qyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().J2(null, qyVar, qyVar.getResourceProvider());
                    PhotoViewer.t1().p7 = true;
                    PhotoViewer.t1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(qyVar.D2);
                    boolean[] zArr = new boolean[qyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new wx(qyVar, zArr), null);
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
                qy qyVar2 = this.b;
                qyVar2.O4(true, false, true, false);
                qyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new lv(qyVar2, 3), 100L);
                break;
            case 2:
                qy qyVar3 = this.b;
                if (qyVar3.G0 && (hxVar = qyVar3.E0) != null && !hxVar.g()) {
                    qyVar3.x4(true, true);
                    break;
                } else {
                    qyVar3.P4();
                    break;
                }
                break;
            case 3:
                qy qyVar4 = this.b;
                if (qyVar4.G0 && (hxVar2 = qyVar4.E0) != null && !hxVar2.g()) {
                    qyVar4.x4(true, true);
                    break;
                } else {
                    qyVar4.P4();
                    break;
                }
                break;
            case 4:
                qy qyVar5 = this.b;
                qyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", qyVar5.X2);
                qyVar5.presentFragment(new fi.s(bundle));
                break;
            case 5:
                qy qyVar6 = this.b;
                ArrayList arrayList4 = qyVar6.I2;
                if (qyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    qyVar6.C2.u(qyVar6, arrayList5, qyVar6.B1.getFieldText(), false, qyVar6.J2, qyVar6.K2, qyVar6.L2, null);
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
                qy qyVar7 = this.b;
                qyVar7.z0.setIsEditing(false);
                qyVar7.I4(false);
                break;
            case 9:
                qy qyVar8 = this.b;
                qyVar8.getClass();
                qyVar8.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) qyVar8, 2, true));
                break;
            case 10:
                qy qyVar9 = this.b;
                qyVar9.getContactsController().loadGlobalPrivacySetting();
                qyVar9.K4();
                break;
            case 11:
                this.b.p4(view);
                break;
            case 12:
                qy.t0(this.b);
                break;
            case 13:
                qy.J0(this.b);
                break;
            case 14:
                qy.v0(this.b);
                break;
            case 15:
                qy qyVar10 = this.b;
                qyVar10.showDialog(org.telegram.ui.Components.e5.m(qyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new uv(qyVar10, 1), new lv(qyVar10, 17), false, false, qyVar10.getResourceProvider()).a);
                break;
            case 16:
                qy.C0(this.b);
                break;
            case 17:
                qy.A0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                qy qyVar11 = this.b;
                qyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new lv(qyVar11, 21), 250L);
                break;
            case 19:
                qy.Z(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                qy qyVar12 = this.b;
                qyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new lv(qyVar12, 15), 250L);
                break;
            case 21:
                z6 z6Var = new z6();
                qy qyVar13 = this.b;
                qyVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new ew(qyVar13, 10), 250L);
                break;
            case 22:
                qy.D0(this.b);
                break;
            case 23:
                qy.Y(this.b);
                break;
            case 24:
                qy.m0(this.b);
                break;
            case 25:
                qy qyVar14 = this.b;
                nf.f.s(qyVar14.getParentActivity(), qyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                qy.l0(this.b);
                break;
            case 27:
                qy.z0(this.b);
                break;
            default:
                qy.X(this.b);
                break;
        }
    }
}
