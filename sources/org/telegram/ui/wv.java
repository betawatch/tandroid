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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ wv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList arrayList;
        lx lxVar;
        lx lxVar2;
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                if (uyVar.a4() && (arrayList = uyVar.D2) != null && !arrayList.isEmpty() && uyVar.getParentActivity() != null) {
                    int i10 = 0;
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) uyVar.D2.get(0);
                    ex exVar = uyVar.B1;
                    CharSequence fieldText = exVar != null ? exVar.getFieldText() : photoEntry.caption;
                    ArrayList arrayList2 = uyVar.D2;
                    int size = arrayList2.size();
                    while (i10 < size) {
                        Object obj = arrayList2.get(i10);
                        i10++;
                        ((MediaController.PhotoEntry) obj).caption = fieldText;
                    }
                    PhotoViewer.t1().K2(null, uyVar, uyVar.getResourceProvider());
                    PhotoViewer.t1().p7 = true;
                    PhotoViewer.t1().q7 = fieldText;
                    ArrayList arrayList3 = new ArrayList(uyVar.D2);
                    boolean[] zArr = new boolean[uyVar.D2.size()];
                    Arrays.fill(zArr, true);
                    PhotoViewer.t1().f2(arrayList3, 0, 0, false, new ay(uyVar, zArr), null);
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
                uy uyVar2 = this.b;
                uyVar2.O4(true, false, true, false);
                uyVar2.Y.b(true);
                AndroidUtilities.runOnUIThread(new qv(uyVar2, 3), 100L);
                break;
            case 2:
                uy uyVar3 = this.b;
                if (uyVar3.G0 && (lxVar = uyVar3.E0) != null && !lxVar.g()) {
                    uyVar3.x4(true, true);
                    break;
                } else {
                    uyVar3.P4();
                    break;
                }
                break;
            case 3:
                uy uyVar4 = this.b;
                if (uyVar4.G0 && (lxVar2 = uyVar4.E0) != null && !lxVar2.g()) {
                    uyVar4.x4(true, true);
                    break;
                } else {
                    uyVar4.P4();
                    break;
                }
                break;
            case 4:
                uy uyVar5 = this.b;
                uyVar5.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uyVar5.X2);
                uyVar5.presentFragment(new gi.s(bundle));
                break;
            case 5:
                uy uyVar6 = this.b;
                ArrayList arrayList4 = uyVar6.I2;
                if (uyVar6.C2 != null && !arrayList4.isEmpty()) {
                    ArrayList arrayList5 = new ArrayList();
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        arrayList5.add(MessagesStorage.TopicKey.of(((Long) arrayList4.get(i11)).longValue(), 0L));
                    }
                    uyVar6.C2.u(uyVar6, arrayList5, uyVar6.B1.getFieldText(), false, uyVar6.J2, uyVar6.K2, uyVar6.L2, null);
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
                uy uyVar7 = this.b;
                uyVar7.z0.setIsEditing(false);
                uyVar7.I4(false);
                break;
            case 9:
                uy uyVar8 = this.b;
                uyVar8.getClass();
                uyVar8.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) uyVar8, 2, true));
                break;
            case 10:
                uy uyVar9 = this.b;
                uyVar9.getContactsController().loadGlobalPrivacySetting();
                uyVar9.K4();
                break;
            case 11:
                this.b.p4(view);
                break;
            case 12:
                uy.t0(this.b);
                break;
            case 13:
                uy.J0(this.b);
                break;
            case 14:
                uy.v0(this.b);
                break;
            case 15:
                uy uyVar10 = this.b;
                uyVar10.showDialog(org.telegram.ui.Components.e5.m(uyVar10.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new zv(uyVar10, 1), new qv(uyVar10, 17), false, false, uyVar10.getResourceProvider()).a);
                break;
            case 16:
                uy.C0(this.b);
                break;
            case 17:
                uy.A0(this.b);
                break;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment.j0 = true;
                uy uyVar11 = this.b;
                uyVar11.presentFragment(premiumPreviewFragment);
                AndroidUtilities.runOnUIThread(new qv(uyVar11, 21), 250L);
                break;
            case 19:
                uy.a0(this.b);
                break;
            case 20:
                PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, "dialogs_hint");
                premiumPreviewFragment2.j0 = true;
                uy uyVar12 = this.b;
                uyVar12.presentFragment(premiumPreviewFragment2);
                AndroidUtilities.runOnUIThread(new qv(uyVar12, 15), 250L);
                break;
            case 21:
                z6 z6Var = new z6();
                uy uyVar13 = this.b;
                uyVar13.presentFragment(z6Var);
                AndroidUtilities.runOnUIThread(new jw(uyVar13, 10), 250L);
                break;
            case 22:
                uy.D0(this.b);
                break;
            case 23:
                uy.Z(this.b);
                break;
            case 24:
                uy.m0(this.b);
                break;
            case 25:
                uy uyVar14 = this.b;
                of.f.s(uyVar14.getParentActivity(), uyVar14.getMessagesController().premiumManageSubscriptionUrl);
                break;
            case 26:
                uy.l0(this.b);
                break;
            case 27:
                uy.z0(this.b);
                break;
            default:
                uy.Y(this.b);
                break;
        }
    }
}
