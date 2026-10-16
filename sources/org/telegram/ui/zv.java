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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ zv(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        px pxVar;
        px pxVar2;
        switch (this.a) {
            case 0:
                yy yyVar = this.b;
                if (yyVar.Y3() && (arrayList = yyVar.D2) != null && !arrayList.isEmpty() && yyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) yyVar.D2.get(0);
                    ix ixVar = yyVar.B1;
                    CharSequence fieldText = ixVar != null ? ixVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = yyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, yyVar, yyVar.getResourceProvider());
                    PhotoViewer.t1().p7 = true;
                    PhotoViewer.t1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(yyVar.D2);
                    boolean[] zArr = new boolean[yyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().g2(arrayList3, 0, 0, false, new fy(yyVar, zArr), null);
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
                yy yyVar2 = this.b;
                yyVar2.M4(true, false, true, false);
                yyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new uv(yyVar2, 3), 100L);
                break;
            case 2:
                yy yyVar3 = this.b;
                if (yyVar3.G0 && (pxVar = yyVar3.E0) != null && !pxVar.g()) {
                    yyVar3.v4(true, true);
                    break;
                } else {
                    yyVar3.N4();
                    break;
                }
                break;
            case 3:
                yy yyVar4 = this.b;
                if (yyVar4.G0 && (pxVar2 = yyVar4.E0) != null && !pxVar2.g()) {
                    yyVar4.v4(true, true);
                    break;
                } else {
                    yyVar4.N4();
                    break;
                }
            case 4:
                yy yyVar5 = this.b;
                yyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", yyVar5.Y2);
                yyVar5.presentFragment(new gi.s(bundle));
                break;
            case 5:
                yy yyVar6 = this.b;
                ArrayList arrayList4 = yyVar6.I2;
                if (yyVar6.C2 != null && !arrayList4.isEmpty()) {
                    yyVar6.M2 = false;
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    yyVar6.C2.w(yyVar6, arrayList5, yyVar6.B1.getFieldText(), false, yyVar6.J2, yyVar6.K2, yyVar6.L2, null);
                    break;
                }
                break;
            case 6:
                this.b.Z3(true);
                break;
            case 7:
                this.b.finishPreviewFragment();
                break;
            case 8:
                yy yyVar7 = this.b;
                yyVar7.z0.setIsEditing(false);
                yyVar7.G4(false);
                break;
            case 9:
                yy yyVar8 = this.b;
                yyVar8.getClass();
                yyVar8.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) yyVar8, 2, true));
                break;
            case 10:
                yy yyVar9 = this.b;
                yyVar9.getContactsController().loadGlobalPrivacySetting();
                yyVar9.I4();
                break;
            case 11:
                this.b.n4(view);
                break;
            case 12:
                yy.r0(this.b);
                break;
            case 13:
                yy.F0(this.b);
                break;
            case 14:
                yy.t0(this.b);
                break;
            case 15:
                yy yyVar10 = this.b;
                yyVar10.showDialog(org.telegram.ui.Components.g5.l(yyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new bw(yyVar10, 1), new uv(yyVar10, 18), false, false, yyVar10.getResourceProvider()).a);
                break;
            case 16:
                yy.A0(this.b);
                break;
            case 17:
                yy.y0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                yy yyVar11 = this.b;
                yyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new uv(yyVar11, 22), 250L);
                break;
            case 19:
                yy.Z(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                yy yyVar12 = this.b;
                yyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new uv(yyVar12, 16), 250L);
                break;
            case 21:
                d7 d7Var = new d7();
                yy yyVar13 = this.b;
                yyVar13.presentFragment(d7Var);
                AndroidUtilities.runOnUIThread(new mw(yyVar13, 11), 250L);
                break;
            case 22:
                yy.B0(this.b);
                break;
            case 23:
                yy.X(this.b);
                break;
            case 24:
                yy.l0(this.b);
                break;
            case 25:
                yy yyVar14 = this.b;
                pf.d.r(yyVar14.getParentActivity(), yyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                yy.k0(this.b);
                break;
            case 27:
                yy.w0(this.b);
                break;
            default:
                yy.W(this.b);
                break;
        }
    }
}
